package hosptial;

public class Doctor extends HospitalEmployee implements MedicalDuties {
    protected String specialty;

    public Doctor(String employeeNum, String name, String specialty){
        super(employeeNum, name);
        this.specialty = specialty;
    }

    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);
    }

    @Override
    public void drawPatientBlood(Patient sickPatient) {
        sickPatient.drawBlood(5);
    }

    @Override
    public int calculatePay() {
        return 90000;
    }

}
