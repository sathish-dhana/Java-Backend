import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeBonus {

    public void Bonus(String str) throws InvalidAge {
        LocalDate currendate = LocalDate.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate joiningDate = LocalDate.parse(str, dateFormat);

            int year = (int) ChronoUnit.YEARS.between(joiningDate, currendate);

            if (year < 1 && year > 0) {
                System.out.println("You got bonus 5000");
            } else if (year >= 1 && year < 2) {
                System.out.println("You got bonus 8000");
            } else if (year >= 2) {
                System.out.println("You got bonus 10000");
            } else throw new InvalidAge("Age should not be in the future");
        } catch (DateTimeParseException im) {
            System.out.println("Please pass the date in correct format");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your joining date in format dd-MM-yyyy");
        String joiningDate = scan.next();

        EmployeeBonus emp = new EmployeeBonus();
        try{
            emp.Bonus(joiningDate);
        } catch (InvalidAge ia) {
            System.out.println(ia);
        }

    }
}
