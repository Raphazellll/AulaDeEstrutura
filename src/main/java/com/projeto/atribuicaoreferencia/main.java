package com.projeto.atribuicaoreferencia;

public class main {

    public static void main(String[] args) {

       Noo<String> noo1 = new Noo<String>("Conteúdo no1");

       Noo<String> noo2 = new Noo<String>("Conteúdo no2");

       noo1.setProximoNo(noo2);

       Noo<String> noo3 = new Noo<String>("Conteúdo no3");

       noo2.setProximoNo(noo3);

       Noo<String> noo4 = new Noo<String>("Conteúdo no4");

       noo3.setProximoNo(noo4);


    System.out.println(noo1);
    System.out.println(noo1.getProximoNo());
    System.out.println(noo2);
    System.out.println(noo2.getProximoNo());


    //no1 -> no2 -> no3 -> no4 -> null
    }
}
