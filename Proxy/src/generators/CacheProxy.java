package generators;

//A CacheProxy for a Generator. Regulates the access to the RealGenerator class's
//methods by the client.
public class CacheProxy extends Generator {

	RealGenerator realObj = null;
	double store = 0; //Stores the value of either PI or E.
	int lastAccessed = 0; //A state variable: 1-PI was accessed. 2-E was accessed.

	public CacheProxy() {
		System.out.println("CacheProxy.CacheProxy()");
		realObj = new RealGenerator();
	}

	/*
	 * (non-Javadoc)
	 * @see generators.Generator#getPi()
	 * Checks if PI is cached. If true returns the cached value. If it isn't, asks
	 * it from the real Generator and caches this value.
	 */
	@Override
	public double getPi() {
		System.out.println("CacheProxy.getPi()");
		if(lastAccessed != 1) {
			this.store = realObj.getPi();
			lastAccessed = 1;
			System.out.println("PI cached.");
		}

		return this.store;
	}

	/*
	 * (non-Javadoc)
	 * @see generators.Generator#getE()
	 * Checks if e is cached. If it is returns the cached value. If not, asks from
	 * the real Generator and cache this value.
	 */
	@Override
	public double getE() {
		System.out.println("CacheProxy.getE()");
		if(lastAccessed != 2) {
			this.store = realObj.getE();
			lastAccessed = 2;
			System.out.println("e cached.");
		}

		return this.store;
	}

}
