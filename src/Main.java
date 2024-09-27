import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cent = true;
        List<Videojuego> videoJuegos = new ArrayList<Videojuego>();

        while(cent){
            int op = menu();
            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    cent = false;
            }
            cent = false;
        }
    }

    static public int menu(){
        Scanner elegir = new Scanner(System.in);
        int sel;
        System.out.println("##### Ejercicio Videojuegos #####\n" +
                "1. Crear arraylist del tipo Videojuego\n" +
                "2. Mostrar arraylist\n" +
                "3. Modificar juego (busqueda por codigo)\n" +
                "4. Mostrar videojuegos de consola Nintendo 64\n" +
                "5. Salir");
        sel = elegir.nextInt();
        return sel;
    }

    static public Videojuego crearArraylist(){
        Scanner elegir = new Scanner(System.in);
        elegir
    }

    static public Videojuego crearVideojuego(){
        Scanner cons = new Scanner(System.in);
        System.out.print("Ingrese el codigo: ");
        int codigo = cons.nextInt();
        System.out.print("Ingrese el Titulo: ");
        String titulo = cons.next();
        System.out.print("Ingrese la consola: ");
        String consola = cons.next();
        System.out.print("Ingrese la cantidad de jugadores: ");
        int cantJugadores = cons.nextInt();
        System.out.print("Ingrese la categoria [numerico]: ");
        String categoria = cons.next();
        return new Videojuego(codigo, titulo, consola, cantJugadores, categoria);
    }

    static public void mostrarVideojuegos(){

    }

}