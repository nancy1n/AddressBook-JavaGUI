/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author DELL
 */
public class Gui extends JFrame  implements ActionListener{
  JButton b1,b2,b3;
JTextField f1,f2,f3;
JLabel l1,l2,l3,l4;
 JPanel p1,p2,p3,base;   
 JTextArea f4;
    AddressBook a =new AddressBook(20);
    
    
    public Gui(){
        base=new JPanel();
        base.setLayout(new BoxLayout(base,BoxLayout.Y_AXIS));
        p1=new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setPreferredSize(new Dimension(100,200));
       l1=new JLabel("Name");
        l2=new JLabel("Phone Number");
         f1=new JTextField();
       f1.setPreferredSize(new Dimension(100,50));
         f2=new JTextField();
       f2.setPreferredSize(new Dimension(100,50));
       l3=new JLabel("Email");
        f3=new JTextField();
       f3.setPreferredSize(new Dimension(100,50));
       
       
       
       
        p1.add(l1);
        p1.add(f1);
        p1.add( l2);
        p1.add(f2);
        p1.add(l3);
        p1.add(f3);
        base.add(p1);
        
                
       
      p2=new JPanel();
      
      p2.setPreferredSize(new Dimension(100,200));
  b1=new JButton("Add");
       b1.setFont(new Font("myfont",Font.ROMAN_BASELINE,25));
       b1.setBackground(Color.blue);
       b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
       
        b2=new JButton("Remove");
       b2.setFont(new Font("myfont",Font.ROMAN_BASELINE,25));
       b2.setBackground(Color.blue);
       b2.setForeground(Color.WHITE);
       b2.addActionListener(this);
       
        b3=new JButton("Update");
       b3.setFont(new Font("myfont",Font.ROMAN_BASELINE,25));
       b3.setBackground(Color.blue);
       b3.setForeground(Color.WHITE);
      b3.addActionListener(this);
       p2.add(b1);
       p2.add(b2);
       p2.add(b3);

       base.add(p2);
       
      p3=new JPanel();
      p3.setPreferredSize(new Dimension(100,200));
     
      
      f4=new JTextArea(50,100);

      JScrollPane s1=new JScrollPane(f4);
   
      p3.add(s1);
      base.add(p3);
       DisplayContact();
       this.add(base);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            String name=f1.getText();
            String pn=f2.getText();
            String em=f3.getText();
            Contact c=new Contact(name,pn,em);
            f4.setText(name+" "+pn+" "+em);
              a.add(c);
    
           DisplayContact();
        }
        else if( e.getSource()==b2)
        {
            String name=f1.getText();
        
           String phone=f2.getText();
           String em=f3.getText();
           Contact c=new Contact(name,phone,em);
            a.remove(c);
             DisplayContact();

        }
        else if( e.getSource()==b3){
             String name=f1.getText();
        
           String phone=f2.getText();
           String em=f3.getText();

          
         Contact c=new Contact(name,phone,em);
           String n="nancy";
           String p="0102234";
           String em1="gmail.com";
           
           Contact c1=new Contact (n,p,em1);
           a.update(c, c1);
    
   f1.setText("");
    f2.setText("");
    f3.setText("");
    DisplayContact();
        }
    }
    
    
   public void DisplayContact(){
       String str=" ";
       Contact [] contact=a.retrieve();
       for(int i=0;i<contact.length;i++){
           str=str+contact[i].getName()+contact[i].getPhoneNum()+contact[i].getEmail();
           
       }
       f4.setText(str);
   }
    
 
}
