import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App {
    static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("src/main/java/log.properties");
        System.out.println("Please input the patient's name, age and weight, separate with whitespace, or press enter to quit");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        while(input.length() != 0){
            try {
                String[] info = input.split(" ");
                Patient patient = new Patient(info[0], Integer.parseInt(info[2]), Float.parseFloat(info[2]));
                Patient.setGroup(patient);
                Patient.setDrug(patient);
                logger.info(patient.toString());
                System.out.println(patient.getDrug());
                System.out.println("Please input the next patient's name, age and weight, separate with whitespace, or press enter to quit");
                input = keyboard.nextLine();
            } catch(Exception e) {
                logger.warn("Invalid input: "+ input);
                System.out.println("Invalid input, please input again");
                input = "";
                input = keyboard.nextLine();
            }
        }
        System.out.println("Thank you");
    }
}
