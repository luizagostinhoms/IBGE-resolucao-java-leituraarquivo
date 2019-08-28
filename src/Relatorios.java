import java.util.List;

public class Relatorios {

	public static void descobriCidadeComMaiorNAcidentes(List<Cidade> cidades) {
		Integer maiorNAcidentes = cidades.get(0).getQuantidadeVitimas();
		Cidade cidadeMaiorAcidadente = cidades.get(0);
		for (Cidade cidade : cidades) {
			if (maiorNAcidentes < cidade.getQuantidadeVitimas()) {
				maiorNAcidentes = cidade.getQuantidadeVitimas();
				cidadeMaiorAcidadente = cidade;
			}
		}
		System.out.println("\n------------------------------");
		System.out.println("\nA cidade com maior indíce de acidentes é: " + cidadeMaiorAcidadente.getCodigoCidade());
		System.out.println("\nO Nome da cidade com  maior indíce de acidentes é: " + cidadeMaiorAcidadente.getNomeCidade());
		System.out.println("\nE o número de acidentes é: " + cidadeMaiorAcidadente.getQuantidadeVitimas());
		
	}

	public static void descobriCidadeComMenorNAcidentes(List<Cidade> cidades) {
		Integer menorNAcidentes = cidades.get(0).getQuantidadeVitimas();
		Cidade cidadeMenorAcidadente = cidades.get(0);
		for (Cidade cidade : cidades) {
			if (menorNAcidentes > cidade.getQuantidadeVitimas()) {
				menorNAcidentes = cidade.getQuantidadeVitimas();
				cidadeMenorAcidadente = cidade;
			}
		}
		System.out.println("\n------------------------------");
		System.out.println("\nA cidade com menor indíce de acidentes é: " + cidadeMenorAcidadente.getCodigoCidade());
		System.out.println("\nO Nome da cidade com menor indíce de acidentes é: " + cidadeMenorAcidadente.getNomeCidade());
		System.out.println("\nE o número de acidentes é: " + cidadeMenorAcidadente.getQuantidadeVitimas());
		
	}

	public static void mediaVeiculosCidades(List<Cidade> cidades) {
		
		Integer totalVeiculos = 0;
		Integer numeroCidades = cidades.size();
		
		for (Cidade cidade : cidades) {
			totalVeiculos = totalVeiculos + cidade.getQuantidadeVeiculo();
		}
		
		Double mediaVeiculo = (double) (totalVeiculos / numeroCidades);
		System.out.println("\n------------------------------");
		System.out.println("\nA méida de veiculos nas cidades juntas é: " + mediaVeiculo);
	}

	public static void mediaAcidentesCidadesMenor2000Veiculos(List<Cidade> cidades) {
		
		Integer totalAcidenteTransito = 0;
		Integer countCidadesMenor2000 = 0;
		for (Cidade cidade : cidades) {
			if(cidade.getQuantidadeVeiculo() < 2000) {
				totalAcidenteTransito = totalAcidenteTransito + cidade.getQuantidadeVitimas();
				countCidadesMenor2000++;
			}
		}
		
		Double mediaAcidenteTransito = (double) (totalAcidenteTransito / countCidadesMenor2000);
		
		System.out.println("\n------------------------------");
		System.out.println("\nA méida de acidentes de trânsito em cidades com menos de 2000 veículos é: " + mediaAcidenteTransito);
	}

}
