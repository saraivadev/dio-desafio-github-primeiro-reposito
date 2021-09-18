package Desafios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class mediaExames {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        float n1,n2,n3,n4,media,emexame,emexamefinal;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
// Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas
        media = (n1*2 + n2*3 + n3*4 + n4*1)/10;


        System.out.printf("Media: %.1f\n",media);

        //continue a solucao de acordo com o enunciado

        if ( media >= 7 ){
            System.out.printf("Aluno aprovado.\n");
        }
        else if (media < 5 ){
            System.out.printf("Aluno reprovado.\n");
        }
        else {
            System.out.printf("Aluno em exame.\n");

            emexame= sc.nextFloat();

            System.out.printf("Nota do exame: %.1f\n", emexame);
            emexamefinal=(media+emexame)/2;
            if(  emexamefinal>=5  ){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n", emexamefinal );
            }
            else{
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n", emexamefinal);
            }
        }

        sc.close();
    }
}
