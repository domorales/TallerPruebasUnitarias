package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Employee;
import model.EmployeeType;

public class EmployeeTest {
	
	/**
	 * Comprobar sueldo para empleado del tipo Worker con moneda USD
	 */
	@Test
	public void sueldoWorkerUSD() {
		Employee empleado = new Employee(400, "USD", 0.5F, EmployeeType.Worker);
		float sueldoResultado = empleado.cs();
		float resultadoEsperado = 464.33334F;
		assertEquals(sueldoResultado, resultadoEsperado, 0);
	}

	/**
	 * Comprobar sueldo para empleado del tipo Supervisor con moneda USD
	 */
	@Test
	public void sueldoSupervisorUSD() {
		Employee empleado = new Employee(800, "USD", 0.6F, EmployeeType.Supervisor);
		float sueldoResultado = empleado.cs();
		float resultadoEsperado = 864.54333F;
		assertEquals(sueldoResultado, resultadoEsperado, 0);

	}

	/**
	 * Comprobar sueldo para empleado del tipo Manager con moneda USD
	 **/
	@Test
	public void sueldoMangerUSD() {
		Employee empleado = new Employee(700, "USD", 0.7F, EmployeeType.Manager);
		float sueldoResultado = empleado.cs();
		float resultadoEsperado = 764.82333F;
		assertEquals(sueldoResultado, resultadoEsperado, 0);

	}
	
	/**
	 * Comprobar sueldo para empleado del tipo Supervisor con moneda EUR
	 */
	@Test
	public void sueldoSupervisorEUR() {
		Employee empleado = new Employee(800, "EUR", 0.6F, EmployeeType.Supervisor);
		float sueldoResultado = empleado.cs();
		float resultadoEsperado = 824.54333F;
		assertEquals(sueldoResultado, resultadoEsperado, 0);
	}
	/**
	 * Comprobar sueldo para empleado del tipo Supervisor con mes PAR
	 */
	public void sueldoSupervisorMesPar() {
		Employee empleado = new Employee(800, "USD", 0.6F, EmployeeType.Supervisor);
		float sueldoResultado = empleado.cs();
		float resultadoEsperado = 800.21F;
		assertEquals(sueldoResultado, resultadoEsperado, 0);
	}

	/**
	 * Comprobar bono anual para empleado del tipo Worker con moneda USD
	 */
	@Test
	public void bonoAnualWorkerUSD() {
		Employee empleado = new Employee(600, "USD", 0.4F, EmployeeType.Worker);
		float sueldoCalculado = empleado.CalculateYearBonus();
		float resultadoEsperado = 386.0F;
		assertEquals(sueldoCalculado, resultadoEsperado, 0);
	}
	

	/**
	 * Comprobar bono anual para empleado del tipo Supervisor con moneda USD
	 */
	@Test
	public void bonoAnualSupervisorUSD() {
		Employee empleado = new Employee(500, "USD", 0.5F, EmployeeType.Supervisor);
		float sueldoCalculado = empleado.CalculateYearBonus();
		float resultadoEsperado = 693.0F;
		assertEquals(sueldoCalculado, resultadoEsperado, 0);
	}

	/**
	 * Comprobar bono anual para empleado del tipo Manager con moneda USD
	 */
	@Test
	public void bonoAnualManagerUSD() {
		Employee empleado = new Employee(600, "USD", 0.4F, EmployeeType.Manager);
		float sueldoCalculado = empleado.CalculateYearBonus();
		float resultadoEsperado = 986.0F;
		assertEquals(sueldoCalculado, resultadoEsperado, 0);
	}

	/**
	 * Comprobar bono anual para empleado del tipo Supervisor con moneda EUR
	 */
	@Test
	public void bonoAnualSupervisorEUR() {
		Employee empleado = new Employee(700, "EUR", 0.3F, EmployeeType.Supervisor);
		float sueldoCalculado = empleado.CalculateYearBonus();
		float resultadoEsperado = 858.0F;
		assertEquals(sueldoCalculado, resultadoEsperado, 0);
	}

}
