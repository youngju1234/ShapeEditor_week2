import processing.core.PApplet;

public class Triangle extends Shape {
    public Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(PApplet pApplet) {
        pApplet.fill(10, 10, 250, 50);
        pApplet.triangle(x, y, x - 20, y + 40, 20 + x, 40 + y);
    }

    @Override
    public Triangle clone() {
        return (Triangle) super.clone();
    }

    @Override
    public int checkCollision(int x, int y) {
        if (x > this.x - 20 && x < this.x + 20 && y > this.y && y < this.y + 40)
            return 3;
        return 0;
    }

}
