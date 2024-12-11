import javax.swing.JOptionPane;

public class SalaryCalculator {

    public static void main(String[] args) {

        double DAILY_RATE = 500.0;
        double PHILHEALTH_DEDUCTION = 220.0;
        double SSS_DEDUCTION = 330.0;

        String name = JOptionPane.showInputDialog("Enter the employee's name:");

        String daysWorkedStr = JOptionPane.showInputDialog("Enter the number of days worked:");
        int daysWorked = Integer.parseInt(daysWorkedStr);

        double grossSalary = daysWorked * DAILY_RATE;

        double totalDeductions = PHILHEALTH_DEDUCTION + SSS_DEDUCTION;

        double netSalary = grossSalary - totalDeductions;

        String message = String.format("Employee: %s\nDays Worked: %d\nGross Salary: %.2f\nTotal Deductions: %.2f\nNet Salary: %.2f",
                name, daysWorked, grossSalary, totalDeductions, netSalary);
        
        JOptionPane.showMessageDialog(null, message, "Salary Details", JOptionPane.INFORMATION_MESSAGE);
    }
}