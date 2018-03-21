package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import pessoa.Funcionario;

public class Cadastro {

	public static void main(String[] args) {
			
		Funcionario fu = null; /*CHAMANDO A CLASSE FUNCIONARIO*/
		String a; /* STRING PARA REFERENCIAR UMA ESCOLHA DENTRO DA REPETICAO*/
		
		/*REPETICAO DO - WHILE*/
		do {
			
		Object [] choice = {"Formulario", "Exit"};		/*OBJETO PARA POSSIVEIS ESCOLHAS*/	
		/*CAIXA DE ESCOLHAS PARA O USUARIO*/
		a = (String)JOptionPane.showInputDialog(null, "*Cadastro*", "Caixa de Dialogo", 
								JOptionPane.QUESTION_MESSAGE, null, choice, null);	
		
		/*RESTRICOES*/
		switch (a) { 
		case "Formulario":
			
			/*FUNCIONARIO (ID, NOME, SETOR), USANDO INSERÇAO DE DADOS POR INTERFACE*/
			fu = new Funcionario(null, JOptionPane.showInputDialog("Insira um nome: "), JOptionPane.showInputDialog("Insira um setor: ")) ;	
			break;	
			
		}	
		
		/*CONEXAO COM O BD*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresadb");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		/*COLOCAR OS DADOS SALVOS EM FU NO BD*/
		em.persist(fu);
		
		/*ENCERRANDO CONEXAO*/
		em.getTransaction().commit();
		em.close();
		emf.close();	
		
		/*RESTRICAO PARA QUE OCORRA OU NAO UMA REPETICAO */
		} while (!a.equals("Exit"));		
	}
}
