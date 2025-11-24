package assignment;
class Utility {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Dummy {

	    public static void main(String[] args) {
	        int result = Utility.add(10, 20); // No object needed
	        System.out.println("Sum: " + result);
	        int result1 = Utility.add(109, 20); // No object needed
	        System.out.println("Sum: " + result1);
	        }
	}

