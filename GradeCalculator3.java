import javax.swing.JOptionPane;

public class GradeCalculator3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            JOptionPane.showMessageDialog(null, "Student " + i);

            while (true) {
                try {
                    double attendanceScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Attendance Score (0-11):"));
                    double assignmentScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Assignment Score (0-120):"));
                    double quizScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Quiz Score (0-132):"));
                    double labActivityScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Laboratory Activity Score (0-200):"));
                    double examScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam Score (0-100):"));

                    if (attendanceScore < 0 || attendanceScore > 11 ||
                        assignmentScore < 0 || assignmentScore > 120 ||
                        quizScore < 0 || quizScore > 132 ||
                        labActivityScore < 0 || labActivityScore > 200 ||
                        examScore < 0 || examScore > 100) {
                        JOptionPane.showMessageDialog(null, "Error: Please enter valid scores within the specified ranges.");
                        continue;
                    }

                    double attendanceWeighted = (((attendanceScore / 11) * 60) + 40) * 0.10;
                    double assignmentWeighted = (((assignmentScore / 120) * 60) + 40) * 0.15;
                    double quizWeighted = (((quizScore / 132) * 60) + 40) * 0.20;
                    double labActivityWeighted = (((labActivityScore / 200) * 60) + 40) * 0.25;
                    double examWeighted = (((examScore / 100) * 60) + 40) * 0.30;
            
                    double totalWeightedScore = attendanceWeighted + assignmentWeighted + quizWeighted + labActivityWeighted + examWeighted;


                    String equivalentGrade;
                    if (totalWeightedScore >= 96) {
                        equivalentGrade = "1.0";
                    } else if (totalWeightedScore >= 93) {
                        equivalentGrade = "1.25";
                    } else if (totalWeightedScore >= 90) {
                        equivalentGrade = "1.50";
                    } else if (totalWeightedScore >= 87) {
                        equivalentGrade = "1.75";
                    } else if (totalWeightedScore >= 84) {
                        equivalentGrade = "2.0";
                    } else if (totalWeightedScore >= 81) {
                        equivalentGrade = "2.25";
                    } else if (totalWeightedScore >= 78) {
                        equivalentGrade = "2.75";
                    } else if (totalWeightedScore >= 75) {
                        equivalentGrade = "3.0";
                    } else if (totalWeightedScore >= 70) {
                        equivalentGrade = "4.0";
                    } else {
                        equivalentGrade = "5.0";
                    }

                    JOptionPane.showMessageDialog(null, String.format("Student %d\nTotal Weighted Score: %.2f\nEquivalent Grade: %s", i, totalWeightedScore, equivalentGrade));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Please enter valid numeric values.");
                }
            }
        }
    }
}