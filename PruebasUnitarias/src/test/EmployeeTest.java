package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Employee;
import model.EmployeeType;
 

public class EmployeeTest {


	//Worker, Supervisor, Manager 
	
	/**
	*Comprobar sueldo para empleado del tipo Worker con moneda USD
	*/
	@Test
	public void sueldoWorker() {
		Employee empleado = new Employee(400,"USD",0.5F, EmployeeType.Worker);
		float sueldoResultado = empleado.cs();
		float resultadoEsperado = 464.33334F;
		assertEquals(sueldoResultado, resultadoEsperado,0);
	}
	
	
	
	
	
	
	
	
	
	
}
