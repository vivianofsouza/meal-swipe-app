package ui;

public class UISelector {

    private static UISelector mealPlanAppUI;

    public static void selectAccountType(int type) {
        // MealPlanUI mealPlanUI = null;
        if (type == 1) {
            System.out.println("Welcome, Student!");
            System.out.println("Enter your username and password to log-in");
        } else {
            System.out.println("Welcome, Administrator!");
            System.out.println("Enter your username and password to log-in");
        }
    }
}
