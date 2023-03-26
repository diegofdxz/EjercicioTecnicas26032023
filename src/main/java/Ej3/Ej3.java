package Ej3;
/*
Construya una función que convierta un número decimal en una cadena que represente el
valor del número en hexadecimal (base 16). A continuación, generalice la función para
convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante
expresiones lambda
 */
import java.util.Scanner;


public class Ej3 {
    interface Convertir {
        String convertir(int num, int base);
    }

    public static void convertirABaseX(Convertir c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número decimal: ");
        int numero = sc.nextInt();

        System.out.println("Ingrese la base de conversión (menor a 10): ");
        int base = sc.nextInt();


        c = (int n, int b) -> {
            String resultado = "";
            while (n > 0) {
                int residuo = n % b;
                resultado = residuo + resultado;
                n = n / b;
            }
            return resultado;
        };

        String resultado = c.convertir(numero, base);
        System.out.println("El número en base " + base + " es: " + resultado);
    }
    public static void convertirHex(Convertir c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número decimal: ");
        int numero = sc.nextInt();


        c = (int n, int b) -> {
            String resultado = "";
            while (n > 0) {
                int residuo = n % b;
                if (residuo < 10) {
                    resultado = residuo + resultado;
                } else {
                    switch (residuo) {
                        case 10:
                            resultado = "A" + resultado;
                            break;
                        case 11:
                            resultado = "B" + resultado;
                            break;
                        case 12:
                            resultado = "C" + resultado;
                            break;
                        case 13:
                            resultado = "D" + resultado;
                            break;
                        case 14:
                            resultado = "E" + resultado;
                            break;
                        case 15:
                            resultado = "F" + resultado;
                            break;
                    }
                }
                n = n / b;
            }
            return resultado;
        };

        String resultado = c.convertir(numero, 16);
        System.out.println("El número en base 16 es: " + resultado);
    }
    public static void Interfaz(){
        while (true) {

        System.out.println("Ingrese 1 para convertir a una base < 10 o 2 para convertir a hexadecimal: ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                Convertir c = null;
                convertirABaseX(c);
                break;
            case 2:
                Convertir c2 = null;
                convertirHex(c2);
                break;
            default:
                System.out.println("Opción inválida");
                Interfaz();
                break;
        }
        }
    }

    public static void main(String[] args) {
       Interfaz();
    }

}
