package day3.assignment.LineComparison;

import java.util.Scanner;

public class LineComparison {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter the coordinates of line 1 respectively : ");
        Line l1 = new Line();
        l1.p1 = new Point();
        l1.p1.x = sc.nextInt();
        l1.p1.y = sc.nextInt();
        l1.p2 = new Point();
        l1.p2.x = sc.nextInt();
        l1.p2.y = sc.nextInt();
        l1.length = l1.getLength();
        System.out.println("length of line l1 is : " + l1.length);
        System.out.println("enter the coordinates of line 2 respectively : ");
        Line l2 = new Line();
        l2.p1 = new Point();
        l2.p1.x = sc.nextInt();
        l2.p1.y = sc.nextInt();
        l2.p2 = new Point();
        l2.p2.x = sc.nextInt();
        l2.p2.y = sc.nextInt();
        l2.length = l2.getLength();
        System.out.println("length of line l2 is : " + l2.length);

        Float Length1 = new Float(l1.length);
        Float Length2 = new Float(l2.length);
        LineComparison lineComparison=new LineComparison();
        lineComparison.equals(Length1,Length2);
        lineComparison.compareLength(Length1,Length2);
    }
//        System.out.println("value of s1 :" + Length1 + "\n" + "value of s2 : " + Length2);
        public void equals (Float Length1,Float Length2) {

            if (Length1.equals(Length2)) {
                System.out.println("lines are equal");
            } else {
                System.out.println("not equal");
            }
        }

        public void compareLength (Float Length1, Float Length2) {
            int result = Length1.compareTo(Length2);
            if (result < 0) {
                System.out.println(result + " this means line l1 is " + result + " number smaller than l2");
            } else if (result > 0) {
                System.out.println(result + " this means line l1 is " + result + " number greater than l2");
            } else
                System.out.println(result + " this means they are equal");

        }

    }

