package Desafios;


    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class salary {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int numberHour = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            double amountHour = Double.parseDouble(st.nextToken());

            double salary = numberHour * amountHour; // Altere o valor da variável com o cálculo esperado
            System.out.println("NUMBER = " + id);
            System.out.printf("SALARY = U$ %.2f", salary);
        }
    }

