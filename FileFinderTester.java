import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileFinderTester {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int SComm =0;
		Scanner In = null;
		Scanner Input = null;
		File Data = new File("RedditData");
		File file = new File("RedditComments");
		File User = new File("RedditUsername");
		String Find =null;
		int nrofComments=0;
		int myLoop =0;
		 
		 
		  BufferedReader br = new BufferedReader(new FileReader(file));
		
		System.out.println("Welcome to Daniels Data Analysys bot!");
		
		 
	

		try {Input = new Scanner(Data);}
		catch (FileNotFoundException e) {
			System.out.println("Cannot open File: RedditData");
			System.exit(0);}
		
		try { In = new Scanner(User);}
		catch (FileNotFoundException e) {
			System.out.println("Cannot open File: RedditUsername");
			System.exit(0);}
		
	
		System.out.println("How can I Help you?");

		fileFinder botA= new fileFinder();
		Find= input.nextLine();
		if (Find.equalsIgnoreCase(botA.moComm)) {
			while (myLoop ==0){
				System.out.println("Enter a Keyword you would like to search for");
				String KeyWord = input.nextLine();
				System.out.println("Reddit posts containing your keyword:");
				fileFinder redditPost = new fileFinder();
				fileFinder.getRedditPosts("RedditData",KeyWord);
				System.out.println("What Post would you like to find the author of? enter line number");
				int author=input.nextInt();
				fileFinder authorOf =new fileFinder();
				authorOf.getUsername(author,"RedditUser");
			System.out.println("Would you like to search for another word?");
			String find2 = input.nextLine();
			if (find2.equalsIgnoreCase("yes"))
			{myLoop=0;
			}
			else 
			{myLoop =1;
				
			}
			}
			
		}
		/*else if (Find.equalsIgnoreCase(
		{while (myLoop ==0){
				system.out.println("Enter a Username to Find the Score of");
				find = input.nextLine();
				RedditReader redditUser = RedditReader();
				redditReader.getReditPosts("RedditUsername",find)
				system.out.println(""+find)
				int Score=input.nextInt();
				RedditReader ScoreOf =new RedditReader();
				ScoreOf.getScore("RedditScore",Score);
			system.out.println("Would you like to search for another Score?");
			find2 = input.nextLine();
			if find2.equalsIqnoreCase("yes")){
			{myLoop=0
			}
			else 
			{myLoop =1
			}
			}
			}
		}
		*/
		//else if (Find.equalsIgnoreCase(
		//{while (myLoop ==0){a
		//	redditReader MostComm = new RedditReader();
		//	MostComm.getnrofComments("RedditComments",nrofComments);

		  
		
		{
			
		
			
		
		
		
		
		}	
	}
		/*//else if (Find.equalsIgnoreCase(botA.numComm))
		//{}//{String st;
		// while ((st = br.readLine()) != null)}
		//else if (Find.equalsIgnoreCase(botA.useScore))
		//{	//System.out.println("Enter Username");
			//botA.username = input.nextLine();
			//System.out.println("The score for"+username"is: "+botA.score);
				//String st;
			  //while ((st = br.readLine()) != null)
	//}
		//else if (Find.equalsIgnoreCase(botA.thrScore))
		//String st;
		 // while ((st = br.readLine()) != null)
		{}
		else if (Find.equalsIgnoreCase(botA.useKey))
		{}//String st;
		  //while ((st = br.readLine()) != null)
		else if (Find.equalsIgnoreCase(botA.dataKey))
		{}//String st;
		 // while ((st = br.readLine()) != null)
		else if (Find.equalsIgnoreCase(botA.useComm))
		{}//String st;
		  //while ((st = br.readLine()) != null)
		*/
	
{
		System.out.println("Sorry I don't Understand");}
		}



		
		
		
		
	





	