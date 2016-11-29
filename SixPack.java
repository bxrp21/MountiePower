class SixPack extends Package{
	private static float discount = (float) 0.9;
	private static int size = 6;
	SixPack(Product product){
		super(product,discount,size);
	}
}