public class Ejercicio03 {
    public static void main(String args[]){
        //se declara una variable
        int x = 10;

        //Se usa el el operador de adicion ++, pero este muestra 10 aun porque es un operador POSTfijo
        System.out.println(x++);

        //este es un operador prefijo, hace la suma antes de imprimirla a consola, valor 12
        System.out.println(++x);

        System.out.println(x--);
        System.out.println(--x);
    }
}

