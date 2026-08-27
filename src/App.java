public class App {
    public static void main(String[] args)  {
        
     Estudiante irma = new Estudiante();
     irma.codigo = "N0001" ;
     irma.nombre = "Irma Bardales";
     irma.promedio = 16.5 ;
     irma.edad = 22;
     irma.mostraDatos();
     
     Estudiante juan = new Estudiante();
     juan.codigo = "N0002";
     juan.nombre = "Juan Perez";
     juan.promedio = 15;
     juan.becado = true;
     juan.mostraDatos();

     Estudiante pedro = new Estudiante();
     pedro.codigo = "N0003";
     pedro.nombre = " Pedro Porro";
     pedro.promedio = 18;
     pedro.sexo = 'M';
     pedro.mostraDatos();

    }
}
