package Odcinek;

import java.sql.SQLOutput;

public class LineCheckTest {
    public static void main(String[] args) {


        Point A = new Point("A", 2, 2);
        Point B = new Point("B", 4, 4);
        Point C = new Point("C", -2, -2);
        Point D = new Point("D", 6, 6);
        Line odc1 = new Line("odc1", A, B);
        Line odc2 = new Line("odc2", C, D);


        LineCheck maszyna = new LineCheck();
        Line werdykt = maszyna.dluzszyOdcinkek(odc1, odc2);

        System.out.println("Dłuższy odcinek to odcinek:");
        System.out.println(werdykt.getNazwaOdc());
        System.out.println("oparty na punktach:");
        System.out.println(werdykt.getP1().getNazwa() + " (" + werdykt.getP1().getX() + ", " + werdykt.getP1().getY() + ")" );
        System.out.println(werdykt.getP2().getNazwa() + " (" + werdykt.getP2().getX() + ", " + werdykt.getP2().getY() + ")" );
        System.out.println("o długosći:");
        System.out.println(maszyna.dlugoscOdc(werdykt) + " cm");

    }
}
