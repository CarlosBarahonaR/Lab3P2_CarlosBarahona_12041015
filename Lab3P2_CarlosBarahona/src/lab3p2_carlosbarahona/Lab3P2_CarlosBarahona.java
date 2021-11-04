/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab3P2_CarlosBarahona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        // TODO code application logic here
        ArrayList<Jugadores> jugadores = new ArrayList();
        int opcion = 0;
        int agregadas = 0;
        int agregadas2 = 0;
        int agregadas3 = 0;
        while (opcion != 0) {
            System.out.println("Clash Royale\n"
                    + "¿Qué desea hacer?\n"
                    + "0) Salir\n"
                    + "1) Crear jugador\n"
                    + "2) Añadir carta a jugador\n"
                    + "3) Añadir Torre de arquera a jugador\n"
                    + "4) Añadir Torre de rey a jugador\n"
                    + "5) Editar jugador\n"
                    + "6) Eliminar jugador\n"
                    + "7) Listar jugador\n"
                    + "8) Listar jugadores\n"
                    + "9) Eliminar Torre de arquera a jugador\n"
                    + "10) Eliminar Torre de rey a jugador\n"
                    + "11) Listar torres de jugador\n"
                    + "12) Eliminar carta de jugador\n"
                    + "13) Listar cartas de jugador\n"
                    + "14) Jugar");
            opcion = r.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre del jugador");
                    String nombre = r.next();
                    ArrayList<Cartas> cartas = new ArrayList();
                    ArrayList<Torres> torres = new ArrayList();
                    jugadores.add(new Jugadores(nombre, cartas, torres));

                    break;
                }
                case 2: {
                    System.out.println("Ingrese el nombre jugador al cual desea agregar cartas");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {

                        int opcion2 = 0;

                        while (agregadas != 6) {
                            System.out.println(
                                    "¿Qué carta desea agregar?\n"
                                    + "1) Especiales\n"
                                    + "2) Rara\n"
                                    + "3) Legendaria");
                            opcion2 = r.nextInt();
                            switch (opcion2) {
                                case 1: {
                                    System.out.println("Ingrese el costo de elixir de la carta");
                                    int costo = r.nextInt();

                                    System.out.println("Ingrese la velocidad de la carta");
                                    int velocidad = r.nextInt();
                                    System.out.println("Ingrese el nombre de la carta");
                                    String nombre2 = r.next();

                                    System.out.println("Ingrese la vida de la carta");
                                    int vida = r.nextInt();

                                    ((Jugadores) jugadores.get(item2)).getCartas().add(new CartasEspeciales(vida, costo, velocidad, nombre2));
                                    agregadas += 1;
                                    break;
                                }

                                case 2: {
                                    System.out.println("Ingrese el costo de elixir de la carta");
                                    int costo = r.nextInt();

                                    System.out.println("Ingrese la velocidad de la carta");
                                    int velocidad = r.nextInt();
                                    System.out.println("Ingrese el nombre de la carta");
                                    String nombre2 = r.next();

                                    System.out.println("Ingrese el ataque de la carta");
                                    int ataque = r.nextInt();

                                    ((Jugadores) jugadores.get(item2)).getCartas().add(new CartasEpicas(ataque, costo, velocidad, nombre2));
                                    agregadas += 1;
                                    break;
                                }
                                case 3: {
                                    System.out.println("Ingrese el costo de elixir de la carta");
                                    int costo = r.nextInt();

                                    System.out.println("Ingrese la velocidad de la carta");
                                    int velocidad = r.nextInt();
                                    System.out.println("Ingrese el nombre de la carta");
                                    String nombre2 = r.next();

                                    System.out.println("Ingrese el ataque de la carta");
                                    int ataque = r.nextInt();

                                    System.out.println("Ingrese la vida de la carta");
                                    int vida = r.nextInt();

                                    ((Jugadores) jugadores.get(item2)).getCartas().add(new CartaLegendaria(ataque, vida, costo, velocidad, nombre2));
                                    agregadas += 1;
                                    break;
                                }

                            }

                        }

                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Ingrese el nombre jugador al cual desea agregar la torre de arquera");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {

                        while (agregadas2 != 2) {

                            System.out.println("Ingrese el ataque de la torre de arquera");
                            int ataque = r.nextInt();

                            System.out.println("Ingrese la vida de la torre de arquera");
                            int vida = r.nextInt();

                            ((Jugadores) jugadores.get(item2)).getTorres().add(new TorreArquera(ataque, vida));
                            agregadas2 += 1;
                        }

                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Ingrese el nombre jugador al cual desea agregar la torre del rey");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {

                        while (agregadas3 != 1) {

                            System.out.println("Ingrese el nombre del reino de la torre del rey");
                            String nombre3 = r.next();
                            System.out.println("Ingrese la vida de la torre del rey");
                            int vida = r.nextInt();

                            ((Jugadores) jugadores.get(item2)).getTorres().add(new TorreDelRey(nombre3, vida));
                            agregadas3 += 1;
                        }

                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }

                case 5: {
                    System.out.println("Ingrese el nombre jugador al cual desea editar");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {

                        ((Jugadores) jugadores.get(item2)).setNombre(r.next());

                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }

                case 6: {
                    System.out.println("Ingrese el nombre jugador al cual desea eliminar");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {

                        jugadores.remove(item2);
                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }

                case 7: {
                    System.out.println("Ingrese el nombre jugador al cual desea listar");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {

                        System.out.println(jugadores.get(item2));
                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }

                case 8: {

                    for (int z = 0; z < jugadores.size(); z++) {

                        System.out.println(jugadores.get(z));
                    }
                    break;
                }

                case 9: {
                    System.out.println("Ingrese el nombre jugador al cual desea eliminar una torre de arquera");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {
                        if ((((Jugadores) jugadores.get(item2)).getTorres().size()) > 0) {

                            for (int x = 0; x < (((Jugadores) jugadores.get(item2)).getTorres().size()); x++) {

                                if ((((Jugadores) jugadores.get(item2)).getTorres().get(x) instanceof TorreArquera)) {
                                    ((Jugadores) jugadores.get(item2)).getTorres().remove(0);
                                    x = jugadores.size();
                                }
                            }
                        }

                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }
                case 10: {
                    System.out.println("Ingrese el nombre jugador al cual desea eliminar una torre de rey");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {
                        if ((((Jugadores) jugadores.get(item2)).getTorres().size()) > 0) {

                            for (int x = 0; x < (((Jugadores) jugadores.get(item2)).getTorres().size()); x++) {

                                if ((((Jugadores) jugadores.get(item2)).getTorres().get(x) instanceof TorreDelRey)) {
                                    ((Jugadores) jugadores.get(item2)).getTorres().remove(0);
                                    x = jugadores.size();
                                }
                            }
                        }

                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }
                case 11: {
                    System.out.println("Ingrese el nombre jugador al cual desea listar las torres");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {
                        if ((((Jugadores) jugadores.get(item2)).getTorres().size()) > 0) {

                            for (int x = 0; x < (((Jugadores) jugadores.get(item2)).getTorres().size()); x++) {
                                System.out.println(((Jugadores) jugadores.get(item2)).getTorres().get(x));

                            }
                        }

                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }

                case 12: {
                    System.out.println("Ingrese el nombre jugador al cual desea eliminar una carta");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {

                        if ((((Jugadores) jugadores.get(item2)).getCartas().size()) > 0) {

                            int opcion4 = 0;
                            System.out.println("¿Que tipo de carta desea eliminar?\n"
                                    + "1) Especiales\n"
                                    + "2) Epicas\n"
                                    + "3) Legendarias");
                            switch (opcion4) {
                                case 1: {
                                    for (int x = 0; x < (((Jugadores) jugadores.get(item2)).getCartas().size()); x++) {

                                        if ((((Jugadores) jugadores.get(item2)).getCartas().get(x) instanceof CartasEspeciales)) {
                                            ((Jugadores) jugadores.get(item2)).getCartas().remove(0);
                                            x = jugadores.size();
                                        }
                                    }
                                    break;
                                }
                                case 2: {
                                    for (int x = 0; x < (((Jugadores) jugadores.get(item2)).getCartas().size()); x++) {

                                        if ((((Jugadores) jugadores.get(item2)).getCartas().get(x) instanceof CartasEpicas)) {
                                            ((Jugadores) jugadores.get(item2)).getCartas().remove(0);
                                            x = jugadores.size();
                                        }
                                    }
                                    break;
                                }
                                case 3: {
                                    for (int x = 0; x < (((Jugadores) jugadores.get(item2)).getCartas().size()); x++) {

                                        if ((((Jugadores) jugadores.get(item2)).getCartas().get(x) instanceof CartaLegendaria)) {
                                            ((Jugadores) jugadores.get(item2)).getCartas().remove(0);
                                            x = jugadores.size();
                                        }
                                    }
                                    break;
                                }

                            }

                        }

                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }

                case 13: {
                    System.out.println("Ingrese el nombre jugador al cual desea listar sus cartas");
                    String nombre = r.next();
                    int item2 = 0;
                    for (int x = 0; x < jugadores.size(); x++) {

                        if (nombre.equals(((Jugadores) jugadores.get(x)).getNombre())) {
                            item2 = x;
                            x = jugadores.size();
                        } else {
                            item2 = 1000;
                        }
                    }
                    if (item2 <= jugadores.size()) {
                        if ((((Jugadores) jugadores.get(item2)).getCartas().size()) > 0) {

                            for (int x = 0; x < (((Jugadores) jugadores.get(item2)).getCartas().size()); x++) {
                                System.out.println(((Jugadores) jugadores.get(item2)).getCartas().get(x));

                            }
                        }

                    } else {
                        System.out.println("No se encontro el nombre del jugador en la lista. Consulte con el soporte tecnico de la compañia.");
                    }
                    break;
                }

            }
        }

    }

}
