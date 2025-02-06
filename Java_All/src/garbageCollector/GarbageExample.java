package garbageCollector;

public class GarbageExample {

	/*
	 * Garbage Collection is process of reclaiming the runtime unused memory
	 * automatically.
	 * 
	 * it is a way to destroy the unused objects.
	 * 
	 * It is automatically done by the garbage collector(a part of JVM) so we don't
	 * need to make extra efforts.
	 * 
	 * finalize() method
	 * 
	 * The finalize() method is invoked each time before the object is garbage
	 * collected. This method can be used to perform cleanup processing
	 * 
	 * gc() method
	 * 
	 * The gc() method is used to invoke the garbage collector to perform cleanup
	 * processing. The gc() is found in System and Runtime classes.
	 */

	public void finalize() {
		System.out.println("This is Finalize method");
	}

	public static void main(String[] args) {
		GarbageExample garbageExample = new GarbageExample();
		GarbageExample garbageExample2 = new GarbageExample();
		garbageExample = null;
		garbageExample2 = null;

		System.gc();
	}
}
