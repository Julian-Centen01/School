

public class Assignment_6_8 {
    public static void main(String[] args)
    {
        double C = 40.0;
        double newF = 0;
        double F = 120.0;
        double newC = 0;

        System.out.println("Celsius   Fahrenheit  |  Fahrenheit   Celsius");

        while (C >= 31 && F >= 30)
        {
            newF = celsiustoFahrenheit(C);
            newC = fahrenheittoCelsius(F);

            System.out.println(C + "      " + newF + "     |   " + F + "       " + newC);
            C = C - 1;
            F = F - 10;
        }


    }
    public static double celsiustoFahrenheit (double C)
    {
        double newF = 0;

        newF = (9.0/5) * C + 32;

        return newF;
    }
    public static double fahrenheittoCelsius (double F)
    {
        double newC = 0;

        newC =  (5/9.0) * (F - 32);

        return newC;
    }
}
