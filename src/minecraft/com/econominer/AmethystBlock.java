package com.econominer;

import java.util.Random;

import com.econominer.gui.SkillGUI;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


public class AmethystBlock extends Block
{
	public AmethystBlock(int par1, String texture)
	{
		super(par1, Material.iron);
		setCreativeTab(CreativeTabs.tabBlock); //place in creative tabs
	}
	//drops when broken with pickaxe
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return Econominer.amethystblock.blockID;
	}
	public int quantityDropped(Random random)
	{
		//return 1;
		return 1 + random.nextInt(3);
	}
	
	public void registerIcons(IconRegister reg)
	{ // Make sure to import IconRegister!
		this.blockIcon = reg.registerIcon("amethyst_block"); // You can also replace blockID and blockIcon with itemID and itemIcon
	}
	
	
	/*
	 * TEMPORARILY UNIMPLEMENTED
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)
	{
		player.openGui(Econominer.instance, 0, world, x, y, z);
		return true;
	}
	*/
}