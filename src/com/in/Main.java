package com.in;

public class Main {
    public static void product1(int arr[]){
        int leftArray[]=new int[arr.length];
        int rightArray[]=new int[arr.length];
        leftArray[0]=arr[0];
        rightArray[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            leftArray[i]=arr[i]*leftArray[i-1];
        }
        for(int i=arr.length-2;i>=0;i--){
            rightArray[i]=arr[i]*rightArray[i+1];
        }
        int ans[]=new int[arr.length];
        ans[0]=rightArray[1];
        ans[ans.length-1]=leftArray[arr.length-2];
        for(int i=1;i<arr.length-1;i++){
            ans[i]=leftArray[i-1]*rightArray[i+1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        product1(arr);
    }
}
