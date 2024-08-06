package std_generic;

public class GenericClass<T> {
    T object;

    public GenericClass(T object) {
        this.object = object;
    }

    void genericType() {
        System.out.println(object.getClass().getName());
    }


}

class GenericClass2 <T, V> {
    T obj;
    V obj2;

    public GenericClass2 (T obj, V obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    void genericType() {
        System.out.println(obj.getClass().getName());
        System.out.println(obj2.getClass().getName());
    }
}

class main{

    public static void main (String[] args) {

       /* GenericClass<Integer> generic1 = new GenericClass<>(10);
        GenericClass<Doubble> generic2 = new GenericClass<>(10.0);

        generic1.genericType();
        generic2.genericType();*/

    }

}
