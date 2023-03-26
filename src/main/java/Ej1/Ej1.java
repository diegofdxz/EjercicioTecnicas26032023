package Ej1;
/*
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
 */

public class Ej1 {
    static final double N = 2;
    static final double PREC = 1e-6;
    static double f(double x) {
        return x * x - N;
    }
    static double bisectIterativo(double min, double max) {
        double med = (min + max) / 2;
        while (max - min > PREC) {
            if (f(min) * f(med) < 0) {
                max = med;
            } else {
                min = med;
            }
            med = (min + max) / 2;
        }
        return med;
    }

    public static void main(String[] args) {
        System.out.println(bisectIterativo(0, 2));
    }
}
