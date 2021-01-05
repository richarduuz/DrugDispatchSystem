import java.util.Random;

/**
 * Util of the Patient class
 */
public class PatientUtil {

    /**
     * Check whether the input of age and weight are valid or not.
     * If invalid, return True
     * @param age
     * @param weight
     * @return whether the input is invalid
     */
    public static boolean inputChecker(int age, float weight){
        return (age < 0 || weight < 0);
    }

    /**
     * Set the group of the patient according to his or her age and weight.
     * @param patient
     */
    public static void setGroup(Patient patient){
        if (patient.getAge() < 75){
            if (patient.getWeight() < 65) patient.setGroup(1);
            else patient.setGroup(2);
        } else {
            if (patient.getWeight() < 65) patient.setGroup(2);
            else patient.setGroup(3);
        }
    }

    /**
     * Set the drug type for this patient according to his or her group and the random number.
     * @param patient
     */
    public static void setDrug(Patient patient){
        Random rand = new Random();
        float tmp = rand.nextFloat();
        patient.setRandNum(tmp);
        char result = '.';
        switch(patient.getGroup()){
            case(1): {
                if (tmp < 0.25){
                    result = 'A';
                } else {
                    result = 'B';
                }
                break;
            }
            case(2): {
                if (tmp < 0.5){
                    result = 'A';
                } else {
                    result = 'B';
                }
                break;
            }
            case(3): {
                if (tmp < 0.75){
                    result = 'A';
                } else {
                    result = 'B';
                }
                break;
            }
        }
        patient.setDrug(result);
    }
}
