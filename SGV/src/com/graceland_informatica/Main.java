package com.graceland_informatica;

import java.time.Instant;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here


        System.out.printf("BEM VINDO ! Faça o seu Login \n");
        System.out.print("__________________________________________________________\n");
        System.out.printf("NOME:\n");
        System.out.printf("PASSWORD:");
        int password;
        String nomex;
        Scanner entradax = new Scanner(System.in);
        nomex=entradax.next();
        Scanner entaradadf = new Scanner(System.in);
        password = entaradadf.nextInt();

        if (entradax.equals("Almeida") ||  entaradadf.equals(12345)){
            System.out.print("ACESSO CONCEBIDO");
        }
        else {
            System.err.print("Acesso Negado !");
        }

        String nome;
        int idade;
        int datanascimento;
        int anonascimento;
        String morada;
        ArrayList<String> listaNomes = new ArrayList<String>();
        ArrayList<Integer> listaIdades = new ArrayList<Integer>();
        ArrayList<Integer> listaDatanascimento = new ArrayList<Integer>();
        ArrayList<Integer> listaAnonascimento = new ArrayList<Integer>();
        ArrayList<String> listaMoradas = new ArrayList<String>();
        System.out.println("OS PASSOS A SEGUIR SÃO OBRIGATÓRIO PREENCHER\n" +
                "---------------------------------------------------------------------------");
        System.out.println("Data Actual:" + Date.from(Instant.now()));
        System.out.println("\nIntroduza O nome: ");

         Integer conteudo;
         for (conteudo = 0; conteudo < 1000000000; conteudo++) {

            {
                Scanner entrada = new Scanner(System.in);
                nome = entrada.next();

                listaNomes.add(nome);
            }

            try {

                System.out.printf(

                        "---------------------------------------------------------------------------\n");
                System.out.println("Introduza  A idade: ");
                Scanner entrada2 = new Scanner(System.in);
                idade = entrada2.nextInt();
                listaIdades.add(idade);
                System.out.printf(
                        "---------------------------------------------------------------------------\n");
                System.out.println("Introduza a Data de Nascimento :");
                Scanner entrada3 = new Scanner(System.in);
                datanascimento = entrada3.nextInt();
                listaDatanascimento.add(datanascimento);
                System.out.printf(
                        "---------------------------------------------------------------------------\n");
                System.out.println("Introduza o Ano de Nascimento");
                Scanner entrada4 = new Scanner(System.in);
                anonascimento = entrada4.nextInt();
                listaAnonascimento.add(anonascimento);
                System.out.printf(
                        "---------------------------------------------------------------------------\n");
                System.out.println("Introduza a Morada Actual : ");
                Scanner entrada5 = new Scanner(System.in);
                morada = entrada5.next();
                listaMoradas.add(morada);
                System.out.printf(
                        "---------------------------------------------------------------------------\n");
              
                System.out.println("Cadastro feito com Sucesso ! ");
                for (String listaN : listaNomes) {
                    System.out.println("NOME: " + listaN);

                    for (int listaID : listaIdades)
                        System.out.println("IDADE: " + listaID);
                        for (int listaDAT : listaDatanascimento)
                            System.out.println(" DATA DE NASCIMENTO:" + listaDAT);
                            for (int listaAn : listaAnonascimento)
                                System.out.println("ANO DE NASCIMENTO: " + listaAn);
                                for (String listaM : listaMoradas)
                                    System.out.println("MORADA : " + listaM);

                        }
                        System.out.printf("\nLISTAS A MOSTRAR");
                        System.out.println("Lista Ano Nascimento: " + listaAnonascimento.size());
                        System.out.println("Lista Data Nascimento:" + listaDatanascimento.size());

                    System.out.println("Lista de Idades : " + listaIdades.size());
                    System.out.println("Lista de Nomes: " + listaNomes.size());
                    System.out.printf("Lista De Moradas: " + listaMoradas.size());
                    System.out.printf("\n", "NOVO CADASTRO !" +
                            "----------------------------------------------------------------------");

            } catch (InputMismatchException e) {
                System.err.println("Ocorreu um ERRO !");
                
            }catch (Exception e){
                                                   System.err.print("Erro" );
            }
        }
    }

}
