
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rails
 */
public class ExercicioCalculoRenda {
    public static void main(String[] args) {
        Scanner renda = new Scanner(System.in);
        
        System.out.println("Insira quantidade de filhos de 0 a 3 anos: ");
        Integer filho01 = renda.nextInt();
        
        System.out.println("Insira quantidade de filhos de 4 a 16 anos: ");
        Integer filho02 = renda.nextInt();
        
        System.out.println("Insira quantidade de filhos de 17 a 18 anos: ");
        Integer filho03 = renda.nextInt();
        
        Integer somaFilho = filho01 + filho02 + filho03;
        
        Double somaRendaFilho01 = filho01 * 25.12; 
        Double somaRendaFilho02 = filho02 * 15.88; 
        Double somaRendaFilho03 = filho03 * 12.44; 
        
        Double somaRendaTotal = somaRendaFilho01 + somaRendaFilho02 
                + somaRendaFilho03;
        
        System.out.println("Você tem um total de " + somaFilho 
                + " filhos e vai receber R$" + somaRendaTotal 
                + " reais de bolsa");
        
    }
}
