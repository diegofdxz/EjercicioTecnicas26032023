package Ej2;
/*
void f(int num, int div)
{
if (num>1) {
if ((num%div) == 0) {
System.out.println(div);
f(num/div,div);
} else {
f(num,div+1);
}
}
}
 */
import java.util.Scanner;
public class Ej2 {
    void factoresPrimosIterativo(int num, int div) {
        while (num > 1) {
            if ((num % div) == 0) {
                System.out.println(div);
                num = num / div;
            } else {
                div++;
            }
        }
    }
    void factoresPrimosLambda(int num, int div) {
        while (num > 1) {
            if ((num % div) == 0) {
                System.out.println(div);
                num = num / div;
            } else {
                div++;
            }
        }
    }


    public static void main(String[] args) {
        Ej2 ej2 = new Ej2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        System.out.println("Divisor: ");
        int div = sc.nextInt();
        System.out.println("Iterativo: ");
        ej2.factoresPrimosIterativo(num, div);
        System.out.println("Lambda: ");
        ej2.factoresPrimosLambda(num, div);
    }
}
