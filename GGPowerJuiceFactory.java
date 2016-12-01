// TODO: Auto-generated Javadoc
/**
 * A factory for creating GGPowerJuice objects.
 */
class GGPowerJuiceFactory implements DrinkProductFactory{
	
	/**
	 * Builds a can
	 * 
	 * @param p the DrinkProduct
	 */
	public Can buildCan(DrinkProduct p){
		return new Can(p);
	}
	
	/**
	 * Builds a six pack
	 * 
	 * @param p the DrinkProduct
	 */
	public SixPack buildSixPack(DrinkProduct p){
		return new SixPack(p);
	}
	
	/**
	 * Builds a PowerPack pack
	 * 
	 * @param p the DrinkProduct
	 */
	public MountiePowerPack buildMountiePowerPack(DrinkProduct p){
		return new MountiePowerPack(p);
	}
}