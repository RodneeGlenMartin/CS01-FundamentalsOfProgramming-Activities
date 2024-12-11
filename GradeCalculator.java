import javax.swing.JOptionPane;

public class GradeCalculator {

    public static void main(String[] args) {

        double attendanceScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Attendance Score:"));
        double assignmentScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Assignment Score:"));
        double quizScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Quiz Score:"));
        double labActivityScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Laboratory Activity Score:"));
        double examScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam Score:"));


        double attendanceWeighted = (((attendanceScore / 15) * 60) + 40) * 0.10;
        double assignmentWeighted = (((assignmentScore / 50) * 60) + 40) * 0.15;
        double quizWeighted = (((quizScore / 80) * 60) + 40) * 0.20;
        double labActivityWeighted = (((labActivityScore / 100) * 60) + 40) * 0.25;
        double examWeighted = (((examScore / 100) * 60) + 40) * 0.30;

        double totalGrade = attendanceWeighted + assignmentWeighted + quizWeighted + labActivityWeighted + examWeighted;


        JOptionPane.showMessageDialog(null, String.format("Total Grade: %.2f", totalGrade));
    }
}