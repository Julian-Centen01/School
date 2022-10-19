

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock()
    {
        symbol = "ORCL";
        name = "Oracle Corporation";
        previousClosingPrice = 34.5;
        currentPrice = 34.35;
    }
    double getChangePercent()
    {
        return 100 * ((currentPrice - previousClosingPrice)/ previousClosingPrice);
    }
}
