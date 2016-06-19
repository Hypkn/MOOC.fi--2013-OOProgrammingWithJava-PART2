/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Dev
 */
public class Box extends Figure {
    
    private int height;
    private int width;
    
    public Box(int x, int y, int height, int width){
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(getX(), getY(), height, width);
    }
    
    
    
}
