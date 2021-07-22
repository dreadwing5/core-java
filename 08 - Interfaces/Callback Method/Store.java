public class Store {

    IMember mem[] = new IMember[100]; // Array of object
    int count = 0; // Number of objects in the array

    void register(IMember m) {

        mem[count++] = m; // Add the object to the array
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callBack(); // Call the customer's callback
        }

    }

}
