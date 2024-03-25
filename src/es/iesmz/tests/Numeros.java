package es.iesmz.tests;

public class Numeros {

    public static int sonIguales(int a, int b, int c){
        int resultado;
        if (a == b && a==c){
            resultado = 0;
        } else if (a == b || b == c){
            resultado = 1;
        } else {
            resultado = 2;
        }
        return resultado;
    }
}
