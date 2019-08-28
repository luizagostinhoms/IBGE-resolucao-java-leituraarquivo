import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * No java tudo é classe, então fiz uma classe RunnerApp, com o objetivo de rodar a aplicação
 * 
 *  a execução irá partir do main.
 * 
 * */
public class RunnerApp {

	// assim como no C, temos um método main para rodar aplicação, a partir daqui ele começa a executar o App.
	public static void main(String[] args) {
		
		
		List<Cidade> cidades = popularDadosCidade();
		
		for (Cidade cidade : cidades) {
			System.out.println(cidade);
		}
		
		Integer menu = 6;
		Scanner valorMenu = new Scanner(System.in);
		
		while (menu != 0) {
			imprimirMenuDeInformacoes();
			menu = valorMenu.nextInt();
			switch (menu) {
			case 1:
				Relatorios.descobriCidadeComMaiorNAcidentes(cidades);
				break;
			case 2:
				Relatorios.descobriCidadeComMenorNAcidentes(cidades);
				break;
			case 3:
				Relatorios.mediaVeiculosCidades(cidades);
				break;
			case 4:
				Relatorios.mediaAcidentesCidadesMenor2000Veiculos(cidades);
				break;
			case 5:
				imprimirCidades(cidades);
				break;
			case 0:
				System.out.println("\nSaindo da aplicação");
				break;
			default:
				System.out.println("\nValor inválido");
				break;
			}
		}
		
	}

	private static void imprimirCidades(List<Cidade> cidades) {
		for (Cidade cidade : cidades) {
			System.out.println(cidade);
		}
		
	}

	private static void imprimirMenuDeInformacoes() {
		System.out.println("\n\n----RELATÓRIOS----- \n\n");
	    System.out.println("\nDigite a opção desjada para: ");
	    System.out.println("\n1 - DESCOBRIR CIDADE COM MAIOR NUMERO DE ACIDENTES: ");
	    System.out.println("\n2 - DESCOBRIR CIDADE COM MENOR NUMERO DE ACIDENTES: ");
	    System.out.println("\n3 - MÉDIA DE VEICULOS ENTRE AS CIDADES: ");
	    System.out.println("\n4 - MÉDIA DE ACIDENTES ENTRE AS CIDADES COM MENOS DE 2000 VEICULOS: ");
	    System.out.println("\n5 - LISTAR TODAS AS CIDADE: ");
	    System.out.println("\n0 - SAIR DA APLICAÇÃO: ");
	    System.out.println("\nopção:");
	}


	private static List<Cidade> popularDadosCidade() {
		
		List<Cidade> cidades = new ArrayList<Cidade>();
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("CIDADE.txt"));
			while(br.ready()){
			
				String linha = br.readLine();
				Cidade cidade = new Cidade();
				
				String[] linhaCidade = linha.split(";");
				cidade.setCodigoCidade(Integer.valueOf(linhaCidade[0]));
				cidade.setNomeCidade(linhaCidade[1]);
				cidade.setQuantidadeVeiculo(Integer.valueOf(linhaCidade[2]));
				cidade.setQuantidadeVitimas(Integer.valueOf(linhaCidade[3]));
				
				cidades.add(cidade);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cidades;
	}
}
