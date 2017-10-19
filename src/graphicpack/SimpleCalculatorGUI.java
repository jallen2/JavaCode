package graphicpack;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimpleCalculatorGUI extends JFrame {
 
	private JButton addButton, subtrButton, multiButton, divButton, equalButton, oneBut, twoBut, threeBut, fourBut, 
	fiveBut, sixBut, sevenBut, eightBut, nineBut, zeroBut, reset;
	private JTextField operation;
	private double firstNumber, secondNumber;
	private Double result = new Double(0); 
	private int currentAction = 0;
	private double zeroCount = 0;
	private int pressed = 0;
	
	public static void main(String[] args){
	
			new SimpleCalculatorGUI(); 
	}
	
	public SimpleCalculatorGUI() {
		
		//SIZE OF GUI
		final int WIDTH = 320; 
		final int HEIGHT = 185; 

		this.setSize(WIDTH, HEIGHT);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize(); 
		int xPos = (dim.width/2) - (this.getWidth() / 2);
		int yPos = (dim.height/2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		
		JPanel buttonPanel = new JPanel();

		reset = new JButton("AC");
		addButton = new JButton("+");
		subtrButton = new JButton("-");
		equalButton = new JButton("=");
		multiButton = new JButton("x");
		divButton = new JButton("/");
		oneBut = new JButton("1");
		twoBut = new JButton("2"); 
		threeBut = new JButton("3"); 
		fourBut = new JButton("4"); 
		fiveBut = new JButton("5"); 
		sixBut = new JButton("6"); 
		sevenBut = new JButton("7"); 
		eightBut = new JButton("8"); 
		nineBut = new JButton("9"); 
		zeroBut = new JButton("0");
		
		Box column1 = Box.createVerticalBox();
		Box column2 = Box.createVerticalBox();
		Box column3 = Box.createVerticalBox();
		Box column4 = Box.createVerticalBox();
		
		 
		column1.add(sevenBut);
		column1.add(fourBut);
		column1.add(oneBut);
		column1.add(zeroBut);
		
		
		column2.add(eightBut);
		column2.add(fiveBut);
		column2.add(twoBut);
		column2.add(equalButton);
		
	
		column3.add(nineBut);
		column3.add(sixBut);
		column3.add(threeBut);
		column3.add(reset);
			
	 
		column4.add(divButton);
		column4.add(multiButton);
		column4.add(subtrButton);
		column4.add(addButton);
		
		buttonPanel.add(column1);
		buttonPanel.add(column2);
		buttonPanel.add(column3); 
		buttonPanel.add(column4); 
		
		//Text Field Format
		operation = new JTextField();
		//Font size 
		Font font = operation.getFont();
		float size = font.getSize() + 7.0f;
		operation.setFont( font.deriveFont(size) );
		//Defaults to 0
		operation.setText("0");
		//Font alignment
		operation.setHorizontalAlignment(JTextField.RIGHT);
		//Makes the field unable to accept typing
		operation.setEditable(false);
	 
		
		this.add(operation, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.SOUTH);
		
		events(); 
		
		this.setVisible(true);
	}
	public void events() {
	
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 
				currentAction = 1; 
				pressed = 0; 
			}
		});
		subtrButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				currentAction = 2;
				pressed = 0; 
			}
		});
		equalButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentAction != 0) {
					double temp =  Double.parseDouble(computation1()); 
					if(temp % 1 > 0) {
						operation.setText(Double.toString(temp));
					}else {
						int temp2 = (int) temp; 
						operation.setText(Integer.toString(temp2));
					}
					pressed = 0; 
				}
				
			}
		});
		multiButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				currentAction = 4;
				pressed = 0; 
			}
		});
		divButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				currentAction = 5;
				pressed = 0; 
			}
		});
		oneBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pressed++; 
				if(currentAction == 0) {
					if(pressed > 1) {
						numberCheck(true,1);
						int newNum = (int)firstNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("1");
						firstNumber = 1; 
					}
				}else {
					if(pressed > 1) {
						numberCheck(false,1);
						int newNum = (int)secondNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("1");
						secondNumber = 1;
					}
				}
			}
		});
		twoBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pressed++; 
				if(currentAction == 0) {
					if(pressed > 1) {
						numberCheck(true,2);
						int newNum = (int)firstNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("2");
						firstNumber = 2;
					}
				}else {
					if(pressed > 1) {
						numberCheck(false,2);
						int newNum = (int)secondNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("2");
						secondNumber = 2;
					}
				}
			}
		});
		threeBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pressed++; 
				if(currentAction == 0) {
					if(pressed > 1) {
						numberCheck(true,3);
						int newNum = (int)firstNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("3");
						firstNumber = 3;
					}
				}else {
					if(pressed > 1) {
						numberCheck(false,3);
						int newNum = (int)secondNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("3");
						secondNumber = 3;
					}
				}
			}
		});
		fourBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pressed++; 
				if(currentAction == 0) {
					if(pressed > 1) {
						numberCheck(true,4);
						int newNum = (int)firstNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("4");
						firstNumber = 4;
					}
				}else {
					if(pressed > 1) {
						numberCheck(false,4);
						int newNum = (int)secondNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("4");
						secondNumber = 4;
					}
				}
			}
		});
		fiveBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pressed++; 
				if(currentAction == 0) {
					if(pressed > 1) {
						numberCheck(true,5);
						int newNum = (int)firstNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("5");
						firstNumber = 5;
					}
				}else {
					if(pressed > 1) {
						numberCheck(false,5);
						int newNum = (int)secondNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("5");
						secondNumber = 5;
					}
				}
			}
		});
		sixBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pressed++; 
				if(currentAction == 0) {
					if(pressed > 1) {
						numberCheck(true,6);
						int newNum = (int)firstNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("6");
						firstNumber = 6;
					}
				}else {
					if(pressed > 1) {
						numberCheck(false,6);
						int newNum = (int)secondNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("6");
						secondNumber = 6;
					}
				}
			}
		});
		sevenBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pressed++; 
				if(currentAction == 0) {
					if(pressed > 1) {
						numberCheck(true,7);
						int newNum = (int)firstNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("7");
						firstNumber = 7;
					}
				}else {
					if(pressed > 1) {
						numberCheck(false,7);
						int newNum = (int)secondNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("7");
						secondNumber = 7;
					}
				}
			}
			});
		
		eightBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pressed++; 
				if(currentAction == 0) {
					if(pressed > 1) {
						numberCheck(true,8);
						int newNum = (int)firstNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("8");
						firstNumber = 8;
					}
				}else {
					if(pressed > 1) {
						numberCheck(false,8);
						int newNum = (int)secondNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("8");
						secondNumber = 8;
					}
				}
			}
		});
	
		nineBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pressed++; 
				if(currentAction == 0) {
					if(pressed > 1) {
						numberCheck(true,9);
						int newNum = (int)firstNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("4");
						firstNumber = 9;
					}
				}else {
					if(pressed > 1) {
						numberCheck(false,9);
						int newNum = (int)secondNumber; 
						operation.setText(Integer.toString(newNum));
					}else {
						operation.setText("4");
						secondNumber = 9;
					}
				}
			}
		});
		zeroBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { 
				int test = 0;
				zeroCount++;
				if(currentAction == 0) {
					if(firstNumber > 0) {
						firstNumber *=  Math.pow(10.0,zeroCount);
						zeroCount--; 
					}else {
						firstNumber = 0;
						zeroCount--;
					}
					
				}else {
					if(secondNumber > 0) {
						secondNumber *= Math.pow(10.0,zeroCount);
						zeroCount--;
					}else {
						secondNumber = 0;
						zeroCount--;
					} 
				}
				
				if(operation.getText().contains(".")) {
					test++; 
					if(test == 1) {
						operation.setText(operation.getText() + "0");
					}else {
						operation.setText("0");
					}
				}else {
					operation.setText(operation.getText() + "0"); 
				}
			}
		});
		
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operation.setText("0");
				firstNumber = 0; 
				secondNumber = 0;
				currentAction = 0;//operator
				zeroCount = 0; //100
				result = (double) 0; //answer
				pressed = 0; 
			}
		});
	}
	
		public void numberCheck(boolean pos, double temp) { 
			if(pos) {
				if(firstNumber > 0) {
					firstNumber *=  Math.pow(10, 1);
					temp += firstNumber;
					firstNumber = temp; 
				}
			}else {
				if(secondNumber > 0) {
					secondNumber *=  Math.pow(10, 1);
					temp += secondNumber;
					secondNumber = temp;
				}
			}
		}
		public String computation1() {
			//currentAction => 1 = add, 2 = subtract, 3 = equals, 4 = multiply 5 = divide
			
			if(result.equals(0.0)) {
				switch(currentAction){
					case 1:
						result = firstNumber + secondNumber;
						break;
					case 2:
						result = firstNumber - secondNumber;
						break;
					case 4:
						result = firstNumber * secondNumber;
						break;
					case 5:
						result = firstNumber / secondNumber; 
						break;
				};
			}else {
				switch(currentAction){
				case 1:
					result += secondNumber;
					break;
				case 2:
					result -= secondNumber;
					break;
				case 4:
					result *= secondNumber;
					break;
				case 5:
					result /=secondNumber; 
					break;
				};
			}
			return result.toString(); 
		}
}



