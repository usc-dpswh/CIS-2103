
// Instructor   :   Sabandal, Gran THE IDOL GWAPO UGH <3
// Author       :   Lanutan, Achille Lorenzo
// ID           :   22103514
// Project      :   Geometry
// Date start   :   September 1, 2023
// Date finish  :   September 3, 2023

package version1;

public class Version1 {

    public static void main(String[] args) {
        MyPoint coordinate = new MyPoint(5,3);
        coordinate.displayPoint();

        
        double distance = coordinate.getDistance(5, 7);
        coordinate.displayCoord(distance);
        
        MyPoint point2 = new MyPoint(4, 6);
        
        System.out.println("Distance between points: " + coordinate.getDistance(point2));    
        System.out.println("Quadrant: " + coordinate.getQuadrant());
        System.out.println(coordinate.getAngle());
    }
    
}
