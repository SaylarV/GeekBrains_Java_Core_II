package GeekBrains_HW_Lesson_1;

public class Robot implements Player{
    private int distance;
    private int height;

    public Robot(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }

    public int getDistance() {
        return distance;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public void doRun() {
        System.out.println("Robot can run.");
    }

    @Override
    public void doJump() {
        System.out.println("Robot can jump.");
    }

    @Override
    public String toString() {
        return "Robot";
    }

}
