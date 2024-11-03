package banco;

public class Cliente {
	private int    numero;
    private String nome;
    private String cpf;
    
    public Cliente(int numeroCliente, String nomeCliente, String cpfCliente) {
    	numero = numeroCliente;
        nome   = nomeCliente;
        cpf    = cpfCliente;
    }
    
    public int getNumero() {
    	return numero;
    }

    public void setNumero(int numeroCliente) { 
    	this.numero = numeroCliente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nomeCliente) {
        this.nome = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpfCliente) {
        this.cpf = cpfCliente;
    }
}

