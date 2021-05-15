/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Yogu D_Gz
 */
public class Grid implements ActionListener ,TextListener
{
    
     String com,nm, no, ead, ra,t="";
    TextField name,num,email,addr;
    TextArea ans;
    static JFrame f= new JFrame("Interview") ;
    Font font1,font2;
    JButton start,cont; 
    Color grn = new Color(163, 223, 36);
    Color br = new Color(254, 235, 175);
    static int ctr=0;
    static PrintWriter o;
    static File fil=new File("output.txt");
       
       Grid()
       {
           
        font1 = new Font("Chiller", Font.BOLD, 20);
        font2 = new Font("Chiller", Font.BOLD, 16);
        f.setVisible(true);
        f.setSize(1200,1000);
        
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            
            o = new PrintWriter(new FileWriter(fil));
        }
            catch(Exception ex)
            {
                System.out.println("Error during reading/writing");
            }
        
       }
       
       
    
     
    public void prog() {
        
        f.setVisible(true);
        f.setSize(1200,1000);
        
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        f.setContentPane(new JLabel(new ImageIcon("D:\\2014 summer\\Interview\\src\\interview\\bluebkgrnd.jpg")));
        name = new TextField();
        name.addTextListener(this);
        name.setFont(font1);
        num = new TextField();
        num.addTextListener(this);
        num.setFont(font1);
        email = new TextField();
        email.addTextListener(this);
        email.setFont(font1);
        addr = new TextField();
        addr.addTextListener(this);
        addr.setFont(font2);
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JButton("Enter Name"));
        f.add(name);
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JButton("Enter Contact Number"));
        f.add(num);
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JButton("Enter Email Address"));
        f.add(email);
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JButton("Enter Residential Adderss"));
        f.add(addr);f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        f.add(new JLabel("                                                                                                                                                                                                                                                                                          "));
        start = new JButton("Start Interview");
        start.setBackground(grn);
        f.add(start);
        start.setActionCommand("start");
        start.addActionListener(new Grid());
        
        System.out.println(nm+no+ead+ra +"prog");
        
        f.setLayout(new GridLayout(30, 1));
        
        
    }
    
        public void body(String a,String com)
        {
        
         
        f.setContentPane(new JLabel(new ImageIcon("D:\\2014 summer\\Interview\\src\\interview\\"+a+".jpg")));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        
        if (!("end".equals(com)))
        {
        if("start".equals(com))
        {
            ans= new TextArea("Enter your Answer here \n It is purposefully made such that only the recently typed part is visible...but entire answer will b automatically save");
            ans.setEditable(false);
            ans.setBackground(br);
            ans.setFont(font2);
            f.add(ans);
        }
        else 
        {
            
            ans= new TextArea(50,3);
            ans.setBackground(br);
            ans.setFont(font2);
            f.add(ans);
            ans.addTextListener(this);
            
        }
        
        f.add(new JLabel("                           "));
        cont=new JButton("Next");
        cont.setBackground(grn);
        cont.setActionCommand(a);
        cont.addActionListener(new Grid());
        f.add(cont);
        }
        
        
        f.setLayout(new GridLayout(10, 1));
        
        }
    
public void body(String a)
        {
        
         
        f.setContentPane(new JLabel(new ImageIcon("D:\\2014 summer\\Interview\\src\\interview\\"+a+".jpg")));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        f.add(new JLabel("                           "));
        
        if (!("end".equals(com)))
        {
        if("start".equals(com))
        {
            ans= new TextArea("Enter your Answer here");
            ans.setEditable(false);
            ans.setBackground(br);
            ans.setFont(font2);
        }
        else 
        {
            
            ans= new TextArea(50,3);
            JScrollPane s=new JScrollPane(ans);
            ans.setBackground(br);
            ans.setFont(font2);
            ans.addTextListener(this);
            
        }
        
        f.add(new JLabel("                           "));
        cont=new JButton("Next");
        cont.setBackground(grn);
        cont.setActionCommand(a);
        cont.addActionListener(new Grid());
        }
        
        
        f.setLayout(new GridLayout(10, 1));
        
        
        }

        
        
        
        
        
        

public void actionPerformed(ActionEvent e)
{
     
        com=e.getActionCommand();
    if("start".equals(com))
         body("inst",com);
    
    if("inst".equals(com))
          body("q0",com);
    
    if("q0".equals(com))
          body("q1",com);
    
    if("q1".equals(com))
          body("q2",com);
    
    if("q2".equals(com))
         body("q3",com);
  
    if("q3".equals(com))
          body("q4",com);
    
    if("q4".equals(com))
         body("q5",com);
    
    if("q5".equals(com))
         body("q6",com);
    
    if("q6".equals(com))
          body("q7",com);
    
    if("q7".equals(com))
         body("q8",com);
    
    if("q8".equals(com))
         body("q9",com);
    if("q9".equals(com))
         body("end");
   
    
}
    public void textValueChanged(TextEvent te)
    {
        String aw="";String a="";
        TextComponent tf = (TextComponent)te.getSource();
        if(tf==name)
        {
            nm="Name : "+name.getText();
                System.out.println(nm);
                a=a+"\n"+nm;
                
            
        }
        if(tf==num)
        { no="Number : "+num.getText();
            System.out.println(no);
                a=a+"\n"+no;
        }
        if(tf==email)
        {ead="email : "+email.getText();
            System.out.println(ead);
                a=a+"\n"+ead;
        }
        if(tf==addr)
        { ra="adderrs : "+addr.getText();
            System.out.println(ra);
                a=a+"\n"+ra;
        }
        
        
        if(tf==ans)
        {
            aw= "next question : "+ans.getText();
            System.out.println(aw);
                a=a+"\n"+aw;
        }
        
             o.println(a);
    }















}
    

