package testes;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
/*
 * Map � uma collection que diferente de arrays e listas, n�o possui ordenamento.
 * Entretanto, � uma collection muito r�pida, que trabalha com chave e valor,
 * sendo o acesso a valores, feito pelas suas chaves.
 * Map pode ser instanciado por v�rias formas, sendo o HashMap() a mais r�pida
 * */
		Map<String, String> map = new HashMap<>();
		map.put("user", "Maria");
		map.put("phone", "35212020");
		map.put("email", "name@mail.com");
		
		for (String key : map.keySet()) { // keySet() retorna as chaves do map
			System.out.println("Chave= " + key + ", Valor= " + map.get(key));
		}
	}
}
