package net.liquidclient.gui.hud;

import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiIngame;
import net.minecraft.src.GuiScreen;
import net.liquidclient.Client;
import net.minecraft.src.GuiIngame;
import net.minecraft.client.Minecraft;
import net.liquidclient.gui.hud.ModMenu;

public class PostModMenu extends GuiScreen {

    

    @Override
    public void initGui() {
        buttonList.clear();
        int BUTTON_WIDTH = 120;
        int BUTTON_HEIGHT = 20;

        int x = (width - BUTTON_WIDTH) / 2;
        int y = (height - BUTTON_HEIGHT) / 2;

        buttonList.add(new GuiButton(1, x, y, BUTTON_WIDTH,BUTTON_HEIGHT, "Polar Settings"));

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        switch (button.id) {
            case 1:
                Client.INSTANCE.hudManager.fpsMod.toggle();
                this.mc.displayGuiScreen(new ModMenu());
                break;

        }
    }
}
