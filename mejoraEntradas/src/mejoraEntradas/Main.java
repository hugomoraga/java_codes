package mejoraEntradas;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int valorEntrada = 10000;
        int total = 30;
        int disponible = 0;
        int ingresa = 0;

        // ARREGLO DE OBJETOS
        ArrayList < Entrada > listaEntrada = new ArrayList < Entrada > ();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < total; i++) {
            listaEntrada.add(new Entrada(i + 1, "platea", valorEntrada, false));
        }

        int opcion;

        do {
            System.out.println("Selecciones una opcion:");
            System.out.println("[1]. Comprar Entradas");
            System.out.println("[2]. Ver Disponibles");
            System.out.println("[3]. Ver Total Recaudado");
            System.out.println("[0]. Cerrar sesion");

            opcion = scan.nextInt();

            if (opcion == 0) {
                System.out.println("Cerrando sesion.");
            } else if (opcion == 1) {
                System.out.println("Opcion 1.");
                System.out.println("¿Desea Comprar entradas?");
                System.out.println("Cuantas Entradas desea comprar");

                Scanner ingresanumero = new Scanner(System.in);
                
                ingresa = ingresanumero.nextInt();

                if (ingresa == 0) {
                    System.out.println("Salir");
                    opcion = 0;
                } else {
                	
                	disponible = total - ingresa;
             
                    System.out.println("ENTRADAS COMPRADAS " + ingresa ); 
                    System.out.println("ENTRADAS DISPONIBLES " + disponible );          
               	
                }
            
            } else if (opcion == 2) {

                System.out.println("Opcion 2.");
                System.out.println("ENTRADAS DISPONIBLES " + disponible );          

            } else if (opcion == 3) {

                System.out.println("Opcion 3");
                int valorTotal = ingresa * valorEntrada;
                System.out.println("TOTAL RECAUDADO " + valorTotal );          
       
                
            } else {
                System.out.println("Opcion Invalida.");
            }

        } while (!(opcion == 0));

    }

}