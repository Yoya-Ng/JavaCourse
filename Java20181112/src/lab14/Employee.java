package lab14;

public class Employee {

    String name;
    int salary;
    String level;
    static String comName = "華華";

    void setLevel() {
        if (salary >= 100000) {
            level = "經理";
        } else if (salary >= 50000) {
            level = "副理";
        } else if (salary >= 40000) {
            level = "襄理";
        } else {
            level = "辦事員";
        }
    }

}
