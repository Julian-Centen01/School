

public class Assignment_6_9 {
    public static void main(String[] args)
    {
        double Ft = 1.0;
        double newM = 0;
        double M = 20.0;
        double newft = 0;

        System.out.println("Foot   Meter  |  Meter   Foot");

        while (Ft <= 10 && M <= 65)
        {
            newM = FoottoMeter(Ft);
            newft = MetertoFoot(M);

            System.out.println(Ft + "      " + newM + "     |   " + M + "       " + newft);
            Ft = Ft + 1.0;
            M = M + 5.0;
        }


    }
    public static double FoottoMeter (double Ft)
    {
        double newM = 0;

        newM = Ft * .305;

        return newM;
    }
    public static double MetertoFoot (double M)
    {
        double newft = 0;

        newft =  M * 3.279;

        return newft;
    }
}
