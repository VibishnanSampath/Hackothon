package Hacking;

import java.io.FileReader;


public class Readingfile {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try {
			fr = new FileReader("C:/Users/ACER/Desktop/abc.txt");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally { 
			//fr.close();
			System.out.println("");
		}



	}

}
	    