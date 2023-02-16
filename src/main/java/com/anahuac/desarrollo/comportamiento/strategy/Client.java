package com.anahuac.desarrollo.comportamiento.strategy;

public class Client {

    public static void main(String[] args) {

        SortBehavior sb = new BurbujaSort();
        SortBehavior sb2 = new QuickSort();
        SortBehavior sb3 = new ShellSort();
        SortBehavior sb4 = new InsertionSort();

        NumList nums = new NumList();
        nums.setSb(sb);
        nums.setNums();
        nums.performSort();
        nums.display();

        NumList nums2 = new NumList();
        nums2.setSb(sb2);
        nums2.setNums();
        nums2.performSort();
        nums2.display();

        NumList nums3 = new NumList();
        nums3.setSb(sb3);
        nums3.setNums();
        nums3.performSort();
        nums3.display();

        NumList nums4 = new NumList();
        nums4.setSb(sb4);
        nums4.setNums();
        nums4.performSort();
        nums4.display();


    }
}
