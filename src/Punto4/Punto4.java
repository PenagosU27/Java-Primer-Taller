package Punto4;

import java.util.Scanner;

public class Punto4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor N°1");
        int valor1 = teclado.nextInt();

        System.out.println("Ingrese valor N°2");
        int valor2 = teclado.nextInt();

        System.out.println("Ingrese valor N°3");
        int valor3 = teclado.nextInt();

        if(valor1 > valor2 && valor1 > valor3) {
            System.out.println("El número mayor es: " + valor1);
        }else if(valor2 > valor3) {
            System.out.println("El número mayor es: " + valor2);
        }else if(valor3 > valor2){
            System.out.println("El número mayor es: " + valor3);
        }else {
            System.out.println("El número esta repetido");
        }


    }
}
