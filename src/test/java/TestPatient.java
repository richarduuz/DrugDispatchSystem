import static org.junit.Assert.assertEquals;

public class TestPatient {
    public static void main(String[] args) {
        /**
         * Unit test of group 1
         */
        Patient patient = new Patient("Richard", 25, 55);
        PatientUtil.setGroup(patient);
        assertEquals(1, patient.getGroup());
        PatientUtil.setDrug(patient);
        if (patient.getRandNum() < 0.25) assertEquals('A', patient.getDrug());
        else assertEquals('B', patient.getDrug());

        /**
         * Unit test of group 2
         */
        patient = new Patient("Richard", 25, 75);
        PatientUtil.setGroup(patient);
        assertEquals(2, patient.getGroup());
        PatientUtil.setDrug(patient);
        if (patient.getRandNum() < 0.5) assertEquals('A', patient.getDrug());
        else assertEquals('B', patient.getDrug());

        patient = new Patient("Richard", 80, 55);
        PatientUtil.setGroup(patient);
        assertEquals(2, patient.getGroup());
        PatientUtil.setDrug(patient);
        if (patient.getRandNum() < 0.5) assertEquals('A', patient.getDrug());
        else assertEquals('B', patient.getDrug());

        /**
         * Unit test of group 3
         */
        patient = new Patient("Richard", 80, 80);
        PatientUtil.setGroup(patient);
        assertEquals(3, patient.getGroup());
        PatientUtil.setDrug(patient);
        if (patient.getRandNum() < 0.75) assertEquals('A', patient.getDrug());
        else assertEquals('B', patient.getDrug());
    }
}
