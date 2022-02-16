package Scene;

public class Level {

    private String levelName;
    private int length;
    private int width;

    public Level() {
    }

    public Level(String levelName, int length, int width) {
        this.levelName = levelName;
        this.length = length;
        this.width = width;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
