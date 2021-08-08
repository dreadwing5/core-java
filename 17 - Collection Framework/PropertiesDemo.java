import java.util.*;
import java.io.*;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties props = new Properties();

        props.setProperty("Brand", "Dell");
        props.setProperty("Model", "XPS");
        props.setProperty("Price", "3000");
        props.setProperty("Color", "Black");
        props.setProperty("Year", "2010");
        props.setProperty("VIN", "123456789");

        System.out.println(props);

        try {
            props.store(new FileOutputStream("./MyData.txt"), "Laptop");
            props.storeToXML(new FileOutputStream("./MyData.xml"), "Laptop");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

        // read the properties from xml file
        // try {
        // props.loadFromXML(new FileInputStream("./MyData.xml"));
        // System.out.println(props);
        // } catch (IOException e) {

        // e.printStackTrace();
        // }
    }

}
