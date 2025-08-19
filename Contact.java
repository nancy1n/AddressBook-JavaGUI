/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject13;

/**
 *
 * @author DELL
 */
public class Contact {
   private String name;
      private String phoneNum;
      private String email;
      public Contact(String n,String EM,String pNUM) {
          name=n;
          phoneNum=pNUM;
          email=EM;
      }
      public void setName(String n)
      {
          name=n;
      }
       public void  setEmail(String e)
      {
        email=e;
      }
        public void setPhoneNum(String p)
      {
        phoneNum=p;
      }
      public String  getName( ){
          return name;
      }
    public String  getEmail( ){
          return email;
          
      }
     public String  getPhoneNum( ){
          return phoneNum;
      }
}
