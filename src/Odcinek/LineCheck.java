package Odcinek;
import static java.lang.Math.*;


public class LineCheck {

    Line dluzszyOdcinkek(Line L1, Line L2) {
        if (dlugoscOdc(L1) < dlugoscOdc(L2)) {
            return L2;
        } else if (this.dlugoscOdc(L1) > dlugoscOdc(L2)) {
            return L1;
        } else {
            return null;
        }

    }

    public double dlugoscOdc(Line odc) {
        double dl = sqrt(pow(odc.getP1().getX() - odc.getP2().getX(), 2) + pow(odc.getP1().getY() - odc.getP2().getY(), 2));
        return dl;
    }
}
