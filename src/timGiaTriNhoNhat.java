public class timGiaTriNhoNhat {
    public static void main(String[] args) {
        int []array = {2,4,6,8,1,3};
        int min = minValue(array);
        System.out.println("giá trị nhỏ nhất trong mảng là: " + array[min]);
    }
    public static int minValue(int[] array) {
        int min = 0;
        for (int i =1 ;i< array.length;i++){
            if (array[i] < array[min]){
                min = i;
            }
        }
        return min;
    }
}