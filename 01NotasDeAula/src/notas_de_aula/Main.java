package notas_de_aula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		System.out.println("Hello World");

		double x = 32.033333;

		System.out.printf("%.2f \n", x);

		System.out.println("Boa Tarde");

		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f \n", product1, price1);
		System.out.printf("%s, which price is $ %.2f \n", product2, price2);
		System.out.printf("Record: %d, years old, code %d and gender %c\n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f \n", measure);

		String nome;

		// System.out.println("Digite um nome:");
		// nome = sc.next();

		// System.out.printf("Você digitou: %s \n", nome);

		// String g;
		// int y;
		// double z;
		// char teste;
		// g = sc.next();
		// y = sc.nextInt();
		// z = sc.nextDouble();
		// teste = sc.next().charAt(0);

		// sc.nextLine(); --ler o texto até quebra de lina

		double y = 4;
		double A = Math.sqrt(x); // Variável A recebe a raiz quadrada de x
		A = Math.pow(x, y); // Variável A recebe o resultado de x elevado a y
		A = Math.abs(x);

		// expressão condicinal ternaria (condição) ? valor se verdadeiro : valor se
		// falso;

		System.out.println((2 > 4) ? 50 : 80);

		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		String s = "potato apple lemon";
		String[] vect = s.split(" "); // usando o espaço como separador
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

		System.out.println(s);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);

		/*
		 * laço for each
		 * 
		 * for (Tipo apelido : coleção) { <comando 1> <comando 2> }
		 */

		// LISTAS

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size());
		for (String J : list) {
			System.out.println(J);
		}
		System.out.println("---------------------");
		list.removeIf(a -> a.charAt(0) == 'M');
		for (String h : list) {
			System.out.println(h);
		}
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //SE NÃO ENCONTRA RETORNA -1
		System.out.println("---------------------");
		List<String> result = list.stream().filter(r -> r.charAt(0) == 'A').collect(Collectors.toList()); //cRIA UMA LISTA COM TODOS OS NOMES QUE COMEÇAM COM A
		for (String g : result) {
			System.out.println(g);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(o -> o.charAt(0) == 'J').findFirst().orElse(null); //ACHA O PRIMEIRO ELEMENTO Q COMEÇA COM j
		System.out.println(name);
		
		
		//DATAS
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
		//Usando o calendar
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date d2 = new Date();
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(d2));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);//adicionando 4 horas ao horario
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);//começa contando o mês de janeiro como 0
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

		sc.close();
		
		/*
		 * Classe abstrattas não podem ser instanciadas
		 * Metodos abstratos são metodos que não possuem implementação
		 * um metodo abstrato só pode existir em uma classe abstrata
		 * 
		 */

	}

}
