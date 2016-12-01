
interface DrinkProductFactory{
	
	/**
	 * Builds the can.
	 *
	 * @param p the p
	 * @return the can
	 */
	public Can buildCan(DrinkProduct p);
	
	/**
	 * Builds the six pack.
	 *
	 * @param p the p
	 * @return the six pack
	 */
	public SixPack buildSixPack(DrinkProduct p);
	
	/**
	 * Builds the mountie power pack.
	 *
	 * @param p the p
	 * @return the mountie power pack
	 */
	public MountiePowerPack buildMountiePowerPack(DrinkProduct p);
}