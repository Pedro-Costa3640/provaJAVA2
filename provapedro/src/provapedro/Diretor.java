/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapedro;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    
    public final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    @Override
    public double salarioFinal() {
        double salarioFinal = 0;
        salarioFinal += salario * PREMIO;
        salarioFinal += salario * bonificacao.boni;
        salarioFinal += salario;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "\nDiretor = " + 
                super.toString() +
                "Prêmio: " + PREMIO * 100 + "%";
    }

    @Override
    public void adimitir(Funcionario funcionario) {
        System.out.println("\nO Funcionário: " + funcionario.nome + ", Foi Adimitido!");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\nO Funcionário: " + funcionario.nome + ", Foi Demitido!");
    }
    
    
    
    
}
