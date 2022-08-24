import users.*;
import ui.*;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Scanner.*;

public class run {
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        Student student = new Student();
        UISelector appUI = new UISelector();
        System.out.println("Welcome to the MealPlanApp");
        System.out.println("Please press 1, if you are a Student. Please press 2 if you aren admin.");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        UISelector.selectAccountType(userInput);
        scanner.close();
    }

}
