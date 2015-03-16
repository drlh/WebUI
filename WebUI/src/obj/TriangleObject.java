package obj;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;

/**
 *
 * @author PR050736
 */
public class TriangleObject extends GraphicalObject {

    int coords[] = new int[6];

    public TriangleObject(Color col, int x, int y, int width, int height) {
        this.col = col;
        r = new Rectangle(x, y, width, height);
        getTriangle();
    }

    @Override
    public String getCoordinates() {
        getTriangle();
        String c = "";
        for (int i = 0; i < coords.length; i++) {
            if ((i + 1) == coords.length) {
                c += coords[i];
            } else {
                c += coords[i] + ",";
            }
        }
        return c;
    }

    @Override
    public void setCoordinates(String coordinate) {

    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(col);
        Polygon p = getTriangle();
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
        c += " coords=\"" + getCoordinates() + "\" shape=\"poly\">";
        return c;
    }

    @Override
    public boolean contains(Point p) {
        return getTriangle().contains(p);
    }

    @Override
    public String getObjectInfo() {
        return "Dreieck Höhe[" + r.height + "] Breite[" + r.width + "]";
    }

    private Polygon getTriangle() {
        Polygon p = new Polygon();
        p.addPoint(r.x + r.width / 2, r.y);
        coords[0] = r.x + r.width / 2;
        coords[1] = r.y;
        p.addPoint(r.x, r.y + r.height);
        coords[2] = r.x;
        coords[3] = r.y + r.height;
        p.addPoint(r.x + r.width, r.y + r.height);
        coords[4] = r.x + r.width;
        coords[5] = r.y + r.height;
        return p;
    }
}
