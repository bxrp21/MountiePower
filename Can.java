class Can extends Package{
	
	/** The discount. */
	private static float discount = (float) 1.0;
	
	/** The size. */
	private static int size = 1;
	
	/**
	 * Instantiates a new can.
	 *
	 * @param product the product
	 */
	Can(Product product){
		super(product,discount,size);
	}
}