package net.polarclient.gui.mod.mods;

import net.polarclient.gui.mod.HudMod;

public class CoordinatesMod extends HudMod {



    public CoordinatesMod() {
        super("Coordinates", 5, 20);
    }

    @Override 
    public void draw() {
        fr.drawStringWithShadow(name + " X: " + Math.round(mc.thePlayer.posX * 1000.0) / 1000.0 + " Y: " + Math.round(mc.thePlayer.posY * 1000.0) / 1000.0 + " Z: " + Math.round(mc.thePlayer.posZ * 1000.0) / 1000.0, getX(), getY(), -1);
        super.draw();
    }

    public int getWidth() {
        return fr.getStringWidth(name);
    }

    public int getHeight() {
        return fr.FONT_HEIGHT;
    }

}
