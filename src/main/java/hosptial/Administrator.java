package hosptial;

public abstract class Administrator extends HospitalEmployee{

    private String department;
    public String getDepartment(){
        return department;
    }
    public Administrator(String employeeNum, String name, String department){
        super(employeeNum, name);
        this.department = department;
    }

    public abstract int calculatePay();
}
