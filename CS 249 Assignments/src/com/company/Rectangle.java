

class Rectangle {
    double width;
    double height;

    Rectangle ()
    {
        width = 1;
        height = 1;
    }

    Rectangle (double nextwidth, double nextheight)
    {
        width = nextwidth;
        height = nextheight;
    }

    double Area()
    {
        return width * height;
    }

    double Perimeter()
    {
        return 2 * width + 2 * height;
    }
    void setDimension(double nextwidth, double nextheight)
    {
        width = nextwidth;
        height = nextheight;
    }
}
