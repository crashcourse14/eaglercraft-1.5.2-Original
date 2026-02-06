/*package net.polarclient.gui.hud;

import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import net.polarclient.Client;
import net.polarclient.gui.mod.mods.*;
import net.polarclient.gui.mod.HudManager;
import net.minecraft.src.GuiMainMenu;


public class ModMenu extends GuiScreen{

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        //this.drawBackground(5);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public void initGui() {
        this.buttonList.add(new GuiButton(1, width / 2 - 150, height / 2 - 20, 150, 20, "FPS - " + Client.INSTANCE.hudManager.fpsMod.isEnabled()));
        this.buttonList.add(new GuiButton(2, width / 2 - 150, height / 2 - 40, 150, 20, "PING - " + Client.INSTANCE.hudManager.pingMod.isEnabled()));
        this.buttonList.add(new GuiButton(3, width / 2 - 150, height / 2 - 60, 150, 20, "COORDS - " + Client.INSTANCE.hudManager.coordinatesMod.isEnabled()));
        this.buttonList.add(new GuiButton(4, width / 2 - 150, height / 2 - 80, 150, 20, "VERTEXES - " + Client.INSTANCE.hudManager.vertexesMod.isEnabled()));
        this.buttonList.add(new GuiButton(5, width / 2 - 150, height / 2 - 100, 150, 20, "TRIANGLES - " + Client.INSTANCE.hudManager.triangleMod.isEnabled()));
        this.buttonList.add(new GuiButton(6, width / 2 - 150, height / 2 - 120, 150, 20, "SERVER IP - " + Client.INSTANCE.hudManager.serverIPMod.isEnabled()));
        this.buttonList.add(new GuiButton(100, width / 2 + 10, height / 2 - 20, 150, 20, "X"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == 1) {
            Client.INSTANCE.hudManager.fpsMod.toggle();
            button.displayString = "FPS - " + Client.INSTANCE.hudManager.fpsMod.isEnabled();
        }
        if (button.id == 2) {
            Client.INSTANCE.hudManager.pingMod.toggle();
            button.displayString = "PING - " + Client.INSTANCE.hudManager.pingMod.isEnabled();
        }
        if (button.id == 3) {
            Client.INSTANCE.hudManager.coordinatesMod.toggle();
            button.displayString = "COORDS - " + Client.INSTANCE.hudManager.coordinatesMod.isEnabled();
        }
        if (button.id == 4) {
            Client.INSTANCE.hudManager.vertexesMod.toggle();
            button.displayString = "VERTEXES - " + Client.INSTANCE.hudManager.vertexesMod.isEnabled();
        }
        if (button.id == 5) {
            Client.INSTANCE.hudManager.triangleMod.toggle();
            button.displayString = "TRIANGLES - " + Client.INSTANCE.hudManager.triangleMod.isEnabled();
        }
        if (button.id == 6) {
            Client.INSTANCE.hudManager.serverIPMod.toggle();
            button.displayString = "SERVER IP - " + Client.INSTANCE.hudManager.serverIPMod.isEnabled();
        }
        if (button.id == 100) {
            this.mc.displayGuiScreen(new GuiMainMenu());
        }
        super.actionPerformed(button);
    }
}*/
