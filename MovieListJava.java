// Ishan Shah, FileIo Lab submission. 
// This lab demonstrates and provides a functioning program which allows you to search through the top 25 movies of all time through the IMDB's top 250 list.
// This program uses scanners, methods, strings, switches, loops, while/if statements, as well as athe help from a seperate txt file named Lab.txt.
// When running the program the scanners allow you to manually search for movies and add them to your own file named Lab1. 
// The list component allows you to search through the top 25 movies ever according to IMDB.


import java.io.FileWriter;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;


public class MovieListJava {
    
  public static void main(String []args)  throws FileNotFoundException, IOException  {
Scanner console=new Scanner(System.in);



String choice1;

String choice2;


System.out.println("Hello! Welcome to my movie program. This info based program uses movies collected from the IMDB top 25 movies EVER!!!" );

do{

System.out.println("\nWould you like to inspect the entire top 25 list or would you like to manually add your own movie into the list? Please answer either 1 for manual or 2 for list." );
String Choice = console.next(); // allows scanner for coice 1 manual or choice 2 list.



if ("2".equalsIgnoreCase(Choice)){ // choice 2 provides list for all movies from imdb and seperate txt file.
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Lab.txt")); // displays txt file in this program
            String line;

            while ((line = reader.readLine()) != null){
    
                System.out.println(line);
            }
            
            reader.close();
            
            System.out.println("Would you like to search a specific movie within the list? Please Answer Yes or No!");
            String option = console.next(); // yes or no string response 
            
            
            if ("yes".equalsIgnoreCase(option)){
              
           System.out.println(" Choose a number from the list to scavenge additional and more specific information on the movie of your choice.");
           int number = console.nextInt(); // number int response
           
           switch (number){   
           
           
             case 1: // movie 1 from seperate txt file
               reader = new BufferedReader(new FileReader("Lab.txt"));
               System.out.println(reader.readLine()); 
              reader.close();
              
              System.out.println("Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.");

              
              System.out.println("\nThis movie came out in 1994. \nIt was directed by Frank Darabont and was written by Stephen King. based on the short novel \"Rita Hayworth and the Shawshank Redemption\"");
              System.out.println("This movie stars Morgan Freeman, Tim Robbins, and Bob Gunton"); // Movie description
              System.out.println("This movie was an Oscar Nominee.");
              
           break;
           
           
             case 2: // movie 2 from seperate txt file
               
            reader = new BufferedReader(new FileReader("Lab.txt"));
            line = reader.readLine();
               System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son."); 
               
           System.out.println("\nThis movie came out in 1972. It was directed by Francis Ford Coppola and was written by Coppola and by Mario Puzo.");
           System.out.println("This movie stars Marlon Brando, Al Pacino, and James Caan"); // Movie description
           System.out.println("This movie won an Oscar in 1973, for the Best Picture (Albery S. Ruddy), Best Actor in a Leading Role (Marlon Brando), and many more.");
           System.out.println("This movie has a total of 32 wins.");
               
               
           break;
           
             case 3:// movie 3 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 2; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
           
            System.out.println("When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.");
               
            System.out.println("\nThis movie came out in 2008. It was directed by Christopher Nolan andd was written by Jonathan Nolan, Christopher Nolan, and David S. Goyer.");
            System.out.println("This movie stars Christian Bale, Heath Ledger, and Aaron Eckhart."); // Movie description
            System.out.println("This movie is an Oscar award winner for Best Performance by an Actor in a Supporting Role(Heath Ledger), and Best Achievement in Sound  Editing.");
            System.out.println("The Dark Knight has 160 award wins.");
               
               
           break;
           
         case 4:// movie 4 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 3; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
           System.out.println("The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.");
                                
           System.out.println("\nThis movie came out in 1974. It was directed by Francis Ford Coppola and was written by Coppola and by Mario Puzo.");
           System.out.println("This movie stars Al Pacino, Robert De Niro, and Robert Duvall"); // Movie description
           System.out.println("This movie won many Oscars in 1975 in many different categories.");
           System.out.println("This movie has a total of 17 wins and 21 nominations"); 
               
               
           break;  
           
           case 5:// movie 5 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 4; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
             System.out.println("In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.");

               
           System.out.println("\nThis movie came out in 1993. It was directed by Steven Spielberg and was written by Thomas Keneally and by Steven ZIllian.");
           System.out.println("This movie stars Al Pacino, Robert De Niro, and Robert Duvall");
           System.out.println("This movie won many Oscars in 1975 in many different categories."); // Movie description
           System.out.println("This movie has a total of 17 wins and 21 nominations");   
               
               
           break;
           
           case 6: // movie 6 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 5; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
            
            System.out.println("Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.");   
               
            System.out.println("\nThis movie released in 2003 as the third and final movie in The Lord of The Rings trilogy.");
            System.out.println("It was directed by Peter Jackson and written with J.R.R. Tolkien, Fran Walsh, and Philippa Boyens."); // Movie description
            System.out.println("The stars of this movie are Elijah Wood, Viggo Mortensen, and Ian McKellen.");
            System.out.println("This movie won 11 Oscars.");
               
               
           break;
           
           
           case 7: // movie 7 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 6; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
            System.out.println("This movie is about The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits \nintertwine in four tales of violence and redemption.");   
           
            System.out.println("\nThis movie released in 1994 and was directed by Quentin Tarantino and was written by Tarantino and ROger Avary.");
            System.out.println("This movie stars John Travolta, Uma Thurman, and Samuel L. Jackson"); // Movie description
            System.out.println("This movie had won 7 oscars.");
            
               
               
           break;
           
           case 8: // movie 8 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 7; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
           
            System.out.println("A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron."); 
               
            System.out.println("\nThis movie released in 2001 as the first movie in The Lord of The Rings trilogy.");
            System.out.println("It was directed by Peter Jackson and written with J.R.R. Tolkien, Fran Walsh, and Philippa Boyens."); // Movie description
            System.out.println("The stars of this movie are Elijah Wood, Orlando Bloom, and Ian McKellen.");
            System.out.println("This movie won 11 OScars.");   
               
           break;
           
           case 9: // movie 9 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 8; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.");   
               
               
            System.out.println("\nThis movie released in 1966 and was Directed by Sergio Leone, and written by Luciano Vincenzoni, Sergio Leone, and Agenore Incrocci.");
            System.out.println("The stars of this movie are Clint Eastwood, Eli Wallach, and Lee Van Cleef.");
            System.out.println("This movie won 3 awards.");  
           
           break;
           
           case 10: // movie 10 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 9; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
           
            System.out.println("The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective\n of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart.");  
               
            System.out.println("\nThis movie released in 1994 and was Directed by Robert Zemeckis, and written by Winston Groom, Eric Roth.");
            System.out.println("The stars of this movie are Tom Hanks, Robin Wright, and Gary Sinise."); // Movie description
            System.out.println("This movie won 51 awards, including 6 Oscars.");                 
               
           break;
           
           case 11: // movie 11 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 10; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
           
            System.out.println("An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.");                   
               
            System.out.println("\nThis movie released in 1999 and was Directed by David Fincher, and written by Chuck Palahiuk, Jim Uhls.");
            System.out.println("The stars of this movie are Brad Pitt, Edward Norton, and Meat Loaf."); // Movie description
            System.out.println("This movie won 11 awards.");               
               
           break;
           
           case 12: // movie 12 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 11; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
           System.out.println("While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided\n fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard.");
               
            System.out.println("\nThis movie released in 2002 as the second movie in The Lord of The Rings trilogy.");
            System.out.println("It was directed by Peter Jackson and written with J.R.R. Tolkien, Fran Walsh, and Philippa Boyens.");
            System.out.println("The stars of this movie are Elijah Wood, Viggo Mortensen, and Ian McKellen."); // Movie description
            System.out.println("This movie was very successfull and won 126 Academy awards.");
               
           break;
           
           case 13: // movie 13 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 12; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
           System.out.println("A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task\n of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster.");      
            System.out.println("\nThis movie released in 2010 and was directed and written by Christopher Nolan."); // Movie description
            System.out.println("The stars of this movie are Leonardo DiCaprio, Koseph Gordon-Levitt, and Elliot Page.");
            System.out.println("This movie was very successfull and won 158 Academy awards.");              
           
           break;
           
           case 14: // movie 14 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 13; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
           
               
            System.out.println("After the Rebels are brutally overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda,\n while his friends are pursued across the galaxy by Darth Vader and bounty hunter Boba Fett.");   
            System.out.println("\nThis movie released in 1980 and was directed by Irvin Kershner, and was written by Leigh Brackett, Lawrence Kasdan, George Lucas.");
            System.out.println("The stars of this movie are Mark Hamill, Harrison Ford, and Carrie Fisher.");// Movie description
            System.out.println("This movie won 26 Academy awards."); 
            
           break;
           
           case 15: // movie 15 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 14; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.");   
           System.out.println("\nThis movie released in 1999 and was directed and written by Lana Wachowski and Lilly Wachowski.");// Movie description
           System.out.println("The stars of this movie are Keanu Reeves, LAurence FIshburne, Carrie-Anne Moss.");
           System.out.println("This movie won 42 Academy awards."); 
           
           
           
           break;
           
           case 16: // movie 16 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 15; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.");   
           System.out.println("\nThis movie released in 1990 and was directed and written by Nicholas Pileggi and Martin Scorsese.");// Movie description
           System.out.println("The stars of this movie are Robert De Niro, Ray Liotta, and Joe Pesci.");
           System.out.println("This movie won one oscar."); 
           
           
           
           break;
           
           case 17: // movie 17 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 16; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("In the Fall of 1963, a Korean War veteran and criminal pleads insanity and is admitted to a mental institution, where he rallies up the scared patients against the tyrannical nurse.");   
           System.out.println("\nThis movie released in 1974 and was directed and written by Lawrence Hauben and Ken Kesey.");// Movie description
           System.out.println("The stars of this movie are Michael Berryman, Peter Brocco, and Jack Nicholson.");
           System.out.println("This movie won 5 oscars."); 
           
           
           
           break;
           
           case 18: // movie 18 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 17; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.");   
           System.out.println("\nThis movie released in 1995 and was directed and written by David Fincher and Andrew Kevin Walker.");// Movie description
           System.out.println("The stars of this movie are Morgan Freeman, Brad Pitt, and Kevin Spacey.");
           System.out.println("This movie was nominated for 1 oscar."); 
           
           
           
           break;
           
           case 19: // movie 19 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 18; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("Farmers from a village exploited by bandits hire a veteran samurai for protection, who gathers six other samurai to join him. As the samurai teach the peasants how to defend themselves, the village is attacked by an army of bandits.");   
           System.out.println("\nThis movie released in 1954 and was directed and written by Akira Kurosawa and Shinobu Hashimoto.");// Movie description
           System.out.println("The stars of this movie are Toshirô Mifune, Takashi Shimura, and Keiko Tsushima.");
           System.out.println("This movie was nominated for 2 oscars."); 
           
           
           
           break;
           
            case 20: // movie 20 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 19; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("An angel is sent from Heaven to help a desperately frustrated businessman by showing him what life would have been like if he had never existed.");   
           System.out.println("\nThis movie released in 1946 and was directed and written by Frank Capra and Frances Goodrich.");// Movie description
           System.out.println("The stars of this movie are James Stewart, Donna Reed, and Lionel Barrymore.");
           System.out.println("This movie was nominated for 5 oscars."); 
           
           
           
           break;
           
            case 21: // movie 21 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 20; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims.");   
           System.out.println("\nThis movie released in 1991 and was directed and written by Jonathan Demme and Ted Tally.");// Movie description
           System.out.println("The stars of this movie are Jodie Foster, Anthony Hopkins, and Lawrence Bonney.");
           System.out.println("This movie won 5 oscars."); 
     
           break;
           
            case 22: // movie 22 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 21; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("In the slums of Rio, two kids' paths diverge as one struggles to become a photographer and the other a kingpin.");   
           System.out.println("\nThis movie released in 2002 and was directed and written by Fernando Meirelles and Paulo Lins.");// Movie description
           System.out.println("The stars of this movie are Alexandre Rodrigues, Leandro Firmino, and Matheus Nachtergaele.");
           System.out.println("This movie was nominated for 4 oscars."); 
                 
           break;
           
            case 23: // movie 23 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 22; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.");   
           System.out.println("\nThis movie released in 1998 and was directed and written by Steven Spielberg and Robert Rodat.");// Movie description
           System.out.println("The stars of this movie are Tom Hanks, Matt Damon, and Tom Sizemore.");
           System.out.println("This movie won 5 oscars."); 
           
           
           
           break;
           
            case 24: // movie 24 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 23; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("When an open-minded Jewish waiter and his son become victims of the Holocaust, he uses a perfect mixture of will, humor, and imagination to protect his son from the dangers around their camp.");   
           System.out.println("\nThis movie released in 1997 and was directed and written by Roberto Benigni and Vincenzo Cerami."); // Movie description
           System.out.println("The stars of this movie are Roberto Benigni, Nicoletta Braschi, and Giorgio Cantarini.");
           System.out.println("This movie won 3 oscars."); 
                     
           break;
           
            case 25: // movie 25 from seperate txt file
               
               reader = new BufferedReader(new FileReader("Lab.txt"));
               for (int i = 0; i < 24; i++){
                 line = reader.readLine();
            }
               
            System.out.println(reader.readLine());
               reader.close();
               
           System.out.println("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival."); // Movie description
           System.out.println("\nThis movie released in 2014 and was directed and written by Christopher Nolan and Jonathan Nolan.");
           System.out.println("The stars of this movie are Matthew McConaughey, Anne Hathaway, and Jessica Chastain.");
           System.out.println("This movie won 1 oscar."); 
        
           break;
           }
              
            }
            
            reader.close();
        } catch (Exception e) {
            // TODO: the handle exception
        }
}

else if ("1".equalsIgnoreCase(Choice)){ // choice 1 if user wants to manually input a movie
  
  do{
    
  System.out.println("What is the name of the movie you want to input?");
  console.next(); // pointless to allow pass for scanner glitch
  String movie = console.nextLine(); // allows space in scanner
  
  
   System.out.println("What year did your movie come out in?");
   
   int movieyear = console.nextInt(); // allows numbers in scanner for the year the manual movie came out
   console.nextLine();
   
   System.out.println("What genre does your movie belong in?");
   
   String moviegenre = console.nextLine(); // allows space in movie genre nextLine
  
   
  System.out.println("Your movie "+movie+", came out in "+movieyear+", and belongs in the genre of "+moviegenre);
  System.out.println("Your movie has been added to the list of movies.");
  
  System.out.println("The updated list is:");
  
 for (int i = 0; i < 1; i++){
   
   System.out.println("\nMovie Name:\tMovie Year:\tMovie Genre:");
 }
  
  
  try { 
     BufferedWriter writer = new BufferedWriter(new FileWriter("Lab1.txt", true)); // lab 1 txt is the file created within the program after user selects the manual option
    
    
    writer.write(movie + "\t\t"+movieyear+ "\t\t"+moviegenre);
    writer.flush();
    writer.newLine();

    
   
 writer.close();
  }
 catch (Exception e) { // TODO: the handle exception
 }
  
  try {
            BufferedReader reader = new BufferedReader(new FileReader("Lab1.txt"));
            String line;
    
            while ((line = reader.readLine()) != null){
    
                System.out.println(line);
            }
    
            
            reader.close();
        } catch (Exception e) { // TODO: the handle exception
        }
 
System.out.println ("Would you like to add a new movie to the list?");
choice1 = console.next();
  }
  
  
  while ("yes".equalsIgnoreCase (choice1));  
}// if/else loops entire program from the start



System.out.println("Would you like to try a different component of this program?");

choice2 = console.next(); // allows user to decide whether or not to loop program from the start


}//do

while("yes".equalsIgnoreCase (choice2)); 



  }
  
}
