package com.econominer;

import com.econominer.events.MiningEvent;
import com.econominer.skills.Mining;

/*
* Basic importing
*/
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
//import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
/*
* Basic needed forge stuff
*/
@Mod(modid = "Econominer", name = "Econominer", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Econominer
{
	/**
	 *  Instance of Mining skill
	 */
	public static Mining mining = new Mining();
	/*
	* ToolMaterial
	*/
	//Telling forge that we are creating these
	//items
	public static Item amethyst;
	public static Block amethystblock;
	
	//tools
	
	//Declaring Init
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		// TODO player stuff I guess -- RC
		mining.setMiningSpeeds();
		
		amethyst = new EcoItem(2000).setUnlocalizedName("amethyst");
		LanguageRegistry.addName(amethyst, "Amethyst");
		
		amethystblock = new AmethystBlock(3608, "amethystblock").setUnlocalizedName("amethyst_block").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(amethystblock, "amethystblock");
		LanguageRegistry.addName(amethystblock, "Amethyst Block");
		
		GameRegistry.registerWorldGenerator(new WorldGenEco());
		
		// register custom events -- RC
		MinecraftForge.EVENT_BUS.register(new MiningEvent());
	}
}