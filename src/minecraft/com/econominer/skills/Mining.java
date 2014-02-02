package com.econominer.skills;

import net.minecraft.client.Minecraft;
import net.minecraft.block.Block;

public class Mining extends Skill {
	// TODO Implement the mining skill -- RC
	
	public void setMiningSpeeds() {
		float ironOre = 1.5f;
		float diamondOre = 3.0f;
		float goldOre = 0.75f;
		float coalOre = 0.75f;
		
		// TODO come up with a better formula -- RC
		float formula = this.currentLevel/50f;
		
		Block.oreIron.setHardness(ironOre/(formula));
		Block.oreDiamond.setHardness(diamondOre/(formula));
		Block.oreGold.setHardness(goldOre/(formula));
		Block.oreCoal.setHardness(coalOre/(formula));
	}
}
