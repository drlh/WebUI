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

/**
 *
 * @author Fabian Angst
 */
public class HexagonObject extends GraphicalObject {

    private int n, rad;
    private double angle;
    private int[] x = new int[5];
    private int[] y = new int[5];
    private double dv = 5 * 2 * Math.PI / 360;
    private double turn = 0.0;

    int[] coords = new int[12];

    public HexagonObject(Color col, int x, int y, int width, int height) {
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

    @Override
    public void draw(Graphics2D g) {
        
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
        c += " coords=\"" + getCoordinateString()+ "\" shape=\"poly\">";
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

}
