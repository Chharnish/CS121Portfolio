import java.util.*;
public class Menu{
    //global variables
    private Scanner input = new Scanner(System.in);
    private Pokedex myPokedex = new Pokedex();

    public void displayMenu() {
        String sel = "";
        while (!sel.equalsIgnoreCase("5")) {
            System.out.println("""
********** Menu **********
Please make a selection:
1) Add a Pokemon
2) Remove a Pokemon
3) Display Pokemon Info
4) Display All Pokemon Info
5) Quit
                    """);
            System.out.print(">>> ");
            sel = input.next();
            switch(sel) {
                case "1":
                    createPokemon();
                    break;
                case "2":
                    deletePokemon();
                    break;
                case "3":
                    displayPokemon();
                    break;
                case "4":
                    displayAllPokemon();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Invalid Selection!!");
            }

        }
        System.out.print("Exiting...");
    }
    private void createPokemon(){
        System.out.println("Please input the name of a new pokemon.");
        String pokeName = input.next();
        System.out.println("Please input the hp of your pokemon.");
        int pokeHP = input.nextInt();
        Pokemon newPoke = new Pokemon(pokeName, pokeHP);
        myPokedex.addPokemon(newPoke);
        String sel = "";
        while (!sel.equalsIgnoreCase("q")) {
            System.out.println("Please enter the name of a move you would like to add or type q to exit");
            sel = input.next();
            if (!sel.equals("q")) {
                System.out.println("Please input the power of the move");
                int power = input.nextInt();
                System.out.println("Please input the speed of the move");
                int speed = input.nextInt();
                Move newMove = new Move(sel, power, speed);
                newPoke.addMove(newMove);
            }
        }
        System.out.println("Pokemon has been added successfully!");
    }
    private void deletePokemon() {
        System.out.println("Please input the name of the pokemon you wish to delete");
        String sel = input.next();
        if (myPokedex.getPokemon(sel) != null){
            myPokedex.removePokemon(myPokedex.getPokemon(sel));
        }
        else {
            System.out.println("Pokemon not found!");
        }
    }
    private void displayPokemon() {
        System.out.println("Please input the name of the pokemon you wish to display");
        String sel = input.next();
        if (myPokedex.getPokemon(sel) != null){
            Pokemon curPokemon = myPokedex.getPokemon(sel);
            System.out.println(curPokemon.toString());
        }
        else {
            System.out.println("Pokemon not found!");
        }
    }
    private void displayAllPokemon() {
        ArrayList<Pokemon> AllPokemon = myPokedex.getPokemonArrayList();
        for (Pokemon pokemon : AllPokemon) {
            System.out.print(pokemon.toString()+ "\n");
        }
    }


}