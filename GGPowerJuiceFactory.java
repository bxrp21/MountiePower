class GGPowerJuiceFactory implements DrinkProductFactory{
	public Can buildCan(DrinkProduct p){
		return new Can(p);
	}
	public SixPack buildSixPack(DrinkProduct p){
		return new SixPack(p);
	}
	public MountiePowerPack buildMountiePowerPack(DrinkProduct p){
		return new MountiePowerPack(p);
	}
}