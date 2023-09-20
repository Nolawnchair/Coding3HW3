/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		//IsAllUnique("hello");
		System.out.println(IsAllUnique("hello") );
	}
	
	
	
	public static boolean IsAllUnique(String str){
        for(int i = 0; i < str.length() - 1; i++)
        {
            char c = str.charAt(i);
            for(int j = i + 1; j < str.length(); j++)
            {
                if(c == str.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
}







