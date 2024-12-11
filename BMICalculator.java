import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();


        double bmi = weight / (height * height);


        String bmiMeaning;
        if (gender == 'M') {
            if (bmi < 20) {
                bmiMeaning = "Underweight";
            } else if (bmi < 25) {
                bmiMeaning = "Normal";
            } else if (bmi < 30) {
                bmiMeaning = "Overweight";
            } else if (bmi < 40) {
                bmiMeaning = "Obese";
            } else {
                bmiMeaning = "Severely Obese";
            }
        } else if (gender == 'F') {
            if (bmi < 19) {
                bmiMeaning = "Underweight";
            } else if (bmi < 24) {
                bmiMeaning = "Normal";
            } else if (bmi < 30) {
                bmiMeaning = "Overweight";
            } else if (bmi < 40) {
                bmiMeaning = "Obese";
            } else {
                bmiMeaning = "Severely Obese";
            }
        } else {
            bmiMeaning = "Invalid gender";
        }


        System.out.println("\nBMI Calculator Result");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight + " kilograms");
        System.out.println("Height: " + height + " meters");
        System.out.println("Body Mass Index: " + bmi + " kilograms per meters squared");
        System.out.println("BMI Meaning: You are " + bmiMeaning);

        scanner.close();
    }
}
