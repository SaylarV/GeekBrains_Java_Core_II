package GeekBrains_HW_Lesson_1;

public class Wall implements Barrier{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String gym(Player player){
        int canJump = player.getHeight();
        if (canJump >= height) return player.toString()+" can jump about "+player.getHeight()+"m. - it's a good job!";
        else return player.toString()+" can jump about "+player.getHeight()+"m. - sorry, it's not enought. Come next time!";
    }

}
