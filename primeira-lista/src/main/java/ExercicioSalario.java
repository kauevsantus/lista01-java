
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rails
 */
public class ExercicioSalario {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        
        System.out.println("Digite seu salário bruto");
        Double bruto = salario.nextDouble();
        
        Double inss = bruto * 0.1;
        System.out.println("inss: " + inss);
        
        Double ir = bruto * 0.2;
        System.out.println("ir: " + ir);
        
        System.out.println("Quanto custa a condução diaria so de ida da casa"
                + " para o trabalho");
        
        Double passagem = salario.nextDouble();
        
        Double conducao = passagem * 2 * 22;
        System.out.println("condução: " + conducao);
        
        Double totalDesconto = inss + ir + conducao;
        Double totalLiquido = bruto - inss - ir - conducao;
        
        
        System.out.println("Seu salário bruto é R$" + bruto + ", tem um "
                + "total de R$" + totalDesconto + " em descontos e receberá "
                + "um líquido de R$" + totalLiquido);
    }
}
