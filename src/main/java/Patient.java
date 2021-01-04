import java.util.Random;


/**
 * The Patient Class
 */
public class Patient {
    private String name;
    private int age;
    private float weight;
    private float randNum;
    private int group;
    private char drug;


    /**
     * Set the group of the patient according to his or her age and weight.
     * @param patient
     */
    public static void setGroup(Patient patient){
        if (patient.age < 75){
            if (patient.weight < 65) patient.group = 1;
            else patient.group =  2;
        } else {
            if (patient.weight < 65) patient.group = 2;
            else patient.group = 3;
        }
    }

    /**
     * Set the drug type for this patient according to his or her group and the random number.
     * @param patient
     */
    public static void setDrug(Patient patient){
        Random rand = new Random();
        float tmp = rand.nextFloat();
        patient.randNum = tmp;
        char result = '.';
        switch(patient.group){
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
        patient.drug = result;
    }

    /**
     * Patient Constructor
     * @param Name
     * @param Age
     * @param Weight
     */
    Patient(String Name, int Age, float Weight){
        name = Name;
        age = Age;
        weight = Weight;
        group = 0;
        drug = '.';
        randNum = -1;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public float getWeight(){
        return weight;
    }

    public int getGroup(){
        return group;
    }

    public char getDrug() {
        return drug;
    }

    public float getRandNum() {
        return randNum;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Weight: " + weight + " Random number: " + randNum + " Group: " + group +
                " Drug: " + drug;
    }
}