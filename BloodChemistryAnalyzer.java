import javax.swing.JOptionPane;

public class BloodChemistryAnalyzer {
    public static void main(String[] args) {

        boolean allNormal = true;
        boolean highGlucose = false;
        boolean highCholesterol = false;
        boolean highTriglycerides = false;

        String gender = JOptionPane.showInputDialog("Enter gender (Male/Female):");
        double lowerUricAcidLimit, upperUricAcidLimit;
        double lowerCreatinineLimit, upperCreatinineLimit;
        double lowerTriglyceridesLimit, upperTriglyceridesLimit;

        if (gender.equalsIgnoreCase("Male")) {
            lowerUricAcidLimit = 0.20;
            upperUricAcidLimit = 0.41;
            lowerCreatinineLimit = 53;
            upperCreatinineLimit = 115;
            lowerTriglyceridesLimit = 0.57;
            upperTriglyceridesLimit = 1.86;
        } else if (gender.equalsIgnoreCase("Female")) {
            lowerUricAcidLimit = 0.14;
            upperUricAcidLimit = 0.35;
            lowerCreatinineLimit = 62;
            upperCreatinineLimit = 106;
            lowerTriglyceridesLimit = 0.45;
            upperTriglyceridesLimit = 1.58;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid gender input. Please enter 'Male' or 'Female'.");
            return;
        }

        double glucose = Double.parseDouble(JOptionPane.showInputDialog("Enter Glucose [FBS]:"));
        if (glucose < 3.8 || glucose > 5.8) {
            allNormal = false;
            double glucoseDeviation = glucose - 5.8;
            if (glucoseDeviation > 0) {
                highGlucose = true;
                JOptionPane.showMessageDialog(null, String.format("Your Glucose level is %.2f higher than normal. You should be in a low carb diet.", glucoseDeviation));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your Glucose result is NORMAL.");
        }

        double uricAcid = Double.parseDouble(JOptionPane.showInputDialog("Enter Serum Uric Acid:"));
        if (uricAcid < lowerUricAcidLimit || uricAcid > upperUricAcidLimit) {
            allNormal = false;
            double uricAcidDeviation = uricAcid - upperUricAcidLimit;
            if (uricAcidDeviation > 0) {
                JOptionPane.showMessageDialog(null, String.format("Your Uric Acid level is %.2f higher than normal. You should avoid foods that are high in purine and fat.", uricAcidDeviation));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your Uric Acid result is NORMAL.");
        }

        double creatinine = Double.parseDouble(JOptionPane.showInputDialog("Enter Creatinine:"));
        if (creatinine < lowerCreatinineLimit || creatinine > upperCreatinineLimit) {
            allNormal = false;
            double creatinineDeviation = creatinine - upperCreatinineLimit;
            if (creatinineDeviation > 0) {
                JOptionPane.showMessageDialog(null, String.format("Your Creatinine level is %.2f higher than normal. You should avoid caffeine, alcohol, carbonated drinks, and salty foods.", creatinineDeviation));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your Creatinine result is NORMAL.");
        }

        double cholesterol = Double.parseDouble(JOptionPane.showInputDialog("Enter Cholesterol:"));
        if (cholesterol < 3.87 || cholesterol > 5.68) {
            allNormal = false;
            double cholesterolDeviation = cholesterol - 5.68;
            if (cholesterolDeviation > 0) {
                highCholesterol = true;
                JOptionPane.showMessageDialog(null, String.format("Your Cholesterol level is %.2f higher than normal. You should be on a low fat diet.", cholesterolDeviation));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your Cholesterol result is NORMAL.");
        }

        double triglycerides = Double.parseDouble(JOptionPane.showInputDialog("Enter Triglycerides:"));
        if (triglycerides < lowerTriglyceridesLimit || triglycerides > upperTriglyceridesLimit) {
            allNormal = false;
            double triglyceridesDeviation = triglycerides - upperTriglyceridesLimit;
            if (triglyceridesDeviation > 0) {
                highTriglycerides = true;
                JOptionPane.showMessageDialog(null, String.format("Your Triglycerides level is %.2f higher than normal. You should avoid sugary and starchy foods.", triglyceridesDeviation));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your Triglycerides result is NORMAL.");
        }

        if (highGlucose && highCholesterol && highTriglycerides) {
            JOptionPane.showMessageDialog(null, "Your Glucose, Cholesterol, and Triglycerides levels are high. You should be in a low carb and low fat diet. You should also take Telmisartan and Atorvastatin.");
        } else if (allNormal) {
            JOptionPane.showMessageDialog(null, "Your Blood Chem Result is NORMAL. You are generally HEALTHY.");
        }
    }
}