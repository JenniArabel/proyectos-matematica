package src;

//IMPORTAR CLASE SCANNER QUE PROPORCIONA MÉTODOS PARA LEER LA ENTRADA DEL USUARIO
import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //CREA UN NUEVO OBJETO SCANNER QUE LEERÁ LA ENTRADA DEL USUARIO DESDE LA CONSOLA (SYSTEM.IN)

        String binario; //TOMA EL NUMERO BINARIO COMO TEXTO

        //VERIFICAR QUE EL TENGA EXACTAMENTE 16 DIGITOS:
        do {
            //SOLICITAR AL USUARIO QUE INGRESE UN NÚMERO BINARIO DE 16 DÍGITOS:
            System.out.println("Ingrese un número binario de 16 dígitos: ");
            binario = scanner.nextLine(); //METODO NEXTLINE SIRVE PARA LEER UNA LÍNEA COMPLETA DE ENTRADA

            if (binario.length() != 16) {
                System.out.println("El número ingresado no tiene 16 dígitos. Inténtalo nuevamente.");
            }
        } while (binario.length() != 16);


        //CONVERTIR A DECIMAL:
        int decimal = Integer.parseInt(binario, 2); // PARA CONVERTIRLO A UN DECIMAL
        System.out.println("Decimal --> " + decimal);

        //CONVERTIR A OCTAL
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal --> " + octal);

        //CONVERTIR A HEXADECIMAL
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal --> " + hexadecimal.toUpperCase());

        scanner.close(); //CERRAR RECURSO SCANNER POR BUENA PRÁCTICA ASÍ SE LIBERAN LOS RECURSOS ASOCIADOS.
    }
}
