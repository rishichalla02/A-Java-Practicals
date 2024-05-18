public class Prac_6_4 {
    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        if (values == null) {
            throw new NullPointerException("Array is null");
        }

        double sum = 0;
        int count = 0;

        for (String str : values) {
            if (str == null) {
                throw new NullPointerException("Array element is null");
            }

            try {
                double num = Double.parseDouble(str);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid format: " + str);
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("Array has no valid elements");
        }

        return sum / count;
    }

    public static void main(String[] args) {
        // Example usage
        String[] values = {"10.5", "20.3", "30.7"};

        try {
            double avg = average(values);
            System.out.println("Average: " + avg);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}