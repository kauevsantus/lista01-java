
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rails
 */
public class ExercicioCalculaTroco {
    public static void main(String[] args) {
        Scanner validar = new Scanner(System.in);
        
        System.out.println("Insira o valor unitário do produto: ");
        Double produto = validar.nextDouble();
        
        System.out.println("Insira a quantidade vendida: ");
        Integer quantidade = validar.nextInt();
        
        System.out.println("Insira o valor pago pelo cliente: ");
        Double valor = validar.nextDouble();
        
        Double troco = valor - produto;
        
        System.out.println("Seu troco será de R$" + troco + " reais " 
                + ", onde " + troco + " é o valor a ser devolvido ao cliente");
        
    }
}
