/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provapedro;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
    
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Roberta Dias", "123.456.789-10", "4440-4444-4444", 
                new Endereco("Condomínio", "4", "Bloco C", "4002-89", "Feira de Santana", UnidadeFederativa.BAHIA), 
                Setor.RECURSOS_HUMANOS, Genero.FEMININO, 7800, EstadoCivil.SOLTEIRO, LocalDate.of(1899, Month.MARCH, 20));
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Carlos Albuquerque", "123.456.789-10", "4440-4444-4444", 
                new Endereco("Prédio", "32", "Bloco B", "41414-41", "Cidade de Deus", UnidadeFederativa.RIO_DE_JANEIRO), 
                Setor.JURIDICO, Genero.MASCULINO, 9000, EstadoCivil.CASADO, LocalDate.of(1888, Month.MARCH, 15));
        
        Motoboy motoboy = new Motoboy("A44555", "Juliano Moreira", "123.456.789-10", "4440-4444-4444", 
                new Endereco("Rua", "25", "", "41455-10", "Salvador", UnidadeFederativa.BAHIA), 
                Setor.OPERACOES, Genero.MASCULINO, 1500, EstadoCivil.SEPARADO, LocalDate.of(2000, Month.AUGUST, 20));
        
        Engenheiro engenheiro = new Engenheiro("445", "Miranda Maiia", "123.456.789-10", "4440-4444-4444", 
                new Endereco("Condomínio", "56", "Próximo ao morro", "55644-45", "São Vicente", UnidadeFederativa.SAO_PAULO), 
                Setor.ENGENHARIA, Genero.FEMININO, 4600.65, EstadoCivil.VIUVO, LocalDate.of(1999, Month.FEBRUARY, 3));
        
        System.out.println("Informações dos usuários: \n");
        System.out.println(diretor.toString());
        System.out.println(gerente.toString());
        
        diretor.adimitir(engenheiro);
        diretor.demitir(motoboy);
        
    }
    
}
