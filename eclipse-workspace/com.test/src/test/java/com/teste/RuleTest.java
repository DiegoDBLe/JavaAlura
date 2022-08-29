package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RuleTest {
	
	//Significa que a pasta temporaria sera criada antes da execução do teste
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();
	
	@Test
	public void ahouldCreateNewFileInTemporaryFolder() throws IOException {
		File  created = tmpFolder.newFile("file.txt");
		
		//Verificar se o arquivo foi criado
		assertTrue(created.isFile());
		// Verificar se o root da pasta temporaria é o mesmo do arquivo criado
		assertEquals(tmpFolder.getRoot(),created.getParentFile());
		
	}

}
