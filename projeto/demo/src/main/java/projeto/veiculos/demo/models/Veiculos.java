package projeto.veiculos.demo.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Veiculos {

	
	private long codigo;
	
	private String nome;
	
	private String marca;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
