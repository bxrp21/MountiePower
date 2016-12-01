
class SixPack extends Package{
	
	/** The discount. */
	private static float discount = (float) 0.9;
	
	/** The size. */
	private static int size = 6;
	
	/**
	 * Instantiates a new six pack.
	 *
	 * @param product the product
	 */
	SixPack(Product product){
		super(product,discount,size);
	}
}