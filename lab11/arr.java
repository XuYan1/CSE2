public class arr{
    public static void sort(int[] a){
        int[] b=new int[a.length]; // Declares the difference array
        int[] c=new int[a.length]; // Declares the sorting output array
        for(int h=0;h<a.length;h++){    // fills the sorting output array with a dummy number
            c[h]=-1;
        }
        int count=0;                    // initializes the position counter
        for (int i=0;i<a.length;i++){   
            for (int j=0;j<a.length;j++){
                b[j]=a[j]-a[i];         // creating the difference array for each element in a
                if(b[j]<0){count++;}
            }
            while(c[count]==a[i]){count++;} // placing the element selected into the correct position
            c[count]=a[i];
            count=0;
        }
        for (int k=0;k<a.length;k++){
            System.out.print(c[k]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        int[] a1=new int[20];
        int[] a2=new int[10];
        int[] a3=new int[30];
        for(int i=0;i<a1.length;i++){
            a1[i]=(int)(Math.random()*100);
        }
        System.out.println("Sorted array 1: ");
        sort(a1);
        for(int i=0;i<a2.length;i++){
            a2[i]=(int)(Math.random()*100);
        }
        System.out.println("Sorted array 2: ");
        sort(a2);
        for(int i=0;i<a1.length;i++){
            a3[i]=a1[i];
        }
        for(int j=0;j<a2.length;j++){
            a3[j+20]=a2[j];
        }
        System.out.println("Sorted array 3: ");
        sort(a3);
    }
}