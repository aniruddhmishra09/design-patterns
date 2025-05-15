package util;

public class PrintObjectDetailsUtils {
    public static void print(String name, Object obj){
        System.out.printf("Class name %s with hashcode %d%n", name, obj.hashCode() );
    }
}
