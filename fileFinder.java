import java.io.BufferedReader;
import java.io.FileReader;

public class fileFinder {
String moComm;
String numComm;
String useScore;
String thrScore;
String useKey;
String dataKey;
String useComm;
String fileToAnalyze;

String username;
String comments;
 int score;
 int nrofComments;
 int maxValue;


	public fileFinder(String username, int nrofComments) {
		this.username=username;
		this.nrofComments=nrofComments;}

	fileFinder()
	{
		moComm		="Find Keywords corrseponding with a User";
		numComm		="Find the Number of comments for a certian User";
		useScore	="Find a Score for a Certian User";
		thrScore 	="Find the top three scores from the data set";
	//	useKey 		="Find Keywords corrseponding with a User";
		dataKey		="Find Number of a Keyword Within the Dataset";
		useComm 	="Find the user for a Certian Comment";
		comments 	=null;
		score 		=0;
		nrofComments =0;
	
		fileToAnalyze="RedditData";
	}
	
	public static int getMaxValue(int[] nrofComments){
		  int maxValue = nrofComments[0];
		  for(int i=1;i < nrofComments.length;i++){
		    if( nrofComments[i] > maxValue){
			  maxValue =  nrofComments[i];
			}
		  }
		  return maxValue;
		}
	public int getnrofComments() {
		return nrofComments;
	}
	
	static void getRedditPosts(String KeyWord,String find)
	{RedditPost [] theDonaldPost = new RedditPost[6466];
	try {
	FileReader fr=new FileReader(find);
	BufferedReader brr= new BufferedReader(fr);
	String line=null;
	int Counter=0;
	while((line=brr.readLine())!=null)
	{line=brr.readLine();
	theDonaldPost[Counter]=new RedditPost(line);
	Counter+=1;
	String AnalyzerLowerCase=line.toLowerCase();
	if (AnalyzerLowerCase.contains(KeyWord)) {
		System.out.println("The Post Number is: /n" +Counter);
		System.out.println(" "+line);
	}
	else {System.out.println("No KeyWords Found");
	}
	}
	}
	catch(Exception e) {
		System.out.println("No file Found");
	}
	}

	 void getUsername(int author,String find2)
	{RedditUser [] theDonaldUsers = new RedditUser[6466];
	if(author>=0 && author<=6466)
	{try
	{
	FileReader fr=new FileReader(find2);
	BufferedReader brr= new BufferedReader(fr);
	String line=null;
	int Counter=0;
	while((line=brr.readLine())!=null)
	{line=brr.readLine();
	theDonaldUsers[Counter]=new RedditUser(line);
	Counter+=1;
	}
	}
	
	catch(Exception e) {
		System.out.println("No file Found");
	}
	}

}
}
	
