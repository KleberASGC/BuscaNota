
package Acoes;

import Conexoes.Conexao;
import Estruturas.Registro;
import Telas.BaixarRegistrosXML;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class BuscaPorCNPJ {
    private String cnpj;
    private Conexao conexao;

    public BuscaPorCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void buscaRegistroCNPJ(Conexao conexao) {
        
        String sql = "SELECT * FROM invoices";
        ResultSet resultado = conexao.executaSQL(sql);
        
        ArrayList<Registro> registros = new ArrayList<Registro>();
        
        try {
            while(resultado.next()) {
                String chaveNota,cnpjEmit,cnpjDest,valor,xml;
                chaveNota = resultado.getString("nfe_key");
                cnpjEmit = resultado.getString("cnpj_emit");
                cnpjDest = resultado.getString("cnpj_dest");
                valor = resultado.getString("amount");
                xml = resultado.getString("arquivo_nfe");
                registros.add(new Registro(chaveNota,cnpjEmit,cnpjDest,valor,xml));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscaPorCNPJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = 0;
        for(Registro r : registros) {
            i++;
            System.out.println("(" + i + ") " +  r.getChaveNota() + " ===> " + r.getCnpjEmit() + " ===> " + r.getCnpjDest() +
             " ===> " + r.getValor());
        }
        
        int resposta = JOptionPane.showConfirmDialog(new JFrame(), "Deseja baixar o arquivo .xml com todas as informações"
                + " da nota de algum desses registros?", "Inserir Registros?", JOptionPane.YES_NO_OPTION);
        
        if(resposta == JOptionPane.YES_OPTION) {
            BaixarRegistrosXML baixarRegistros = new BaixarRegistrosXML(registros);
            baixarRegistros.setVisible(true);
        }
    }
    
    
    
}
