package hipster.model;

public class Hipster
{
	private String name;
	private String []  hipsterPhrases;
	
	public Hipster()
	{
		this.name ="";
	    this.hipsterPhrases = new String[4];
	    
	    setupArray();
	    
	}
	
	private void setupArray()
	{
		
		hipsterPhrases[0] = "that is so mainstream";
		hipsterPhrases[1] = "im no normal hpster";
		hipsterPhrases[2] = "i did that before it was cool";
		hipsterPhrases[3] = "one caramel machiato ";
		
		
	}
}
