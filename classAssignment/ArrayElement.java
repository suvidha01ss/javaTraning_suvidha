import java.util.*;
class ArrayElement
{
    int[] arr={45,90,12,56,74,78,45,25,5,9,58,104};

    void findElement() {
        int largest=arr[0];
        int smallest=arr[0];

        System.out.println("Given Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
            if (arr[i]>largest){
                largest=arr[i];
            }
            else if(arr[i]<smallest) {
                smallest=arr[i];
            }
        }
        System.out.println("\nLargest Element: "+largest);

        System.out.println("Smallest Element: "+smallest);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayElement arrayElement=new ArrayElement();
        /*  System.out.println("Enter array Elements");
        int[] arr=scanner.nextInt();
        arrayElement.arr []=arr [];

         */
        arrayElement.findElement();
    }
}