package cl.laboratoria;

import java.util.Scanner;

public class Main {


    //COLORES EN CONSOLA //
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";



    public static void  main(String[] args) {

        Asiento palcoUno = new Asiento("palco", 30000, 80, 80, true);
        Asiento palcoDos = new Asiento("palco", 30000, 80, 80, true);
        Asiento plateaUno = new Asiento("platea", 20000, 60, 60, false);
        Asiento plateaDos = new Asiento("platea", 20000, 60, 60, false);
        Asiento galeriaUno = new Asiento("galeria", 10000, 50, 50, false);
        Asiento galeriaDos = new Asiento("galeria", 10000, 50, 50, false);



        int opcion;
        do {
            Scanner ingresar = new Scanner(System.in);
            System.out.println("SISTEMA PARA RESERVAR ASIENTO\n");
            System.out.println("Palco Uno = Seleccione opcion 1");
            System.out.println("Palco Dos = Seleccione opcion 2");
            System.out.println("Platea Uno = Seleccione Opcion 3");
            System.out.println("Platea Dos = Seleccione Opcion 4");
            System.out.println("Galeria Uno = Seleccione Opcion 5");
            System.out.println("Galeria Dos = Seleccione Opcion 6");
            System.out.println("\nIngresar la Opcion: ");

            opcion = ingresar.nextInt();


            switch (opcion) {
                case 1:
                    if (palcoUno.disponible == true) {
                        System.out.println(palcoUno.toString());
                        palcoUno.setDisponible(false);
                    } else System.out.println(ANSI_RED + "Asiento ya reservado Seleccione otro Por Favor" + ANSI_RESET);


                    break;

                case 2:
                    if (palcoDos.disponible == true) {
                        System.out.println(palcoDos.toString());
                        palcoDos.setDisponible(false);
                    } else
                        System.out.println(ANSI_RED + "Asiento ya reservado Seleccione otro Por Favor" + ANSI_RESET);

                    break;


                case 3:
                    if (plateaUno.disponible == true) {
                        System.out.println(plateaUno.toString());
                        plateaUno.setDisponible(false);
                    } else
                        System.out.println(ANSI_RED + "Asiento ya reservado Seleccione otro Por Favor" + ANSI_RESET);

                    break;

                case 4:
                    if (plateaDos.disponible == true) {
                        System.out.println(plateaUno.toString());
                        plateaDos.setDisponible(false);
                    } else
                        System.out.println(ANSI_RED + "Asiento ya reservado Seleccione otro Por Favor" + ANSI_RESET);
                    break;

                case 5:
                    if (galeriaUno.disponible == true) {
                        System.out.println(galeriaUno.toString());
                        galeriaUno.setDisponible(false);
                    } else
                        System.out.println(ANSI_RED + "Asiento ya reservado Seleccione otro Por Favor" + ANSI_RESET);
                    break;

                case 6:
                    if (galeriaDos.disponible == true) {
                        System.out.println(galeriaDos.toString());
                    } else
                        System.out.println(ANSI_RED + "Asiento ya reservado Seleccione otro Por Favor" + ANSI_RESET);
                    break;
            }
        } while(opcion !=7);
    }

}
