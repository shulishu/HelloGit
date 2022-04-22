package training;

public class HelloWorld {

	public static void main(String[] args) {
		
		HelloWorld obj = new HelloWorld();
		
		boolean flag = true;
		
		if (flag != true) {
			System.out.println("hello world");
		}
		else {
			obj.display();
		}
	}
	
	public void display() {
		System.out.println("hello git");
	}
}
