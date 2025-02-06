package singletonClass;


public class SingletonMain {
	public static void main(String[] args) {
		Singleton  a = Singleton.getInstance();
		Singleton b  = Singleton.getInstance();
		Singleton c = Singleton.getInstance();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}

}
