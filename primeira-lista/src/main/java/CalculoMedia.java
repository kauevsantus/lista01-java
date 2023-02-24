
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rails
 */
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner calcular = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = calcular.nextLine();
        
        System.out.println("Digite sua nota 1: ");
        Double notaUm = calcular.nextDouble();
        
        System.out.println("Digite sua nota 2: ");
        Double notaDois = calcular.nextDouble();
        
        Double media = (notaUm + notaDois) / 2;
        
        System.out.println("Olá, " + nome + ". Sua média foi de " + media);
        
    }
}
