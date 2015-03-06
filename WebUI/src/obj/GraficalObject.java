/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.awt.Color;
import javax.swing.JPopupMenu;

/**
 *
 * @author Fabian Angst
 */
public abstract class GraficalObject {

    private Color col = new Color(0, 0, 0);
    private JPopupMenu contextMenu = new JPopupMenu();
    private String href = "";

    public GraficalObject() {
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Color getColor() {
        return col;
    }

    public void setColor(Color col) {
        this.col = col;
    }

    public abstract void getCoordinates();

    public abstract void setCoordinates(String coordinates);

    public abstract void drawObject();

    public abstract String getMapCode();
}
