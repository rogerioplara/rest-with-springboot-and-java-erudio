package br.com.roger.converters;

public class NumberConverter {
	
	public static Double convertToDouble(String strNumber) {
		// verificar se é nulo
		if (strNumber == null) return 0D;
		
		// localização de decimais, replace da vírgula pelo ponto
		String number = strNumber.replaceAll(",", ".");
		
		// verifica se é numérico e retorna o numero já convertido para double
		if(isNumeric(number)) return Double.parseDouble(number);
		
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		// valida se está vazio ou não
		if (strNumber == null) return false;
		
		// troca as vírgulas por ponto 
		String number = strNumber.replaceAll(",", ".");
		
		// verifica se é numérico por esse regex
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
