package br.com.codigomorse;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Dicionario {
	
	public Map<String, String> dicionario;
	
	public Dicionario(){
		dicionario = new HashMap<String, String>();
		dicionario.put("a", ".-");
		dicionario.put("b", "-...");
		dicionario.put("c", "-.-.");
		dicionario.put("d", "-..");
		dicionario.put("e", ".");
		dicionario.put("f", "..-.");
		dicionario.put("g", "--.");
		dicionario.put("h", "....");
		dicionario.put("i", "..");
		dicionario.put("j", ".----");
		dicionario.put("k", "-.-");
		dicionario.put("l", ".-..");
		dicionario.put("m", "--");
		dicionario.put("n", "-.");
		dicionario.put("o", "---");
		dicionario.put("p", ".--.");
		dicionario.put("q", "--.-");
		dicionario.put("r", ".-.");
		dicionario.put("s", "...");
		dicionario.put("t", "-");
		dicionario.put("u", "..-");
		dicionario.put("v", "...-");
		dicionario.put("w", ".--");
		dicionario.put("x", "-..-");
		dicionario.put("y", "-.--");
		dicionario.put("z", "--..");
		dicionario.put("1", ".----");
		dicionario.put("2", "..---");
		dicionario.put("3", "...--");
		dicionario.put("4", "....-");
		dicionario.put("5", ".....");
		dicionario.put("6", "-....");
		dicionario.put("7", "--...");
		dicionario.put("8", "---..");
		dicionario.put("9", "----.");
	}

	public String getLetra(String codigo) {
		String letra = "";
		for (Entry<String, String> cod : dicionario.entrySet()) {
			if (cod.getValue().equals(codigo)){
				letra = cod.getKey();
			}
		}
		return letra;
	}

	public String getMorse(String letra) {
		String codigo = "";
		for (Entry<String, String> cod : dicionario.entrySet()) {
			if (cod.getKey().equals(letra)){
				codigo = cod.getValue();
			}
		}
		return codigo;
	}
}
