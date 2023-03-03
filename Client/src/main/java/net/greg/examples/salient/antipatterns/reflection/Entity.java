package net.greg.examples.salient.antipatterns.reflection;

public final class Entity {

	public Entity(String nameArg, int ageArg) {
		name = nameArg;
		age = ageArg;
	}

  // private field
	private String name;
	public String getName() { return name; }
	public void setName(String value) { name = value; }

  // private field
  private int age;
	private int getAge() { return age; }
	public void setAge(int value) { age = value; }

	@Override
  public String toString() {
		return
      "Entity [name=" + name + ", age=" + age + "]";
	}
}
