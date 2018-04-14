package model;

public class Conta {

	
	private int idconta;
	private int idcliente;
	private String numeroconta;
	private String agenciaconta;
	private String tipoconta;
	
	
	
	
	
	
	
	
	public Conta( int idconta, int idcliente, String numeroconta, String agenciaconta, String tipoconta) {
		super();
		this.idcliente = idcliente;
		this.idconta = idconta;
		this.numeroconta = numeroconta;
		this.agenciaconta = agenciaconta;
		this.tipoconta = tipoconta;
	}
	
	
	
	
	
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getIdconta() {
		return idconta;
	}
	public void setIdconta(int idconta) {
		this.idconta = idconta;
	}
	public String getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(String numeroconta) {
		this.numeroconta = numeroconta;
	}
	public String getAgenciaconta() {
		return agenciaconta;
	}
	public void setAgenciaconta(String agenciaconta) {
		this.agenciaconta = agenciaconta;
	}
	public String getTipoconta() {
		return tipoconta;
	}
	public void setTipoconta(String tipoconta) {
		this.tipoconta = tipoconta;
	}
	
	
	
	
	
	
	
	
	
}
