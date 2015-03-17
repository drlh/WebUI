/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class PentagonObject extends GraphicalObject {

    private int n, rad;
    private double angle;
    private int[] x = new int[5];
    private int[] y = new int[5];
    private double dv = 5 * 2 * Math.PI / 360;
    private double turn = 0.0;

    int[] coords = new int[10];

    public PentagonObject(Color col, int x, int y, int width, int height) {
        this.col = col;
        r = new Rectangle(x, y, width, height);
        n = 5;
        rad = (width + height) / 2;
        angle = 2 * Math.PI / n;
    }

    @Override
    public String getCoordinateString() {
        return "";
    }

    private Polygon getPentagon() {
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

    @Override
    public void draw(Graphics2D g) {
        if (isSelected() == true) {
            g.setStroke(getStroke());
            g.drawRect(r.x, r.y, r.width, r.height);
        }
        Polygon p = getPentagon();
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
        return getPentagon().contains(p);
    }

    @Override
    public String getObjectInfo() {
        return "Pentagon";
    }

}
