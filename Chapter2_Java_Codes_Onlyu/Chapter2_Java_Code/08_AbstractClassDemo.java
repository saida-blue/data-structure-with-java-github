// Abstract class with concrete and abstract methods.
abstract class GraphicObject {
    protected int x;
    protected int y;

    public void moveTo(int newX, int newY) {
        x = newX;
        y = newY;
        System.out.println("Moved to (" + x + ", " + y + ")");
    }

    public abstract void draw();
    public abstract void resize();
}

class Circle extends GraphicObject {
    private int radius = 10;

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void resize() {
        if (radius < 100) {
            radius *= 2;
        }
        System.out.println("Circle radius: " + radius);
    }
}

class AbstractClassDemo {
    public static void main(String[] args) {
        GraphicObject shape = new Circle();
        shape.moveTo(5, 8);
        shape.draw();
        shape.resize();
    }
}
