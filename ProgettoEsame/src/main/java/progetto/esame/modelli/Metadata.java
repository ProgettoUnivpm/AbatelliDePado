package progetto.esame.modelli;




public class Metadata 
{
	public String tipo;
	public String nome;
	
	public Metadata(String nome, String tipo)
	{
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
