import java.util.Scanner;

public class Lab1_64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
       
            System.out.print("Enter the month (full name, abbreviation, or number): ");
            monthInput = scanner.nextLine().trim();

 
            System.out.print("Enter the year: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid year, please enter a valid year.");
                scanner.nextLine(); 
                continue;
            }
            year = scanner.nextInt();
            scanner.nextLine(); 
            if (year < 0) {
                System.out.println("Invalid year, please enter a non-negative year.");
                continue;
            }

            int month = convertMonthInput(monthInput);

            if (month == -1) {
                System.out.println("Invalid month, please try again.");
                continue;
            }

            int days = getDaysInMonth(month, year);
            System.out.println("Number of days in " + monthInput + " " + year + ": " + days);
            break;
        }

        scanner.close();
    }

    
    public static int convertMonthInput(String monthInput) {
        switch (monthInput.toLowerCase()) {
            case "january":
            case "jan":
            case "jan.":
            case "1":
                return 1;
            case "february":
            case "feb":
            case "feb.":
            case "2":
                return 2;
            case "march":
            case "mar":
            case "mar.":
            case "3":
                return 3;
            case "april":
            case "apr":
            case "apr.":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug":
            case "aug.":
            case "8":
                return 8;
            case "september":
            case "sep":
            case "sept.":
            case "9":
                return 9;
            case "october":
            case "oct":
            case "oct.":
            case "10":
                return 10;
            case "november":
            case "nov":
            case "nov.":
            case "11":
                return 11;
            case "december":
            case "dec":
            case "dec.":
            case "12":
                return 12;
            default:
                return -1;
        }
    }


    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }


    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
