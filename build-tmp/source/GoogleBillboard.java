import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  

public void setup()  
{            
    noLoop();  
    for(int i=2; i<e.length(); i++){
    double tenDigit= Double.parseDouble(e.substring(i,i+10));
     	if(isPrime(tenDigit)==true){
     		System.out.println(tenDigit);
            break;
        }
    }
}  
public void draw()  
{   
	//not needed for this assignment
}  
public boolean isPrime(double dNum)  
{   
    //to be finished later  
    int factors=0;
    for(int n=2; n<=Math.sqrt(dNum); n++){
		if(dNum%n==0)
		factors++;
	}
	if(factors==0)
	return true;
	else
	return false;
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
