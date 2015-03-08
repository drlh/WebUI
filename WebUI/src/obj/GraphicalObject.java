/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.*;
import java.io.Serializable;
import javax.swing.JPopupMenu;

/**
 *
 * @author Fabian Angst
 */
public abstract class GraphicalObject implements Serializable {

    protected Color col;
    protected Rectangle r;
    private String href = "";
    private String alt = "";
    private int[] coords;

    public GraphicalObject(Color col, int x, int y, int width, int height) {
        this.col = col;
        r = new Rectangle(x, y, width, height);
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getAlt() {
        return this.alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Color getColor() {
        return col;
    }

    public void setColor(Color col) {
        this.col = col;
    }

    public abstract String getCoordinates();

    public abstract void setCoordinates(String coordinate); //each split by ","

    public abstract void draw(Graphics2D g);

    public abstract String getMapCode();

    public abstract boolean contains(Point p);

    public Rectangle getR() {
        return r;
    }

    public void setR(Rectangle r) {
        this.r = r;
    }
}
