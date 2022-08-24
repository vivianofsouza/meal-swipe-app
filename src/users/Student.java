package users;

import java.util.UUID;

public class Student {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String planType;
    private int carolinaCash;
    private int mealSwipes;
    private int mealPlanDollars;
    private UUID id;

    public Student() {

    }

    public Student(String firstName, String lastName, String planType) {

    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPlanType() {
        return planType;
    }

    public int getCarolinaCash() {
        return carolinaCash;
    }

    public int getMealSwipes() {
        return mealSwipes;
    }

    public int getMealPlanDollars() {
        return mealPlanDollars;
    }

    public Object getID() {
        return null;
    }
}