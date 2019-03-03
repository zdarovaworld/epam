package homework1234.travelagency_v3.common;

public final class ArrayUtils {

    private ArrayUtils(){
    }

    public static void removeElement(Object[] arr, int index) {
        System.arraycopy(arr, index + 1, arr, index, arr.length - 1 - index);
    }
}
