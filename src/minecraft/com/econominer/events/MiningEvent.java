package com.econominer.events;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

import com.econominer.Econominer;
import com.econominer.skills.Skill;

public class MiningEvent {
	@ForgeSubscribe
	public void onBlockBreak(BreakEvent event) {
		Block block = event.block;
		
		switch(block.blockID) {
			case 14: // gold ore
				Econominer.mining.addXP(12);
				break;
			case 15: // iron ore
				Econominer.mining.addXP(10);
				break;
			case 16: // coal ore
				Econominer.mining.addXP(6);
				break;
			case 56: // diamond ore
				Econominer.mining.addXP(24);
				break;
		}
		
		Econominer.mining.setMiningSpeeds();
	}
}
