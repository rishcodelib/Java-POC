package home.aggarwal.practice;

// Creating STATIC Function, to use them directly without instantiation.

public class Common {

	static void print(Object data) {
		System.out.println(data);
	}

	static String prompt(String Question) {
		print(Question);
		String result = System.console().readLine();
		
		return result;
	}

	static int getNumber(String Question) {
		return Integer.parseInt(prompt(Question));

	}

	static double getDouble(String question) {
		return Double.parseDouble(prompt(question));
	}
}
