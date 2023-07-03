public class A7Q8 {
    static boolean checkStraightLine(int[][] coordinates) {
            int x0 = coordinates[0][0];
            int y0 = coordinates[0][1];
            int x1 = coordinates[1][0];
            int y1 = coordinates[1][1];
            // Iterate through the remaining points and check if the slope remains consistent
            for (int i = 2; i < coordinates.length; i++) {
                int x = coordinates[i][0];
                int y = coordinates[i][1];
                // If the current point doesn't satisfy the slope formula, return false
                if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) {
                    return false;
                }
            }
            // All points satisfy the slope formula, so they form a straight line
            return true;
        }

        public static void main(String[] args) {

            int [][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
            System.out.println(checkStraightLine(coordinates));

        }

    }