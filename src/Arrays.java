public class Arrays {
    public static void main(String[] args) {
        int myArray[]={10,11,12,13,14,15};
        System.out.println(myArray); //only calls the memory address of array
        System.out.println(myArray[0]);
        System.out.println(myArray.length );

//---------------------------------------------------------
        System.out.println("Find 2nd smallest number in an array");
        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){  //compare 1st and 2nd element in array
                    temp = array[i];    //if 1st is greater than 2nd means swap the element,and so on
                    array[i] = array[j];
                    array[j] = temp;
                }
            } //after sorting of array in a ascending order,print the 2nd smallest element
        }
        System.out.println("2nd Smallest element of the array is: "+array[1]);

    }
}
