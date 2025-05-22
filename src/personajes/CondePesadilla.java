package personajes;

public class CondePesadilla extends personaje{
    int robar;
    public  CondePesadilla(int robar, String nombre, int fuerza, int velocidad, int defensa, int vida){
        super(nombre, fuerza, velocidad, vida, defensa);
        this.robar = robar;
    }
    @Override
    public int ataqueBasico(){
        return super.ataqueBasico();
    }
    @Override
    public void mostrarEstadisticas(){
        super.mostrarEstadisticas();
    }
    public int robar(){
        this.robar = super.ataqueEspecial();
        return this.robar;
    }
}
