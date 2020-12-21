package Q31readwritefile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Stack;

public class readwritefile {

	public static void main(String[] args) throws Exception  {
		//1. First you will goto location 2. you will open the file 3. Read line by line
		System.out.println(System.getProperty("user.dir")+"/JavaHackthon.txt");
		String sPath = System.getProperty("user.dir")+"/JavaHackthon.txt";//
		readwriteFile(sPath);
	}
	public static void readwriteFile(String sPath) throws Exception {
		String sLine;
		FileReader oFR = new FileReader(sPath);
		BufferedReader oBR = new BufferedReader(oFR);
		
		BufferedWriter oBW = null;
		String sFilePathToWrite = "/Users/new/eclipse-workspace/Java Hackathon/reverse.txt";
		FileWriter oFW = new FileWriter(sFilePathToWrite, true);
		 oBW = new BufferedWriter(oFW);
		
		List<String> s = new ArrayList<String>();
		while((sLine = oBR.readLine()) != null){
			System.out.println(sLine);
            s.add(sLine);
		}
		for (int i=s.size()-1; i>=0; i--) {
			oBW.write(s.get(i));
			oBW.newLine();
		}
		oBW.close();
	}
	
}
