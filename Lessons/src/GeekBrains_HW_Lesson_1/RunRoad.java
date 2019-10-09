package GeekBrains_HW_Lesson_1;

public class RunRoad implements Barrier{
    private int distance;

    public RunRoad(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String gym(Player player) {
        int canRun = player.getDistance();
        if (canRun >= distance) return player.toString()+" can run "+player.getDistance()+"m. - it's a good job!";
        else return player.toString()+" can run "+player.getDistance()+"m. - sorry, it's not enought. Come next time!";
    }
}
