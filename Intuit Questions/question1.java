public class question1{
    public static String movefront(String string){
        //Problem Statement : You have write a function that accepts, a string which length is “len”, 
       // the string has some “#”, in it you have to move all the hashes to the front of the string and return the whole string back and print it.

     /*  Example :
          Sample Test Case
          Input :
          Move#Hash#to#Front
          Output :
         MoveHashtoFront*/ 
         String str1="";
         String str2="";
         for(int i=0;i<string.length();i++)
         {
            if(string.charAt(i)=='#')
              str1+='#';
            else
             str2+=string.charAt(i);
         }
         return str1.trim()+str2.trim();
    }
    public static String optimised(String string){
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();

        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if(ch=='#')
             str1.append(ch);
            else
             str2.append(ch);
        }
        return str1.append(str2).toString();
    }
    public static void main(String args[])
    {
        String str="Mo#ve#Hash#to#Front";
        String str1="#MoveH#as##to#Front";
        System.out.println(movefront(str));
        System.out.println(optimised(str1));
    }
}

