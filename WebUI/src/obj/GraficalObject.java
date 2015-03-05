/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.awt.Color;

/**
 *
 * @author Fabian Angst
 */
public abstract class GraficalObject {

    private Color col = new Color(0, 0, 0);

    public GraficalObject() {
    }

    public Color getColor() {
        return col;
    }
    
    public abstract void getCoordinates();
}
