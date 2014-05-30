package patrones.singlenton;

public final class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getSingleton() {
		// Creaci�n perezosa
		if (Singleton.singleton == null) {
			Singleton.singleton = new Singleton();
		}
		return Singleton.singleton;
	}
}
