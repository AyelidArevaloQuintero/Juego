package personajes;

public class SenorAbismo extends personaje {
    boolean resucitado ;
    int usosHabilidad;
    public SenorAbismo(String nombre, int fuerza,int velocidad, int defensa, boolean resucitado, int usosHabilidad){
        super(nombre, fuerza, defensa, velocidad);
        this.usosHabilidad = 0;
    }
    //metodo sobrecargado para un ataque especial
    public void ataqueEspecial(personaje oponente){
        if(usosHabilidad > 0){
            int poderExtra = this.fuerza * 3; //el ataque especial depende de la velocidad
            System.out.println(nombre + " realiza un ataque especial a " + oponente.nombre
                    + " con " + poderExtra + " puntos de daño");
            oponente.defensa -= poderExtra;
            if(oponente.defensa < 0) oponente.defensa = 0;
            System.out.println(oponente.nombre + " ahora tiene " + oponente.defensa +
                    " puntos de vida");
            usosHabilidad--;
        }
    }
    //metodo para revivir
    public void resurreccion(){
        if(this.velocidad == 0 && !resucitado){
            this.velocidad = 40; //nuevo valor de la vida, solo si llega a 0
            System.out.println("¡" + this.nombre + " ha caido, pero vuelve de entre los muertos con "
            + this.velocidad + " puntos de vida");
            resucitado = true;
        }
    }
}