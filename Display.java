import java.util.Date;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new java.util.Date();
		System.out.println("Today's Date is: " + date);
		Pizza p = new Pizza("Large",23,"Hawain");
		Pizza p1 = new Pizza("Small",14,"Pepperoni");
		System.out.println("Hawain: " + p.getSize() + ", " + p.getCost() + ", " + p.getType());
		System.out.println("Pepperoni: " + p1.getSize() + ", " + p1.getCost() + ", " + p1.getType());
	}

}
