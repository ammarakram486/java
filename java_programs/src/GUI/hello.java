package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class hello extends JFrame {

	private JPanel contentPane;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
	private JTextPane txt1,txt2,txt3;
	private JButton btn16,btn17,btn18,btn19,btn20,btn21,btn22;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hello frame = new hello();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hello() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 448);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextPane();
		txt1.setBounds(112, 11, 403, 44);
		txt1.setBackground(Color.GRAY);
		txt1.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt1.setText("NUMBER SYSTEM CONVERSION");
		contentPane.add(txt1);
		
		btn1 = new JButton("START");
		btn1.setBounds(237, 356, 89, 23);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn3.setVisible(true);
				btn2.setVisible(true);
				btn4.setVisible(true);
				btn5.setVisible(true);
				btn6.setVisible(true);
				btn7.setVisible(true);
				btn1.setVisible(false);
				txt1.setVisible(false);
				txt2.setVisible(false);
				btn8.setVisible(true);
				txt3.setVisible(true);
				btn9.setVisible(true);
				btn10.setVisible(true);
				btn11.setVisible(true);
				btn12.setVisible(true);
				btn13.setVisible(true);
				btn14.setVisible(true);
				btn15.setVisible(true);
				btn16.setVisible(true);
				btn17.setVisible(true);
				btn18.setVisible(true);
				btn19.setVisible(true);
				btn20.setVisible(true);
				btn21.setVisible(true);
				btn22.setVisible(true);
				
				
				
			}
		});
		contentPane.add(btn1);
		
		txt2 = new JTextPane();
		txt2.setBounds(175, 304, 218, 23);
		txt2.setText("CLICK START TO CONTINUE\r\n\r\n");
		contentPane.add(txt2);
		
		btn2 = new JButton("BASE 2 TO BASE 5");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck2(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck2(s);
			}
				
			x=Base2ToBase10(s);
			a=Base10ToBase5(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			
			}
		});
		btn2.setVisible(false);
		btn2.setBounds(20, 44, 207, 30);
		contentPane.add(btn2);
		
		btn3 = new JButton("BASE 2 TO BASE 8");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck2(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck2(s);
			}
				
			x=Base2ToBase10(s);
			a=Base10ToBase8(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			
			}
		});
		btn3.setVisible(false);
		btn3.setBounds(20, 76, 207, 30);
		contentPane.add(btn3);
		
		btn4 = new JButton("BASE 8 TO BASE 16");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck8(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck8(s);
			}
				
			x=Base8ToBase10(s);
			a=Base10ToBase16(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn4.setVisible(false);
		btn4.setBounds(343, 76, 205, 30);
		contentPane.add(btn4);
		
		btn5 = new JButton("BASE 2 TO BASE10");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int t=0;
				String a,s;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck2(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck2(s);
			}
				
			a=Base2ToBase10(s);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			
			}
		});
		btn5.setVisible(false);
		btn5.setBounds(20, 108, 207, 30);
		contentPane.add(btn5);
		
		btn6 = new JButton("BASE 10 TO BASE 2");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int t=0;
				String a,s;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck10(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck10(s);
			}
				
			a=Base10ToBase2(s);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			
				}
		});
		btn6.setVisible(false);
		btn6.setBounds(343, 108, 205, 30);
		contentPane.add(btn6);
		
	    btn7 = new JButton("BASE 8 TO BASE 10");
	    btn7.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int t=0;
				String a,s;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck8(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck8(s);
			}
				
			a=Base8ToBase10(s);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			
	    	}
	    });
	    btn7.setBounds(343, 44, 207, 30);
		btn7.setVisible(false);
		contentPane.add(btn7);
		
		txt3 = new JTextPane();
		txt3.setBounds(75, 11, 349, 30);
		txt3.setVisible(false);
		txt3.setText("CLICK THE CONVERSION YOU WANT TO PERFORM");
		contentPane.add(txt3);
		
		btn8 = new JButton("EXIT");
		btn8.setBounds(237, 332, 89, 23);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn8.setVisible(false);
		contentPane.add(btn8);
		
		btn10 = new JButton("BASE 5 TO BASE 2");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck5(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck5(s);
			}
				
			x=Base5ToBase10(s);
			a=Base10ToBase2(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn10.setVisible(false);
		btn10.setBounds(20, 173, 207, 30);
		contentPane.add(btn10);
		
		btn11 = new JButton("BASE 5 TO BASE 8");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck5(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck5(s);
			}
				
			x=Base5ToBase10(s);
			a=Base10ToBase8(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn11.setVisible(false);
		btn11.setBounds(20, 206, 207, 30);
		contentPane.add(btn11);
		
		btn9 = new JButton("BASE 2 TO BASE 16");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck2(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck2(s);
			}
				
			x=Base2ToBase10(s);
			a=Base10ToBase16(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			
				
			}
		});
		btn9.setVisible(false);
		btn9.setBounds(20, 140, 207, 30);
		contentPane.add(btn9);
		
		btn12 = new JButton("BASE 5 TO BASE 16");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck5(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck5(s);
			}
				
			x=Base5ToBase10(s);
			a=Base10ToBase16(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn12.setVisible(false);
		btn12.setBounds(20, 270, 207, 30);
		contentPane.add(btn12);
		
		btn13 = new JButton("BASE 5 TO BASE 10");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck5(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck5(s);
			}
				
			a=Base5ToBase10(s);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			
			}
		});
		btn13.setVisible(false);
		btn13.setBounds(20, 238, 207, 30);
		contentPane.add(btn13);
		
		btn14 = new JButton("BASE 8 TO BASE 2");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck8(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck8(s);
			}
				
			x=Base8ToBase10(s);
			a=Base10ToBase2(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn14.setVisible(false);
		btn14.setBounds(20, 301, 207, 30);
		contentPane.add(btn14);
		
		btn15 = new JButton("BASE 8 TO BASE 5");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck8(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck8(s);
			}
				
			x=Base8ToBase10(s);
			a=Base10ToBase5(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn15.setVisible(false);
		btn15.setBounds(20, 333, 207, 30);
		contentPane.add(btn15);
		
		btn16 = new JButton("BASE 10 TO BASE 5");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck10(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck10(s);
			}
				
			a=Base10ToBase5(s);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
			
		});
		btn16.setVisible(false);
		btn16.setBounds(343, 140, 205, 30);
		contentPane.add(btn16);
		
		btn17 = new JButton("BASE 10 TO BASE 8");
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck10(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck10(s);
			}
				
			a=Base10ToBase8(s);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			
			}
		});
		btn17.setVisible(false);
		btn17.setBounds(343, 173, 205, 30);
		contentPane.add(btn17);
		
		btn18 = new JButton("BASE 10 TO BASE 16");
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int t=0;
				String a,s;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck10(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck10(s);
			}
				
			a=Base10ToBase16(s);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn18.setVisible(false);
		btn18.setBounds(343, 206, 205, 30);
		contentPane.add(btn18);
		
		btn19 = new JButton("BASE 16 TO BASE 8");
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck16(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck16(s);
			}
				
				x=Base16ToBase10(s);
				a=Base10ToBase8(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn19.setVisible(false);
		btn19.setBounds(343, 301, 205, 30);
		contentPane.add(btn19);
		
		btn20 = new JButton("BASE 16 TO BASE 2");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck16(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck16(s);
			}
				
			x=Base16ToBase10(s);
			a=Base10ToBase2(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn20.setVisible(false);
		btn20.setBounds(343, 238, 205, 30);
		contentPane.add(btn20);
		
		btn21 = new JButton("BASE 16 TO BASE 5");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s,x;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck16(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck16(s);
			}
				
			x=Base16ToBase10(s);
			a=Base10ToBase5(x);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			}
		});
		btn21.setVisible(false);
		btn21.setBounds(343, 270, 205, 30);
		contentPane.add(btn21);
		
		btn22 = new JButton("BASE 16 TO BASE 10");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=0;
				String a,s;
				s=JOptionPane.showInputDialog("ENTER INPUT");
				t=inputcheck16(s);
				while(t!=0){
					s=JOptionPane.showInputDialog("ENTER WRONG INPUT ENTER AGAIN");
					t=inputcheck16(s);
			}
				
			a=Base16ToBase10(s);
			JOptionPane.showMessageDialog(null,a , "OUTPUT", JOptionPane.PLAIN_MESSAGE);
					
			
			}
		});
		btn22.setVisible(false);
		btn22.setBounds(343, 333, 205, 30);
		contentPane.add(btn22);
	}
	public int inputcheck2(String s){
		  int a=0;
		  int b=s.length();
		  for(int i=0;i<b;i++){
				if(s.charAt(i)=='0'||s.charAt(i)=='1'){  
							  }
				else {
					a++;
				}
			}
		  return a;
	  }
	public int inputcheck5(String s){
		  int a=0;
		  int b=s.length();
		  for(int i=0;i<b;i++){
			  if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'){  
							  }
				else {
					a++;
				}
			}
		  return a;
	  }
	public int inputcheck8(String s){
		  int a=0;
		  int b=s.length();
		  for(int i=0;i<b;i++){
				if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'){  
							  }
				else if(s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'){
					
				}
				else {
					a++;
				}
			}
		  return a;
	  }
	public int inputcheck10(String s){
		  int a=0;
		  int b=s.length();
		  for(int i=0;i<b;i++){
				if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'){  
							  }
				else if(s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'){
					
				}
				else {
					a++;
				}
			}
		  return a;
	  }
	  public int inputcheck16(String s){
		  int a=0;
		  int b=s.length();
		  for(int i=0;i<b;i++){
				if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'){  
							  }
				else if(s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'){
				}
				else if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C'||s.charAt(i)=='D'||s.charAt(i)=='E'){
					
				}
				else if(s.charAt(i)=='F'){
					
				}
				else {
					a++;
				}
			}
		  return a;
	  }
	

		public String Base10ToBase2(String a){
			String s="";
			int b =Integer.parseInt(a);
			int num;
			while(b>0){
				num=b%2;
				b=b/2;
				s=num+s;
			}
			return s;
		}
		public String Base10ToBase5(String a){
			String s="";
			int b =Integer.parseInt(a);
			int num;
			while(b>0){
				num=b%5;
				b=b/5;
				s=num+s;
			}
			return s;
		}
		public String Base10ToBase8(String a){
			String s="";
			int b =Integer.parseInt(a);
			int num;
			while(b>0){
				num=b%8;
				b=b/8;
				s=num+s;
			}
			return s;
		}
		public String Base10ToBase16(String a){
			String s="";
			int b =Integer.parseInt(a);
			int num;
			while(b>0){
				num=b%16;
				b=b/16;
				switch(num){
				case 15:{
					s="F"+s;
					break;
				}
				case 14:{
					s="E"+s;
					break;
				}
				case 13:{
					s="D"+s;
					break;
				}
				case 12:{
					s="C"+s;
					break;
				}
				case 11:{
					s="B"+s;
					break;
				}
				case 10:{
					s="A"+s;
					break;
				}
				default:{
					s=num+s;
					break;
				}
				}
				
			}
			return s;
		}
		public String Base2ToBase10(String a){
			String s="";
			int j=0;
		    for(int i=0;i<a.length();i++){
		        if(a.charAt(i)== '1'){
		         j=(int)(j+ Math.pow(2,a.length()-1-i));
		     }
		    }
		       s= Integer.toString(j);
			
			return s;
		}
		public String Base5ToBase10(String a){
			String s="";
			int j=0;
		    for(int i=0;i<a.length();i++){
		        if(a.charAt(i)== '1'){
		         j=(int)(j+ Math.pow(5,a.length()-1-i));
		     }
		        if(a.charAt(i)== '2'){
			         j=(int)(j+(2*Math.pow(5,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '3'){
			         j=(int)(j+(3*Math.pow(5,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '4'){
			         j=(int)(j+(4*Math.pow(5,a.length()-1-i)));
			     }
		    }
		       s= Integer.toString(j);
			
			return s;
		}
		public String Base8ToBase10(String a){
			String s="";
			int j=0;
		    for(int i=0;i<a.length();i++){
		        if(a.charAt(i)== '1'){
		         j=(int)(j+ Math.pow(8,a.length()-1-i));
		     }
		        if(a.charAt(i)== '2'){
			         j=(int)(j+(2* Math.pow(8,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '3'){
			         j=(int)(j+ (3*Math.pow(8,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '4'){
			         j=(int)(j+ (4*Math.pow(8,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '5'){
			         j=(int)(j+ (5*Math.pow(8,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '6'){
			         j=(int)(j+ (6*Math.pow(8,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '7'){
			         j=(int)(j+(7* Math.pow(8,a.length()-1-i)));
			     }
		        
		    }
		       s= Integer.toString(j);
			
			return s;
		}
		public String Base16ToBase10(String a){
			String s="";
			int j=0;
		    for(int i=0;i<a.length();i++){
		        if(a.charAt(i)== '1'){
		         j=(int)(j+ Math.pow(16,a.length()-1-i));
		     }
		        if(a.charAt(i)== '2'){
			         j=(int)(j+(2* Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '3'){
			         j=(int)(j+ (3*Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '4'){
			         j=(int)(j+ (4*Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '5'){
			         j=(int)(j+ (5*Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '6'){
			         j=(int)(j+ (6*Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '7'){
			         j=(int)(j+(7* Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '8'){
			         j=(int)(j+(8* Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== '9'){
			         j=(int)(j+(9* Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== 'A'){
			         j=(int)(j+(10* Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== 'B'){
			         j=(int)(j+(11* Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== 'c'){
			         j=(int)(j+(12* Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== 'D'){
			         j=(int)(j+(13* Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== 'E'){
			         j=(int)(j+(14* Math.pow(16,a.length()-1-i)));
			     }
		        if(a.charAt(i)== 'F'){
			         j=(int)(j+(15* Math.pow(16,a.length()-1-i)));
			     }
		        
		    }
		       s= Integer.toString(j);
			
			return s;
		}
		
}
