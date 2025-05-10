package net.tubbor.world.gen;

import net.tubbor.world.gen.ModBushGeneration;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();

        ModBushGeneration.generateBushes();
    }
}