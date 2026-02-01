package net.polarclient.gui.mod;

import java.util.ArrayList;

import net.polarclient.gui.mod.mods.*;

public class HudManager {

    public ArrayList<HudMod> hudMods = new ArrayList<>();

    public ClientName clientName;
    public CoordinatesMod coordinatesMod;
    public FpsMod fpsMod;
    public Ping pingMod;

    public HudManager() {
        hudMods.add(clientName = new ClientName());
        hudMods.add(coordinatesMod = new CoordinatesMod());
        hudMods.add(fpsMod = new FpsMod());
        hudMods.add(pingMod = new Ping());

    }

    public void renderMods() {
        for (HudMod m : hudMods) {
            if (m.isEnabled()) {
                m.draw();
            }
        }
    }
}
