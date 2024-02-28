public class GreatestOfThree {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15; // Sample numbers, you can modify these as per your requirement

        // Displaying the original numbers
        System.out.println("Original numbers:");
        System.out.println("num1: " + num1 + ", num2: " + num2 + ", num3: " + num3);

        // Finding the greatest of three numbers
        int greatest = findGreatest(num1, num2, num3);

        // Displaying the greatest number
        System.out.println("\nGreatest of the three numbers: " + greatest);
    }

    // Method to find the greatest of three numbers
    public static int findGreatest(int num1, int num2, int num3) {
        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        return greatest;
    }
}
