public class Soln1 
{
    String lcp="",buff="";

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
                buff=buff+s.charAt(i);
            }
            else
            {
                break;
            }
        }
        lcp = buff;
        buff="";
    }    
}
