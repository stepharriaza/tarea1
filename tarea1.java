import java.io.IOException;
public class tarea1 {

    public static void main(String... args){
        String[] command = {
            ".\\docto.exe",
            "-f", ".\\MyFile.docx",
            "-O", ".\\MyFile.txt",
            "-T", "wdFormatText"
        };

        ProcessBuilder processBuilder = new ProcessBuilder(command);

        try {        
            Process process = processBuilder.start();

            int exitCode = process.waitFor();

            System.out.println("La aplicacion fue executada con código: "+exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}