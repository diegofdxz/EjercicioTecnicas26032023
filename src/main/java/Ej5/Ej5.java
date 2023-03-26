package Ej5;
/*
Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda,
una función que nos devuelva el máximo común divisor de dos números enteros
utilizando el algoritmo de Euclides.
ALGORITMO DE EUCLIDES
Dados dos números enteros positivos m y n, tal que m > n,
para encontrar su máximo común divisor
(es decir, el mayor entero positivo que divide a ambos):
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r).
 */
import java.util.Scanner;
public class Ej5 {
    interface Calcular{
        int calcular(int m, int n, Calcular f);
    }
    public static int MCDRecursivo(int a, int b) {
        Calcular Recursivo = (m, n, f) -> {
            if (n == 0) {
                return m;
            } else {
                return f.calcular(n, m % n, f);
            }
        };
        return Recursivo.calcular(a, b, Recursivo);
    }
    public static int MCDIterativo(int a, int b) {
        Calcular Iterativo = (m, n, f) -> {
            while (n != 0) {
                int r = m % n;
                m = n;
                n = r;
            }
            return m;
        };
        return Iterativo.calcular(a, b, Iterativo);
    }
    public static void Interfaz() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el primer numero");
            int a = sc.nextInt();
            System.out.println("Introduce el segundo numero");
            int b = sc.nextInt();
            System.out.println("Iterativo: " + MCDIterativo(a, b));
            System.out.println("Recursivo: " + MCDRecursivo(a, b));
        }
    }
    public static void main(String[] args) {
        Interfaz();
    }
}
