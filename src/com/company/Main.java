package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* COMPROBACION DE TODOS LOS METODOS
        System.out.println("La suma de 2+3= " + CalculadoraDeMano.sumar(2,3));
        System.out.println("La resta de 10-3= " + CalculadoraDeMano.restar(10,3));
        System.out.println("La multiplicacion de de 2*3= " + CalculadoraDeMano.multiplicar(2,3));
        System.out.println("La division de 5/3= " + CalculadoraDeMano.dividir(5,3));
        System.out.println("El 10% de 100= " + CalculadoraDeMano.porcentaje(10,100));
        System.out.println("El -4 cambiado de signo es= " + CalculadoraDeMano.cambiarSigno(-4));
        System.out.println("La raiz cuadrada de 4= " + CalculadoraDeMano.raizCuadrada(4));
        System.out.println("La potencia de 2 elevado a 3= " + CalculadoraDeMano.potencia(2,3));
         */

        String seguir = "S";

        do {
            System.out.println("CALCULADORA CONSOLA JAVA\n Introduzca:");
            System.out.println("\"+\" Para sumar \n\"-\" Para restar \n\"*\" Para multiplicar");
            System.out.println("\"/\" Para dividir \n\"%\" Para hallar porcentaje \n\"!\" Para cambiar signo");
            System.out.println("\"sq\" Para raiz cuadrada \n\"^\" Para la potencia");

            String op = sc.next();

            double num1 = 0;
            double num2 = 0;

            switch (op) {
                case "+":
                    System.out.print("Introduzca el primer sumando: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduzca el segundo sumando: ");
                    num2 = sc.nextDouble();
                    System.out.println("RESULTADO= " + CalculadoraDeMano.sumar(num1, num2));
                    break;

                case "-":
                    System.out.print("Introduzca el minuendo: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduzca el sustraendo: ");
                    num2 = sc.nextDouble();
                    System.out.println("RESULTADO= " + CalculadoraDeMano.restar(num1, num2));
                    break;

                case "*":
                    System.out.print("Introduzca el primer multiplicando: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduzca el segundo multiplicando: ");
                    num2 = sc.nextDouble();
                    System.out.println("RESULTADO= " + CalculadoraDeMano.multiplicar(num1, num2));
                    break;

                case "/":
                    System.out.print("Introduzca el dividendo: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduzca el divisor: ");
                    num2 = sc.nextDouble();
                    System.out.println("RESULTADO= " + CalculadoraDeMano.dividir(num1, num2));
                    break;

                case "%":
                    System.out.print("Introduzca el porcentaje: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduzca el numero al que le quieres hallar ese porcentaje: ");
                    num2 = sc.nextDouble();
                    System.out.println("RESULTADO= " + CalculadoraDeMano.porcentaje(num1, num2));
                    break;

                case "!":
                    System.out.print("Introduzca el numero a cambiar de signo: ");
                    num1 = sc.nextDouble();
                    System.out.println("RESULTADO= " + CalculadoraDeMano.cambiarSigno(num1));
                    break;

                case "sq":
                    System.out.print("Introduzca el numero para hallarle la raiz cuadrada: ");
                    num1 = sc.nextDouble();
                    System.out.println("RESULTADO= " + CalculadoraDeMano.raizCuadrada(num1));
                    break;

                case "^":
                    System.out.print("Introduzca el numero a elevar: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduzca la potencia: ");
                    num2 = sc.nextDouble();
                    System.out.println("RESULTADO= " + CalculadoraDeMano.potencia(num1, num2));
                    break;

                default:
                    break;

            }

            System.out.println("Desea realizar otra operacion? (S/N)");
            seguir = sc.next();

        } while (seguir.equalsIgnoreCase("S"));

    }
}
