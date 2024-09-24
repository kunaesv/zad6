
public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(); // Создаем объект Circle, наследующий от Figure
        Figure square = new Square();
        Figure rectangle = new Rectangle();
        Ellipse ellipse = new Ellipse();

        circle.drawCircle();
        square.drawSquare();
        rectangle.drawRectangle();
        Ellipse.circleToEllipse();
    }
}

