package Desafios;

import java.util.Scanner;

public class calculoArea {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //declare suas variaveis do tipo double

        double raio = scan.nextDouble();//continue a solucao

        double area = 3.14159 * (Math.pow(  raio ,2));

        System.out.printf("A=%.4f\n", area);
    }
}
