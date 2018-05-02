public class Padre {
    public Padre() {
    }
    public void getNombre(){
        if (this.getClass().getCanonicalName().equals(Hijo.class.getCanonicalName())) {
            System.out.print("La clase instanciada, es la clase Hijo");
        }else{
            System.out.print("La clase instanciada, no es la clase Hijo");
        }
    }
}
