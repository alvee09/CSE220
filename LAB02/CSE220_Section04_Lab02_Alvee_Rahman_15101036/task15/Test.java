public class Test{
  public static int [] removeOdd (int [] input){
    int newLength=0;
   for(int i=0; i<input.length; i++)
   {
     if(input[i]%2==0)
     {
       newLength++;
     }
   }
   int [] array2= new int[newLength];
   int i=0;
   while(i<array2.length)
   {
     
     for(int x=0; x<input.length; x++)
     {
       if(input[x]%2==0)
       {
         array2[i]=input[x];
         i++;
       }
     }
   }
   return array2;
  }
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}
