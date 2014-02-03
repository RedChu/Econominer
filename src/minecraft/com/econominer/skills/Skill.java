package com.econominer.skills;

public class Skill {
	protected int currentLevel = 1;
	protected int currentXP = 0;
	
	private int expThreshold = 1;
	
	public Skill() {
		// TODO some constructor stuff, probably -- RC
		
		recalculateXP();
	}
	
	public int getCurrentLevel() {
		return currentLevel;
	}
	
	public int getCurrentXP()
	{
		return currentXP;
	}
	
	public void addXP(int val)
	{
		currentXP += val;
		
		if (currentXP >= expThreshold)
		{
			currentXP -= expThreshold;
			currentLevel ++;
			recalculateXP();
		}
	}
	
	public void recalculateXP()
	{
		// TODO: Consider the level cap -- Kilin
		// 11 XP at level 1
		// 151 XP at level 5
		// 651 XP at level 10
		// 5751 XP at level 25
		// 35251 XP at level 50
		// 240501 XP at level 100
		expThreshold = (int) Math.ceil(((1/5) * Math.pow(currentLevel, 3)) + (4 * Math.pow(currentLevel, 2)) + (5 * currentLevel) + 1);
	}
}
