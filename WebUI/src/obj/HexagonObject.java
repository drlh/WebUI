package obj;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;

/**
 *
 * @author Fabian Angst
 */
public class HexagonObject extends GraphicalObject {

    private int n, rad;
    private double angle;
    private int[] x = new int[5];
    private int[] y = new int[5];
    private double dv = 6 * 2 * Math.PI / 360;
    private double turn = 0.0;

    int[] coords = new int[12];

    public HexagonObject(Color col, int x, int y, int width, int height) {
        this.col = col;
        r = new Rectangle(x, y, width, height);
        n = 6;
        rad = (width + height) / 2;
        angle = 2 * Math.PI / n;
    }

    @Override
    public String getCoordinateString() {
        return "";
    }

    @Override
    public void draw(Graphics2D g) {
        if (isSelected() == true) {
            g.setStroke(getStroke());
            g.drawRect(r.x, r.y, r.width, r.height);
            g.drawRect(r.x, r.x, 2, 2);
        }
        Polygon p = getHexagon();
        g.setColor(col);
        g.fillPolygon(p);
    }

    @Override
    public String getMapCode() {
        String c = "";
        if (getAlt() == "") {
            c += "<area";
        } else {
            c += "<area alt=\"" + getAlt() + "\"";
        }
        if (getHref() == "") {
            c += " nohref";
        } else {
            c += "\" href=\"" + getHref();
        }
        c += " coords=\"" + getCoordinateString() + "\" shape=\"poly\">";
        return c;
    }

    @Override
    public boolean contains(Point p) {
        return false;
    }

    @Override
    public String getObjectInfo() {
        return "Hexagon";
    }

    private Polygon getHexagon() {
        Polygon p = new Polygon();
        int xnull = r.x / 2;
        int ynull = r.y / 2;
        turn = 1.5707963267948698; //trial an error selected 

        for (int i = 0; i < n; i++) {
            double v = i * angle - turn;
            x[i] = xnull + (int) Math.round(rad * Math.cos(v));
            y[i] = ynull + (int) Math.round(rad * Math.sin(v));
            p.addPoint(x[i], y[i]);
        }
        return p;
    }

}
