package praticas.interfacesELambdas;

public class EquipeVendas extends Funcionario {
	
	double percentual = 0.05; // apliquei um percentual de comissão maior para equipe de vendas em relação ao ADM.
	
	public EquipeVendas(double salarioFunc, double venda){
		super(salarioFunc, venda);
			
	}
	
	public double getComissao() {
		
		return getVenda()*percentual;
	}
	
	public double calcularSalario() { // usando o mesmo método para calcular o salario, porém sobrescrevendo o método com o novo percentual.
		
		if(getVenda() > 0) {
			setTotal(this.getSalarioFunc() + (getVenda()*percentual));
			return getSalarioFunc() + (getVenda()*percentual); 
				
		} else {
			setTotal(getSalarioFunc());
			return getSalarioFunc();
		}
			
	}
	
	
	
	
	
}
