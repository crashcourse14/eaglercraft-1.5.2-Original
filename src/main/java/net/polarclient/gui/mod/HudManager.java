package net.polarclient.gui.mod;

import java.util.ArrayList;

import net.polarclient.gui.mod.mods.CoordinatesMod;
import net.polarclient.gui.mod.mods.TestMod;

public class HudManager {

    public ArrayList<HudMod> hudMods = new ArrayList<>();

    public TestMod testMod;
    public CoordinatesMod coordinatesMod;

    public HudManager() {
        hudMods.add(testMod = new TestMod());
        hudMods.add(coordinatesMod = new CoordinatesMod());

    }

    public void renderMods() {
        for (HudMod m : hudMods) {
            if (m.isEnabled()) {
                m.draw();
            }
        }
    }
}
