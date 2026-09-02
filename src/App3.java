import java.util.Random;
//COMENTARIO DE PRUEBA
public class App3 {

    public static void main(String[] args) {
        String cadena= "Bienvenido a la clase de tecnicas de POO";
        char letra ='B';
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.length());
        System.out.println(cadena.toUpperCase());
        System.err.println(cadena.toLowerCase());
        System.out.println(cadena.substring(10,20 ));
        System.out.println(cadena.contains("clase"));
        System.out.println(cadena.replace("clase", "sesion"));
          
       System.out.println("");
       
       String cadena3 = "Victor";
       String cadena4 = "Victor";

       String candena5 = new String("Victor");

       System.out.println(cadena3 == cadena4);
       System.out.println(cadena3 == candena5);


        System.out.println("");
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(0,50));
        System.out.println(aleatorio.nextBoolean());
        System.out.println(aleatorio.nextDouble(0.0,1));;

        System.out.println("");

        System.out.println(Math.pow(12, 2));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.round(10.7));
        System.out.println(Math.round(10.3));
        System.err.println(Math.floor(10.8));
        System.out.println(Math.ceil(10.3));
        System.out.println(Math.E);
    }
}
