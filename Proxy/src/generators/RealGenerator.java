package generators;

/*
 * The implementation of Generator. It is not public thus cannot be accessed
 * by classes not from the same class.
 */
class RealGenerator extends Generator {

	public RealGenerator() {
		System.out.println("RealGenerator.RealGenerator()");
	}

	@Override
	public double getPi() {
		System.out.println("RealGenerator.getPi()");
		return Math.PI;
	}

	@Override
	public double getE() {
		System.out.println("RealGenerator.getE()");
		return Math.E;
	}

}
