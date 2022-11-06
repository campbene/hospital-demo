package hosptial;

public class Surgeon extends Doctor{
    private boolean isOperating;

    public Surgeon(String employeeNum, String name, String specialty, boolean isOperating) {
        super(employeeNum, name, specialty);
        this.isOperating = isOperating;
    }

    @Override
    public int calculatePay(){
        return 100000;
    }
}
