import processing.core.PApplet;
import processing.event.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class ShapeEditor extends PApplet {

    private List<Shape> shapes;
    private int checkShapeCollision = 0;
    private int idx;

    @Override
    public void settings() {
        this.size(600, 600);
    }

    @Override
    public void setup() {
        this.background(0);
        rectMode(CENTER);
        ellipseMode(CENTER);
        shapes = new ArrayList<>();
    }

    @Override
    public void draw() {
        for (Shape shape : shapes) {
            shape.draw(this);
        }
    }

    public static void main(String[] args) {
        PApplet.main("ShapeEditor");
    }


    @Override
    public void mousePressed(MouseEvent event) {

        if (checkShapeCollision != 0) {

            Shape copyShape = shapes.get(idx).clone();
            copyShape.setX(mouseX);
            copyShape.setY(mouseY);

            shapes.add(copyShape);

            checkShapeCollision = 0;

            return;

        }


        if (!keyPressed)
            return;


        if (key == '1') {
            shapes.add(new Rect(mouseX, mouseY));
        } else if (key == '2') {
            shapes.add(new Circle(mouseX, mouseY));
        } else if (key == '3') {
            shapes.add(new Triangle(mouseX, mouseY));
        } else if (key == '9') {
            idx = 0;
            for (Shape shape : shapes) {
                checkShapeCollision = shape.checkCollision(mouseX, mouseY);
                if (checkShapeCollision != 0) {
                    return;
                }
                idx++;
            }
        }
    }
}
