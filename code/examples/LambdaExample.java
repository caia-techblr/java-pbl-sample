package org.gitam.cseblr;

@FunctionalInterface
interface MyFunctionalInterface {
    int operation(int a, int b);
}

public class LambdaExample {
	public static void main(String args[])
	{
		MyFunctionalInterface op;
		int res;
		
		op = (a,b) -> { return a + b; } ;
		res = op.operation(10, 20);
		
		op = (a,b) -> { return a * b; } ;
		res = op.operation(10, 20);
		
		compute(10,20, (a,b) -> { return a + b; } );
		compute(12,15, (a,b) -> { return a * b; } );
		
	}
	public static void compute(int val1, int val2, MyFunctionalInterface calc)
	{
		int res = calc.operation(val1, val2);
		//print res
	}
}
