package filas;

import com.pilha.No;

public class Fila<T> {

    private Noo<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public T first(){
        if(!this.isEmpty()){
            Noo primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNoo() != null){
                    primeiroNo = primeiroNo.getRefNoo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    public void enqueue(T obj) {
        Noo novoNoo = new Noo(obj);
        novoNoo.setRefNoo(refNoEntradaFila);
        refNoEntradaFila = novoNoo;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            Noo primeiroNo = refNoEntradaFila;
            Noo noAuxiliar = refNoEntradaFila;

            while (true){
                if(primeiroNo.getRefNoo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNoo();
                }else{
                    refNoEntradaFila.setRefNoo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        Noo noAuxuliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxuliar.getObject() + "}] -------->";
                if(noAuxuliar.getRefNoo() != null){
                    noAuxuliar = noAuxuliar.getRefNoo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
