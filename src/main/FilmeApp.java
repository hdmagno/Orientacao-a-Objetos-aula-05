package main;

import entity.Filme;
import persistence.FilmeDao;

public class FilmeApp {

	public static void main(String[] args) {

		FilmeDao fDao = new FilmeDao();
		
		Filme ef2 = new Filme(null, "O Exterminador do Futuro 2", "Ação", 40D, "https://vignette.wikia"
				+ ".nocookie.net/exterminadordofuturo/images/b/bd/Terminator2"
				+ ".jpg/revision/latest?cb=20150731181909&path-prefix=pt-br");
		
		
		try {
			fDao.create(ef2);
			System.out.println("Salvo no Banco de Dados...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			fDao.findAll().stream().forEach(x -> System.out.println(x.getNome() + ", " + x.getPreco()));
			System.out.println("Ok...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
