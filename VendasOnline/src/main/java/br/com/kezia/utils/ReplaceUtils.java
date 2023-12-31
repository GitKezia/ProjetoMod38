/**
 * 
 */
package br.com.kezia.utils;


public class ReplaceUtils {

	public static String replace(String value, String ...patterns) {
		String retorno = value;
		for (String pattern : patterns) {
			retorno = retorno.replace(pattern, "");
		}
		return retorno;
	}
}
