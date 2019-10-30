package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//ACTIVIDAD 3. Crea un algoritmo que pueda resolver una ecuación de segundo grado (x^2 + x + n)
     double solucion1=0,solucion2=0,n=0,x1=0,x2=0;
     Scanner scanner=new Scanner(System.in);
        System.out.println("Programa para resolver ecuaciòn de 2ª grado x²+x+n: ");
        System.out.print("Dame el valor n: ");
        n=scanner.nextDouble();
        double raiz=1-(4*n);
        if (raiz<0){
            double raiz1= raiz*(-1.0);
            double img = Math.sqrt(raiz)/2;
            double sol_real =Math.pow(-0.5,2)-Math.pow(img,2);
            double sol_img=2*sol_real*img;
            System.out.println("Solución 1 parte real"+sol_real+" + "+sol_img+" i");
            System.out.println("Solución 1 parte real"+sol_real+" - "+sol_img+" i");
        }
        else{
            x1=(-1+Math.sqrt(raiz))/2;
            x2=(-1-Math.sqrt(raiz))/2;
            solucion1=Math.pow(x1,2)+x1+n;
            solucion2=Math.pow(x2,2)+x2+n;
            System.out.println("Los resultados de la función: "+"sol1: "+solucion1+" sol2: "+solucion2);
        }
    }
}
