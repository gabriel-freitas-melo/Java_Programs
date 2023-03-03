package fundamentos;



import javax.swing.JOptionPane;

public class DesafioConversão {
	public static void main(String[] args) {
		//FOI FEITA A CONVERSÃO STRING PARA DOUBLE 
				System.out.println("CÁLCULO SALARIAL");
				String salario1 = JOptionPane.showInputDialog("Digite o  primeiro salário").replace(",", ".");
				double salario_1 = Double.parseDouble(salario1);
				String salario2 = JOptionPane.showInputDialog("Digite o segundo salário").replace(",", ".");
				double salario_2 = Double.parseDouble(salario2);
				String salario3 = JOptionPane.showInputDialog("Digite o tercceiro salário").replace(",", ".");
				double salario_3 =Double.parseDouble(salario3);
				double media = (salario_1 + salario_2 + salario_3)/3.00;
				
				System.out.printf("A média salarial é: R$%f", media);

	}


}
