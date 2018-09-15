//program to find the coordinates of a prime number in a prime spiral
public class PrimeCoordinates{
	static void spiralSplicer(int input){
		int step_count=1;
		int step_limit=2;
		int adder = 1;
		int x=0, y=0;
		
		for(int n=2; n!=input+1; n++, step_count++){
			if(step_count<=0.5*step_limit)
				x=+adder;
			else if(step_count<= step_limit)
				y+=adder;
			if (step_count == step_limit) { 
   
				// Changes adder to -1 and vice versa 
				adder *= -1;  
  
				// Keeps on updating 'step_limit' 
				step_limit += 2;  
             
				// Resets count 
				step_count = 0;  
			}
		}
		System.out.println(x+" "+y);
		
	}
	public static int primeIndex(int input) 
{ 
    int j, cnt, prime_c = 0; 
    for (int i = 2; i <= 1000000; i++) { 
        cnt = 0; 
        for (j = 2; j <= i; j++) { 
            if (i % j == 0) 
                cnt++; 
        } 
  
        if (cnt == 1) { 
            prime_c++; 
  
            if (input == i) { 
  
           /* Replaces the prime number with  
              Step K which will be fed into 
              the main algorithm*/
                input = prime_c;  
                break; 
            } 
        } 
    } 
    return input; 
} 
	public static void main(String[] args){
		int input=113;
		spiralSplicer(primeIndex(input));
	}
	
}
