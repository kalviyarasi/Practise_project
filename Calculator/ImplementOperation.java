package calculator;

public class ImplementOperation implements Operations {
	@Override
	public int addition(int n1, int n2) {
		int total=0;
	    total= n1+n2;
		return total;
	}

	@Override
	public int subraction(int n1, int n2) {
		int total=0;
		total= n1-n2; 
		return total;
	}

	@Override
	public int multiplication(int n1, int n2) {
	    int total=1;
	    total =n1*n2;
		return total;
	}

	@Override
	public int division(int n1, int n2) {
		int total=0;
		if(n2>0) {
			total=n1/n2;
		}
		return total;

	}

}
