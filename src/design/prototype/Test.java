package design.prototype;

public class Test {
	public static void main(String [] args) {
		Demo d = new Demo();
		try {
			Demo d2 = d.clone();
			/* d2.setName("a"); */
			System.out.println(d2.equals(d));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
