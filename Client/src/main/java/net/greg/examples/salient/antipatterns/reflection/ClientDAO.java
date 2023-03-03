package net.greg.examples.salient.antipatterns.reflection;

import net.greg.examples.salient.antipatterns.reflection.actor.ReflectionTestUtils;


public final class ClientDAO {

  public static void main(String ... args) {

    System.err.println("\n\n\tBefore --> Entity: " + entity);


ReflectionTestUtils.setField(entity, "name", "Gregor");
ReflectionTestUtils.setField(entity, "age", 888);

    System.err.println("\n\tAfter  --> Entity: " + entity + "\n\n");
  }



  private static Entity entity;

  static {
    entity = new Entity("Greg", 299);
  }
}
