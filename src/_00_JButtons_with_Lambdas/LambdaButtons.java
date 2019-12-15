package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 NUMBERS");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e->{
		String a = JOptionPane.showInputDialog("Give me a number.");
		String b = JOptionPane.showInputDialog("Give me another number.");
		int aI = Integer.parseInt(a);
		int bI = Integer.parseInt(b);
		int c = aI + bI;
		JOptionPane.showMessageDialog(null, a + " + " + b + " = " + c);
			
		});
		
		randNumber.addActionListener(e->{
	
		String a = JOptionPane.showInputDialog("What is the highest random number I can choose? 0 to ___.");
		int aI = Integer.parseInt(a);
		int b = new Random().nextInt(aI);
		JOptionPane.showMessageDialog(null, "Your random number is: " + b);
				
			
			
		});
		
		tellAJoke.addActionListener(e->{
			
		JOptionPane.showMessageDialog(null, "What do you get when you cross a joke with a rhetorical question?");
			
		});
		
		
		
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
