package net.liquidclient.gui.mod.mods;

import net.liquidclient.Client;
import net.liquidclient.gui.mod.HudMod;
import net.minecraft.src.FontRenderer;


public class ClientName extends HudMod {

    public FontRenderer fr = mc.fontRenderer;

    public ClientName() {
        super("§6[§eLiquid Client (1.5.2)§6]", 5, 10);
    }

    @Override 
    public void draw() {
        fr.drawStringWithShadow(name, getX(), getY(), 0);
        super.draw();
    }

    @Override
    
    public int getWidth() {
        return fr.getStringWidth(name);
    }

    @Override
    public int getHeight() {
        return fr.FONT_HEIGHT;
    }

}
