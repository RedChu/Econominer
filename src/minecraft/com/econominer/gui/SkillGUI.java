package com.econominer.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class SkillGUI extends GuiScreen
{
	public SkillGUI(World world, Minecraft minecraft, EntityPlayer player)
	{
	}
	
	public void initGui()
	{
		//controlList.clear();
		//controlList.add(new GuiButton(1, width / 2 - 50, height / 2 - 40, 100, 20, "New Button"));
		buttonList.clear();
		buttonList.add(new GuiButton(1, width / 2 - 50, height / 2 - 40, 100, 20, "New Button"));
	}
	
	public void actionPerformed(GuiButton button){}
	
	public void drawScreen(int i, int j, float f)
	{
		drawDefaultBackground();
		drawCenteredString(fontRenderer, "We Made A GUI", width / 2, height / 2 - 20, 0xffffff);
		super.drawScreen(i, j, f);
	}
}