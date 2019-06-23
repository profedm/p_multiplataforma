public class Finalizando{
 
    String nombre;
 
    Finalizando (String pNombre){
 
        this.nombre = pNombre;
 
    }
 
    @Override
    protected void finalize(){
        System.out.println(this.nombre);
    }
    public static void pasarGarbageCollector(){
 
        Runtime garbage = Runtime.getRuntime();
        garbage.gc();
    }
    public static void main (String[] args){
 
        Finalizando persona = new Finalizando("Martha");
        Finalizando.pasarGarbageCollector();
 
    }
}
