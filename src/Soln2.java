public class Soln2 
{
    boolean hasDigit(char str[])
    {
        for(int i=0; i<str.length; i++)
        {
            if(Character.isDigit(str[i]))
            {
                return true;
            }
        }
        return false;
    }

    boolean hasCapital(char str[])
    {
        for(int i=0; i<str.length; i++)
        {
            if(Character.isUpperCase(str[i]))
            {
                return true;
            }
        }
        return false;
    }

    boolean checkSpaceAndSlash(char str[])
    {
        for(int i=0; i<str.length; i++)
        {
            if(str[i]==' ' || str[i]=='/')
            {
                return false;
            }
        }
        return true;
    }

    int checkPassword(char str[],int n)
    {
        if(str.length>=4 && hasDigit(str) && hasCapital(str) && checkSpaceAndSlash(str) && !Character.isDigit(str[0]))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
