public class t{
 public static void main(String[] args){
int[] array1=new int[10];

      int[] array2=new int[5];

      for(int i=0;i<10;i++){

         array1[i]=(int)(Math.random()*22);

         System.out.println(array1[i]);

      }

      for(int j=0;j<5;j++){

         array2[j]=array1[j*2];

         System.out.println(array2[j]);

      }
    }
}