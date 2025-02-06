package test;

import java.util.Objects;

public class Example {
	int id;
	String name;

	public Example(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Example other = (Example) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		Example example = new Example(1, "A");
		Example example2 = new Example(1, "A");

		System.out.println(example == example2);
		System.out.println(example.equals(example2));

	}
}
