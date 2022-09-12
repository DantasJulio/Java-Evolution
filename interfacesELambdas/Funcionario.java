package praticas.interfacesELambdas;

import java.util.ArrayList;
import java.util.List;

public class Funcionario implements FolhaSalarial{
		
	private final double percentual = 0.02;
	private double salarioFunc;
	private double venda; 
	private static double total;
	
	List<Funcionario> qtdFunc = new ArrayList<>();
	
	public Funcionario(double salarioFunc, double venda){
		
		setSalarioFunc(salarioFunc);
		setVenda(venda);
		
	}
	
	public void setQtdFunc(int qtdFunc) {
		this.qtdFunc.add(new Funcionario(this.salarioFunc, this.venda));
	}

	public double getSalarioFunc() {
		return salarioFunc;
	}

	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}
		
	public static double getTotal() {
	
		return total;
	}

	public void setTotal(double total) {
		
			this.total += total;
				
	}
	
	public double getComissao() {
		
		return getVenda()*percentual;
	}

	public double calcularSalario() {
		
		if(venda > 0) {
			setTotal(salarioFunc + (venda*percentual));
			return salarioFunc + (venda*percentual); 
				
		} else {
			setTotal(salarioFunc);
			return salarioFunc;
		}
			
	}
	
}
