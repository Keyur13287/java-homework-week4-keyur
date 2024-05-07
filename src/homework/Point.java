package homework;

public class Point {
    int x;
    int y;
    public  Point(){

    }
    public  Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int setX(int x){
        this.x=x;
        return x;
    }
    public int setY(int y){
        this.y=y;
        return y;
    }
    public double distance(){
        return Math.sqrt(x* y + y * y);

    }
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double distance(Point another){
        return distance(another.getX(), another.getY());
    }
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

}
