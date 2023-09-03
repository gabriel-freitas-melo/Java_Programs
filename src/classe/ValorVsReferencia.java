package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		int a = 2;
		int b = a; //Atribuição por valor (tipo primitivo)
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d = new Data();
		d.dia = 28;
		d.mes = 5;
		d.ano = 2000;
		
		Data d1 = d; //Atribuição por referencia(Objeto)
		d1.dia = 16; //Alterou o mesmo objeto usando d1 e d
		d.mes = 8;
		
		System.out.println(d.obterData());
	}
}
