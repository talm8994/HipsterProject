package hipster.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import hipster.controller.HipsterController;
import hipster.model.*;


public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox<String>();
		baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 129, SpringLayout.WEST, this);
		bookPageCountLabel = new JLabel("page count");
		baseLayout.putConstraint(SpringLayout.SOUTH, bookPageCountLabel, -194, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, bookPageCountLabel, -59, SpringLayout.EAST, this);
		bookAuthorLabel = new JLabel("me");
		baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, -4, SpringLayout.NORTH, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookAuthorLabel, 0, SpringLayout.WEST, bookPageCountLabel);
		bookSubjectLabel = new JLabel("subject");
		baseLayout.putConstraint(SpringLayout.SOUTH, bookAuthorLabel, -6, SpringLayout.NORTH, bookSubjectLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookSubjectLabel, 0, SpringLayout.WEST, bookPageCountLabel);
		bookTitleLabel = new JLabel("title");
		baseLayout.putConstraint(SpringLayout.SOUTH, bookSubjectLabel, -6, SpringLayout.NORTH, bookTitleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookTitleLabel, 0, SpringLayout.WEST, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, bookTitleLabel, -6, SpringLayout.NORTH, bookPageCountLabel);
		bookPriceLabel = new JLabel("$$$");
		baseLayout.putConstraint(SpringLayout.NORTH, bookPriceLabel, 8, SpringLayout.SOUTH, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookPriceLabel, 0, SpringLayout.WEST, bookPageCountLabel);
		changeBookButton = new JButton("stuff");
		baseLayout.putConstraint(SpringLayout.NORTH, changeBookButton, -1, SpringLayout.NORTH, phraseComboBox);
		baseLayout.putConstraint(SpringLayout.EAST, changeBookButton, -6, SpringLayout.WEST, phraseComboBox);
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		startClick = 0;
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.red);
		this.add(phraseComboBox);
		this.add(bookPageCountLabel);
		this.add(bookAuthorLabel);
		this.add(bookSubjectLabel);
		this.add(bookTitleLabel);
		this.add(bookPriceLabel);
		this.add(changeBookButton);
		
	}
	
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() *256);
				setBackground(new Color(red,blue,green));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		});
		
		changeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book [] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClick < maxClicks)
				{
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
					bookAuthorLabel.setText("Book author: " + tempBooks[startClick].getAuthor());
					bookTitleLabel.setText("Book title: " + tempBooks[startClick].getTitle());
					bookPageCountLabel.setText("Book pages: " + tempBooks[startClick].getPageCount());
					bookPriceLabel.setText("book price: " + tempBooks[startClick].getPrice());
					startClick++;
				}
				else
				{
					startClick = 0;
					bookSubjectLabel.setText("Book subject: " );
					bookAuthorLabel.setText("Book Author: ");
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("Book pages: ");
					bookPriceLabel.setText("book price: ");
					
				}
			}
		});
	}
	
}
	
