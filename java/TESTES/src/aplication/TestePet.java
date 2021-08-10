package aplication;

import entities.Ave;
import entities.Cachorro;
import entities.Gato;
import entities.Pet;

public class TestePet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet animal1 = new Pet("Vira-lata Caramelo", 2019);
		animal1.setPorte('M');
		
		System.out.println(animal1.getRaca());
		System.out.println(2021 - animal1.getAnoNascimento());
		animal1.emiteSom();
		System.out.println();
		
		
		Cachorro animal2 = new Cachorro("Collie", true);
		Gato animal3 = new Gato("Persa",2018, false);
		Ave animal4 = new Ave("Canário",2020, true);
		
		animal2.setAnoNascimento(2017);
		
		System.out.println(animal2.getRaca() +" - "+ animal2.idade());
		System.out.println(animal3.getRaca() +" - "+ animal3.idade());
		
		animal2.emiteSom();
		System.out.println();
		animal3.emiteSom();
		
	}

}
