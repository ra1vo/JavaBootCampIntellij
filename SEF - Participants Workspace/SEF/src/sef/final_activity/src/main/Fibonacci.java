public class Fibonacci {

    public static void main(String[] args) {
        try {
            int input = Integer.parseInt(args[0]);
            int result = 0;
            int temp1 = 0;
            int temp2 = 1;
            for (int i = 0; i < input; i++){
                System.out.print(result + " ");
                if (result == 0)
                    result += 1;
                else {
                    result = temp1 + temp2;
                    temp1 = temp2;
                    temp2 = result;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Provide integer as argument");
        }

    }
}
