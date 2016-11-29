abstract class Packaging{
	private double cost;
	private float discount;
	private Product product;
	private int size;

	Packaging(float discount, Product product, int size){
		this.cost = cost;
		this.discount = discount;
		this.product = product;
		this.size = size;
	}

	public double getPrice(){
		return size*cost*discount;
	}
}