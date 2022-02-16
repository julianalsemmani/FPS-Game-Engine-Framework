public class Game {

    private String gameTitle;
    private int height;
    private int width;

    public Game() {
    }

    public Game(String gameTitle, int height, int width) {
        this.gameTitle = gameTitle;
        this.height = height;
        this.width = width;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
