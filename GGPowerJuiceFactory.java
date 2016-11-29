class GGPowerJuiceFactory implements ProductFactory{
	public Can buildCan(Product p){
		return new Can(p);
	}
	public SixPack buildSixPack(Product p){
		return new SixPack(p);
	}
	public MountiePowerPack buildMountiePowerPack(Product p){
		return new MountiePowerPack(p);
	}
}