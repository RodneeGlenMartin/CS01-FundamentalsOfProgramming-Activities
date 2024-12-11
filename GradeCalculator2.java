import javax.swing.JOptionPane;

public class GradeCalculator2 {

    public static void main(String[] args) {

        double attendanceScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Attendance Score:"));
        if (attendanceScore > 11) {
            JOptionPane.showMessageDialog(null, "Error: Attendance score cannot exceed 11.");
            return;
        }

        double assignmentScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Assignment Score:"));
        if (assignmentScore > 120) {
            JOptionPane.showMessageDialog(null, "Error: Assignment score cannot exceed 120.");
            return;
        }

        double quizScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Quiz Score:"));
        if (quizScore > 132) {
            JOptionPane.showMessageDialog(null, "Error: Quiz score cannot exceed 132.");
            return;
        }

        double labActivityScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Laboratory Activity Score:"));
        if (labActivityScore > 200) {
            JOptionPane.showMessageDialog(null, "Error: Laboratory Activity score cannot exceed 200.");
            return;
        }

        double examScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam Score:"));
        if (examScore > 100) {
            JOptionPane.showMessageDialog(null, "Error: Exam score cannot exceed 100.");
            return;
        }

        double attendanceWeighted = (((attendanceScore / 11) * 60) + 40) * 0.10;
        double assignmentWeighted = (((assignmentScore / 120) * 60) + 40) * 0.15;
        double quizWeighted = (((quizScore / 132) * 60) + 40) * 0.20;
        double labActivityWeighted = (((labActivityScore / 200) * 60) + 40) * 0.25;
        double examWeighted = (((examScore / 100) * 60) + 40) * 0.30;

        double totalGrade = attendanceWeighted + assignmentWeighted + quizWeighted + labActivityWeighted + examWeighted;

        String equivalentGrade;

        if (totalGrade >= 99) {
            equivalentGrade = "1.0";
        } else if (totalGrade >= 96) {
            equivalentGrade = "1.25";
        } else if (totalGrade >= 93) {
            equivalentGrade = "1.50";
        } else if (totalGrade >= 90) {
            equivalentGrade = "1.75";
        } else if (totalGrade >= 87) {
            equivalentGrade = "2.0";
        } else if (totalGrade >= 84) {
            equivalentGrade = "2.25";
        } else if (totalGrade >= 81) {
            equivalentGrade = "2.50";
        } else if (totalGrade >= 78) {
            equivalentGrade = "2.75";
        } else if (totalGrade >= 75) {
            equivalentGrade = "3.0";
        } else if (totalGrade >= 70) {
            equivalentGrade = "4.0";
        } else {
            equivalentGrade = "5.0";
        }

        JOptionPane.showMessageDialog(null,
                String.format("Total Grade: %.2f\nEquivalent Grade: %s", totalGrade, equivalentGrade));
    }
}