class SixPack extends Packaging{
	private float discount = 0.9
	private int size = 6;
	SixPack(Product product){
		Super(product,discount,size);
	}
}