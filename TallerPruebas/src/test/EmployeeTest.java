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
	
	
	
	/**
	*Comprobar sueldo para empleado del tipo Supervisor
	*/
	@Test
	public void sueldoSupervisorUSD() {
		Employee empleado = new Employee(800,"USD",0.6F, EmployeeType.Supervisor);
		float sueldoResultado = empleado.cs();
		System.out.println(sueldoResultado);

		float resultadoEsperado = 816.87667F;
		assertEquals(sueldoResultado, resultadoEsperado,0);
		
	}
	
	/**
	*Comprobar sueldo para empleado del tipo Supervisor
	*/
	@Test
	public void sueldoSupervisorEUR() {
		Employee empleado = new Employee(800,"EUR",0.6F, EmployeeType.Supervisor);
		float sueldoResultado = empleado.cs();
		float resultadoEsperado = 464.33334F;
		assertEquals(sueldoResultado, resultadoEsperado,0);
		
	}
	
	
	/**
	*Comprobar sueldo para empleado del tipo Manager
	*/
	@Test
	public void sueldoManager() {
		Employee empleado = new Employee(900,"USD",0.5F, EmployeeType.Supervisor);
		float sueldoResultado = empleado.cs();
		float resultadoEsperado = 464.33334F;
		assertEquals(sueldoResultado, resultadoEsperado,0);
		
	}
	
	/**
	*Comprobar sueldo para empleado del tipo Manager con mes par
	*/
	@Test
	public void sueldoManagerPar() {
		
		
	}
	
	
	
	
	
	
	
	
}
