
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rails
 */
public class ExercicioCalculadora {
    public static void main(String[] args) {
        
        Scanner calcular = new Scanner(System.in);
        
        System.out.println("Insira um número:");
        Double numero01 = calcular.nextDouble();
        
        System.out.println("Insira um outro número:");
        Double numero02 = calcular.nextDouble();
        
        Double soma = numero01 + numero02;
        Double subtracao = numero01 - numero02;
        Double multiplicacao = numero01 * numero02;
        Double divisao = numero01 / numero02;
        
        System.out.println("Resultado da soma: " + "\n" + soma);
        
        System.out.println("Resultado da subtração: " + "\n" + subtracao);
        
        System.out.println("Resultado da multiplicação: " + "\n" + multiplicacao);
        
        System.out.println("Resultado da divisão: " + "\n" + divisao);
    }
}
