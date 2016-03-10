package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClienteTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Teste1", 2, -2);//Esperado, obtido
		assertEquals("Teste double", 1.0/3.0, 0.333, 0.001);//Esperado, obtido, precisão
		int[] v1 = {1,2,3};
		int[] v2 = {1,2,3};
		assertArrayEquals("Vetor", v1, v2);//Teste vetor
	}

}
