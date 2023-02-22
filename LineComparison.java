package day3.assignment.LineComparison;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("welcome to LineComparison program ");
        //points for Line1

        short point_x1 = 10;
        short point_x2 = 20;
        short point_y1 = 10;
        short point_y2 = 30;

        //points for Line2

        short point_a1 = 20;
        short point_a2 = 30;
        short point_b1 = 20;
        short point_b2 = 10;

        float length1 = (float) Math.sqrt(Math.pow(point_x1 - point_x2, 2) + Math.pow(point_y1 - point_y2, 2));

        float length2 = (float) Math.sqrt(Math.pow(point_a1 - point_a2, 2) + Math.pow(point_b1 - point_b2, 2));

        System.out.println("length of Line 1 is : " + length1 + "\n" + "length of Line 2 is : " + length2);
        System.out.println(".....................................");

        //comparing if both lines are equal
        if (length1 == length2) {
            System.out.println("the line are equal .");
        } else
            System.out.println("they are not equal...");
    }

}
