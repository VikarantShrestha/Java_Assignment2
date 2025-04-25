public class Soln1_main 
{
    public static void main(String arg[])
    {
        Soln1 ob = new Soln1();
       String[] arr={"temperature","temps","tempo","temper"};

       for(int i=0; i<arr.length; i++)
       {
            ob.lcp_finder(arr[i]);
       }
       
       System.out.println(ob.lcp);
    }
}
