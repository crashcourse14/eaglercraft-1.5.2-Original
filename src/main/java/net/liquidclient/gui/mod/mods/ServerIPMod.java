package net.liquidclient.gui.mod.mods;

import net.minecraft.client.Minecraft;
import net.liquidclient.gui.mod.HudMod;
import net.lax1dude.eaglercraft.EaglerAdapter;

public class ServerIPMod extends HudMod {


    Minecraft mc = Minecraft.getMinecraft();

    public ServerIPMod() {
        super("Server IP", 5, 150);
    }

    @Override 
    public void draw() {
        fr.drawStringWithShadow("§6[§e" + mc.getServerURI() + "§6]", getX(), getY(), 0);
        super.draw();
    }


    @Override
    public int getWidth() {
        return fr.getStringWidth("§6[§e" + mc.getServerURI() + "§6]");
    }

    @Override
    public int getHeight() {
        return fr.FONT_HEIGHT;
    }

}



