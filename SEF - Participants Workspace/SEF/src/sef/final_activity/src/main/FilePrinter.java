import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FilePrinter {

    public static void main(String[] args) {
        String s = "hello hdd!";
        try {
            File file = new File("text2.txt");
            System.out.println(file.getAbsolutePath());
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(s.getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
