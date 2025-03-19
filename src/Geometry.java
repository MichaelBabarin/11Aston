public class GeometricShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Синий");
        Shape rectangle = new Rectangle(4, 6, "Зеленый", "Желтый");
        Shape triangle = new Triangle(3, 4, 5, "Фиолетовый", "Розовый");

        System.out.println("Круг:");
        circle.printShapeInfo();
        System.out.println();

        System.out.println("Прямоугольник:");
        rectangle.printShapeInfo();
        System.out.println();

        System.out.println("Треугольник:");
        triangle.printShapeInfo();
    }
}
