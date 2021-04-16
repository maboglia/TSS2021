package paesi.lab;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import paesi.entities.Paese;

public class ReflectionPaese {

	public static void main(String[] args) {
		
		Object p = new Paese();
		
		Class<?> c = p.getClass();

		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		
		Constructor<?>[] constructors = c.getConstructors();
		System.out.println("Questa classe ha " + constructors.length +" costruttori");

		Constructor<?> constructor = constructors[0];
		
		Object obj = null;
		
		try {
			obj = constructor.newInstance();
			System.out.println(obj);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
