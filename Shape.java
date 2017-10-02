import processing.core.PApplet;

public abstract class Shape implements Cloneable {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 부모가 굳이 구현을 제공할 필요가 없다면, 추상 메소드가 좋다.
    public abstract void draw(PApplet pApplet);

    public int checkCollision(int x, int y) {
        return 0;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


}
