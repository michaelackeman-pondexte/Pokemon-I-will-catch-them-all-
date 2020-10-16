import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //opening//
    System.out.println(" ");
    System.out.println("--------------------------------POKEMON---------------------------------");//pokemon game opening 




    //Pressing start
    System.out.println(" ");
    System.out.println("Press start ->");//Since I cant add images or music you have to use your imagination
    boolean start= true;
    boolean dontStart= false;//this is not a 100% pokemon opening
    if(start != dontStart){
      System.out.println("Welcome to the world of pokemon");

    }else{
      System.out.println("Press start or leave the game");

    }
    System.out.println("- Here in the world of pokemon you can find and catch many pokemon.     There are hundreds of them out there... are you ready");
    System.out.println(" ");//for better code layout
    System.out.println("-----Choose your name-----");





    //choosing you name
    boolean phill = false;//doing names will be difficult...
    boolean maria = false;
    boolean guest = true;
    if(maria != phill){
    System.out.println("Phill");

    }else if(maria){
    System.out.println("Maria");
    } 
    else if(maria || guest){
    System.out.println("Guest");
    }else{
    System.out.println(" Maria");
    }
    System.out.println("... Are you sure");
    if(true == true){
    System.out.println("yes");
    }else{
    System.out.println("then choose again");
    }
    System.out.println(" ");






   
  //dialouge after choosing name... then choosing your rival
    System.out.println("Hello guest do you remember your old rival from middleschool... uhh ... I dont remember there name again... what is it? ");
    System.out.println(" ");
    //nothing fancy now that I did this before
    boolean John = false;//doing names will be difficult...
    boolean demetri = false;
    boolean Christy = true;
    if(maria && phill){
    System.out.println("oh its... uh ... Joe ... Jacob? ... Oh I mean Jhon");

    }else if(maria){
    System.out.println("oh its... uh ... Dem ... Demi ... Oh I mean Demetri");
    } 
    else if(maria == guest){
    System.out.println("oh its... uh ... Dem ... Demi? ... Oh I mean Demetri");
    }else{
    System.out.println("oh its... uh ... Chr ... Chris ... Oh I mean Christy");
    }
    System.out.println("... Are you sure");
    if(true == true){
    System.out.println("yes");
    }else{
    System.out.println("then choose again");
    }
    System.out.println(" ");
 







    //Saving
    System.out.println("Now with this information go and recieve your pokemon.");

      for(int count = 1; count <= 3; count++)
     {
        System.out.println(count);
     }
    System.out.println("Saving...");
    System.out.println(" ");





    //Choosing pokemon and desired level this time ill use scanner
    Scanner scan = new Scanner(System.in);
    System.out.println("Now it's time to choose your pokemon.");
    System.out.print(" You have three choices Treeko, Torchic, or Mudkip. Which one will you  choose?");
    String pokemon = scan.next();//I plan to use all main scanners
    System.out.println(" ");//in this part of my code 
    System.out.println("Is it true or false that you choose " + pokemon + " as your starting pokemon?");//if you type false nothing will make sense so please type true
    boolean trueFalse = scan.nextBoolean();
    System.out.println(" ");
    System.out.println( trueFalse + ", No matter what you said you have choosen " + pokemon + " as your pokemon.  If you want a different pokemon, close the game and start again");

    System.out.println(" ");
    System.out.println("A pokemons progression in abilities, strength, and obedience all require a high bond between trainer and pokemon."); 

    System.out.println("The max level a pokemon can reach is 100. meaning that your pokemon has   the strongest abilities, strentgh, and obedience.");

    System.out.println("The lowest level is 0  meaning your pokemon has no abilities, strength, or obdience.");
    System.out.println(" ");
    
    System.out.println("What level of bond will you try to earn  with your pokemon?");
    int level = scan.nextInt();
    System.out.println("So you want to reach a level of " + level + " well I believe you can achieve that, unless it's above 100.");





    //saving because that was alot of scanner
    //after this save well set our adventurer into the 
    //world of pokemon
    System.out.println(" ");
    System.out.println("Get ready... your pokemon adventure will soon begin");
    int counting = 1;
    while (counting < 4)
    {
      System.out.println(counting++);

    }
    System.out.println("Saving...");
    System.out.println(" ");






    //Now the epic conclusion of the opening sequence Finally
    //Since the name isn't a scanner this will be weird
    // So you dont get to choose your name(or rivals) really, but you can choose your pokemon... oof
    //main variables to remember     guest, Christy, level, trueFalse, pokemon, and thats pretty much all
    System.out.print("-----You have come far Guest and you will go farther with your pokemon  " + pokemon + " to raise, and your rival Christy to make you strive to do better.\n You will achieve greatness and defeat the odds... Guest you will be the world's best pokemon trainer.\n You will get " + pokemon + " to level " + level + ", because you are greatness ready to    rise.");
    System.out.println(" ");
    System.out.println("---------------Good luck & Welcome to the world of pokemon--------------");
    

    // Comments and final thoughts
    // I really enjoyed doing this it was fun and I really enjoyed "scanner." I wish for the name of the player and rival, that I used a scanner, because it would allow more customization. I didn't use a scanner though, because I had little to know information about it. Thats one problem the other one is I wish the text would appear slower, because it just immediatly pops at the reader/veiwer. Thats all 






    






















  }
}