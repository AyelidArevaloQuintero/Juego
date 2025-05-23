import java.util.Scanner;
import personajes.CondePesadilla;
import personajes.SenorAbismo;
public class Main{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //conde pesadilla
        CondePesadilla conde = new CondePesadilla("Conde Pesadilla", 15, 2, 100, 1, 1);
    //señor del abismo
        SenorAbismo senor = new SenorAbismo("Señor del abismo",5, 150, 2, false);
        //mostrar las estadisticas iniciales
        senor.mostrarEstadisticas();
        conde.mostrarEstadisticas();

        //interaccion del usuario
        int opcion;
        do{
            System.out.println("Elige una acción:");
            System.out.println("--------------------------------");
            System.out.println("1. El señor del abismo ataca al conde pesadilla");
            System.out.println("2. El señor del abismo usa su ataque especial");
            System.out.println("--------------------------------");
            System.out.println("3. El conde pesadilla ataca al conde señor del abismo");
            System.out.println("4. El conde pesadilla hace trampa");
            System.out.println("----------------------------------");
            System.out.println("5. El señor del abismo se recupera");
            System.out.println("6. conde pesadilla se recupera");
            System.out.println("7. El conde pesadilla intenta robar el ataque del señor del abismo ");
            System.out.println("----------------------------------");
            System.out.println("8. Mostrar estadísticas");
            System.out.println("9. Terminar batalla");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    senor.atacar(conde);
                    break;
                case 2:
                    senor.ataqueEspecial(conde);
                    break;
                case 3:
                    conde.atacar(senor);
                    break;
                case 4:
                    conde.trampa(senor);
                    break;
                case 5:
                    senor.recuperarse();
                    break;
                case 6:
                    conde.recuperarse();
                    break;
                case 7:
                    conde.robarAtaque(senor);
                    break;
                case 8:
                    senor.mostrarEstadisticas();
                    conde.mostrarEstadisticas();
                    break;
                case 9:
                    System.out.println("La batalla ha terminado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            if(senor.defensa <= 0){
                senor.resurreccion();
            }
            // Si la defensa de alguno llega a 0, la batalla termina
            if (senor.defensa == 0) {
                System.out.println(senor.nombre + " ha sido derrotado. ¡El villano gana!");
                break;
            } else if (conde.defensa == 0) {
                System.out.println(conde.nombre + " ha sido derrotado. ¡El héroe gana!");
                break;
            }
        }while (opcion != 8);

        scanner.close();
    }
}