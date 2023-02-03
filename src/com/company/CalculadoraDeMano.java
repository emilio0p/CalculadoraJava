package com.company;

public class CalculadoraDeMano {

    public static double sumar(double n1, double n2){
        return (n1+n2);
    }

    public static double restar(double n1, double n2){
        return (n1-n2);
    }

    public static double multiplicar(double n1, double n2){
        return (n1*n2);
    }

    public static double dividir(double n1, double n2){
        return (n1/n2);
    }

    public static double porcentaje(double n1, double n2){
        return (n1/100)*n2;
    }

    //SEGUN LA CALCULADORA DEL MOVIL
    public static double porcentaje(double n1){
        return (n1/100);
    }

    public static double cambiarSigno(double n1){
        return (-n1);
    }

    public static double raizCuadrada(double n1){
        return (Math.sqrt(n1));
    }

    public static double potencia(double n1,double n2){
        return (Math.pow(n1,n2));
    }
}
