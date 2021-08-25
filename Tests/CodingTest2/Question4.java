package techment.CodingTest2;

import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/** Program to simulate the traffic light
 * 
 * @author POONAM
 *
 */

public class Question4 {

	public static void main(String[] args) {
		
//		JRadioButton jRadioButton1 = new JRadioButton();
//		JRadioButton jRadioButton2 =new JRadioButton();
//		JRadioButton jRadioButton3 =new JRadioButton();
//
//
//		jRadioButton1.setText("Red");
//		jRadioButton2.setText("Yellow");
//		jRadioButton3.setText("Green");
//
//		ButtonGroup buttonGroup = new ButtonGroup();
//		buttonGroup.add(jRadioButton1);
//		buttonGroup.add(jRadioButton2);
//		buttonGroup.add(jRadioButton3);
//		
//	
//		JButton jButton = new JButton();
//		jButton.setBounds(125, 90, 80,30);
//		
//		String button = " ";
//		
//		if(jRadioButton1.isSelected())
//		{
//			button = jRadioButton1.getText();
//			//button = "Red";
//			//JOptionPane.showMessageDialog(jRadioButton1, "STOP !");
//		}
//		else if (jRadioButton2.isSelected()) 
//		{
//			button = jRadioButton2.getText();
//			//button = "Yellow";
//			//JOptionPane.showMessageDialog(jRadioButton2, "Ready !");
//		}
//		else if (jRadioButton2.isSelected()) 
//		{
//			button = jRadioButton3.getText();
//			//button = "Green";
//			//JOptionPane.showMessageDialog(jRadioButton3, "GO !");
//		}
//		else
//		{
//			
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select one of three lights : ");
		System.out.println("\n1.) 'Red' \n2.) 'Yellow' \n3.) 'Green'\n");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1: System.out.println("\nMessage : STOP !");
				break;
		case 2: System.out.println("\nMessage : READY !");
				break;
		
		case 3: System.out.println("\nMessage : GO !");
				break;
		
		default:System.out.println("Invalid Input");
				break;
		}				
	}

}
