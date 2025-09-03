public class MergeArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};

        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length); 
        System.arraycopy(b, 0, c, a.length, b.length);
        for (int i : c) {
            System.out.print(i + " ");
        }
    }
}