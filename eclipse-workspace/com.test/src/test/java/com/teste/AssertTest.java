package com.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertTest {
	
	//Criando dois arrays iguais e comparando os dois
	@Test
	public void testAssertArrayEquals() {
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();
		assertArrayEquals(esperado, atual);
		}
	
	//Comparando se as duas String são iguais
	@Test
	public void testAssertEquals() {
		assertEquals("text","text");
		
	}
	
	//Teste Boolean
	@Test
	public void testAssertEqualsFalse() {
		assertFalse(false);
		
	}
	
	//Para garantir que um objeto não está retornando um valor nullo
	@Test
	public void testAssertNotNull() {
		assertNotNull(new Object());
		
	}
	
	//Verificando se os objetos não são os mesmos 
		@Test
		public void testAssertNotSame() {
			assertNotEquals(new Object(), new Object() );
			
		}
		
		//Para garantir que o objeto está Null	
		@Test
		public void testAssertNull() {
		assertNull(null); 
		}
		
		//Vai verificar se o Objeto é o mesmo
		@Test
		public void testAssertSame() {
		Integer aNumber = Integer.valueOf(765);
			assertSame(aNumber, aNumber); 
		}


}
