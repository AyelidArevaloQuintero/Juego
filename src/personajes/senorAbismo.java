package personajes;

public class senorAbismo extends personaje {

    public senorAbismo(String nombre, int fuerza, int vida, int defensa, int velocidad){
        super(nombre, fuerza, vida, defensa, velocidad);
    }

    @Override
    public void mostrarEstadisticas(){
        super.mostrarEstadisticas();
    }
    @Override
    public int ataqueBasico(){
        return super.ataqueBasico();
    }

    public int resurrecion(){
        System.out.println("Ah… qué molesto. Siempre lo mismo. Un inconveniente, sin duda, pero ¿la muerte? Un mero… trámite." +
                " Creían haberme extinguido, ¿no es así? Pensaban que el gran vacío, el olvido eterno, me reclamaría. " +
                "¡Qué ingenuos! El abismo no me devora; YO SOY EL ABISMO.");
        return this.vida = 30;
    }
}
