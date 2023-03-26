# EjercicioTecnicas26032023
## Mi repositorio es: https://github.com/diegofdxz/EjercicioTecnicas26032023.git

Ejercicios repaso
1. Dado el siguiente fragmento de código C:

static final double N = 2; 

static final double PREC = 1e-6;

static double f (double x)

{

return x*x-N;

}

static double bisect (double min, double max)

{

double med = (min+max)/2;

if (max-min<PREC) { 

return med;

} else if (f(min)*f(med)<0) { 

return bisect (min,med);

} else {

return bisect (med,max);

}

}

a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)?
Calcula la raiz cuadrada de N, utilizando el método de bisección

Si cambiamos el valor de N, ¿qué estaríamos calculando?
Calculariamos la raiz cuadrada de otro numero, en el caso del codigo original este calcula la raiz cuadrada de 2

¿Y si cambiásemos la función f(x)?
Si cambiamos la función f(x) en el código, estamos cambiando la función que se utiliza para encontrar el cero utilizando el método de bisección.

b) Implemente un algoritmo iterativo equivalente.
codigo en src/main/java/Ej1/Ej1.java


2. Dado el siguiente algoritmo recursivo:

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

a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función 
recursiva f(x,2)? 
muestra por pantala todos los factores primos del numero x

¿Cuál sería un nombre más adecuado para la función f?
mostrarPrimos

b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda 
equivalentes.
se encuentra en src/main/java/Ej2/Ej2.java

3. Construya una función que convierta un número decimal en una cadena que represente el 
valor del número en hexadecimal (base 16). A continuación, generalice la función para 
convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante 

expresiones lambda.
Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16 
en las cuales los restos determinan los dígitos hexadecimales del número según 
la siguiente correspondencia:
Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Dígito 0 1 2 3 4 5 6 7 8 9 A B C D E F
Por ejemplo:
65029|10 = FE05|16
4. Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga 
si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo, 
“DABALEARROZALAZORRAELABAD” es un palíndromo.
5. Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda, 
una función que nos devuelva el máximo común divisor de dos números enteros 
utilizando el algoritmo de Euclides.
ALGORITMO DE EUCLIDES
Dados dos números enteros positivos m y n, tal que m > n, 
para encontrar su máximo común divisor
(es decir, el mayor entero positivo que divide a ambos):
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r).
