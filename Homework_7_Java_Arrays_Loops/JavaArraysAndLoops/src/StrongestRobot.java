
public class StrongestRobot {

    public static void main(String[] args) {
            int[] weights = {300, 450, 200, 500, 350};
            int max= weights[0];
            int strongestRobotIndex = 0;

            for (int i = 1; i < weights.length; i++) {
                if (weights[i] > max) {
                    max = weights[i];
                    strongestRobotIndex = i;
                }
            }

            System.out.println("Робот номер " + (strongestRobotIndex + 1) + " найсильніший. Він підняв " + max + " кг.");
    }
}

