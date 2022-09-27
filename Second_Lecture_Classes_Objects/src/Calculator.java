
public class Calculator {
public double sum(double num1, double num2) {
	return (num1 + num2);
}
//public double sum(double num2, double num1) {  //Java doesn't like this, it isn't method overloading it pays attention to data types
	// return(num1 + num2);it sees same data types

public double sum(int num2, double num1) {
	return (num1+num2); 
	//different data types so it's overloaded
}

public double sum(double num2, int num1) {
	return (num1 + num2);
}

/*public int sum(double num2, int num1) {   name of function and order of data type is what java pays attention to
return (int) (num1+num2);  //the int is typecasting.   Because the name "sum" and data types are the same it causes an error
} */


}

