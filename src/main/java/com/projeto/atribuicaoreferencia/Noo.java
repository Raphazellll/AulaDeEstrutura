package com.projeto.atribuicaoreferencia;

public class Noo<T> {

   private T conteudo;
   private Noo<T> proximoNoo;

   public Noo(String conteudo) {
       this.proximoNoo = null;
       this.conteudo = (T) conteudo;
   }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Noo<T> getProximoNo() {
        return proximoNoo;
    }

    public void setProximoNo(Noo<T> proximoNoo) {
        this.proximoNoo = proximoNoo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}

