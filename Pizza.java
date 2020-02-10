public class Pizza {
	
	private String size;
	private int cost;
	private String type;
	
	public Pizza(String size, int cost, String type) {
		this.size=size;
		this.cost=cost;
		this.type=type;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getCost() {
		return cost;
	}
	
	public String getType() {
		return type;
	}
}
