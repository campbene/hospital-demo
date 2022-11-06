package hosptial;

public abstract class HospitalEmployee {
    protected String employeeNum;
    protected String name;

    public String getName() {
        return name;
    }
    public String getEmployeeNum() {
        return employeeNum;
    }
    public HospitalEmployee(String employeeNum, String name) {
        this.employeeNum = employeeNum;
        this.name = name;
    }

    public abstract int calculatePay();

}
