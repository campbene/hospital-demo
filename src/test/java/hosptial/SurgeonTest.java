package hosptial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {
    Surgeon underTest = new Surgeon("1", "name", "Specialty", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelFrom10to20WhenCaringForPatient(){
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20, healthLevel);
    }

    @Test
    public void shouldDecreaseBloodLevelFrom20To15WhenDrawn() {
        underTest.drawPatientBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);
    }
    @Test
    public void shouldExpectASalaryOf90k(){
        int salary = underTest.calculatePay();
        assertEquals(100000, salary);
    }
}
