package cl.cafetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Cafetera cafetera = new Cafetera(3000, 1000);
        Scanner scanner = new Scanner(System.in);
        String seleccion;

        do {

            System.out.println("\n Cafetera con: " + cafetera.getCantidadActual() + "\n");

            System.out.println("* Llenar Cafetera ------------> 1  *");
            System.out.println("* Vaciar Cafetera ------------> 2  *");
            System.out.println("* Servir Cafe a cliente ------> 3  *");
            System.out.println("* Agregar Cafe a Cafetera ----> 4  *");
            System.out.println("* Consultar nivel Cafetera ---> 5  *");
            System.out.println("* Salir del Sistema ----------> 0  *");
            System.out.print("\n Ingrese su selección: \n");


            seleccion = scanner.nextLine();

// validar el caso enter o vacio!!!
            switch (seleccion.charAt(0)) {
                case '1':
                    cafetera.llenarCafetera();
                    break;
                case '2':
                    cafetera.vaciarCafetera();
                    break;
                case '3':
                    if (!cafetera.servirTaza(250)) {
                        System.out.println("NO ALCANZA!");
                    } else {
                        System.out.println("SE LLENO LA TAZA!");
                    }
                    break;
                case '4':
                    if (!cafetera.agregarCafe(1000)) {
                        System.out.println("Se te rebosó la jarra!");
                    }
                    break;
                case '5':
                    System.out.println("Cafetera tiene: " + cafetera.getCantidadActual());
                    break;
                case '0':
                    System.out.println("Gracias por su consumo!");
                    break;
                default:
                    System.out.println("LA OPCION INGRESADA ES INVALIDA!");
            }
        } while (!(seleccion.charAt(0) == '0'));
        scanner.close();
    }
}