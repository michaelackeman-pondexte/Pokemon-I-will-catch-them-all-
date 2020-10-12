import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //opening//
    System.out.println(" ");
    System.out.println("-----Pokemon-----");//pokemon game opening 



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
    else if(maria == guest){
    System.out.println("Maria");
    }else{
    System.out.println("Guest");
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
    if(maria != phill){
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
    System.out.println("Now with this information go and become the worlds best pokemon trainer.");

      for(int count = 1; count <= 3; count++)
     {
        System.out.println(count);
     }
    System.out.println("Saving...");




    //Choosing pokemon this time ill use scanner
    Scanner scan = new Scanner(System.in);
    System.out.println("Now it's time to choose your pokemon.");
    System.out.print(" You have three choices Treeko, Torchic, or Mudkip. Which one will you  choose?");
    String pokemon = scan.next();
    System.out.println(" ");
    System.out.println("So you have chosen " + pokemon + " ?");
  




    






















  }
}