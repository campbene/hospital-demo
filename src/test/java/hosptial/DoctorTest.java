package hosptial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {
    Doctor underTest = new Doctor("1", "name", "specialty");
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthOfPatientFrom10To20WhenProvidingCare(){
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(20, patientHealthLevel);
    }
    @Test
    public void shouldDecreaseBloodLevelFrom20To15WhenDrawn(){
        underTest.drawPatientBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);
    }
    @Test
    public void shouldExpectASalaryOf90k(){
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);
    }
}
