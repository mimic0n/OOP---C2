public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int[] {this.x, this.y};
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double distance(int x , int y) {
        return Math.sqrt(x * x + y * y);
    }
    public double AnotherDistance(int x , int y) {
        int xDiff = x - this.x;
        int yDiff = y - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double distance(MyPoint another) {
        int xdiff = this.x - another.x;
        int ydiff = this.y - another.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}