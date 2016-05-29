package clients;

import generators.CacheProxy;
import generators.Generator;

/*
 * Test client for the CachProxy
 */
public class Cache {
	public static void main(String[] args) {
		Generator calc = new CacheProxy();
		//PI is cached - the getPi() method of RealGenerator is invoked.
		double d = calc.getPi();
		System.out.println("main " + d);
		//PI is already cached. the CachProxy object denies access to the getPi() method. 
		d = calc.getPi();
		System.out.println("main " + d);
		//Same
		d = calc.getPi();
		System.out.println("main " + d);
		//E is now cached instead of PI - the getE() method of RealGenerator is invoked.
		d = calc.getE();
		System.out.println("main " + d);
		//E is already cached. the CachProxy object denies access to the getE() method. 
		d = calc.getE();
		System.out.println("main " + d);
		//PI is now cached instead of E.
		d = calc.getPi();
		System.out.println("main " + d);
		//E is now cached instead of PI.
		d = calc.getE();
		System.out.println("main " + d);

	}
}
