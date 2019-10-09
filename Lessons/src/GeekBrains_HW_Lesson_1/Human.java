package GeekBrains_HW_Lesson_1;

public class Human implements Player{
    private int distance;
    private int height;

    public Human(int distance, int height) {
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
        System.out.println("Human can run.");
    }

    @Override
    public void doJump() {
        System.out.println("Human can jump.");
    }

    @Override
    public String toString() {
        return "Human";
    }

}
