
class MountiePowerPack extends Package{
	
	/** The discount. */
	private static float discount = (float) 0.7;
	
	/** The size. */
	private static int size = 24;
	
	/**
	 * Instantiates a new mountie power pack.
	 *
	 * @param product the product
	 */
	MountiePowerPack(Product product){
		super(product,discount,size);
	}
	
	@Override
	public boolean equals(Object o){
		if (!(o instanceof MountiePowerPack))
			return false;
		
		MountiePowerPack mpp = (MountiePowerPack) o;
		return this.getProduct().equals(mpp.getProduct());
	}
}