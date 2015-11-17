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
		
	}

}
