package personajes;

public class MadameMortycia extends personaje {

    public MadameMortycia(String nombre, int vida, int fuerza, int defensa,int velocidad ){
        super(nombre, fuerza, vida, defensa, velocidad);
    }
    /*
    public int robarVida(personaje oponente){
        if(oponente.vida >= 0 ){
            System.out.println("no puedes robarle vida a alguien que no la tiene");
        }

    }

     */
    @Override
    public void mostrarEstadisticas(){
        super.mostrarEstadisticas();
    }
    @Override
    public void recibirDano(int dano){
        super.recibirDano(dano);
    }
    @Override
    public int ataqueBasico(){
        return super.ataqueBasico();
    }
}