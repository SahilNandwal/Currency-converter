import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ItemListener,
ActionListener,KeyListener
{
	JComboBox cb,cb1;
	JTextField tx1,tx2;
	JButton b1,b2;
	String s1="";
	String s4="";
	FDemo()
	{
		Font f=new Font("",Font.BOLD,40);
		setLayout(null);
		
		String s[]={"DOLLAR","EURO","DIRHAM","RIAL","INR"};
		cb=new JComboBox(s);
		cb.setSize(200,75);
		cb.setLocation(100,200);
		cb.setFont(f);
		add(cb);
		cb.addItemListener(this);
		
		
		cb1=new JComboBox(s);
		cb1.setSize(200,75);
		cb1.setLocation(100,300);
		cb1.setFont(f);
		add(cb1);
		cb1.addItemListener(this);
		
		tx1=new JTextField("Enter Amount",15);
		tx1.setSize(300,75);
		tx1.setLocation(320,200);
		tx1.setFont(f);
		tx1.setForeground(Color.gray);
		add(tx1);
		tx1.addKeyListener(this);
		
		tx2=new JTextField(10);
		tx2.setSize(300,75);
		tx2.setLocation(320,300);
		tx2.setFont(f);
		add(tx2);
		
		b1=new JButton("CONVERT");
		b1.setSize(250,75);
		b1.setLocation(125,400);
		b1.setFont(f);
		add(b1);
		b1.addActionListener(this);
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
		
		b2=new JButton("Clear");
		b2.setSize(200,75);
		b2.setLocation(400,400);
		b2.setFont(f);
		add(b2);
		b2.addActionListener(this);
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
	}
	public void itemStateChanged(ItemEvent e)
	{
		 s1=(String)cb.getSelectedItem();
		 s4=(String)cb1.getSelectedItem();
	}
	public void actionPerformed(ActionEvent e)
	{
		String s2=tx1.getText();
		double x=Double.parseDouble(s2);
		double y=0;
		if(s1.equals("DOLLAR") && s4.equals("INR"))
		{
			 y=x*85.39;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("EURO") && s4.equals("INR"))
		{
			 y=x*97.11;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("DIRHAM") && s4.equals("INR"))
		{
			 y=x*23.25;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("RIAL") && s4.equals("INR"))
		{
			 y=x*221.77;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("INR") && s4.equals("INR"))
		{
			 y=x*1;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("INR") && s4.equals("DOLLAR"))
		{
			 y=x*0.012;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("EURO") && s4.equals("DOLLAR"))
		{
			 y=x*1.14;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("DIRHAM") && s4.equals("DOLLAR"))
		{
			 y=x*0.27;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("RIAL") && s4.equals("DOLLAR"))
		{
			 y=x*2.60;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("DOLLAR") && s4.equals("DOLLAR"))
		{
			 y=x*1;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("DOLLAR") && s4.equals("EURO"))
		{
			 y=x*0.88;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("INR") && s4.equals("EURO"))
		{
			 y=x*0.010;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("DIRHAM") && s4.equals("EURO"))
		{
			 y=x*0.24;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("RIAL") && s4.equals("EURO"))
		{
			 y=x*2.28;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("EURO") && s4.equals("EURO"))
		{
			 y=x*1;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("DOLLAR") && s4.equals("DIRHAM"))
		{
			 y=x*3.67;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("EURO") && s4.equals("DIRHAM"))
		{
			 y=x*4.18;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("INR") && s4.equals("DIRHAM"))
		{
			 y=x*0.043;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("RIAL") && s4.equals("DIRHAM"))
		{
			 y=x*9.54;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("DIRHAM") && s4.equals("DIRHAM"))
		{
			 y=x*1;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("DOLLAR") && s4.equals("RIAL"))
		{
			 y=x*0.38;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("EURO") && s4.equals("RIAL"))
		{
			 y=x*0.44;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("DIRHAM") && s4.equals("RIAL"))
		{
			 y=x*0.10;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("INR") && s4.equals("RIAL"))
		{
			 y=x*0.0045;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(s1.equals("RIAL") && s4.equals("RIAL"))
		{
			 y=x*1;
			String s3=""+y;
			tx2.setText(s3);
		}
		if(e.getSource()==b2)
		{
			tx1.setText("Enter Amount");
			tx1.setForeground(Color.gray);
			tx2.setText("");
		}
	}
	public void keyPressed(KeyEvent e)
	{
		String s=tx1.getText();
		if(s.equals("Enter Amount"))
		{
		tx1.setText("");
		tx1.setForeground(Color.black);
		}
	}
public void keyReleased(KeyEvent e)
{
	String s=tx1.getText();
	if(s.equals(""))
	{
	tx1.setText("Enter Amount");
	tx1.setForeground(Color.gray);
	}
}
public void keyTyped(KeyEvent e){}
}
class model1
{
	public static void main(String []ar)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(800,800);
		f.setLocation(200,100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}