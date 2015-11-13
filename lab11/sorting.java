public class sorting{
    public static void sort(int[] arr){
        int max,index,sub;
        int j;
        for(j=arr.length;j>1;j--){
            max=0; index=0; sub=0;
            for(int i=0;i<j;i++){
                if(arr[i]>max){max=arr[i]; index=i;}
            }
            sub=arr[j-1];
            arr[j-1]=max;
            arr[index]=sub;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        int[] a=new int[20];
        int[] b=new int[20];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        sort(a);
    }
}