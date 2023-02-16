package dominio;

public class Ejercicio11 {
    public static int calcularProductoEscalar(int[]lista,int []lista2,int n){
        if(n>lista.length-1){
            return 0;
        }else{
            return lista[n]*lista2[n]+calcularProductoEscalar(lista,lista2,n+1);
        }

    }
}
