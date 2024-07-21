import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
public class Numberguess implements ActionListener
{
 int num1, num2 , score=0,count=5;
  boolean chance=true;
 JFrame frame = new JFrame("Number Game");
 JLabel label1 = new JLabel();
 JLabel label2 = new JLabel();
  JLabel label3 = new JLabel();
 JTextField textfield1 = new JTextField();
 JTextField textfield2 = new JTextField();
 JTextField textfield3 = new JTextField();
 JTextField textfield4 = new JTextField();
 JButton buttonplay =new JButton("Play");
 JButton buttonagain =new JButton("Play Again");
 JButton buttonclear =new JButton("Clear");
 Random ran=new Random();
 Numberguess()
 {
   prepareGui();
   addcomponents(); 
   addActionEvent();
 }
public void prepareGui()
{
 frame.setSize(305,450);
 frame.getContentPane().setLayout(null);
 frame.getContentPane().setBackground(Color.blue);
 frame.setLocationRelativeTo(null);
 frame.setVisible(true);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void addcomponents()
{

  textfield1.setBounds(10,10,270,30);
  textfield1.setFont(new Font("Arial",Font.BOLD,20));
  textfield1.setEditable(false);
  textfield1.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield1);
  textfield1.setEnabled(true);

  label1.setBounds(50,50,250,50);
  label1.setForeground(Color.white);
  frame.add(label1);
  label1.setFont(new Font("Arial",Font.BOLD,20));
  label1.setText("Guess The Number");
  label1.setEnabled(true);

  textfield2.setBounds(10,100,270,30);
  textfield2.setFont(new Font("Arial",Font.BOLD,20));
  textfield2.setEditable(true);
  textfield2.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield2);
  textfield2.setEnabled(true);
 

  textfield3.setBounds(30,210,250,30);
  textfield3.setFont(new Font("Arial",Font.BOLD,20));
  textfield3.setEditable(true);
  textfield3.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield3);
  textfield3.setEnabled(true);
   
  buttonplay.setBounds(180,150,100,40);
  buttonplay.setFont(new Font("Arial",Font.BOLD,12));
  frame.add(buttonplay);
  buttonplay.setEnabled(true);

  label3.setBounds(70,150,80,50);
  label3.setForeground(Color.white);
  frame.add(label3);
  label3.setFont(new Font("Arial",Font.BOLD,20));
  label3.setText(Integer.toString(count));
  label3.setEnabled(true);

  label2.setBounds(10,260,100,50);
  label2.setForeground(Color.white);
  frame.add(label2);
  label2.setFont(new Font("Arial",Font.BOLD,20));
  label2.setText("Score : ");
  label2.setEnabled(true);

  textfield4.setBounds(100,270,150,30);
  textfield4.setFont(new Font("Arial",Font.BOLD,20));
  textfield4.setEditable(false);
  textfield4.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(textfield4);
  textfield4.setEnabled(true);


  buttonagain.setBounds(180,340,100,40);
  buttonagain.setFont(new Font("Arial",Font.BOLD,12));
  frame.add(buttonagain);
  buttonagain.setEnabled(true); 

   buttonclear.setBounds(50,340,100,40);
   buttonclear.setFont(new Font("Arial",Font.BOLD,12));
   frame.add(buttonclear);
   buttonclear.setEnabled(true); 
}
public void addActionEvent()
{
  buttonplay.addActionListener(this);
  buttonagain.addActionListener(this);
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
    }

   else if(obj==buttonplay)
  {
  textfield1.setEditable(true);
  textfield4.setEditable(true);
   num1=ran.nextInt(100) + 1;
   num2=Integer.parseInt(textfield2.getText());
if(chance)
{
  if(count==0)
       textfield3.setText("Game over");
 if(count!=0)
{
   if(num1 ==num2)
  {
     textfield1.setText(Integer.toString(num1));
     textfield3.setText("You Win The Game");
     score=score+1;
     chance=false;
   
  }
  else if(num1<num2)
  {
    textfield3.setText("opp!!!! its too high");
  }
  else
  {
    textfield3.setText("opp!!!! its too low");
  }
  
  textfield4.setText(Integer.toString(score));
  count=count-1;
  label3.setText(Integer.toString(count)); 
 }
}
}
else if(obj==buttonagain)
{
     
     textfield1.setEditable(false);
     textfield4.setEditable(false);
     textfield1.setText("");
     textfield2.setText("");
     textfield3.setText(""); 
     count=5;
     label3.setText(Integer.toString(count)); 
}
}
public static void main(String args[])
 {
  Numberguess number=new Numberguess();
 }
}