package com.projeto.atribuicaoreferencia;

public class No<T> {

   private T conteudo;
   private No<T> proximoNo;

   public No(String conteudo) {
       this.proximoNo = null;
       this.conteudo = (T) conteudo;
   }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}

