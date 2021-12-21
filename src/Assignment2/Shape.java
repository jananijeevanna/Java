package Assignment2;

public abstract class Shape {

    abstract void draw();
}

class Line extends Shape {

    private int x;
    private int y;

    public Line(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        System.out.println(" Drawing a line with coordinates "+x +" and " +y);
    }
}

    class Circle extends Shape {

        private double r;

        public Circle(double r) {
            this.r = r;
        }

        @Override
        void draw() {

            System.out.println(" Drawing a circle with radius "+r);
        }
    }
        class Rect extends Shape {

            private double l;
            private double b;

            public Rect(double l, double b) {
                this.l = l;
                this.b = b;
            }

            @Override
            void draw() {

                System.out.println(" Drawing a rectangle with length " +l +" and breadth " +b);
            }
        }


class MainClass{

    public static void main(String[] args) {

        Shape line = new Line(2,3);
        line.draw();
        Shape circle = new Circle(4.5);
        circle.draw();
        Shape rect = new Rect(5,8);
        rect.draw();

    }
}