package com.econominer;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class EcoItem extends Item
{

	public EcoItem(int par1)
	{
		super(par1); //Returns super constructor: par1 is ID
		setCreativeTab(CreativeTabs.tabMaterials);
	}//Tells the game what creative mode tab it goes in


	public void registerIcons(IconRegister reg)
	{ // Make sure to import IconRegister!
		if (itemID == Econominer.amethyst.itemID)
		{
			this.itemIcon = reg.registerIcon("amethyst"); // You can also replace blockID and blockIcon with itemID and itemIcon
		}
	}
}