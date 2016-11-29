class GGPowerJuice implements DrinkProduct{
	private final double price = 3.25;

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}
	
	@Override
	public boolean equals(Object o){
		return (o instanceof GGPowerJuice);
	}
}