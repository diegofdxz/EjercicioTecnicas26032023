package Ej4;
/*
Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga
si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo,
“DABALEARROZALAZORRAELABAD” es un palíndromo
 */
import java.util.Scanner;

public class Ej4 {
    public static boolean palindromoIterativo(String cadena){
        int longitud = cadena.length();
        for (int i = 0; i < longitud/2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                return false;
            }

        }
        return true;
    }
    public static boolean palindromoRecursivo(String cadena){
        int longitud = cadena.length();
        if (longitud <= 1) {
            return true;
        }else{
            if (cadena.charAt(0) == cadena.charAt(longitud - 1)) {
                return palindromoRecursivo(cadena.substring(1, longitud - 1));
            }else{
                return false;
            }
        }
    }
    public static void Interfaz(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();
        System.out.println("Iterativo: " + palindromoIterativo(palabra));
        System.out.println("Recursivo: " + palindromoRecursivo(palabra));

    }
    public static void main(String[] args) {
        Interfaz();
    }
}
