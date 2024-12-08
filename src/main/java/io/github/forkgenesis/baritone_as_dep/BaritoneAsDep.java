package io.github.forkgenesis.baritone_as_dep;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(BaritoneAsDep.modid)
public class BaritoneAsDep {
    public static final String modid = "baritone_as_dep";

    public BaritoneAsDep() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
