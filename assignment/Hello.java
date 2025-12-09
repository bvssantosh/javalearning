package assignment;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
			try {
				System.out.println("2");
				
			}catch(Exception e) {
				System.out.println("3");
				return;
				
			}finally {
				System.out.println("4");
			}
			System.out.println("5");
	}

}
