package contaPetri;

public class Executor {

	 public static void informaDadosPessoais(Conta conta) {
	    	System.out.println("Nome do titular: "+ conta.getNome());
	    	System.out.println("Endereço de cobrança: "+ conta.getEndereco());
	    	System.out.println("CPF do titular: "+ conta.getCpf());
	    	System.out.println("Idade do titular: "+ conta.getIdade());
	    	System.out.println("Numero do titular: "+ conta.getNumeroCelular());
	    	System.out.println("Sálario informado: "+ conta.getSalario());
	    }
	
    public static void main(String[] args) {

        Conta conta1 = new Conta("Daniel", "Rua Ayrton Senna 1723", 00000000000, 21, 999999999, 1977.50, 1000, 1000000, "Corrente");
        informaDadosPessoais(conta1);

        Conta conta2 = new Conta("Ricardo", "Rua Antonio Fagundes 1999", 01111111111, 27, 977777777, 15250, 1001, 10.0, "Poupança");

        conta2.setEndereco("Avenida Higieanápolis 22");
        informaDadosPessoais(conta2);
        
        System.out.println(conta1.devolveTipoConta());
        System.out.println(conta2.devolveTipoConta());
        
    }
}
