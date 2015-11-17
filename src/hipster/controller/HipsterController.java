package hipster.controller;

import hipster.view.HipsterFrame;
import hipster.model.Hipster;

public class HipsterController
{
	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	
	public HipsterController()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
		
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What is that name");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName + "'s Hipster Project");
	}
	
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}

}
