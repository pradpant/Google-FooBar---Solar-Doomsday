import java.util.*;
public class Main {

  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("Hello world!");
    int t=Integer.parseInt(sc.next());
     while(t-- > 0)
          {
        int a = Integer.parseInt(sc.next());
        int x[]= {};
        x=solution(a);
        System.out.println(Arrays.toString(x));
     }
    
  }

   public static int foundSqrt(float n)
    {
 
        float x = n;
        float y = 1;
        double e = 0.000001;
        while (x - y > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return (int)x;
    }
    public static int[] solution(int area) {
       int c=0;
       int gg=0;
        ArrayList<Integer> al= new ArrayList<Integer>();
       if(area<0 ||area>1000000)
          return 0;
       while(area!=0){
          c=foundSqrt(area);
          gg=c*c;
          if(c>0)
             al.add(gg);
          area=area-gg;
       }
       int b[]=new int[al.size()];
        for (int i = 0; i < al.size() ; i++)
        {
			    if(al.get(i)==0)
            break;
          b[i] = al.get(i);

        }
       return b;
    }
}