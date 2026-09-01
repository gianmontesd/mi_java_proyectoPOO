import java.util.Scanner;
// Ejemplo de la clase semana 2
public class App2 {
    public static void main(String[] args){
        double balance = 2000;
        double montoRetirar;
        String dni;
        int tipoCliente = 0; // 1 banca minorista, 2. Cliente Privado, 3. Cliente Corporativo
        
        // Usar clase Scanner
        // Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);
        // Preguntar al usuario su dni (string)
        System.out.println("Ingrese su DNI: ");
        dni = scanner.nextLine(); // Leemos la informacion ingresada por el usuario
        // Preguntar al usuario su tipo cliente (int)
        System.out.println("Ingrese su tipo de cliente");
        tipoCliente = scanner.nextInt();
        // Preguntar al usuario su monto a retirar (double)
        System.out.println("Ingrese monto a retirar");
        montoRetirar = scanner.nextDouble();
        //Cerrar scanner
        scanner.close();
        // Identificar a nuestro cliente
        switch (tipoCliente) {
            case 1:
                System.out.println("Cliente de Banca Minorista");
                break;
            case 2:
                System.out.println("Cliente Privado");
                break;
            case 3:
                System.out.println("Cliente Corporativo");
                break;
            default:
                System.out.println("Tipo de Cliente no válido");
                break;
        }
        System.out.println("=========Retiro de Fondos=======");
        // IF ELSE
        if(balance == 0){
            System.out.println("El cliente no tiene fondos");
            // Terminar el programa
        }else if(montoRetirar > balance){
            System.out.println("Faltan fondos para completar el retiro");
        }else{
            balance = balance - montoRetirar;
            System.out.println("El nuevo balance es: " + balance);
        }
        System.out.println(" ");

        // Proceso de Liquidacion
        System.out.println("======== While - Proceso de Extractos Bancarios ======= ");
        int numeroExtractosAProcesar = 2;
        int contador = 1;
        while(contador <= numeroExtractosAProcesar){
            System.out.println("Extracto " + contador + " procesado.");

            // Actualizar el contador es importante 
            contador++;
        }
        System.out.println("\n======== Do While - Proceso de Extractos Bancarios ======= ");
        contador = 1;
        do {
            System.out.println("Extracto " + contador + " procesado");
            contador++;
        }while(contador <= numeroExtractosAProcesar);

        System.out.println("\n======== For - Proceso de Extractos Bancarios ======= ");
        for(contador = 1; contador <= numeroExtractosAProcesar; contador++){
            System.out.println("Extracto " + contador + " procesado");
        } 
    }
}
