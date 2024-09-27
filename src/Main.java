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
                case 1: crearArraylist(videoJuegos);
                    break;
                case 2: mostrarVideojuegos(videoJuegos);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    cent = false;
            }
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
        System.out.print("?: ");
        sel = elegir.nextInt();
        return sel;
    }

    static public void crearArraylist(List<Videojuego> videojuegos){
        Scanner elegir = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de videojuegos a cargar: ");
        int n = elegir.nextInt();
        for(int i=0; i<n; i++){
            videojuegos.add(crearVideojuego());
        }
    }

    static public Videojuego crearVideojuego(){
        Scanner cons = new Scanner(System.in);
        System.out.print("Ingrese el codigo: ");
        int codigo = cons.nextInt();
        cons.nextLine();
        System.out.print("Ingrese el Titulo: ");
        String titulo = cons.nextLine();
        System.out.print("Ingrese la consola: ");
        String consola = cons.nextLine();
        System.out.print("Ingrese la cantidad de jugadores: ");
        int cantJugadores = cons.nextInt();
        System.out.print("Ingrese la categoria: ");
        String categoria = cons.next();
        cons.nextLine();
        return new Videojuego(codigo, titulo, consola, cantJugadores, categoria);
    }

    static public void mostrarVideojuegos(List<Videojuego> videojuegos){
        if(videojuegos.isEmpty()){
            System.out.println("No hay videoujegos cargos. Favor cargue algunos!");
        } else {
            System.out.println("Test");
        }
    }

}