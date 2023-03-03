package net.greg.examples.salient.antipatterns.reflection.actor;

import java.lang.reflect.Field;


public final class ReflectionTestUtils {

  public static void main(String ... args) {  }

  public static final void setField(
      Object object, String fieldname, Object value) {

    try {

      for (Field field : object.getClass().getDeclaredFields()) {

        if ( ! field.getName().equals(fieldname)) continue;

			  field.setAccessible(Boolean.TRUE);
        field.set(object, value);
        field.setAccessible(Boolean.FALSE);
      }
  	}
		catch (IllegalAccessException e) { e.printStackTrace(); }
	}
}
