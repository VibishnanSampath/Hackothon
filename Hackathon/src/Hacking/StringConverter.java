package Hacking;
import java.io.*;
import java.util.*;


 
public class StringConverter {

	   public static void printBytes(byte[] array, String name) {
	      for (int k = 0; k < array.length; k++) {
	        /// System.out.println(name + "[" + k + "] = " + "0x" +UnicodeFormatter.byteToHex(array[k]));
	      }
	   }

	   public static void main(String[] args) {

	      System.out.println(System.getProperty("file.encoding"));
	      String original = new String("A" + "\u00ea" + "\u00f1"+ "\u00fc" + "C");
	   
	      System.out.println("original = " + original);
	      System.out.println("அறிவியலானது பொதுவான உண்மைகளையும் விதிகளையும் உள்ளடக்கியது");
	   
	      try {
	          byte[] utf8Bytes = original.getBytes("UTF8");
	          byte[] defaultBytes = original.getBytes();
	 
	          String roundTrip = new String(utf8Bytes, "UTF8");
	          System.out.println("roundTrip = " + roundTrip);
	 
	          System.out.println();
	          printBytes(utf8Bytes, "utf8Bytes");
	          System.out.println();
	          printBytes(defaultBytes, "defaultBytes");
	      } catch (UnsupportedEncodingException e) {
	          e.printStackTrace();
	      }
	      
	   } // main

	}
