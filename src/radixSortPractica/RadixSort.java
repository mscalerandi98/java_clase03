package radixSortPractica;

import java.util.ArrayList;

public class RadixSort {
    public static void radixSort(int []arr)
    {
        String[] strArray = StringUtils.toStringArray(arr);
        //System.out.println(Arrays.toString(strArray));
        StringUtils.lNormalize(strArray,'0');
        ArrayList<String>[] lists = new ArrayList[10];
        int n = strArray[0].length();
        int arrLength = arr.length;

        for (int i = n -1; i >= 0; i--) {
            for (int j = 0; j < 10; j++) {
                lists[j] = new ArrayList<>();
            }
            //System.out.println(Arrays.toString(strArray));
            for (String number : strArray) {
                int j = Integer.parseInt(String.valueOf(number.charAt(i)));
                //System.out.println(j);
                lists[j].add(number);
            }
            strArray = listsToArray(lists, arrLength);
        }

        int[] output = StringUtils.toIntArray(strArray);

        for (int i = 0; i < arrLength; i++) {
            arr[i] = output[i];
        }
    }

    private static String[] listsToArray(ArrayList<String>[] lists, int n) {
        String[] output = new String[n];
        int i = 0;

        for (ArrayList<String> list : lists) {
            for (String elem : list) {
                output[i] = elem;
                i++;
            }
        }

        return output;
    }

    public static void main(String[] args)
    {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }
}
