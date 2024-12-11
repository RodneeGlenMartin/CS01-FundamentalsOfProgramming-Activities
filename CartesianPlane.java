import javax.swing.JOptionPane;

public class CartesianPlane {
    public static void main(String[] args) {
        int[][] points = new int[5][2];

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Enter x and y coordinates for point " + (i + 1) + " (e.g., 2,3):");
            String[] coordinates = input.split(",");
            points[i][0] = Integer.parseInt(coordinates[0].trim());
            points[i][1] = Integer.parseInt(coordinates[1].trim());
        }

        for (int i = 0; i < 5; i++) {
            int x = points[i][0];
            int y = points[i][1];
            String quadrant;

            if (x > 0 && y > 0) {
                quadrant = "I";
            } else if (x < 0 && y > 0) {
                quadrant = "II";
            } else if (x < 0 && y < 0) {
                quadrant = "III";
            } else if (x > 0 && y < 0) {
                quadrant = "IV";
            } else {
                quadrant = "Origin";
            }

            JOptionPane.showMessageDialog(null, "Point (" + x + ", " + y + ") is in Quadrant " + quadrant);
        }
    }
}
