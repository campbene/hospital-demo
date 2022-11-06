package hosptial;

public class Janitor extends Administrator{
    private boolean isCleaning;
    public Janitor(String employeeNum, String name, String department, boolean isCleaning){
        super(employeeNum, name, department);
        this.isCleaning = isCleaning;
    }

    @Override
    public int calculatePay(){
        return 50000;
    }
}
