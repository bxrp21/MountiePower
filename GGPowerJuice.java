
class GGPowerJuice implements DrinkProduct{
	
	/** The price. */
	private final double price = 3.25;
	
	/** The flavour. */
	private String flavour;

	/**
	 * Instantiates a new GG power juice.
	 */
	GGPowerJuice(){
		flavour = "Regular";
	}

	/**
	 * Instantiates a new GG power juice.
	 *
	 * @param flavour the flavour
	 */
	GGPowerJuice(String flavour){
		this.flavour = flavour;
	}

	/**
	 * Gets the price
	 * 
	 */
	public double getPrice(){
		return price;
	}

	/**
	 * Gets the flavour
	 */
	public String getFlavour(){
		return flavour;
	}

	@Override
	public boolean equals(Object o){
		return (o instanceof GGPowerJuice);
	}
}