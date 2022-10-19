

public class Assignment_9_1 {
    public static void main (String[] args)
    {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("A rectangle with " + rectangle1.width + " width and " + rectangle1.height + " height has an area of " + rectangle1.Area() +  " and a perimeter of " +  rectangle1.Perimeter());
        System.out.println("A rectangle with " + rectangle2.width + " width and " + rectangle2.height + " height has an area of " + rectangle2.Area() +  " and a perimeter of " +  rectangle2.Perimeter());

    }
}
