import java.util.*;

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
                    if(modificarVideojuego(videoJuegos)){
                        System.out.println("Videojuego actualizado con éxito!");
                    } else {
                        System.out.println("Videojuego no encontrado...");
                    }
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
        System.out.print("##### Ejercicio Videojuegos #####\n" +
                "1. Crear arraylist del tipo Videojuego\n" +
                "2. Mostrar arraylist\n" +
                "3. Modificar videojuego (busqueda por codigo)\n" +
                "4. Mostrar videojuegos de consola Nintendo 64\n" +
                "5. Salir\n" +
                "?: ");
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
        //elegir.close();
    }
    // Opcion 1
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
        //cons.close();
        return new Videojuego(codigo, titulo, consola, cantJugadores, categoria);
    }
    // Opcion 2
    static public void mostrarVideojuegos(List<Videojuego> videojuegos){
        if(videojuegos.isEmpty()){
            System.out.println("No hay videoujegos cargos. Favor cargue algunos!");
        } else {
            System.out.printf("| %-6s | %-15s | %-15s | %-13s | %-15s |%n","Codigo","Titulo","Consola","N° Jugadores","Categoria");
            for(Videojuego vj : videojuegos){
                System.out.printf("| %06d | %-15s | %-15s | %-13s | %-15s |%n",vj.getCodigo(),vj.getTitulo(),vj.getConsola(),vj.getCantJugadores(),vj.getCategoria());
            }
        }
    }
    // Opcion 3
    static public boolean modificarVideojuego(List<Videojuego> videojuegos){
        boolean encontrado = false;
        Scanner cons = new Scanner(System.in);
        if(videojuegos.isEmpty()) {
            System.out.println("No hay videoujegos cargos. Favor cargue algunos!");
        } else {
            System.out.print("Ingrese el codigo a buscar: ");
            int codigo = cons.nextInt();
            cons.nextLine();
            for (Videojuego vj : videojuegos) {
                if (vj.getCodigo() == codigo) {
                    System.out.print("Ingrese el titulo: ");
                    String tit = cons.nextLine();
                    System.out.print("Ingrese la consola: ");
                    String con = cons.nextLine();
                    System.out.print("Ingrese la cantidad de jugadores: ");
                    int cantJug = cons.nextInt();
                    cons.nextLine();
                    System.out.print("Ingrese la categoria: ");
                    String categoria = cons.nextLine();
                    vj.setTitulo(tit);
                    vj.setConsola(con);
                    vj.setCantJugadores(cantJug);
                    vj.setCategoria(categoria);
                    encontrado = true;
                }
            }
        }
        //cons.close();
        return encontrado;
    }
}
