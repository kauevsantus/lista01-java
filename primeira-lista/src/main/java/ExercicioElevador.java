
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rails
 */
public class ExercicioElevador {
    public static void main(String[] args) {
        
        Scanner info = new Scanner(System.in);
        
        System.out.println("Digite o limite de peso de um elevador: ");
        Double pesoLimite = info.nextDouble();
        
        System.out.println("Digite o limte de pessoas em um elevador: ");
        Integer limitePessoa = info.nextInt();
        
        System.out.println("Digite o peso da 1º pessoa que entrou no elevador: ");
        Integer pessoaUm = info.nextInt();
        
        System.out.println("Digite o peso da 2º pessoa que entrou no elevador: ");
        Double pessoaDois = info.nextDouble();
        
        System.out.println("Digite o peso da 3º pessoa que entrou no elevador: ");
        Double pessoaTres = info.nextDouble();
        
        Double pesoTotal = pessoaUm + pessoaDois + pessoaTres;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " 
                + limitePessoa + " pessoas." + " O peso total no elevador é de " 
                + pesoTotal + ", sendo que ele suporta " + pesoLimite);
                    
        
        
        
    }
}
