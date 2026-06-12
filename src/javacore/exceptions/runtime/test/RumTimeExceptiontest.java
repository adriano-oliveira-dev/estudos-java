package javacore.exceptions.runtime.test;

public class RumTimeExceptiontest {
    public static void main(String[] args) {
         // Checked and Unchecked

        int[] nums = {1,2};
        System.out.println(nums[2]);

        Object object = null;
        System.out.println(object.toString());
    }
}
