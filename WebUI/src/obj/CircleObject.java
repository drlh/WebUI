package obj;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author PR050736
 */
public class CircleObject extends GraphicalObject {

    private int rad, x, y;
    private int[] coords = new int[3];

    public CircleObject(Color col, int x, int y, int rad) {
        this.col = col;
        r = new Rectangle(x, y, rad, rad);
        this.rad = rad;
        this.x = x;
        this.y = y;
        setCoordinates(x + "," + y + "," + rad);
    }

    @Override
    public String getMapCode() {
        String mapcode = "<area alt=\"" + getAlt() + "\" href=\"" + getHref() + "\" coords=\"" + getCoordinates() + "\" shape=\"circle\">";
        return mapcode;
    }

    @Override
    public String getCoordinates() {
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
    public void setCoordinates(String coordinates) {
        String[] split = coordinates.split(",");
        x = Integer.parseInt(split[0]);
        y = Integer.parseInt(split[1]);
        rad = Integer.parseInt(split[2]);
        coords[0] = x;
        coords[1] = y;
        coords[2] = rad;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(getColor());
        g.fillOval(r.x, r.y, r.width, r.height);

    }

    @Override
    public boolean contains(Point startPoint) {
        Ellipse2D e = new Ellipse2D.Double(r.x, r.y, r.width, r.height);
        return e.contains(startPoint);
    }

    @Override
    public String getObjectInfo() {
        return "Kreis: Rad[" + rad + "] Centerpos[" + x + "," + y + "]";
    }

}
