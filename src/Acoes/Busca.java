package Acoes;

import Conexoes.Conexao;
import Estruturas.Registro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Busca {

    private String parametro;
    private String parametro2;
    private String tipoBusca;

    public Busca(String tipoBusca, String parametro, String parametro2) {
        this.parametro = parametro;
        this.parametro2 = parametro2;
        this.tipoBusca = tipoBusca;
    }

    public ArrayList<Registro> buscaRegistro(Conexao conexao) {
        String sql = "";
        switch (this.tipoBusca) {
            case "CNPJ":
                sql = "SELECT nfe_key,cnpj_emit,cnpj_dest,note_issue_date,amount,arquivo_nfe FROM invoices "
                        + "WHERE cnpj_emit LIKE '%" + this.parametro + "%'";
                
                break;
            case "Data":
                sql = "SELECT nfe_key,cnpj_emit,cnpj_dest,note_issue_date,amount,arquivo_nfe FROM invoices "
                        + "WHERE note_issue_date LIKE '%" + this.parametro + "%'";
                break;
            case "CNPJ e Data":
                sql = "SELECT nfe_key,cnpj_emit,cnpj_dest,note_issue_date,amount,arquivo_nfe FROM invoices "
                        + "WHERE cnpj_emit LIKE '%" + this.parametro + "%' AND note_issue_date LIKE '%" + this.parametro2 + "%'";
                break;
            case "Chave":
                sql = "SELECT nfe_key,cnpj_emit,cnpj_dest,note_issue_date,amount,arquivo_nfe FROM invoices "
                        + "WHERE nfe_key LIKE '%" + this.parametro + "%'";
                break;
        }
        ResultSet resultado = conexao.executaSQL(sql);
        ArrayList<Registro> registros = new ArrayList<>();

        try {
            while (resultado.next()) {
                String chaveNota, cnpjEmit, cnpjDest, valor, xml, dataEmissao;
                chaveNota = resultado.getString("nfe_key");
                cnpjEmit = resultado.getString("cnpj_emit");
                cnpjDest = resultado.getString("cnpj_dest");
                dataEmissao = resultado.getString("note_issue_date");
                valor = resultado.getString("amount");
                xml = resultado.getString("arquivo_nfe");
                registros.add(new Registro(chaveNota, cnpjEmit, cnpjDest, dataEmissao, valor, xml));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Busca.class.getName()).log(Level.SEVERE, null, ex);
        }

        return registros;

    }
}
