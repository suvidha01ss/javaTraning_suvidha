class Loop{
    void display() {
        int arr1[] = new int[5];
        System.out.println("array1");
        for (int i = 0; i < arr1.length; i = i + 1) {

            arr1[i] = i + 1;
            System.out.print(" " + arr1[i]);

        }
        System.out.println(" \narray2");
        int arr2[] = {10, 20, 30, 40, 20, 60, 80};
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(" " + arr2[j]);
        }
    }
}