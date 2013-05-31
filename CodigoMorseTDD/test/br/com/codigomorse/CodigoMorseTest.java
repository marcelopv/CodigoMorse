package br.com.codigomorse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CodigoMorseTest {
	
	String mensagem;
	CodigoMorse cm = new CodigoMorse();
	
	@Before
	public void iniciaValores(){
		mensagem = "";
	}
	
	@Test
	public void quandoPassarLetraDeveraRetornarRespectivoMorse(){
		mensagem = "o";
		assertEquals("---", cm.letraToMorse(mensagem));
	}
	
	@Test
	public void quandoPassarDuasLetrasJuntasDeveraRetornarRespectivoMorse(){
		mensagem = "oi";
		assertEquals("--- ..", cm.palavraToMorse(mensagem));
	}
	
	@Test
	public void quandoPassarDuasPalavrasSeparadasDeveraRetornarRespectivoMorse(){
		mensagem = "codigo morse";
		assertEquals("-.-. --- -.. .. --. ---   -- --- .-. ... .", cm.palavraToMorse(mensagem));
	}
	
	@Test
	public void quandoPassarMorseDeveraRetornarLetra(){
		mensagem = "---";
		assertEquals("o", cm.morseToLetra(mensagem));
	}
	
	@Test
	public void quandoPassarDoisMorsesJuntosDeveraRetornarRespectivaPalavra(){
		mensagem = "--- ..";
		assertEquals("oi", cm.morseToPalavra(mensagem));
	}
	
	@Test
	public void quandoPassarDoisMorsesSeparadasDeveraRetornarRespectivoMorse(){
		mensagem = "-.-. --- -.. .. --. ---   -- --- .-. ... .";
		assertEquals("codigo morse", cm.morseToPalavra(mensagem));
	}
	
}
