package com.teste;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
	
//	//Eu executando assim vai falhar pois estou esperando uma exceção. porem existe um argumento na minha lista
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void empty() {
//		List <String> lista = new ArrayList<String>();
//		lista.add("Diego");
//		lista.get(0);
//	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
		List<Object> list = new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index: 0, Size: 0");
		list.get(0);
	}
	

}
