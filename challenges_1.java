// Find the longest common prefix from an array of String

public class prefix
{
	public static void main(String[] args) {
	    System.out.println(longestCommonPrefix(new String[]{"Hello","Hi","Highest"}));
	}
	
	private static String longestCommonPrefix(String[] array)
	{
	    String prefix = "";
	    if(array == null || array.length == 0) 
	    {
	        return "";
	    }
	    prefix = array[0];
	    
	    for(int index = 1; index < array.length; index++)
	    {
	        for(int count = 1; count < array[index].length(); count++)
	        {
	            if(!array[index].substring(0,count).equals(prefix.substring(0,count)))
	            {
	                prefix = prefix.substring(0, count -1);
	                break;
	            }
	        }
	    }
	    return prefix;
	}
}
