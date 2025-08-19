/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject13;

/**
 *
 * @author DELL
 */
public class AddressBook {
  private  Contact [] c;
  int ContactSize;
  public AddressBook(int size )
  {
      
      c=new Contact[size];
       ContactSize=0;
  }
  
  
  public void add(Contact contact ){
      if(ContactSize<c.length){
         c[ContactSize] =contact;
      ContactSize++;
      }
      else
          System.out.println("cant add new contact");
          
  }
  public void remove(Contact contact){
      for(int i=0;i<ContactSize;i++){
          if(c[i].getName().equals(contact.getName())){
              for(int j=i;j<ContactSize-1;j++){
                  c[j]=c[j+1];
                  
              }
              ContactSize--;
            c [ContactSize]=null;
              
          break;
      }
         
      }

  }
 
  public void update(Contact old,Contact new1){
      for(int i=0;i<ContactSize;i++){
          if(c[i].getName().equals(old.getName()))
             c[i].setName(new1.getName());
          c[i].setPhoneNum(new1.getPhoneNum());
          c[i].setEmail(new1.getEmail());
          System.out.println(" the contact is updated ");
          return;
      }
      System.out.println("can't find this contact ");
      

  }
  public Contact[] retrieve(){
    Contact[]  contacts = new Contact[ContactSize];
    for(int i=0;i<ContactSize;i++){
        contacts[i]=c[i];
        
    }
    return contacts;
   
  }
  
} 
