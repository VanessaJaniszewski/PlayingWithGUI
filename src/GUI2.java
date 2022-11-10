import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI2 extends JFrame implements ActionListener {
	
	JButton button;
	JButton button2;
	int likes;
	JFrame frame;
	JLabel label;
	ImageIcon a;
	ImageIcon b;
	ImageIcon c;
	ImageIcon d;
	ImageIcon h;
	ImageIcon f;
	ImageIcon g;
	ImageIcon i;
//	ImageIcon j;
	JPanel panel;

	GUI2(){
		
		
		a = new ImageIcon(getClass().getResource("nuba.png"));
		b = new ImageIcon(getClass().getResource("domingos.png"));
		c = new ImageIcon(getClass().getResource("rurik.png"));
		d = new ImageIcon(getClass().getResource("vanessa.png"));
		h = new ImageIcon(getClass().getResource("luka.png"));
		f = new ImageIcon(getClass().getResource("mamis.png"));
		g = new ImageIcon(getClass().getResource("ru.png"));
		i = new ImageIcon(getClass().getResource("quem.png"));
//		j = new ImageIcon(getClass().getResource("nuba.png"));

		
		panel = new JPanel();
		button = new JButton();
		//label = new JLabel("Likes: "+likes);
		
		button.setBounds(100,50,250,300);
		button.addActionListener(this);
		button.setText("Clique Aqui !");
		button.setFocusable(false);
		button.setIcon(i);
		button.setHorizontalTextPosition(button.CENTER);
		button.setVerticalTextPosition(button.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 40));
		button.setBackground(Color.GREEN);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.add(label);
		
		
		//label.setLabelFor(button);
		//label.setLocation(100,400);
		//label.setFont(new Font("Comic Sans",Font.CENTER_BASELINE,35));
		
		//panel.setBorder(BorderFactory.createEmptyBorder(0,0,100,100));
		//panel.setLayout(new GridLayout(0,1));
		//panel.setBackground(Color.BLACK);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle("Família linda: random pick");
		this.add(button);
		this.add(button2);
		
	}
public static void main(String[] args) {
	new GUI2();
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== button) {
			double number = Math.round(Math.random()*6);
			int valor = (int) number;
			if(valor ==1) {
			button.setIcon(a);}
			else if(valor ==2) {
			button.setIcon(b);
			}else if (valor==3) {
			button.setIcon(c);}
			else if(valor==4){
			button.setIcon(d);
			}else if(valor==5) {
			button.setIcon(h);
			}else if (valor ==6) {
			button.setIcon(f);	
			}else {
				button.setIcon(g);
			}
			
		}
		// TODO Auto-generated method stub
		
	}}

