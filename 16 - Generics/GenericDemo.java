// class Data<T> {
//     private T obj;

//     public void setData(T v) {
//         obj = v;
//     }

//     public T getData() {
//         return obj;
//     }

// }

// interface A {
// }

// class B implements A {
// }

// class C implements A {
// }

// @SuppressWarnings("unchecked")
// class MyArray<T extends A> {
//     T A[] = (T[]) new Number[10]; // casting Template to Object[]
//     int length = 0;

//     public void append(T v) {
//         A[length++] = v;
//     }

//     public void display() {
//         for (int i = 0; i < length; i++) {
//             System.out.println(A[i]);

//         }
//     }
// }

// class MyArray2<T> extends MyArray<String> {

// }

@SuppressWarnings("unchecked")
class MyArray<T> {
    T A[] = (T[]) new Object[10]; // casting Template to Object[]
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);

        }
    }
}

public class GenericDemo {

    // This function can take a generic type as input
    // static <E> void show(E[] list) {
    // for (E e : list) {
    // System.out.println(e);
    // }
    // }

    static void fun(MyArray<?> obj) {
        obj.display();
    }

    public static void main(String[] args) {

        // Data<String> data = new Data<String>();
        // data.setData("Hello");

        // Data<Integer> data = new Data<>();
        // data.setData(10);
        // System.out.println(data.getData());

        // MyArray<Integer> myArray = new MyArray<>();
        // myArray.append(10);
        // myArray.append(20);
        // myArray.append(30);

        // myArray.display();

        // MyArray2<String> ma = new MyArray2<>();
        // ma.append("Hello");
        // ma.append("World");
        // ma.append(10); // Error

        // MyArray<Float> m = new MyArray<>();
        // m.append(10.5f);
        // m.append(10f);
        // m.append(10.123f);

        // m.display();

        // MyArray<A> myArray = new MyArray<>();

        // show(new String[] { "Hi", "Go", "Bye" });
        // show(new Integer[] { 10, 20, 30 });

        MyArray<String> ma1 = new MyArray<>();

        ma1.append("Hello");
        ma1.append("World");

        MyArray<Integer> ma2 = new MyArray<>();
        ma2.append(10);
        ma2.append(20);

        fun(ma1);
        fun(ma2);

    }
}