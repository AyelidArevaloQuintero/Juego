package personajes;

public class personaje {
    public String nombre;
    public int fuerza;
    public int velocidad;
    public int defensa;

    //constructor
    public personaje(String nombre, int fuerza,int velocidad, int defensa){
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.defensa = defensa;
    }
    //metodo para atacar al otro personaje
    public void atacar(personaje oponente){
        System.out.println(nombre + " ataca a " + oponente.nombre + " con una fuerza de " + fuerza + " puntos.");
        oponente.defensa -= fuerza;
        if (oponente.defensa< 0) oponente.defensa= 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.defensa + " puntos de resistencia.");
    }
    //metodo para mostrar las estadisticas del personaje
    public void mostrarEstadisticas(){
        System.out.println("tu personaje es => " + this.nombre);
        System.out.println("tu tu salud es => " + this.defensa);
        System.out.println("tu fuerza actual es => " + this.fuerza);
        System.out.println("tu velocidad actual es => " + this.velocidad);
    }
    //metodo para aumentar la defensa y la vida
    public void recuperarse(){
        defensa += 20;
        System.out.println(nombre + " se ha recuperado y ahora tiene " + defensa + " puntos de resistencia.");
        }

}