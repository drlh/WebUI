/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

/**
 *
 * @author PR050736
 */
public class Cricle extends GraficalObject {

    private int rad, x, y;
    private int[] coords = new int[3];

    @Override
    public void drawObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMapCode() {
        String mapcode = "<area coords=\"" + getCoordinates() + "\" shape=\"circle\">";
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
        
    }

}
