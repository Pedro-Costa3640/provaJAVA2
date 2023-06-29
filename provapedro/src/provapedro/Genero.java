/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package provapedro;

/**
 *
 * @author Aluno
 */
public enum Genero {
    
    MASCULINO("Masculino",'M'),
    FEMININO("Feminino",'F');
    
    private String sexo;
    private char sigla;

    private Genero(String sexo, char sigla) {
        this.sexo = sexo;
        this.sigla = sigla;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }
    
    
    
}
