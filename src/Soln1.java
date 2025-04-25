public class Soln1 
{
    String lcp="",buffer="";

    void lcp_finder(String s)
    {
        if(lcp.equals(""))
        {
            lcp=s;
        }
        
        for(int i=0; i<Math.min(s.length(), lcp.length()); i++)
        {
            if(lcp.charAt(i)==s.charAt(i))
            {
                buffer=buffer+s.charAt(i);
            }
            else
            {
                break;
            }
        }
        if(buffer.equals(""))
        {
            System.out.println("no common prefix found");
            System.exit(1);
        }
        
        lcp = buffer;
        buffer="";
    }    
}
