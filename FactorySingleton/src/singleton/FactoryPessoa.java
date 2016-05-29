package singleton;

public class FactoryPessoa {
	
	//implementando padr�o factory
	public Pessoa getPessoa(String nome, String sexo) {
		
		if(sexo.equals("M")) {
			return new Homem(nome);
		}else if(sexo.equals("F")) {
			return new Mulher(nome);
		}
		System.err.println("Erro");
		return null;
	}
	
	//implementando padr�o singleton
	private static FactoryPessoa uniqueInstance;
	
	private FactoryPessoa() {
		
	}
	
	public static synchronized FactoryPessoa getInstance() {
		
		if(uniqueInstance == null) {
			return new FactoryPessoa();
		}else {
			return uniqueInstance;
		}
	}
}
