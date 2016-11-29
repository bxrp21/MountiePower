abstract class Packaging{
	private double cost;
	private float discount;
	private Product product;
	private int size;

	Packaging(Product product, float discount, int size){
		this.product = product;
		cost = product.getPrice();
		this.discount = discount;
		this.size = size;
	}

	public double getPrice(){
		return size*cost*discount;
	}
}