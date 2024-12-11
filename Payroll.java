import javax.swing.JOptionPane;

public class Payroll {
    public static void main(String[] args) {
        String companyName = "Bytes Corporation";
        String companyAddress = "Kabacan, Cotabato";
        String companyContact = "064 572-1234";
        String companyEmail = "bytes@gmail.com";

        String month = JOptionPane.showInputDialog("Enter the month:");

        String employee1Name = JOptionPane.showInputDialog("Enter Employee 1 Name:");
        int employee1DaysWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee 1 Days Worked:"));

        String employee2Name = JOptionPane.showInputDialog("Enter Employee 2 Name:");
        int employee2DaysWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee 2 Days Worked:"));

        String employee3Name = JOptionPane.showInputDialog("Enter Employee 3 Name:");
        int employee3DaysWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee 3 Days Worked:"));

        double dailyRate = 500.0;
        double philHealthDeduction = 220.0;
        double sssDeduction = 330.0;

        double employee1GrossSalary = employee1DaysWorked * dailyRate;
        double employee1NetSalary = employee1GrossSalary - philHealthDeduction - sssDeduction;

        double employee2GrossSalary = employee2DaysWorked * dailyRate;
        double employee2NetSalary = employee2GrossSalary - philHealthDeduction - sssDeduction;

        double employee3GrossSalary = employee3DaysWorked * dailyRate;
        double employee3NetSalary = employee3GrossSalary - philHealthDeduction - sssDeduction;

        String payrollOutput = "<html><h2>PAYROLL for the month of " + month + "</h2>" +
                "<p><strong>" + companyName + "</strong><br>" +
                companyAddress + "<br>" +
                "Contact: " + companyContact + "<br>" +
                "Email: " + companyEmail + "</p>" +
                "<table border='1' cellpadding='5' cellspacing='0'>" +
                "<tr><th>Employee Name</th><th>Days Worked</th><th>Daily Rate</th><th>Gross Salary</th><th colspan='2'>Deductions</th><th>Net Salary (Pesos)</th></tr>"
                +
                "<tr><th></th><th></th><th></th><th></th><th>PhilHealth</th><th>SSS</th><th></th></tr>" +
                "<tr><td>" + employee1Name + "</td><td>" + employee1DaysWorked + "</td><td>" + dailyRate + "</td><td>"
                + employee1GrossSalary + "</td><td>" + philHealthDeduction + "</td><td>" + sssDeduction + "</td><td>"
                + employee1NetSalary + "</td></tr>" +
                "<tr><td>" + employee2Name + "</td><td>" + employee2DaysWorked + "</td><td>" + dailyRate + "</td><td>"
                + employee2GrossSalary + "</td><td>" + philHealthDeduction + "</td><td>" + sssDeduction + "</td><td>"
                + employee2NetSalary + "</td></tr>" +
                "<tr><td>" + employee3Name + "</td><td>" + employee3DaysWorked + "</td><td>" + dailyRate + "</td><td>"
                + employee3GrossSalary + "</td><td>" + philHealthDeduction + "</td><td>" + sssDeduction + "</td><td>"
                + employee3NetSalary + "</td></tr>" +
                "</table><br>" +
                "<p>Prepared by: Renier P. Apal (Secretary)<br>Approved by: Rodnee Glen A. Martin (Company President)</p></html>";

        JOptionPane.showMessageDialog(null, payrollOutput, "Payroll", JOptionPane.INFORMATION_MESSAGE);
    }
}