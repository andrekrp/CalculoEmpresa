package com.serasa.empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculoEmpresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculoEmpresaApplication.class, args);
		
		Empresa emp1 = new Empresa(16/06/2020, "Senior", "Rua Sao pedro", 165, "Araponguinhas", "3333-2707", null);
		
		
		Nota n1 = new Nota(null, 51.00);
	    Nota n2 = new Nota(null, 1.00);
	    Nota n3 = new Nota(null, 1.00);
	    Nota n4 = new Nota(null, 1.00);
	    Nota n5 = new Nota(null, 1.00);
	    Nota n6 = new Nota(null, 1.00);
	    Nota n7 = new Nota(null, 1.00);
	    Nota n8 = new Nota(null, 1.00);
	    Nota n9 = new Nota(null, 1.00);
	    Nota n10 = new Nota(null, 1.00);
		Integer Soma = (int) (n1.getNota() + n2.getNota() + n3.getNota()+ n4.getNota() + n5.getNota() +
				n6.getNota() + n7.getNota() + n8.getNota() + n9.getNota() + n10.getNota());
	
		
		Confiabilidade comf1 = new Confiabilidade(null,52.00 );
		Confiabilidade comf2 = new Confiabilidade(null,2.00 );
		Confiabilidade comf3 = new Confiabilidade(null,2.00 );
		Confiabilidade comf4 = new Confiabilidade(null,2.00 );
		Confiabilidade comf5 = new Confiabilidade(null,2.00 );
		Confiabilidade comf6 = new Confiabilidade(null,2.00 );
		Confiabilidade comf7 = new Confiabilidade(null,2.00 );
		Confiabilidade comf8 = new Confiabilidade(null,2.00 );
		Confiabilidade comf9 = new Confiabilidade(null,2.00 );
		Confiabilidade comf10 = new Confiabilidade(null,2.00 );
		
		Integer TotalConfiabilida =  (int) (comf1.getConfiabilidade() + comf2.getConfiabilidade() + comf3.getConfiabilidade() 
		+ comf4.getConfiabilidade() + comf5.getConfiabilidade() + comf6.getConfiabilidade() + comf7.getConfiabilidade() + comf8.getConfiabilidade()
		+ comf9.getConfiabilidade()+ comf10.getConfiabilidade());
		
		
		
		Integer Pendencia = Soma - 2;
		
		
		
		
		System.out.println("A empresa:" + emp1 + "Soma das Notas: " + Soma + " Seu Grau de Confiabilidade é de :" + TotalConfiabilida 
				+ "  A Sua pendencia é: " + Pendencia );
		
		
	}

}
