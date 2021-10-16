package br.com.confidencecambio.javabasico;

import java.util.Scanner;

public class IMC {
 
    public static void main(String[] args) {
        double peso;
        double altura;
        
        System.out.println("\t Sistema ** IMC **! \n");
        @SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
        System.out.println("Informe o seu peso!");
        peso = leia.nextDouble();
        System.out.println("Informe a sua altura");
        
        altura = leia.nextDouble();
        
        double imc;
        
        imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");            
        }else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");            
        }else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Peso em excesso");            
        }else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");            
        }else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II");            
        }else{
            System.out.println("Obesidade grau III");            
        }
    }
}

