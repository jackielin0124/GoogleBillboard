public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
int found=0;
factors
public void setup()  
{            
     noLoop();  
     for(int i=0; found==1; i++){
     	double tenDigit= Double.parseDouble(e.substring(i,i+10));
     	
     }
}  
public void draw()  
{   
	//not needed for this assignment
}  
public boolean isPrime(double dNum)  
{   
    //to be finished later  
    for(int n=2; n<=Math.sqrt(dNum); n++){
		if(dNum%n==0)
		factors++;
	  }
	  if(factors==0)
	  return true;
	  return false;
    return true;  
} 