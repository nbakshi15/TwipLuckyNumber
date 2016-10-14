import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1;

        String user1 = null;
        String color1 = null;
        int lucky = 0;

        while(num != 0 && num != 1)
        {

            if(num != 0 && num != 1)
            {
                System.out.println("Please enter your first name");
                Scanner input2 = new Scanner(System.in);
                String name = input2.nextLine();
                System.out.println("Please enter your favorite color");
                String color = input2.next();
                perfectRandom user = new perfectRandom(name, color);
                user1 = user.perfName;
                color1 = user.perfColor;
                lucky = user.perfectSquareRandom;
                System.out.println("Enter '0' to exit or '1' to print your lucky number or '2' to enter another name and another color");

            }
            num = input.nextInt();
        }
        if(num == 0)
        {
            System.out.println("Goodbye! Have a nice day!");
        }
        else
        {
            System.out.println("Nice to meet you, " + user1 + "! Your favorite number is " + color1 + " and your lucky number is " + lucky);

        }
    }
}
