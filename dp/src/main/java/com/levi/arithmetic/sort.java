/**
 * abssqr.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.levi.arithmetic;

import java.util.Arrays;

/**
 *
 * @author zhangliwei
 * @version com.levi.arithmetic: sort.java, v 0.1 2018-12-13 12:24 AM zhangliwei Exp $ 
 */
public class sort {

    /**
     * 插入排序
     * @param a
     * @param n
     * @return
     */
    private static int[] insertSort(int[] a,int n){
        //每次从无序的集合部分中选出第一个插入到有序的部分中

        for (int i=1;i<n;i++){
            //设置无序部分第一个数的值为value
            int value = a[i];
            //从尾部遍历有序部分,将大于value的值的下标都加一
            int j = i-1;
            for (;j>=0;j--){
                if (a[j]>value){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }

            a[j+1]=value;

        }

        return a;
    }


    public static void main(String args[]){
        int[] a = {6,5,4,3,2,1};
        int n = 6;
        System.out.println("排序前:"+Arrays.toString(a));
        int[] sorted = insertSort(a,n);
        System.out.println("排序后:"+Arrays.toString(sorted));
    }

}
