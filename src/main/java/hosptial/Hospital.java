package hosptial;

import java.util.*;

public class Hospital {
    Map<String, HospitalEmployee> employeeList = new HashMap<>();
    Map<Integer, Patient> patientList = new HashMap<>();
    private int patientId;

    public void hire(HospitalEmployee employeeToHire) {
        employeeList.put(employeeToHire.getEmployeeNum(), employeeToHire);
    }

    public HospitalEmployee findEmployee(String employeeNum) {
        return employeeList.get(employeeNum);
    }

    public Collection<HospitalEmployee> getAllEmployees() {
        return employeeList.values();
    }

    public Collection<HospitalEmployee> getMedicalEmployees() {
        Collection<HospitalEmployee> medicalEmployees = new ArrayList<>();
        for(HospitalEmployee employee: employeeList.values()){
            if(employee instanceof MedicalDuties){
                medicalEmployees.add(employee);
            }
        }
        return medicalEmployees;
    }

    public void admit(Patient patientToAdmit) {
        patientId++;
        patientList.put(patientId, patientToAdmit);
    }

    public Collection<Patient> getAllPatients() {
        return patientList.values();
    }
}
