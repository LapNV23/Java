import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //First employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstname", "Dang");
        employeeDetails.put("lastname", "Kim Thi");
        employeeDetails.put("website", "codeLean.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        //Second employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstname", "Code");
        employeeDetails2.put("lastname", "Lean");
        employeeDetails2.put("website", "codeLean.vn");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject.put("employee", employeeDetails2);

        //Add employee to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        //write JSON file
        try(FileWriter file = new FileWriter("employee.json")) {
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}