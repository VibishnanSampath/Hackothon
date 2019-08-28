package Hacking;

import java.io.*;


public class StringConve {

   public static void printBytes(byte[] array, String name) {
      for (int k = 0; k < array.length; k++) {
         System.out.println(name + "[" + k + "] = " + "0x" +
            Unicodco.byteToHex(array[k])); 
      }
   }

   public static void main(String[] args)throws IOException {
      System.out.println(System.getProperty("file.encoding"));
      String original = new String("தேடிச் சோறுநிதந் தின்று - பல"
      		+ "\nசின்னஞ் சிறுகதைகள் பேசி - மனம்"
      		+ "\nவாடித் துன்பமிக உழன்று - பிறர்"
      		+ "\nவாடப் பலசெயல்கள் செய்து - நரை"
      		+ "\nகூடிக் கிழப்பருவ மெய்தி - கொங்"
      		+ "\nகூற்றுக் கிரையெனப்பின் மாயும் - பல"
      		+ "\nவேடிக்கை மனிதரைப் போலே - நான்"
      		+ "\nவீழ்வே னென்று நினைத் தாயோ?நின்னைச் சிலவரங்கள் கேட்பேன் - அவை"
      		+ "\nநேரே இன்றெனக்குத் தருவாய் - என்றன்"
      		+ "\nமுன்னைத் தீயவினைப் பயன்கள் - இன்னும்"
      		+ "\nமூளா தழிந்திடுதல் வேண்டும் - இனி"
      		+ "\nஎன்னைப் புதியவுயி ராக்கி - எனக்"
      		+ "\nகேதுங் கவலையறச் செய்து - மதி"
      		+ "\nதன்னை மிகத்தெளிவு செய்து - என்றும்"
      		+ "\nசந்தோஷங் கொண்டிருக்கச் செய்வாய்");
      System.out.println("original = " + original);
      System.out.println((char)0x61); 
   
      try {
          byte[] utf8Bytes = original.getBytes("UTF8");
       //   byte[] defaultBytes = original.getBytes();
 
          String roundTrip = new String(utf8Bytes, "UTF8");
          System.out.println("roundTrip = " + roundTrip);
 
          System.out.println();
          printBytes(utf8Bytes, "utf8Bytes");
          System.out.println();
      //    printBytes(defaultBytes, "defaultBytes");
      } catch (UnsupportedEncodingException e) {
          e.printStackTrace();
      }
      
   } // main

}
