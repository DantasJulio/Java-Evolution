package praticas.interfacesELambdas;

public class FolhaMain {
	
	public static void main(String[] args) {
		
		Adm funcionario1 = new Adm(1500, 50000);
		funcionario1.calcularSalario();
		Adm funcionario2 = new Adm(1500, 35000);
		funcionario2.calcularSalario();
		Adm funcionario3 = new Adm(1500, 42000);
		funcionario3.calcularSalario();
		
		System.out.println(funcionario1.calcularSalario());
		System.out.println(funcionario2.calcularSalario());
		System.out.println(funcionario3.calcularSalario());
		System.out.println(Adm.getTotal());
		
		EquipeVendas funcionario4 = new EquipeVendas(1300, 450000);
		EquipeVendas funcionario5 = new EquipeVendas(1300, 300000);
		EquipeVendas funcionario6 = new EquipeVendas(1300, 100000);
		
		System.out.println(funcionario4.calcularSalario());
		System.out.println(funcionario5.calcularSalario());
		System.out.println(funcionario6.calcularSalario());
		System.out.println(EquipeVendas.getTotal());
		
		FolhaSalarial folha = () -> { // 
			
			return funcionario1.getSalarioFunc() + funcionario1.getComissao();
		};
		
		folha = () -> funcionario2.getSalarioFunc() + funcionario2.getComissao();
		
		folha = () -> funcionario3.getSalarioFunc() + funcionario3.getComissao();
		
		
	}

}
