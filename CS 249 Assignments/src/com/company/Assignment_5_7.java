

public class Assignment_5_7 {
    public static void main (String[] args)
    {
        double tuition = 10000;
        double interest = 1.05;
        double total = 0;

        for (int i = 0; i < 14; i++)
        {
            tuition = tuition * interest;
            if (i >= 9)
            {
                total = total + tuition;
                if (i == 9)
                    System.out.println("Year 10 Tuition: " + tuition);

            }
        }
        System.out.println("Total four-year tuition past year 10: " + total);
    }
}
