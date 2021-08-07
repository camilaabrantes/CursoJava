package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		/*
		 Em um portal de cursos online, cada usuário possui um código único, representado por
		um número inteiro.
		Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
		matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
		é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
		alunos repetidos em mais de um curso.
		O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
		Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
		quantidade total e alunos dele, conforme exemplo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> alunosCodigoA = new HashSet<>();
		Set<Integer> alunosCodigoB = new HashSet<>();
		Set<Integer> alunosCodigoC = new HashSet<>();
		
		System.out.print("Quantos estudantes no curso A? ");
		int alunosA = sc.nextInt();
		for(int i=0; i<alunosA; i++) {
			alunosCodigoA.add(sc.nextInt());
		}
		
		System.out.print("Quantos estudantes no curso B? ");
		int alunosB = sc.nextInt();
		for(int i=0; i<alunosB; i++) {
			alunosCodigoB.add(sc.nextInt());
		}
		
		System.out.print("Quantos estudantes no curso C? ");
		int alunosC = sc.nextInt();
		for(int i=0; i<alunosC; i++) {
			alunosCodigoC.add(sc.nextInt());
		}
		
		Set<Integer> alunosCodigoTotal = new HashSet<>(alunosCodigoA);
		alunosCodigoTotal.addAll(alunosCodigoB);
		alunosCodigoTotal.addAll(alunosCodigoC);
		
		System.out.println("Total de alunos A: " + alunosCodigoA.size());
		System.out.println("Total de alunos B: " + alunosCodigoB.size());
		System.out.println("Total de alunos C: " + alunosCodigoC.size());
		System.out.println("Total de alunos Total: " + alunosCodigoTotal.size());
		
		sc.close();
	}

}
