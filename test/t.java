public class t{
  public static int volume(int height, int length, int width) {
    int volume = width * height * length;
    return volume;
  }
  public static void main(String args[]) {
    String str="not";
    int a=0;
int b=0;
  for (int i = 0; i < str.length()-1; i++) {
     if (str.substring(i,i+2).equals("is")){
        a++;
     }
  }
  System.out.println(a);
  for (int i = 0; i < str.length()-2; i++) {
     if (str.substring(i,i+2).equals("not")){
        b++;
     }
  }
  System.out.println(str.substring(0,3));
  System.out.println((a==b));
  }
  char c='a';
  String d=c;
}