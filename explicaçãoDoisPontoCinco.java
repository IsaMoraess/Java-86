/*Calcule a potencia qualquer, sem usar a função pow. O usuário deverá entrar com
o valor da base e do expoente, e o programa deverá apresentar o resultado da
potência. Exemplo:
-base = 2
-expoente = 3
-potência = 23 = 2*2*2 = 8 */
import java.util.Scanner;
public class explicaçãoDoisPontoCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a base e o expoente");
        int base = sc.nextInt();
        int expoente = sc.nextInt();
        int potencia = 1;
        for (int i = 0; i < expoente; i++) {
            potencia = potencia * base;
        }
        System.out.println(potencia);
    }
}


