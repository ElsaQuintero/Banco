/* Banco Tony Stark
    Nombre del cliente: Tony Stark
    Tipo de cuenta: Premium
    Saldo disponible: $1,256,989.52 dolares

    ***************************************
    ** Escriba el número de la opción deseada **
    1.  Consultar saldo
    2.  Retirar
    3.  Depositar
    9.  Salir
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Bienvenida
        System.out.println("Bienvenido a tu banco,\n¿Con quién me comunico?");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        double saldo = 1256989.52;

        System.out.println("Buen día " + nombre + ", bienvenido a su cuenta Premium\nNombre del cliente: " + nombre + "\nTipo de cuenta: Premium \nSaldo disponible: $" + saldo + " dolares\n");
        // Recibe la opción
        int opcion = 0;

        while(opcion != 9){
            System.out.println("*************************************** \n ** Escriba el número de la opción deseada ** \n 1.  Consultar saldo\n 2.  Retirar\n 3.  Depositar\n 9.  Salir");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Saldo actualizado = " + saldo);
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad a retirar");
                    double retiro = teclado.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                    saldo -= retiro;
                    System.out.println("Su saldo actual es $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Ingresa la cantidad a depositar");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("Su saldo actual es $" + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por ser parte de la familia Banco, nos vemos");
                    break;
                default:
                    System.out.println("Esta opción no es valida");
            }
        }
    }
}