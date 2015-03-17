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

/**
 *
 * @author Fabian Angst
 */
public abstract class GraphicalObject implements Serializable {

    protected Color col;
    protected Rectangle r;
    private String href = "";
    private String alt = "";
    private boolean sel = false;
    private BasicStroke stroke = new BasicStroke(1.4f, BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_MITER, 1.4f, new float[]{1.4f, 1.4f}, 0.4f);

    public abstract String getObjectInfo();

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

    public abstract String getCoordinateString();

    public abstract void draw(Graphics2D g);

    public abstract String getMapCode();

    public abstract boolean contains(Point p);

    public Rectangle getR() {
        return r;
    }

    public void setR(Rectangle r) {
        this.r = r;
    }

    public void select() {
        sel = true;
    }

    public void unSelect() {
        sel = false;
        }

    public boolean isSelected() {
        return sel;
    }

    public BasicStroke getStroke() {
        return stroke;
    }
}
