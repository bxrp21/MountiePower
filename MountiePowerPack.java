class MountiePowerPack extends Packaging{
	private float discount = 0.7
	private int size = 24;
	MountiePowerPack(Product product){
		Super(product,discount,size);
	}
	
	@Override
	public boolean equals(Object o){
		if (!(o instanceof MountiePowerPack))
			return false;
		
		MountiePowerPack mpp = (MountiePowerPack) o;
		return this.getProduct().equals(mpp.getProduct());
	}
}