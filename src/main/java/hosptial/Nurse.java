package hosptial;

public class Nurse extends HospitalEmployee implements MedicalDuties{
    private int numPatients;
    public Nurse(String employeeNum, String name, int numPatients) {
        super(employeeNum, name);
        this.numPatients = numPatients;
    }

    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }

    @Override
    public void drawPatientBlood(Patient sickPatient) {
        sickPatient.drawBlood(5);
    }

    @Override
    public int calculatePay() {
        return 80000;
    }
}
