public class GFG
{
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("Disponible:" + run.freeMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(run.availableProcessors());
    }
}