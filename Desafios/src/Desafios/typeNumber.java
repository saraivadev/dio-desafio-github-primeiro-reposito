package Desafios;

import java.io.IOException;
import java.util.Scanner;

public class typeNumber {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int  par = 0;
        int  impar = 0;
        int  positivo = 0;
        int  negativo = 0;
        int  cont;

//continue a solução
        while (leitor.hasNextInt()) {
            cont=leitor.nextInt();
            if(cont%2==0) par++;
            if(Math.abs(cont%2)==1) impar++;
            if(cont>0) positivo++;
            if(cont<0)negativo++;
        }
//insira suas variaveis corretamente
        System.out.println( + par +" valor(es) par(es)");
        System.out.println( + impar +" valor(es) impar(es)");
        System.out.println( + positivo +" valor(es) positivo(s)");
        System.out.println( + negativo +" valor(es) negativo(s)");
    }

}