public class //hello im max lol

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Do you want hard or easy");
        String userAnswer = userInput.nextLine();

        int max = 10;
        int min = 1;
        int range = max - min;

        int x = (int) (Math.random()*range+min);
        int y = (int) (Math.random()*range+min);

        if (userAnswer.equals("easy")) {
            System.out.println(x + "+" + y + "=");
            int sum = x + y;
            System.out.println(sum);

         } else if (userAnswer.equals("hard")) {
            System.out.print(x + "+" + y + "=");
            int product = x^y;
            System.out.println(product);
        }

    }
}
