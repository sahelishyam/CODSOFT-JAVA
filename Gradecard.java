import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Gradecard implements ActionListener
{ 
  double b,m,eng,p,c,total,avg;
  char grade; 
 JFrame frame = new JFrame("Gradecard");
 JLabel label1 = new JLabel();
 JLabel label2 = new JLabel();
 JLabel label3 = new JLabel();
 JLabel label4 = new JLabel();
 JLabel label5 = new JLabel();
 JLabel label6 = new JLabel();
 JLabel label7 = new JLabel();
 JLabel label8 = new JLabel();
 JLabel label9 = new JLabel();
 JLabel label10 = new JLabel();
 JLabel label11 = new JLabel();
 JLabel label12 = new JLabel();
 JLabel label13 = new JLabel();
 JTextField textfield1 = new JTextField();
 JTextField textfield2 = new JTextField();
 JTextField textfield3 = new JTextField();
 JTextField textfield4 = new JTextField();
 JTextField textfield5 = new JTextField();
 JTextField textfield6 = new JTextField();
 JTextField textfield7 = new JTextField();
 JTextField textfield8 = new JTextField();
 JTextField textfield9 = new JTextField();
 JTextField textfield10 = new JTextField();
 JButton buttonclear =new JButton("Clear");
 JButton buttoncal =new JButton("Calculate");
 
Gradecard()
{
   prepareGui();
   addcomponents(); 
   addActionEvent();
}

public void prepareGui()
{
 frame.setSize(500,800);
 frame.getContentPane().setLayout(null);
 frame.getContentPane().setBackground(Color.blue);
 frame.setLocationRelativeTo(null);
 frame.setVisible(true);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void addcomponents()
{
  label1.setBounds(120,10,300,50);
  label1.setForeground(Color.white);
  frame.add(label1);
  label1.setFont(new Font("Arial",Font.BOLD,25));
  label1.setText("Student Grade Calculator");
  label1.setEnabled(true);
  
  label2.setBounds(10,50,100,50);  //name
  label2.setForeground(Color.white);
  frame.add(label2);
  label2.setFont(new Font("Arial",Font.BOLD,20));
  label2.setText("Name : ");
  label2.setEnabled(true);

  textfield1.setBounds(120,60,180,30);
  textfield1.setFont(new Font("Arial",Font.BOLD,20));
  textfield1.setEditable(true);
  textfield1.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield1);
  textfield1.setEnabled(true);

  label3.setBounds(10,100,100,50);  //subject
  label3.setForeground(Color.white);
  frame.add(label3);
  label3.setFont(new Font("Arial",Font.BOLD,20));
  label3.setText("Subject  ");
  label3.setEnabled(true);

  label4.setBounds(190,100,100,50);  //score
  label4.setForeground(Color.white);
  frame.add(label4);
  label4.setFont(new Font("Arial",Font.BOLD,20));
  label4.setText("Score  ");
  label4.setEnabled(true);

  label5.setBounds(10,150,100,50);  //bengali
  label5.setForeground(Color.white);
  frame.add(label5);
  label5.setFont(new Font("Arial",Font.BOLD,20));
  label5.setText("Bengali :  ");
  label5.setEnabled(true);

  textfield2.setBounds(180,160,100,30);
  textfield2.setFont(new Font("Arial",Font.BOLD,20));
  textfield2.setEditable(true);
  textfield2.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield2);
  textfield2.setEnabled(true);
  
  label6.setBounds(10,220,100,50);  //english
  label6.setForeground(Color.white);
  frame.add(label6);
  label6.setFont(new Font("Arial",Font.BOLD,20));
  label6.setText("English : ");
  label6.setEnabled(true);

  textfield3.setBounds(180,230,100,30);
  textfield3.setFont(new Font("Arial",Font.BOLD,20));
  textfield3.setEditable(true);
  textfield3.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield3);
  textfield3.setEnabled(true);

  label7.setBounds(10,290,150,50);  //math
  label7.setForeground(Color.white);
  frame.add(label7);
  label7.setFont(new Font("Arial",Font.BOLD,20));
  label7.setText("Mathematics : ");
  label7.setEnabled(true);

  textfield4.setBounds(180,300,100,30);
  textfield4.setFont(new Font("Arial",Font.BOLD,20));
  textfield4.setEditable(true);
  textfield4.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield4);
  textfield4.setEnabled(true);

  label8.setBounds(10,360,100,50);  //physics 
  label8.setForeground(Color.white);
  frame.add(label8);
  label8.setFont(new Font("Arial",Font.BOLD,20));
  label8.setText("Physics :  ");
  label8.setEnabled(true);

  textfield5.setBounds(180,370,100,30);
  textfield5.setFont(new Font("Arial",Font.BOLD,20));
  textfield5.setEditable(true);
  textfield5.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield5);
  textfield5.setEnabled(true);

  label9.setBounds(10,420,130,50);  //chemistry
  label9.setForeground(Color.white);
  frame.add(label9);
  label9.setFont(new Font("Arial",Font.BOLD,20));
  label9.setText("Chemistry :  ");
  label9.setEnabled(true);

  textfield6.setBounds(180,430,100,30);
  textfield6.setFont(new Font("Arial",Font.BOLD,20));
  textfield6.setEditable(true);
  textfield6.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield6);
  textfield6.setEnabled(true);
 
  buttoncal.setBounds(100,500,150,40);
  buttoncal.setFont(new Font("Arial",Font.BOLD,20));
  frame.add(buttoncal);
  buttoncal.setEnabled(true);

  buttonclear.setBounds(300,500,150,40);
  buttonclear.setFont(new Font("Arial",Font.BOLD,20));
  frame.add(buttonclear);
  buttonclear.setEnabled(true);

  label10.setBounds(20,570,130,50);  //total
  label10.setForeground(Color.white);
  frame.add(label10);
  label10.setFont(new Font("Arial",Font.BOLD,20));
  label10.setText("TOTAL");
  label10.setEnabled(true);

  label11.setBounds(200,570,130,50);  //average
  label11.setForeground(Color.white);
  frame.add(label11);
  label11.setFont(new Font("Arial",Font.BOLD,20));
  label11.setText("AVERAGE");
  label11.setEnabled(true);

  label12.setBounds(360,570,130,50);  //grade
  label12.setForeground(Color.white);
  frame.add(label12);
  label12.setFont(new Font("Arial",Font.BOLD,20));
  label12.setText("GRADE");
  label12.setEnabled(true);

  textfield7.setBounds(20,620,100,30); //total
  textfield7.setFont(new Font("Arial",Font.BOLD,20));
  textfield7.setEditable(true);
  textfield7.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield7);
  textfield7.setEnabled(true);
 
  textfield8.setBounds(200,620,100,30);//average
  textfield8.setFont(new Font("Arial",Font.BOLD,20));
  textfield8.setEditable(true);
  textfield8.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield8);
  textfield8.setEnabled(true);

  textfield9.setBounds(360,620,100,30);//grade
  textfield9.setFont(new Font("Arial",Font.BOLD,20));
  textfield9.setEditable(true);
  textfield9.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield9);
  textfield9.setEnabled(true);
  
}
public void addActionEvent()
{
  buttoncal.addActionListener(this);
  buttonclear.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
  Object obj=e.getSource();
  if (obj==buttonclear)
    {
     textfield1.setText("");
     textfield2.setText("");
     textfield3.setText("");
     textfield4.setText("");
     textfield5.setText("");
     textfield6.setText("");
     textfield7.setText("");
     textfield8.setText("");
     textfield9.setText("");
    }
  else if(obj==buttoncal)
  {
    b=Double.parseDouble(textfield2.getText());
    eng=Double.parseDouble(textfield3.getText());
    m=Double.parseDouble(textfield4.getText());
    p=Double.parseDouble(textfield5.getText());
    c=Double.parseDouble(textfield6.getText());
    total=b+eng;
    total=total+m;
    total=total+p;
    total=total+c;
    avg=total/5;
    if(avg >=90)
    grade='O';
    else if (avg < 90 && avg >=80)
    grade='E';
    else if (avg < 80 && avg >=70)
    grade='A';
    else if (avg < 70 && avg >=60)
    grade='B';
    else if (avg < 60 && avg >=50)
    grade='C';
    else if (avg < 50 && avg >=40)
    grade='D';
    else
    grade='F';
   textfield7.setText(Double.toString(total));
   textfield8.setText(Double.toString(avg));
   textfield9.setText(Character.toString(grade));
    
  }
}
public static void main(String args[])
 {
  Gradecard grade=new Gradecard();
 }
}
