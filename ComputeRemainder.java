import java.util.Scanner;
public class ComputeRemainder {
	
	private int num, den;
	
	public int compute() {
		setNumbers();
		return num % den;
		}
	
	public void setNumbers() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter a numerator.");
		num = keys.nextInt();
				
		try {
		System.out.println("Enter a denominator. An input of 0 throws an exception.");	
		den = keys.nextInt();
		
		if (den == 0) {
			throw new DivideByZeroException();
			}
			}			
		
		catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
			}
		}		
	
	public static void main(String[] args) {
		ComputeRemainder demo = new ComputeRemainder();
		System.out.println(demo.compute());
		}
	} 
