package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//ACTIVIDAD 3. Crea un algoritmo que pueda resolver una ecuación de segundo grado (x^2 + x + n)

     Scanner scanner=new Scanner(System.in);
        System.out.println("Programa para resolver ecuaciòn de 2ª grado x²+x+n: ");
        System.out.print("Dame el valor n: ");
        double n=scanner.nextDouble();
        double raiz=(1.0)-(4*n);
        if (raiz<0){
            double raiz1= Math.sqrt(raiz*(-1.0))/2;
            double sol_real=Math.pow((-0.5/2),2)-Math.pow(raiz1,2)+(-0.5/2)+n;
            double sol_img=(2*raiz1*(-0.5/2))+raiz1;
            System.out.println("Solución 1 parte real"+sol_real+" + "+sol_img+" i");
            System.out.println("Solución 1 parte real"+sol_real+" - "+sol_img+" i");
        }
        else{
            System.out.println(raiz);
            double x1=((-1)+Math.sqrt(raiz))/2;
            double x2=((-1)-Math.sqrt(raiz))/2;
            double solucion1=Math.pow(x1,2)+x1+n;
            double solucion2=Math.pow(x2,2)+x2+n;
            System.out.println("Los resultados de la función: "+"sol1: "+solucion1+" sol2: "+solucion2);
        }
    }
}
