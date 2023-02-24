
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rails
 */
public class ExercicioUm {
    public static void main(String[] args) {
        Scanner cadastro = new Scanner(System.in);
        
        System.out.println("Digite seu Login: ");
        String login = cadastro.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = cadastro.nextLine();
        
        System.out.println("Quantidade de vezes que o usuário "
                + "aceita errar a senha antes do bloqueio");
        Integer tentativa = cadastro.nextInt();
        
        System.out.println("Seu login é " + login + " e sua senha é " 
                + senha + "." + " Você tem " 
                + tentativa + " tentativas antes de ser bloqueado");
        
        
                
    }
}
