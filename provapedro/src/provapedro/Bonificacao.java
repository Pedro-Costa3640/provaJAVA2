/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package provapedro;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    
    GERENTE(0.15),
    DIRETOR(0.25);
    
    public double boni;

    private Bonificacao(double boni) {
        this.boni = boni;
    }

    public double getBoni() {
        return boni;
    }

    public void setBoni(double boni) {
        this.boni = boni;
    }
    
    
}
