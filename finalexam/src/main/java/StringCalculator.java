package finalexam.src.main.java;

public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        if (numbers.isEmpty()) {
            return returnValue;
        }
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }

        return returnValue;
    }
}

/*
 * 
 * 1. The method can take 0 or more numbers separated by comma (,) as a string
 * variable.
 * 2. For an empty string, the method will return 0
 * 3. The method will return the sum of numbers.
 * 
 */