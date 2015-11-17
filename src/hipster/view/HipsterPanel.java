package hipster.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import hipster.controller.HipsterController;


public class HipsterPanel extends JPanel
{
	private HipsterContoller baseController;
	private SpringLayout = new SpringLayout();
	
	public HipsterPanel(HipsterController baseContoller);
	{
		
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getfirstHipster().getHipsterphrase();
		DefaultComboBoxModel phraseModle = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	private void setupPanel()
	{
		
		this.setlayout(baseLayout);
		this.setBackground(Color.red);
		this.add(phraseComboBox);
	}
	
	setupListeners()
	{
		phraseComboBox.addactionListener(new ActionListener()
		{
			public void ctionPreformer(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() *256);
				
			}
		});
	}
	
	
	
	
	
}
