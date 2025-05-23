import java.util.Scanner;
import personajes.CondePesadilla;
import personajes.SenorAbismo;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //conde pesadilla
        CondePesadilla conde = new CondePesadilla("Conde Pesadilla", 15, 2, 100, 1, 1);
        //señor del abismo
        SenorAbismo senor = new SenorAbismo("Señor del abismo", 10, 150, 2, false, 1);

        int opcion;
        //mostrar las estadisticas iniciales
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("| nombre => " + conde.nombre + "          | nombre => " + senor.nombre + "          |");
        System.out.println("| fuerza => " + conde.fuerza + "                       | fuerza => " + senor.fuerza + "                        |");
        System.out.println("| vitalidad => " + conde.defensa + "                   | vitalidad => " + senor.defensa + "                      |");
        System.out.println("| velocidad => " + conde.velocidad + "                     | velocidad => " + senor.velocidad + "                    |");
        System.out.println("| numero de uso de habilidades => 1  | numero de uso de habilidades => 1   |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|              1                     |                   2                 |");
        System.out.println("¡escoge a tu personaje para la batalla!");
        int personajeEsco = scanner.nextInt();
        switch (personajeEsco) {
            case 1:
                System.out.println("!enhorabuena has escogido a!" + conde.nombre);
                do{
                    System.out.println("--------------------------------");
                    System.out.println("1. El conde pesadilla ataca");
                    System.out.println("2. El conde pesadilla hace trampa");
                    System.out.println("----------------------------------");
                    System.out.println("3. conde pesadilla se recupera");
                    System.out.println("4. El conde pesadilla intenta tomar el control de la mente de su oponente");
                    System.out.println("----------------------------------");
                    System.out.println("4. Mostrar estadísticas");
                    System.out.println("--------------------------------");
                    System.out.print("Elige una acción: ");

                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            conde.atacar(senor);
                            break;
                        case 2:
                            conde.trampa(senor);
                            break;
                        case 3:
                            conde.recuperarse();
                            break;
                        case 4:
                            conde.controlMental(senor);
                            break;
                        case 5:
                            conde.mostrarEstadisticas();
                            break;
                        default:
                            System.out.println("no bro, ese personaje no existe");
                    }
                    if(senor.defensa <= 0){
                        senor.resurreccion();
                    }
                    if(senor.defensa <= 0){
                        System.out.println(senor.nombre + " ha caido en batalla");
                        break; // Terminar el bucle si murió definitivamente
                    }

                    if (conde.defensa == 0) {
                        System.out.println(conde.nombre + " ha sido derrotado");
                        break;
                    }
                }while(opcion != 8);
            case 2:
                do{
                    System.out.println("--------------------------------");
                    System.out.println("1. El señor del abismo ataca");
                    System.out.println("2. El señor del abismo usa su ataque especial");
                    System.out.println("----------------------------------");
                    System.out.println("3. El señor del abismo se recupera");
                    System.out.println("4. El señor del abismo ");
                    System.out.println("----------------------------------");
                    System.out.println("4. Mostrar estadísticas");
                    System.out.println("--------------------------------");
                    System.out.print("Elige una acción: ");

                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            senor.atacar(conde);
                            break;
                        case 2:
                            senor.ataqueEspecial(conde);
                            break;
                        case 3:
                            senor.recuperarse();
                            break;
                        case 4:
                            senor.mostrarEstadisticas();
                            break;
                    }
                    if(senor.defensa <= 0){
                        senor.resurreccion();
                    }
                    if(senor.defensa <= 0){
                        System.out.println(senor.nombre + " ha caido en batalla");
                    }
                }while(opcion != 8);

            default:
                System.out.println("no bro, ese personaje no existe");

                scanner.close();
        }
    }
}
