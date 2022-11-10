import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame implements ActionListener{
	
	JButton button;
	JButton button2;
	int likes;
	JFrame frame;
	JLabel label;
	ImageIcon reika;
	JPanel panel;
	
	GUI(){
		
		
		reika = new ImageIcon(getClass().getResource("nuba.png"));
		panel = new JPanel();
		button = new JButton();
		label = new JLabel("Likes: "+likes);
		
		button.setBounds(100,50,250,300);
		button.addActionListener(this);
		button.setText("Like");
		button.setFocusable(false);
		button.setIcon(reika);
		button.setHorizontalTextPosition(button.CENTER);
		button.setVerticalTextPosition(button.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 40));
		button.setBackground(Color.MAGENTA);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.add(label);
		
		
		label.setLabelFor(button);
		label.setLocation(100,400);
		label.setFont(new Font("Comic Sans",Font.CENTER_BASELINE,35));
		
		//panel.setBorder(BorderFactory.createEmptyBorder(0,0,100,100));
		//panel.setLayout(new GridLayout(0,1));
		//panel.setBackground(Color.BLACK);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle("Quantos likes merece essa guerreira?");
		this.add(button);
		this.add(button2);
		
	}
public static void main(String[] args) {
	new GUI();
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== button) {
			likes++;
			label.setText("Likes: "+likes);
		}
		// TODO Auto-generated method stub
		
	}}

