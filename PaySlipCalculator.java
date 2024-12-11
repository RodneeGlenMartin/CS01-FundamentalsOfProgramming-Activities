import javax.swing.JOptionPane;

public class PaySlipCalculator {

    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter Employee Name:");
            if (name == null || name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Employee name cannot be empty.");
                continue;
            }

            String daysWorkedStr = JOptionPane.showInputDialog(null, "Enter Days Worked:");
            int daysWorked;
            try {
                daysWorked = Integer.parseInt(daysWorkedStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number of days.");
                continue;
            }

            double dailyRate = 500.0;
            double grossSalary = daysWorked * dailyRate;
            double sssDeduction = 330.50;
            double philHealthDeduction = 220.25;
            double netSalary = grossSalary - (sssDeduction + philHealthDeduction);

            String result = String.format(
                "Bytes Corporation\n" +
                "Kabacan, Cotabato\n" +
                "064 572-1234\n" +
                "bytes@gmail.com\n" +
                "PAY SLIP for September 2024\n\n" +
                "Employee Name: %s\n" +
                "No. of Days Worked: %d\n" +
                "Daily Rate: %.2f Pesos\n" +
                "Gross Salary: %.2f Pesos\n" +
                "Deductions:\n" +
                "SSS: %.2f Pesos\n" +
                "PhilHealth: %.2f Pesos\n" +
                "Net Salary: %.2f Pesos",
                name, daysWorked, dailyRate, grossSalary, sssDeduction, philHealthDeduction, netSalary);

            JOptionPane.showMessageDialog(null, result);

            int option = JOptionPane.showConfirmDialog(null, "Do you want to calculate another pay slip?", "Continue", JOptionPane.YES_NO_OPTION);
            if (option != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}