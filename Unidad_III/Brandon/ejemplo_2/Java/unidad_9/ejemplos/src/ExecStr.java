public class ExecStr
{
    public static void main(String[] args) {
        try {
            String[] cmd = new String[2];
            cmd[0]="notepad";cmd[1] = "File.java";
            Process p = Runtime.getRuntime().exec(cmd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}