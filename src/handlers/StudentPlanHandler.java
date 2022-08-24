package handlers;

import users.*;

public class StudentPlanHandler {

    public StudentPlanHandler() {

    }

    public boolean useSwipe() {
        return true;
    }

    public boolean usePlanDollars() {
        return true;
    }

    public boolean useCarolinaCash() {
        return true;
    }

    public int getMealSwipes(Student student) {
        return student.getMealSwipes();
    }

    public double getMealPlanDollars(Student student) {
        return student.getMealPlanDollars();
    }

    public double getCarolinaCash(Student student) {
        return student.getCarolinaCash();
    }

    public void addMealSwipes() {

    }

    public void addMealPlanDollars() {

    }

    public void addCarolinaCash() {

    }

    public void receiveSwipes() {

    }

    public void receiveMealPlanDollars() {

    }

    public void receiveCarolinaCash() {

    }

}
