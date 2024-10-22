public class Test_2_7 {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1);  // Should print MyLine[begin=(1, 2), end=(3, 4)]


        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2);


        System.out.println("Begin point: " + line1.getBegin());
        System.out.println("End point: " + line1.getEnd());

        line1.setEnd(new MyPoint(9, 10));
        System.out.println(line1);

        System.out.println("Length of line1: " + line1.getLength());
        System.out.println("Gradient of line1: " + line1.getGradient());

        // Test coordinate setters
        line2.setBeginXY(10, 20);
        line2.setEndXY(30, 40);
        System.out.println(line2);

        // Test individual coordinate getters
        System.out.println("Begin X of line2: " + line2.getBeginX());
        System.out.println("Begin Y of line2: " + line2.getBeginY());
        System.out.println("End X of line2: " + line2.getEndX());
        System.out.println("End Y of line2: " + line2.getEndY());
    }
}
