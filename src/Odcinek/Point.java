package Odcinek;

public class Point {
    private String Nazwa;
    private int X;
    private int Y;

    public Point(String nazwa, int x, int y) {
        Nazwa = nazwa;
        X = x;
        Y = y;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
