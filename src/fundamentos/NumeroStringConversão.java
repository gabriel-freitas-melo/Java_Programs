package fundamentos;

import javax.swing.JOptionPane;

public class NumeroStringConversão {
	public static void main(String[] args) {
		//Converteu um inteiro para string
		int num1 = 1000;
		System.out.println(Integer.toString(num1));
		//Converteu uma string para um double
		String s = JOptionPane.showInputDialog("Digite um valor");
		double num2 = Double.parseDouble(s);
		System.out.println(num2);
	}

}
