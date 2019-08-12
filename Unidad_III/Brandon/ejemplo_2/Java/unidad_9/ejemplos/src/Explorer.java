public class Explorer
{
    public static void main(String[] args) {
        try {
            Runtime run = Runtime.getRuntime();
            Process P = run.exec("explorer");
            System.out.println("Explorer App");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}