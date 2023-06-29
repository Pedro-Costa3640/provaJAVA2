
package provapedro;

public enum UnidadeFederativa {
    
    BAHIA("Bahia", "BA"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    SAO_PAULO("São Paulo", "SP");
 
    private String local;
    private String caractere;

    private UnidadeFederativa(String local, String caractere) {
        this.local = local;
        this.caractere = caractere;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }
    
    
    
}
