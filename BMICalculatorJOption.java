import javax.swing.JOptionPane;

public class BMICalculatorJOption {

  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog(null, "Enter your name: ");

    String ageStr = JOptionPane.showInputDialog(null, "Enter your age: ");
    int age = Integer.parseInt(ageStr);

    String genderStr = JOptionPane.showInputDialog(null, "Enter your gender (M/F): ");
    char gender = genderStr.charAt(0);

    String weightStr = JOptionPane.showInputDialog(null, "Enter your weight (kg): ");
    double weight = Double.parseDouble(weightStr);

    String heightStr = JOptionPane.showInputDialog(null, "Enter your height (m): ");
    double height = Double.parseDouble(heightStr);

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

    String result = "BMI Calculator Result\n" +
        "Name: " + name + "\n" +
        "Age: " + age + " years old\n" +
        "Gender: " + gender + "\n" +
        "Weight: " + weight + " kilograms\n" +
        "Height: " + height + " meters\n" +
        "Body Mass Index: " + bmi + " kilograms per meters squared\n" +
        "BMI Meaning: You are " + bmiMeaning;

    JOptionPane.showMessageDialog(null, result);
  }
}