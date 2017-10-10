package cn.lbw;

import java.util.Arrays;

/**
 * Created by Bowei Liu on 2017/10/10.
 * 归并排序
 */
public class MergeSort {

    static int number;
    public static void main(String[] args) {

        double []test = {2,3,1,4,5,8,6,7,3,2};
        sort(test,0,test.length-1);


    }

    public static void sort(double []arrary , int low , int high){

        int mid = ( low + high ) / 2 ;
        if(low >= high)
            return;

        sort(arrary,low,mid);
        sort(arrary,mid+1 , high);

        merge(arrary,low,mid,high);


    }

    private static void merge(double[] a, int left, int mid, int right) {

        double[] tmp = new double[a.length];
        int r1 = mid + 1;
        int t = left;
        int c=left;

        while(left <=mid && r1 <= right) {
            if (a[left] <= a[r1])
                tmp[t++] = a[left++];
            else
                tmp[t++] = a[r1++];
        }
        // 左边
        while (left <=mid) {
            tmp[t++] = a[left++];
        }
        // 右边
        while ( r1 <= right ) {
            tmp[t++] = a[r1++];
        }




        System.out.println("第"+(++number)+"趟排序:\t");
        // TODO Auto-generated method stub

        while(c<=right){
            a[c]=tmp[c];

            System.out.print(a[c]+"\t");
            c++;
        }
        System.out.println();
    }
}
