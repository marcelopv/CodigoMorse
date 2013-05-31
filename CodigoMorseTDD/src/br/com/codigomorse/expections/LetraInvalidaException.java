/**
 * 
 */
package br.com.codigomorse.expections;

/**
 * @author marcelopv
 *
 */
public class LetraInvalidaException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;

	public LetraInvalidaException(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMessage(){
		return this.mensagem;
	}
}
