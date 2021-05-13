package Conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Conexao {

    private String url;
    private String usuario;
    private String senha;
    public Connection con;

    public Conexao(String[] credenciaisBanco) {
        url = "jdbc:postgresql://" + credenciaisBanco[0] + ":" + credenciaisBanco[1] + "/" + credenciaisBanco[2];
        usuario = credenciaisBanco[3];
        senha = credenciaisBanco[4];

    }

    public boolean testaConexao() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Erro ao tentar conectar com o Banco de Dados.\n" + e.getMessage());
            return false;
        }
    }

    public ResultSet executaSQL(String sql) {
        try {

            Statement stm = con.createStatement();
            ResultSet resultado = stm.executeQuery(sql);
            return resultado;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    
    public void encerraConexao() throws SQLException {
        this.con.close();
    }

}
