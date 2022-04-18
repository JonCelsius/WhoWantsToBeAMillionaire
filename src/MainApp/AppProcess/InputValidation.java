package MainApp.AppProcess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidation {
    Scanner scanner;

    public InputValidation() {
        scanner = new Scanner(System.in);
    }

    public String inputString() {
        return scanner.nextLine();
    }

    public String checkDate() {
        String regex = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$";
        String date;
        while (true) {
            date = scanner.nextLine();
            if (date.matches(regex)) {
                break;
            } else {
                System.out.println("Enter again!");
            }
        }
        return date;
    }

    public void closeScanner() {
        this.scanner.close();
    }

    public int checkIntInput() {
        int input = 0;
        try {
            input = readIntValue();
            while (input <= 0) {
                System.out.print("\nEntered number is not valid, please enter an integer positive number!:  ");
                input = readIntValue();
            }
            scanner.nextLine();
            return input;

        } catch (InputMismatchException inputMismatchException) {
            System.out.print("\nEntered number is not valid, please enter an integer positive number!:");
            scanner.next();
            return checkIntInput();
        }

    }

    /**
     * This method is a part of a validation process of an integer value that uses hasNextInt() method.
     *
     * @return readValue.nextInt() or checkInput(readValue)
     */
    public int readIntValue() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.print("\nInvalid input, it can only be integer. Introduce again:");
            scanner.next();
            return checkIntInput();
        }
    }

    public String checkTime() {
        String regex = "^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$";
        String time;
        while (true) {
            time = scanner.nextLine();
            if (time.matches(regex)) {
                break;
            } else {
                System.out.println("Enter again!");
            }
        }
        return time;
    }
}

