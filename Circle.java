import processing.core.PApplet;

public class Circle extends Shape {
    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(PApplet pApplet) {
        pApplet.fill(153, 51, 255, 50);
        pApplet.ellipse(x, y, 40, 40);

    }

    @Override
    public Circle clone() {
        return (Circle) super.clone();
    }

    @Override
    public int checkCollision(int x, int y) {
        if (x > this.x - 20 && x < this.x + 20 && y > this.y - 20 && y < this.y + 20)
            return 2;
        return 0;
    }

}
