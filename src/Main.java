public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        System.out.println("diện tích hình tròn : "+circle.getArea());

        System.out.println("-----Cylinder-----");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5,3.5);
        System.out.println(cylinder);
        System.out.println("diện tích hình trụ : "+cylinder.getAreaCylinder());
    }
}