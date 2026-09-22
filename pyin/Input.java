package pyin; 

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static boolean hasSymbols(String str) {
    // Returns true if it finds at least one character that is NOT a letter
        return str.matches(".*[^a-zA-Z ].*");
    }

    public static String stringInput(String prompt, boolean disallowSymbols) { 
        while (true) {
            try {
                System.out.print(prompt + "  "); 
                String stringIn = scanner.nextLine().trim(); 

                // Handle the symbol logic with an IF, not by throwing an exception
                if (disallowSymbols && hasSymbols(stringIn)) {
                    System.out.println("Error: Names cannot contain symbols or numbers!");
                    // We use 'continue' to restart the loop without hitting the 'return'
                    continue; 
                }

                return stringIn; // If we get here, everything is fine!

            } catch (Exception e) {
                // This only runs if the Scanner itself fails (e.g., the stream is closed)
                System.out.println("A system error occurred. Please restart the program.");
                return ""; 
            }
        }
    }

// --- INTEGER METHODS ---

    private static int getInt(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt + " ");
                int x = Integer.parseInt(scanner.nextLine().trim());
                if (x < min || x > max) {
                    // Specific error messaging
                    if (max == Integer.MAX_VALUE) System.out.println("Must be at least " + min);
                    else if (min == Integer.MIN_VALUE) System.out.println("Must be no more than " + max);
                    else System.out.println("Must be between " + min + " and " + max);
                } else {
                    return x;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Try again.");
            }
        }
    }

    public static int intInput(String prompt) {
        return getInt(prompt, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int intInputMin(String prompt, int min) {
        return getInt(prompt, min, Integer.MAX_VALUE);
    }

    public static int intInputMax(String prompt, int max) {
        return getInt(prompt, Integer.MIN_VALUE, max);
    }

    public static int intInputBounds(String prompt, int min, int max) {
        return getInt(prompt, min, max);
    }

// --- DOUBLE METHODS ---

    private static double getDouble(String prompt, double min, double max) {
        while (true) {
            try {
                System.out.print(prompt + " ");
                double x = Double.parseDouble(scanner.nextLine().trim());
                if (x < min || x > max) {
                    if (max == Double.POSITIVE_INFINITY) System.out.println("Must be at least " + min);
                    else if (min == Double.NEGATIVE_INFINITY) System.out.println("Must be no more than " + max);
                    else System.out.println("Must be between " + min + " and " + max);
                } else {
                    return x;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    public static double doubleInput(String prompt) {
        return getDouble(prompt, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public static double doubleInputMin(String prompt, double min) {
        return getDouble(prompt, min, Double.POSITIVE_INFINITY);
    }

    public static double doubleInputMax(String prompt, double max) {
        return getDouble(prompt, Double.NEGATIVE_INFINITY, max);
    }

    public static double doubleInputBounds(String prompt, double min, double max) {
        return getDouble(prompt, min, max);
    }

    public static char charInput(String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            String line = scanner.nextLine();

            if (line.length() == 1) {
                char ch = line.charAt(0);

                if (ch == ' ') {
                    boolean confirmed = boolInput("You entered a space. Are you sure? (yes/no)");
                    if (confirmed) {
                        return ' ';
                    } else {
                        continue; // re-prompt
                    }
                }

                return ch;
            } else {
                System.out.println("Enter exactly one character.");
            }
        }
    }


    public static boolean confirm(String prompt) {
        while (true) {
            System.out.print(prompt + "  ");
            String line = scanner.nextLine().toLowerCase();
            if (line.equals("yes") || line.equals("y") || line.equals("true")){
                return true; 
            
            }else if (line.equals("no") || line.equals("n") || line.equals("false")){
                return false; 
            }else{
                 System.out.println("Please enter yes or no.");

            }
    
        }
            
    }

    public static boolean boolInput(String prompt){
        System.out.print(prompt + " ");
        String line = scanner.nextLine();
        if(line.isEmpty()){
            return false;
        }else{
            return true; 
        }
    }
}

