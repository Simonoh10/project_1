public class Main {
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}

	public int multiplyTwoNumbers(int a, int b) {
		return a*b;
	}

	public float divideTwoNumbers(int a, int b) {
		return a/b;
	}

	public int substractTwoNumbers(int a, int b) {
		return a-b;
	}

	public boolean isNumberEven(int a){
		boolean r=true;
		boolean f=false;
		if(a%2==0){
			return r;
		}
		else{
			return f;
		}
	}

	public int calculateFirstRightDigit(int a){
		int  h=a%10;
		if (h<0){
			h=h*-1;
		}
		return h;
	}

	public float celciusToFahrenheit(float a){
		float f=(a*9/5)+32;
		return f;
	}

	public float areaOfATriangle(float height, float base){
		float r=base*height/2;
		return r;
	}

	public boolean isLeapYear(int year){
		boolean t=true;
		boolean f=false;
		if (year%400==0 || year%4==0 ){
			
			
			return t;
			
		}else{
			return f;
		}
		
		
		
	}

    public boolean isPrime(int number) {
		boolean t=true;
		int acum=0;
		for (int i=1; i<number; i++){
			if (number%i==0){
				acum=acum+1;
			}
			
		}
		if (acum<=2){
			return t;
		}else{
			return t=false;
		}
    }

    public int calculateFactorial(int number){
		int r=1;
		for(int i=1; i<=number; i++){
			r=r*i;
		}
		return r;
    }

    public int calculateLastNFibonnacci(int n){
		int a=1;
		int b=1;
		int c=1;
		for(int i=1; i<n; i++){
			b=c+a;
			c=a;
			a=b;
		}
		return c;
    }

    public int getNumberOfDigits(int number){
		int a=0;
		while(number>0){
			number=number/10;
			a=a+1;
		}
		return a;
    }

    public int rotateNumber(int number){
		int acum=0;
		int a=0;
		int b=number;
		int c=number;
		int y=0;
		
		while(b>0){
			b=b/10;
			acum=acum+1;
		}
		if (acum>1){
			
			for(int i=acum; i>0; i--){
				a=(a+y*10^i);
				y=c%10;
				
				c=c/10;
				
			}
			
		}
		if (acum<=1){
			a=number;
		}
		return a;
		
    }

    public int sumOffirstNNumbersMultiplesOfFiveOrThree(int N){
		int a=0;
		for(int i=1; i<=N; i++){
			
			if(i%5==0 || i%3==0){
				a=a+i;
			}
		}
		return a;
    }
}