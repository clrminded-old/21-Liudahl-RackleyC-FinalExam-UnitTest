package src.main.java;

public class StringCalculator {
    public int add(final String numbers) {
        int returnValue = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (number.contains("-")) {
                throw new IllegalArgumentException();
            }
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}
