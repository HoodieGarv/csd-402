public class FanTest {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "black");

        System.out.println("fan1 (default constructor): " + fan1);
        System.out.println("fan2 (argument constructor): " + fan2);

        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("blue");
        fan1.setRadius(8);

        System.out.println("fan1 after setter calls:    " + fan1);

        fan2.setOn(false);

        System.out.println("fan2 after turning off:     " + fan2);
    }
}
