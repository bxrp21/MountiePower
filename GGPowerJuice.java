class GGPowerJuice implements DrinkProduct{
	private final double price = 3.25;
	private String flavour;

	GGPowerJuice(){
		flavour = "Regular"
	}

	GGPowerJuice(String flavour){
		this.flavour = flavour;
	}

	public double getPrice(){
		return price;
	}

	public String getFlavour(){
		return flavour;
	}

	@Override
	public boolean equals(Object o){
		return (o instanceof GGPowerJuice);
	}
}