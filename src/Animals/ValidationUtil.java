package Animals;

import java.time.LocalDate;

public class ValidationUtil {
    public static String valOrDefString(String value, String defValue) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return defValue;
        } else {
            return value;
        }

    }

    public static double valOrDefDouble(double value, double defValue) {
        if (value < 0) {
            return Math.abs(value);
        } else if (value == 0) {
            return defValue;
        } else return value;
    }

    public static int valOrDefInt(int value, int defValue) {
        if (value < 0) {
            return Math.abs(value);
        } else if (value == 0) {
            return defValue;
        } else return value;
    }

    public static int valOrDefYear(int value) {
        if (value > 0 && value < LocalDate.now().getYear()) {
            return LocalDate.now().getYear() - value;
        } else if (value < 0 && value < LocalDate.now().getYear()) {
            return LocalDate.now().getYear() - Math.abs(value);
        } else return LocalDate.now().getYear();
    }
}
