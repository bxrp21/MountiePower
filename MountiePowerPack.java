class MountiePowerPack extends Package{
	private static float discount = (float) 0.7;
	private static int size = 24;
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