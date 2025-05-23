package personajes;

public class SenorAbismo extends personaje {
    boolean resucitado ;
    public SenorAbismo(String nombre, int fuerza, int defensa, int velocidad, boolean resucitado){
        super(nombre, fuerza, defensa, velocidad);
    }
    //metodo sobrecargado para un ataque especial
    public void ataqueEspecial(personaje oponente){
        int poderExtra = this.fuerza * 2; //el ataque especial depende de la velocidad
        System.out.println(nombre + " realiza un ataque especial a " + oponente.nombre
                + " con " + poderExtra + " puntos de daño");
        oponente.defensa -= poderExtra;
        if(oponente.defensa < 0) oponente.defensa = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.defensa +
                " puntos de vida");
    }
    //metodo para revivir
    public void resurreccion(){
        if(this.defensa == 0 && !resucitado){
            this.defensa = 30; //nuevo valor de la vida, solo si llega a 0
            System.out.println("¡" + this.nombre + " ha caido, pero vuelve de entre los muertos con "
            + this.defensa + " puntos de vida");
            resucitado = true;
        }
    }
}