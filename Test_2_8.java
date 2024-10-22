public class Test_2_8 {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);


        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println(c2);


        MyPoint p = new MyPoint(1, 2);
        MyCircle c3 = new MyCircle(p, 10);
        System.out.println(c3);

        c1.setRadius(15);
        System.out.println("Radius of c1: " + c1.getRadius());
        c1.setCenterXY(6, 7);
        System.out.println("Center of c1: " + c1.getCenter());


        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Circumference of c2: " + c2.getCircumference());


        System.out.println("Distance between c2 and c3: " + c2.distance(c3));
    }
}
