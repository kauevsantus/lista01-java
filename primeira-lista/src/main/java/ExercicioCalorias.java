
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rails
 */
public class ExercicioCalorias {
    public static void main(String[] args) {
        
        Scanner verificar = new Scanner(System.in);
        
        System.out.println("Digite quantos minutos você se aqueceu: ");
        Integer aquecer = verificar.nextInt();
        
        System.out.println("Digite quantos minutos você fez "
                + "exercícios aeróbicos: ");
        Integer aerobico = verificar.nextInt();
        
        System.out.println("Digite quantos minutos você fez "
                + "exercícios de musculação: ");
        Integer musculacao = verificar.nextInt();
        
        Integer totalMinutos = aquecer + aerobico + musculacao;
        
        Integer perdaCaloriaTotal = (aquecer * 12) + (aerobico * 20) 
                + (musculacao * 25);
        
        System.out.println("Olá, Jorge. Você fez um total de " 
                + totalMinutos + " minutos de exercícios e perdeu cerca de " 
                + perdaCaloriaTotal + " calorias");
    }
}
