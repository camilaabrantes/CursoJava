package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Coment;
import entities.Post;

public class ExercicioResolvido02 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os
		//na tela do terminal, conforme exemplo.
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Post post = new Post(sdf.parse("21/06/2018"), "Titulo", "comentario", 12);
		
		Coment c1 = new Coment("comentario 01");
		post.addComents(c1);
		Coment c2 = new Coment("comentario 02");
		post.addComents(c2);
		
		System.out.println(post);
		System.out.println(post.getComents()); //imprme a lista
		
		sc.close();
	}

}
