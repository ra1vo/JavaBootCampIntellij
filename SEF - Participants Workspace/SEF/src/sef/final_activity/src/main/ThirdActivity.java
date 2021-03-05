import java.util.Date;

public class ThirdActivity {

    static String s;
    public static void main(String[] args) {
        try {
            s.toUpperCase();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("Thanks for using this software!");
        }
    }
}
