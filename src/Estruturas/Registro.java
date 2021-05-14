
package Estruturas;



public class Registro {
    
    private String chaveNota,cnpjEmit,cnpjDest,dataEmissao,valor,xml;

    public Registro(String chaveNota, String cnpjEmit, String cnpjDest,String dataEmissao, String valor,String xml) {
        this.chaveNota = chaveNota;
        this.cnpjEmit = cnpjEmit;
        this.cnpjDest = cnpjDest;
        this.dataEmissao = dataEmissao;
        this.valor = valor;
        this.xml = xml;
    }

    public String getChaveNota() {
        return chaveNota;
    }

    public String getCnpjEmit() {
        return cnpjEmit;
    }

    public String getCnpjDest() {
        return cnpjDest;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }
    

    public String getValor() {
        return valor;
    }

    public String getXml() {
        return xml;
    }

    
    
    
    
}
