package json;

import org.json.simple.JSONObject;

import users.Administrator;
import users.Student;

public class JSONSerializer {
    public static void writeStudentStringToJSON(Student student) {
        JSONObject studentObj = new JSONObject();

        studentObj.put("firstName", student.getFirstName());
        studentObj.put("lastName", student.getLastName());
        studentObj.put("username", student.getUsername());
        studentObj.put("password", "");
        studentObj.put("id", student.getID());
        studentObj.put("planType", student.getPlanType());
        studentObj.put("mealSwipes", student.getMealSwipes());
        studentObj.put("mealPlanDollars", student.getMealPlanDollars());
        studentObj.put("carolinaCash", student.getCarolinaCash());

        System.out.println(studentObj);
    }

    public static void writeAdminStringToJSON(Administrator administrator) {
        JSONObject adminObj = new JSONObject();

        adminObj.put("firstName", administrator.getFirstName());
        adminObj.put("lastName", administrator.getLastName());
        adminObj.put("username", administrator.getUsername());
        adminObj.put("password", "");
        adminObj.put("id", administrator.getID());

        System.out.println(adminObj);
    }
}
