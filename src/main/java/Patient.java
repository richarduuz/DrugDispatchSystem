import java.util.Random;


/**
 * The Patient Class
 */
public class Patient {
    /** Patient's name **/
    private String name;
    /** Patient's age **/
    private int age;
    /** Patient's weight **/
    private float weight;
    /** Random number to determine the durg **/
    private float randNum;
    /** Patient's group, according to the weight and age **/
    private int group;
    /** Patient's drug type **/
    private char drug;

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

    public void setGroup(int group) {
        if (group == 1 || group == 2 || group == 3){
            this.group = group;
        }
    }

    public void setRandNum(float randNum) {
        this.randNum = randNum;
    }

    public void setDrug(char drug) {
        if (drug == 'A' || drug == 'B') {
            this.drug = drug;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Weight: " + weight + " Random number: " + randNum + " Group: " + group +
                " Drug: " + drug;
    }
}