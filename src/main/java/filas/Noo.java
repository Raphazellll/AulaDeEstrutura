package filas;

public class Noo<T> {

    private T object;
    private Noo<T> refNoo;


    public Noo(){

    }
    public Noo(T object){
        this.refNoo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Noo getRefNoo() {
        return refNoo;
    }

    public void setRefNoo(Noo refNoo) {
        this.refNoo = refNoo;
    }

    @Override
    public String toString() {
        return "Noo{" +
                "object=" + object +
                '}';
    }
}
