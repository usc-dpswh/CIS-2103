
package version1;

public class MyPoint {
//    Definitions
    private int x;
    private int y;

////////////////////////////////////////////////////////
//    Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
////////////////////////////////////////////////////////
//    Setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

////////////////////////////////////////////////////////
//    Getters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
////////////////////////////////////////////////////////
//    Methods
    
    public void displayCoord(double distance){
        System.out.printf("DISTANCE: %.2f\n", distance);

    }
    
    public double getDistance(int x, int y){
        int dx = x - this.x;
        int dy = y - this.y;

        return Math.hypot(dx, dy);
    }
    
    public double getDistance(MyPoint otherPoint) {
        int dx = otherPoint.getX() - this.x;
        int dy = otherPoint.getY() - this.y;
        
        return Math.hypot(dx, dy);
    }
    
    public double getDistance() {
        return getDistance(0, 0);
    }
    
    
    public int getQuadrant() {
    int quadrant;

    switch (Integer.signum(x) * 10 + Integer.signum(y)) {
        case 11:
            quadrant = 1;
            break;
        case -11:
            quadrant = 2;
            break;
        case -1:
            quadrant = 3;
            break;
        case 1:
            quadrant = 4;
            break;
        case 10:
            quadrant = 5;
            break;
        case -10:
            quadrant = 6;
            break;
        default:
            quadrant = 0;
            break;
    }

        return quadrant;
    }
    
    public double getAngle() {
        return Math.toDegrees(Math.atan2(x, y));
    }

    
    public void displayPoint() {
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
    
    
    
}
