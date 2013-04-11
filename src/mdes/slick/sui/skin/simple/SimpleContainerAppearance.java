/*
 * SimpleContainerAppearance.java
 *
 * Created on November 7, 2007, 8:17 PM
 */

package mdes.slick.sui.skin.simple;

import mdes.slick.sui.Component;
import mdes.slick.sui.Skin;
import mdes.slick.sui.Theme;
import mdes.slick.sui.skin.SkinUtil;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.RoundedRectangle;
import org.newdawn.slick.gui.GUIContext;

/**
 *
 * @author davedes
 */
public class SimpleContainerAppearance extends SimpleComponentAppearance {
    
    public void render(GUIContext ctx, Graphics g, Component comp, Skin skin, Theme theme) {
      
    	Rectangle rect = comp.getAbsoluteBounds();
    	
        //check for round rectangles
        if (SimpleSkin.isRoundRectanglesEnabled()) {            
        	RoundedRectangle rounded = new RoundedRectangle(0f,0f,0f,0f,5f,15); 
        	rounded.setBounds(comp.getAbsoluteBounds());
        	rect = rounded;
        	g.setAntiAlias(true);
        }    	
    	
    	SkinUtil.renderComponentBase(g, comp, rect);
    }
}
