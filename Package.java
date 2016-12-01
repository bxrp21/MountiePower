
abstract class Package {
	
	/** The cost. */
	private double cost;
	
	/** The discount. */
	private float discount;
	
	/** The product. */
	private Product product;
	
	/** The size. */
	private int size;

	/**
	 * Instantiates a new package.
	 *
	 * @param product the product
	 * @param discount the discount
	 * @param size the size
	 */
	Package(Product product, float discount, int size){
		this.product = product;
		cost = product.getPrice();
		this.discount = discount;
		this.size = size;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice(){
		return size*cost*discount;
	}
	
	/**
	 * Gets the product.
	 *
	 * @return the product
	 */
	public Product getProduct(){
		return product;
	}

	@Override
	public boolean equals(Object o){
		if (!(o.getClass().equals(this.getClass())))
			return false;
		
		Package p = (Package) o;
		return this.getProduct().equals(p.getProduct());
	}
}
