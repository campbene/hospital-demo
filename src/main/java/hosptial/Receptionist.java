package hosptial;

public class Receptionist extends Administrator{
    private boolean isOnPhone;
    public Receptionist(String employeeNum, String name, String department, boolean isOnPhone){
        super(employeeNum, name, department);
        this.isOnPhone = isOnPhone;
    }

    @Override
    public int calculatePay(){
        return 50000;
    }
}
