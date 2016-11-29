interface DrinkProductFactory{
	public Can buildCan(DrinkProduct p);
	public SixPack buildSixPack(DrinkProduct p);
	public MountiePowerPack buildMountiePowerPack(DrinkProduct p);
}