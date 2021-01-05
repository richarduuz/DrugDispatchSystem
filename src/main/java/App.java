import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class App {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory();
        Logger logger = loggerFactory.getLoggerType("PATIENT").getLogger();
        System.out.println("Please input the patient's name, age and weight(kilogram) in order, separate with whitespace, or press enter to quit");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        while(input.length() != 0){
            try {
                String[] info = input.split(" ");
                if (PatientUtil.inputChecker(Integer.parseInt(info[1]), Float.parseFloat(info[2]))){
                    throw new InputMismatchException("Age or weight must be positive");
                }
                Patient patient = new Patient(info[0], Integer.parseInt(info[1]), Float.parseFloat(info[2]));
                PatientUtil.setGroup(patient);
                PatientUtil.setDrug(patient);
                logger.info(patient.toString());
                System.out.println("The drug for this patient is " + patient.getDrug());
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
                logger.warn("Invalid age or weight: "+ input);
            } catch(Exception e) {
                System.out.println("Invalid input format");
                logger.warn("Invalid input: "+ input);
            } finally {
                System.out.println("Please input the next patient's name, age and weight, separate with whitespace, or press enter to quit");
                input = "";
                input = keyboard.nextLine();
            }
        }
        System.out.println("Thank you");
    }
}
