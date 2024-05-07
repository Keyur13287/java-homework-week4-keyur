package homework.encapsulation26;

public class Encapsulate {
    // private variables declared these can only beaccessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    // get method for name to access private variablename
    public String getName() {
        return name;
    }

    // set method for name to access private variablename
    public void setName(String name) {
        this.name = name;
    }

    // get method for roll to access private variablerollNo
    public int getRollNo() {
        return rollNo;
    }

    // set method for roll to access private variablerollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // get method for age to access private variable age
    public int getAge() {
        return age;
    }

    // set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }

}
