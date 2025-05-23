package personajes;

public class CondePesadilla extends personaje{
    int usosAtaqueRobado;
    int habilidadTrampa;
    public  CondePesadilla(String nombre, int fuerza, int velocidad, int defensa, int usosAtaqueRobado, int habilidadTrampa){
        super(nombre, fuerza, velocidad, defensa);
        this.usosAtaqueRobado = usosAtaqueRobado;
        this.habilidadTrampa = habilidadTrampa;
    }
    //metodo para hacer trampa y duplicar su ataque
    public void trampa(personaje oponente){
        if(habilidadTrampa > 0){
            int dobleAtaque = fuerza * 2;
            System.out.println(nombre + " hace trampa y ataca con el doble  de fuerza: " +
                    dobleAtaque + " puntos de daño");
            oponente.defensa -= dobleAtaque;
            if(oponente.defensa < 0) oponente.defensa = 0;
            System.out.println(oponente.nombre + " ahora tiene " + oponente.defensa +
                    " puntos de resistencia ");
            habilidadTrampa--;
        }else{
            System.out.println("El conde pesadilla no puede usar la habilidad de trampa nuevamente");
        }
    }
    public void robarAtaque(personaje oponente){
        //guardar la fuerza original
        int fuerzaOriginal = this.fuerza;
        if(usosAtaqueRobado > 0){
            System.out.println(nombre + " roba la cantidad de ataque de " + oponente.nombre + " multiplicada por 2");
            this.fuerza = oponente.fuerza * 2;
            oponente.defensa -= this.fuerza;
            System.out.println("le aplica la potencia de sus golpes dejandolo a " + oponente.defensa + " puntos de vida ");
            if(oponente.defensa < 0) {oponente.defensa = 0;}
            //para que solo se pueda usar una vez
            usosAtaqueRobado--;
        }
        this.fuerza = fuerzaOriginal;
        System.out.println(this.nombre + " restaura su fuerza original");
    }
}
