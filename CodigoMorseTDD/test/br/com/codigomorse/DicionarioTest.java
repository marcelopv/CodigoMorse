package br.com.codigomorse;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DicionarioTest {
	
	private Dicionario dicionario;

	@Before
	public void setUp(){
		dicionario = new Dicionario();
	}
	
	@Test
	public void testeO(){
		String letra = dicionario.getLetra("---");
		assertEquals("o", letra);
	}
	
	@Test
	public void quandoPassarLetraParaDicionarioDeveraProcurarERetornarRespectivoCodigo(){
		String codigo = dicionario.getMorse("e");
		assertEquals(".", codigo);
	}
	
	@Test
	public void quandoPassarCodigoParaDicionarioDeveraProcurarERetornarRespectivaLetra(){
		String letra = dicionario.getLetra(".");
		assertEquals("e", letra);
	}
	
	
}
