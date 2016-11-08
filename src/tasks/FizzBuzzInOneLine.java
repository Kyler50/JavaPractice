package tasks;

public class FizzBuzzInOneLine {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++)System.out.println((i % 15 == 0) ? "fizzbuzz" : (i % 5 == 0) ? "buzz" : (i % 3 == 0) ? "fizz" : i);
	}
}
