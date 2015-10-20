public class Average {
        public static void main(String args[]) {
             int f=0;
for (int i=10;i<=100;i++){
     for (int d=2;d<i;d++){
          if (i%d == 0){
               f++;
          }
     }
     if (f==0){
          System.out.println(i);
     }
     f=0;
}
}
}