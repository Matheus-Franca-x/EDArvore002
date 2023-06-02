package view;

import model.matheus.libArvoreInt.ArvoreInt;

public class Main {

	public static void main(String[] args) 
	{
		int[] vet = {12, 4, 16, 2, 8, 6};
		
		
		ArvoreInt arvore = new ArvoreInt();
		
		for (int each : vet)
			arvore.insert(each);
		
		try {
			arvore.prefixSearch();
			System.out.println("\n");
			arvore.infixSearch();
			System.out.println("\n");			
			arvore.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
