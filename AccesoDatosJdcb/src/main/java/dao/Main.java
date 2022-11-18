package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Servicios serv = (Servicios) context.getBean("inserta");
		
		serv.insertar(
				"INSERT INTO \"public\".\"Alumnos\" (nombre,apellido,email)"
						+ "VALUES('Paco','Fernández','Herrera')");
	}

}
