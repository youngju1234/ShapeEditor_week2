import processing.core.PApplet;

public class Rect extends Shape {
    public Rect(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(PApplet pApplet) {
        pApplet.fill(204, 255, 51, 50);
        pApplet.rect(x, y, 40, 40);
    }

    @Override
    public Rect clone() {
        return (Rect) super.clone();
    }

    @Override
    public int checkCollision(int x, int y) {
        if (x > this.x - 20 && x < this.x + 20 && y > this.y - 20 && y < this.y + 20)
            return 1;
        return 0;
    }


}
