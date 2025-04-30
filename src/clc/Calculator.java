package clc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input;
	private double answer,number;
	public int operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addInput(String str) {
		//tuşlara tıkladığımızda ilgili değeri ekrana yazdıracak bir metot yazdık bunu aşağıda tuşlarda çağıracağız tek tek yazmak yerine
		input.setText(input.getText() + str);
	}
	
	public void calculate() {
		 switch(operation) {
		    case 1: // Toplama
		        answer = number + Double.parseDouble(input.getText());
		        input.setText(Double.toString(answer));
		        break;
		    case 2: // Çıkarma
		        answer = number - Double.parseDouble(input.getText());
		        input.setText(Double.toString(answer));
		        break;
		    case 3: // Çarpma
		        answer = number * Double.parseDouble(input.getText());
		        input.setText(Double.toString(answer));
		        break;
		    case 4: // Bölme
		    	answer = number / Double.parseDouble(input.getText());
		        input.setText(Double.toString(answer));
		        break;
		 }
	}
	


	//burası constructor her şey bunun içinde oluşturuluyor zaten 
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 10, 264, 60);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = 	new JTextField();
		input.setBackground(new Color(255, 255, 0));
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 16));
		input.setBounds(0, 21, 264, 39);
		screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl.setBounds(0, 10, 264, 11);
		screen.add(lbl);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 8, 264, 13);
		screen.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 78, 264, 304);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 160));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setBackground(new Color(0, 0, 160));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setBackground(new Color(0, 0, 160));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("+");	
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Double.parseDouble(input.getText());
				operation=1;//toplama işlemi yapacak
				input.setText("");//toplama işlemi yapmadan önceki değeri alıp işlem yapacak 
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_4.setBackground(new Color(0, 0, 160));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 160));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setBackground(new Color(0, 0, 160));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5.setBackground(new Color(0, 0, 160));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Double.parseDouble(input.getText());
				operation=2;//çıkarma işlemi yapacak switch casede 2 yazdık
				input.setText(""); 
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_7.setBackground(new Color(0, 0, 160));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setBackground(new Color(0, 0, 160));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_9.setBackground(new Color(0, 0, 160));
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_10.setBackground(new Color(0, 0, 160));
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_9_1 = new JButton("*");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Double.parseDouble(input.getText());
				operation=3;//çarpma işlemi yapcak switch casede 3 yazdık
				input.setText(""); 
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_9_1.setBackground(new Color(0, 0, 160));
		btnNewButton_9_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_9_1);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.setBackground(new Color(0, 0, 160));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
		}
				
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_9_2 = new JButton("=");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_9_2.setBackground(new Color(0, 0, 160));
		btnNewButton_9_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_9_2);
		
		JButton btnNewButton_9_3 = new JButton("C");
		btnNewButton_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");//c ye basınca otomatik olarak yazılı olanlar sıfırlanacak metin kutusunu set et dedik değiştir yani boş stringle
			}
		});
		btnNewButton_9_3.setBackground(new Color(0, 0, 160));
		btnNewButton_9_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_9_3);
		
		JButton btnNewButton_9_4 = new JButton("/");
		btnNewButton_9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Double.parseDouble(input.getText());
				operation=4;//bölme işlemi yapacak 
				input.setText(""); 
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_9_4.setBackground(new Color(0, 0, 160));
		btnNewButton_9_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_9_4);
	}
}
