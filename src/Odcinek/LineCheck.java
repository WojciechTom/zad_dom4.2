package Odcinek;
import static java.lang.Math.*;


public class LineCheck {

    Line dluzszyOdcinkek(Line l1, Line l2) {
        if (dlugoscOdc(l1) < dlugoscOdc(l2)) {
            return l2;
        } else if (this.dlugoscOdc(l1) > dlugoscOdc(l2)) {
            return l1;
        } else {
            return null;
        }

    }

    public double dlugoscOdc(Line odc) {
        double dl = sqrt(pow(odc.getP1().getX() - odc.getP2().getX(), 2) + pow(odc.getP1().getY() - odc.getP2().getY(), 2));
        return dl;
    }
}
