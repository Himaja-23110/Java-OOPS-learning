
package Abstract;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle is a Shape");
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
