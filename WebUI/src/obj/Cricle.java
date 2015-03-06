/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.awt.Graphics2D;

/**
 *
 * @author PR050736
 */
public class Cricle extends GraficalObject {

    private int rad, x, y;
    private int[] coords = new int[3];

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
        y = Integer.parseInt(split[1]);
        rad = Integer.parseInt(split[2]);
        coords[0] = x;
        coords[1] = y;
        coords[2] = rad;

    }

    @Override
    public void draw(Graphics2D g) {
        
    }

}
