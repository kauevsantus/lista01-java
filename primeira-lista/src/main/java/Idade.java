
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rails
 */
public class Idade {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = idade.nextLine();
        
        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento?”.");
        Integer idader = idade.nextInt();
        
        Integer idadeFuturo = 2030 - idader;
        
        
        System.out.println("Em 2030 você terá " + idadeFuturo + " anos");
        
    }
}
