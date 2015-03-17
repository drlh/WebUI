/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author PR050736
 */
public class RectangleObject extends GraphicalObject {

    int[] coords = new int[4];

    public RectangleObject(Color col, int x, int y, int width, int height) {
        this.col = col;
        r = new Rectangle(x, y, width, height);
        coords[0] = r.x;
        coords[1] = r.y;
        coords[2] = r.x + r.width;
        coords[3] = r.y + r.height;
    }

    @Override
    public String getCoordinateString() {
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
    public void draw(Graphics2D g) {
        if (isSelected() == true) {
            g.setStroke(getStroke());
            g.drawRect(r.x, r.y, r.width, r.height);
        }
        g.setColor(col);
        g.fillRect(r.x, r.y, r.width, r.height);
        coords[0] = r.x;
        coords[1] = r.y;
        coords[2] = r.x + r.width;
        coords[3] = r.y + r.height;
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
        c += " coords=\"" + getCoordinateString() + "\" shape=\"rect\">";
        return c;
    }

    @Override
    public boolean contains(Point p) {
        Rectangle2D e = new Rectangle2D.Double(r.x, r.y, r.width, r.height);
        return e.contains(p);
    }

    @Override
    public String getObjectInfo() {
        return "Rechteck";
    }

}
