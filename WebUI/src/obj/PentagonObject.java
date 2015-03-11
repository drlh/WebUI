/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author PR050736
 */
public class PentagonObject extends GraphicalObject {

    public PentagonObject(Color col, int x, int y, int width, int height) {

        this.col = col;
    }

    @Override
    public String getCoordinates() {
        return "";
    }

    @Override
    public void setCoordinates(String coordinate) {

    }

    @Override
    public void draw(Graphics2D g) {

    }

    @Override
    public String getMapCode() {
        return "";
    }

    @Override
    public boolean contains(Point p) {
        return false;
    }

    @Override
    public String getObjectInfo() {
        return "Pentagon";
    }

}
