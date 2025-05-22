package personajes;

public class personaje {
    protected String nombre;
    protected int fuerza;
    protected int velocidad;
    protected int defensa;
    protected int vida;

    //constructor
    public personaje(String nombre, int fuerza,int velocidad, int defensa, int vida){
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.defensa = defensa;
        this.vida = vida;
    }
    //metodo para atacar al otro personaje
    public int ataqueBasico(){
        if(this.defensa < this.fuerza){
            this.vida -= this.defensa - this.fuerza;
        }
        return this.vida;
    }
    //metodo para mostrar las estadisticas del personaje
    public void mostrarEstadisticas(){
        System.out.println("tu personaje es => " + this.nombre);
        System.out.println("tu salud es => " + this.vida);
        System.out.println("tu defensa es => " + this.defensa);
        System.out.println("tu fuerza actual es => " + this.fuerza);
        System.out.println("tu velocidad actual es => " + this.velocidad);
    }
    protected int ataqueEspecial(){
        return this.ataqueEspecial();
    }
    public void recibirDano(int dano){
        this.vida = Math.max(0, this.vida - dano);
        System.out.println(this.nombre + " recibe " + dano + " de daño");
    }
}