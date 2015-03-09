package obj;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author PR050736
 */
public class CircleObject extends GraphicalObject {

    private int rad, x;
    private int[] coords = new int[3];

    public CircleObject(Color col, int x, int y, int width, int height) {
        super(col, x, y, width, height);
        this.col = col;
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
            c += coords[i] + ",";
        }
        return c;
    }

    @Override
    public void setCoordinates(String coordinates) {
        String[] split = coordinates.split(",");
        x = Integer.parseInt(split[0]);
        rad = Integer.parseInt(split[2]);
        coords[0] = x;
        coords[1] = x;
        coords[2] = rad;

    }

    @Override
    public void draw(Graphics2D g) {
        g.drawOval(x, x, rad, rad);
    }

    @Override
    public boolean contains(Point p) {
        return false;
    }

    @Override
    public String getObjectInfo() {
        return "Kreis";
    }

}
