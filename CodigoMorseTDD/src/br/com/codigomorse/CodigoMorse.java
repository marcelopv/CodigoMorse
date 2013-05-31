/**
 * 
 */
package br.com.codigomorse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcelopv
 *
 */
public class CodigoMorse {
	
	private static final String SEPARADOR_LETRAS = " ";
	private static final String SEPARADOR_PALAVRAS = "   ";
	
	Dicionario dicionario;
	List<String> letras = new ArrayList<String>();
	
	public CodigoMorse(){
		dicionario = new Dicionario();
	}

	public String letraToMorse(String letra) {
		return this.dicionario.getMorse(letra);
	}

	public String palavraToMorse(String mensagem) {
		
		StringBuilder morse = new StringBuilder();
		
		if (mensagemTemEspacos(mensagem)){
			String[] palavrasSeparadas = mensagem.split(SEPARADOR_LETRAS);
			
			for (String palavraSeparada : palavrasSeparadas) {
				char[] letras = palavraSeparada.toCharArray();
				
				for (int i = 0; i < letras.length; i++) {
					String letra = String.valueOf(letras[i]);
					morse.append(this.dicionario.getMorse(letra));
					
					if (!(i == letras.length - 1)){
						morse.append(SEPARADOR_LETRAS);
					}
				}
				morse.append(SEPARADOR_PALAVRAS);
			}
		}else{
			char[] letras = mensagem.toCharArray();
			
			for (int i = 0; i < letras.length; i++) {
				String letra = String.valueOf(letras[i]);
				morse.append(this.dicionario.getMorse(letra));
				morse.append(SEPARADOR_LETRAS);
			}
		}
		return morse.toString().trim();
	}

	private boolean mensagemTemEspacos(String mensagem) {
		return mensagem.contains(SEPARADOR_LETRAS);
	}

	public String morseToPalavra(String morse) {
		
		StringBuilder palavra = new StringBuilder();
		
		if (mensagemTemEspacos(morse)){
			String[] morsesSeparados = morse.split(SEPARADOR_PALAVRAS);
			
			for (String morseSeparado : morsesSeparados) {
				String[] subMorsesSeparados = morseSeparado.split(SEPARADOR_LETRAS);
				
				for (String subMorseSeparado : subMorsesSeparados){
					palavra.append(this.dicionario.getLetra(subMorseSeparado));
				}
				palavra.append(SEPARADOR_LETRAS);
			}
			
		}else{
			char[] letras = morse.toCharArray();
			
			for (int i = 0; i < letras.length; i++) {
				String letra = String.valueOf(letras[i]);
				palavra.append(this.dicionario.getMorse(letra));
				palavra.append(SEPARADOR_LETRAS);
			}
		}
		return palavra.toString().trim();
	}

	public String morseToLetra(String morse) {
		return this.dicionario.getLetra(morse);
	}
}
