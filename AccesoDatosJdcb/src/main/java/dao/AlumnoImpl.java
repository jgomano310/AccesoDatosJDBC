package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AlumnoImpl implements Servicios {
	
	
		
	
	DataSource dataSource;

	
	public DataSource getDatasource() {
		return dataSource;
	}

	public void setDatasource(DataSource datasource) {
		this.dataSource = datasource;
	}

	public void insertar(String consulta) {

		try {
			
			
			System.out.println(dataSource.getConnection());
			Connection cn = this.dataSource.getConnection();
			System.out.println(cn);

	
			
			java.sql.Statement declaracionSQL = null;

			
			declaracionSQL = cn.createStatement();
			
		
			declaracionSQL.execute(consulta);
			
			
			declaracionSQL.close();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(" La conexión ha fallado");

			e.printStackTrace();
		}
	
	

	}}
