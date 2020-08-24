package com.company;

import java.util.Scanner;

public class Game {
    /*
        if(scanner.hasNextInt())
         {
             variable=scanner.next();
             var = Integer.parseInt(variable);

             System.out.println("Zmienna jest INT: "+var);
         }else{System.out.println("Zmienna nie jest INT: "+var);}


     */
    String line = "-----------------------------------------------------------";
    Scanner scanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);

    String playerWeapon;
    String playerArmor;
    String playerName;
    String space;
    String directions;
    String wish;
    String potion1 ;
    String potion2;
    String again;
    String fightChoice1="";
    String input="Input only numbers!";

    int playerArmorPoints;
    int playerHp;
    int playerEnergy;
    int attack_1;
    int attack_2;
    int attack_3;
    int bossHP=1000;
    int hurt=30;
    int hurtArmor=50;
    int money = 1000;
    int adventure_choice;
    String choice_1;
    int potionHealth;
    int potionMana;
    int  northChoice1;
    int  southChoice1;
    int  eastChoice1;
    int  westChoice1;
    boolean pass;



    public static void main(String[] args) {
        Game Hardian = new Game();
        Hardian.playerSetUp();


    }

    private static boolean isNumber(String isNumber) {
        for (int i = 0; i < isNumber.length(); i++) {
            if (!isDigit(isNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    private static boolean isDigit(char isDigit) {
        for (int i = 0; i < 10; i++) {
            if (isDigit == i + 48) {
                return true;
            }
        }
        return false;
    }
    public  void  playerSetUp(){
        String line = "-----------------------------------------------------------";
        System.out.println("\n\nWelcome to the game \"Zelda Empire\"");
        System.out.println("\nTip:If You arent asked for input just type space to continue");
        System.out.print("What's your name, traveler? ");


            playerName=scanner.next();




        playerHp = 100;
        playerEnergy = 100;
        playerWeapon = "Knife";
        playerArmor = "Leather Armor";
        playerArmorPoints = 100;
        potion1 = "Health  Potion";
        potionHealth = 100;
        potion2 = "Mana  Potion";
        potionMana = 100;

        System.out.println("Welcome " + playerName);
        space = enterScanner.nextLine();
        System.out.println("You're in  Zelda Castle\n-----------------------------------------------------------");
        space = enterScanner.nextLine();
        System.out.println("Here's your equipment: ");
        System.out.println("HP:     " + playerHp + " HP's");
        System.out.println("Energy: " + playerEnergy + " MP");
        System.out.println("Weapon: " + playerWeapon);
        System.out.println("Armor:  " + playerArmor);
        System.out.println("Armor Points:  " + playerArmorPoints + " AR's");
        System.out.println("\nTip:If You arent asked for input just type space to continue");
        space = enterScanner.nextLine();
        System.out.println("1. Potion:  " + potion1);
        System.out.println("   Potion HP(Health Points):  " + potionHealth + " HP's\n");
        System.out.println("2. Potion:  " + potion2);
        System.out.println("   Potion MP(Mana Points):  " + potionMana + " MP's");
        System.out.println(line);
        System.out.println("\nLets play a game!\n");
        space = enterScanner.nextLine();
        townGate();

    }
    public  void  townGate(){



        System.out.println("You are going to market away from your's Lord-girl castle.");
        System.out.println("In your way is guard guarding main gate.");
        System.out.println("\n\nWhat do you want to do?\n");
        System.out.println("1. Talk to the guard");
        System.out.println("2. Attack the guard");
        System.out.println("3. Leave and go search for coin ");

            choice_1 = scanner.next();

        switch(choice_1)
        {
            case "1":
                System.out.println("Guard: Its a honor to meet u sir.\nGuard: Its a pleasure to let You through. \nGuard: But got coin pass right?");
                space= enterScanner.nextLine();
                break;
            case "2":
                System.out.println("\n*Guard immediately avoided attack and attack You harder that You excepted*");
                space = enterScanner.nextLine();
                System.out.println("Guard: Dont get  back here without pass Moron!\n");
                space = enterScanner.nextLine();
                break;

            case "3":
                System.out.println("Guard: Goodbye Sir.\nGuard: Have a good day.");

                break;
            default:
                System.out.println("Guard is impatient of your not telling anything.Choose option before making him mad.\n"+line);
                townGateRevisited();
                break;
        }

        if(choice_1.equals("1"))
        {


            if(pass){
                System.out.println(playerName+": Yes i have here it is");
                ending();
            }
            else{
                System.out.println(playerName+" : Oh sorry my mistake.I will come back later ;)");
                space = enterScanner.nextLine();
                System.out.println("Guard: You should get coin pass first. I am sure that wont be a problem for Prince *laughs*");
                space = enterScanner.nextLine();
                townGateRevisited();
            }
        }

        if(choice_1.equals("2"))
        {
            playerHp = playerHp - hurt;
            if(playerHp<=0){playerHp=0;}

            System.out.println("You lost "+ hurt+" HP's. Remains:"+playerHp+" HP's");

            playerArmorPoints = playerArmorPoints - hurtArmor;
            if(playerArmorPoints<=0) {playerArmorPoints=0;}
            System.out.println("You lost "+ hurtArmor+" Armor HP's.Remains "+playerArmorPoints+" Armor HP's");

            if((playerHp<=0) && (playerArmorPoints<=0)){death(); }else{townGateRevisited();}
        }
        if(choice_1 .equals("3"))
        {
            plan();
        }


    }
    public  void  townGateRevisited(){



        System.out.println("\n\nWhat do You want to do?\n");
        System.out.println("1: Talk to the guard");
        System.out.println("2: Attack the guard");
        System.out.println("3: Leave and go search for coin pass");



       
            choice_1 = scanner.next();






        switch(choice_1)
        {
            case "1":
                System.out.println("Guard: Its a honor to meet u sir.\nGuard: Its a pleasure to let You through. \nGuard: But got coin pass right?");
                space= enterScanner.nextLine();
                break;
            case "2":
                System.out.println("\n*Guard immediately avoided attack and attack You harder that You excepted*");
                space = enterScanner.nextLine();
                System.out.println("Guard: Dont get  back here without pass Moron!\n");
                space = enterScanner.nextLine();
                break;

            case "3":
                System.out.println("Guard: Goodbye Sir.\nGuard: Have a good day.");

                break;
            default:
                System.out.println("Guard is impatient of your not telling anything.Choose option before making him mad.\n"+line);
                townGateRevisited();
                break;
        }

        if(choice_1.equals("1"))
        {


            if(pass){
                System.out.println(playerName+": Yes i have here it is");
                ending();
            }
            else{
                System.out.println(playerName+" : Oh sorry my mistake.I will come back later ;)");
                space = enterScanner.nextLine();
                System.out.println("Guard: You should get coin pass first. I am sure that wont be a problem for Prince *laughs*");
                space = enterScanner.nextLine();
                townGateRevisited();
            }
        }

        if(choice_1.equals("2"))
        {
            playerHp = playerHp - hurt;
            if(playerHp<=0){playerHp=0;}

            System.out.println("You lost "+ hurt+" HP's. Remains:"+playerHp+" HP's");

            playerArmorPoints = playerArmorPoints - hurtArmor;
            if(playerArmorPoints<=0) {playerArmorPoints=0;}
            System.out.println("You lost "+ hurtArmor+" Armor HP's.Remains "+playerArmorPoints+" Armor HP's");

            if((playerHp<=0) && (playerArmorPoints<=0)){death(); }else{townGateRevisited();}
        }
        if(choice_1 .equals("3"))
        {
            plan();
        }

    }
    public  void  plan(){
        System.out.println("\n"+playerName+": I need to get this coin. I heard that I may obtain it in some dungeon\n");
        space = enterScanner.nextLine();
        System.out.println(playerName+": I will go to Castle Trader. He will may have map and key to dungeon.\n\n");
        money = money - 300;

        adventure();


    }
    public  void  ending(){

        System.out.println("\nGuard: Oh You got it? My mistake.\nIt wont happen ever again.\n\nI wish You happy adventure Sir\n");


        System.out.println(line+"\nThanks for Playing\n  ~Paweł Łukasz");
        System.exit(0);

    }
    public  void  adventure(){
        System.out.println("Trader: Are You sure You want to go for adventure?\n1. Yes\n2. No");
        adventure_choice = scanner.nextInt();
        if(adventure_choice==1){
            System.out.println("Trader: I dont have map unfortunately but i saw that place so i would recognise if we would be there :)");
            space= enterScanner.nextLine();
            wish="As You wish.\nClient is my master!";
            adventure_question();


        }
        else if(adventure_choice == 2){townGateRevisited();}
        else{

            System.out.println("Do You choosed  something?\nYou make me angry...");

            space = enterScanner.nextLine();System.out.println("Do You understand me?\n");
            adventure();
        }


    }
    public  void  adventure_question(){
        /*w adventure_question jest cały kod z kierunkami i przygoda po to by jak zla odp to by zapetlalo sie pytanie .
        Oficialnie samo adventure jest tez wyciete z plans takze sie zagniezdza wszystko ale to chyba jak narazie jedyny sposob

         */


        System.out.println("Alright then.Choose direction would Ya?");
        System.out.println("North/South/East/West");
        directions = scanner.next();
        switch (directions)
        {
            case "North":
                System.out.println("Lets go to North then.\n"+wish);
                north();
                break;
            case "South":
                System.out.println("Lets go to South then.\n"+wish);
                south();
                break;
            case "East":
                System.out.println("Lets go to East then.\n"+wish);
                east();
                break;
            case "West":
                System.out.println("Lets go to West then.\n"+wish);
                west();
                break;
            default:
                System.out.println("Would ya choose something?I dont have all day\n");
                adventure_question();
                break;
        }
    }
    public  void  death(){
        System.out.println("-------------------------YOU  DIED-------------------------\n\n" +
                "-------------------------GAME OVER-------------------------");
        System.out.println("\n\nDo u want to play again?(YES/NO)");
        again = scanner.next();
        if(again.equals("YES")){ playerSetUp();townGate();}else if(again.equals("NO")){
            System.out.println("Goodbye :)");
        }else{
            System.out.println("Choose something correctly");

            deathRevisited();
        }


    }
    public  void  deathRevisited(){
        System.out.println("\n\nDo u want to play again?(YES/NO)");
        again = scanner.next();
        if(again.equals("YES")){playerSetUp();townGate();}else if(again.equals("NO")){
            System.out.println("Goodbye :)");
        }else{
            System.out.println("Choose something correctly");

            deathRevisited();
        }
    }
    public  void  north(){
        space = enterScanner.nextLine();
        playerEnergy = playerEnergy - 30;
        System.out.println("*Travel is exhausting but You walk as long as You can.You lost 30 energy for travel*\n" +
                "*The night is coming. You pitch your tents and light a fire.*");
        System.out.println("Player Energy :"+playerEnergy+" MP's\n");
        space = enterScanner.nextLine();
        System.out.println("!*** W A R N I N G ***!");
        space = enterScanner.nextLine();
        System.out.println("*Camp was attacked by a bear last night*. " +
                "\n*Your companion died and you have to try to go with what's left*.");
        space = enterScanner.nextLine();
        System.out.println("You must choose if You want go back or go to Dungeons");
        System.out.println(" 1.You want to go back\n 2.Lets go to dungeons!!!");
        northChoice1 = scanner.nextInt();

        switch (northChoice1)
        {
            case 1:
                System.out.println("Wise choice.By turning backYou missed a bear attack on the path. Well done.");
                space = enterScanner.nextLine();
                townGateRevisited();
                break;
            case 2:
                System.out.println("You wont learn anything by this mistake.");
                space = enterScanner.nextLine();
                System.out.println("Moments later, you were attacked by a bear and you died.");
                space= enterScanner.nextLine();
                death();
                break;
            default :
                System.out.println("Do You choosed direction?\nIf You stay here You will get instant death");
                northRevisited();
                break;
        }

    }
    public  void  northRevisited(){            space = enterScanner.nextLine();
        System.out.println("You must choose if You want go back or go to Dungeons");
        System.out.println(" 1.You want to go back\n 2.Lets go to dungeons!!!");
        northChoice1 = scanner.nextInt();

        switch (northChoice1)
        {
            case 1:
                System.out.println("Wise choice.By turning backYou missed a bear attack on the path. Well done.");
                space = enterScanner.nextLine();
                townGateRevisited();
                break;
            case 2:
                System.out.println("You wont learn anything by this mistake.");
                space = enterScanner.nextLine();
                System.out.println("Moments later, You were attacked by a bear and you died.");
                space= enterScanner.nextLine();
                death();
                break;
            default :
                System.out.println("Do u choosed direction?\nIf You stay here You will get instant death");
                northRevisited();
                break;
        }
    }
    public  void  south(){
        space = enterScanner.nextLine();
        playerEnergy = playerEnergy - 20;
        System.out.println("*Travel is exhausting but You walk as long as You can.You lost 20 energy for travel*\n" +
                "*The night is coming. You pitch your tents and light a fire.*");
        System.out.println("Player Energy :"+playerEnergy+" MP's\n");
        space = enterScanner.nextLine();
        System.out.println("!*** W A R N I N G ***!");
        space = enterScanner.nextLine();
        System.out.println("*Wrong alarm.Its just a Squirrel*. " +
                "\n*The next full day, You go on a trip*.");
        space = enterScanner.nextLine();

        System.out.println("There are moving sands on your way.\n\n" +
                "Do You think You should jump over them or come back?");
        System.out.println("1.Jump over\n2.Come back like a Coward");
        southChoice1 = scanner.nextInt();

        switch (southChoice1)
        {
            case 1:
                System.out.println("Well done You jump over");
                space = enterScanner.nextLine();
                System.out.println("Unfortunatly You got bitten by venomous snake.\nWhile You die in the forrest, Your Friend run for help but it was too late");
                space = enterScanner.nextLine();
                death();
                break;
            case 2:
                System.out.println("Good job.Better be  carefull than dead");
                playerEnergy = playerEnergy +30;
                space = enterScanner.nextLine();
                System.out.println("You earned 30 energy\nNow its time to go back to castle\n");
                space= enterScanner.nextLine();
                townGateRevisited();
                break;
            default :
                System.out.println("Do You choosed direction?\nIf u stay here You will get instant death");
                southRevisited();
                break;
        }


    }
    public  void  southRevisited(){
        System.out.println("There are moving sands on your way.\n\n" +
                "Do You think You should jump over them or come back?");
        System.out.println("1.Jump over\n2.Come back like a Coward");
        southChoice1 = scanner.nextInt();

        switch (southChoice1)
        {
            case 1:
                System.out.println("Well done You jump over");
                space = enterScanner.nextLine();
                System.out.println("Unfortunatly You got bitten by venomous snake.\nWhile You die in the forrest, Your Friend run for help but it was too late");
                space = enterScanner.nextLine();
                death();
                break;
            case 2:
                System.out.println("Good job.Better be  carefull than dead");
                playerEnergy = playerEnergy +30;
                space = enterScanner.nextLine();
                System.out.println("You earned 30 energy\nNow its time to go back to castle\n");
                space= enterScanner.nextLine();
                townGateRevisited();
                break;
            default :
                System.out.println("Do You choosed direction?\nIf You stay here You will get instant death");
                southRevisited();
                break;
        }

    }
    public  void  east(){

        space = enterScanner.nextLine();
        playerEnergy = playerEnergy - 25;
        System.out.println("*Travel is exhausting but You walk as long as You can.You lost 25 energy for travel*\n" +
                "*The night is coming. You pitch your tents and light a fire.*");
        System.out.println("Player Energy: "+playerEnergy+" MP's \n");
        space = enterScanner.nextLine();
        System.out.println("!*** W A R N I N G ***!");
        space = enterScanner.nextLine();
        System.out.println("*During the night, your partner got lost.*\n*Maybe he was killed by forest bandits.* ");

        space = enterScanner.nextLine();
        System.out.println("Before night he told You that it may  be nearby!");
        System.out.println("You are alone now!");
        System.out.println("\n\nYou must choose if You want go back or go to Dungeons");
        System.out.println(" 1.You want to go back\n 2.Lets go to dungeons!!!");
        eastChoice1 = scanner.nextInt();

        switch (eastChoice1)
        {
            case 1:
                System.out.println("When You was going back You was attacked by bandits.");
                space = enterScanner.nextLine();
                System.out.println("Moments later, Team was dead.");
                space= enterScanner.nextLine();
                death();
                break;
            case 2:
                System.out.println("Wise choice.After turn there was dungeon!");
                space = enterScanner.nextLine();
                System.out.println("By Your courage You earned 25 Energy!");
                playerEnergy = playerEnergy+25;
                System.out.println("Player Energy: "+playerEnergy+" MP's");
                dungeon();
                break;

            default :
                System.out.println("Do You choosed direction?\nIf You stay here You will get instant death");
                eastRevisited();

                break;
        }


    }
    public  void  eastRevisited(){

        System.out.println("\n\nYou must choose if You want go back or go to Dungeons");
        System.out.println(" 1.You want to go back\n 2.Lets go to dungeons!!!");
        eastChoice1 = scanner.nextInt();

        switch (eastChoice1)
        {
            case 1:
                System.out.println("When You was going back You was attacked by bandits.");
                space = enterScanner.nextLine();
                System.out.println("Moments later, Team was dead.");
                space= enterScanner.nextLine();
                death();
                break;
            case 2:
                System.out.println("Wise choice.After turn there was dungeon!");
                space = enterScanner.nextLine();
                System.out.println("By Your courage You earned 45 Energy!");
                playerEnergy = playerEnergy+45;
                System.out.println("Player Energy: "+playerEnergy+" MP's");
                dungeon();
                break;

            default :
                System.out.println("Do You choosed direction?\nIf You stay here You will get instant death");
                eastRevisited();

                break;
        }

    }
    public  void  west(){

        space = enterScanner.nextLine();
        playerEnergy = playerEnergy - 15;
        System.out.println("*Travel is exhausting but You walk as long as You can.YoU lost 15 energy for travel*\n" +
                "*The night is coming. You pitch your tents and light a fire.*");
        System.out.println("Player Energy: "+playerEnergy+" MP's \n");
        space = enterScanner.nextLine();
        System.out.println("!*** W A R N I N G ***!\n");
        space = enterScanner.nextLine();
        System.out.println("*You were kidnapped by a gang of natives last night.*\n*You miraculously managed to get away. Your trader wasn't so lucky.* ");

        space = enterScanner.nextLine();
        System.out.println("Before night You saw that u are next to Mountain!");
        System.out.println("\n\nYou must choose if u want go for nearest Mountain or take muddy path");
        System.out.println(" 1. You want to go search Mountain\n 2. Let's go down the path!!!");
        westChoice1 = scanner.nextInt();

        switch (westChoice1)
        {
            case 1:
                System.out.println("When You was searching You was attacked by radioactive bees.");
                space = enterScanner.nextLine();
                System.out.println("Moments later, You were lying on the ground.");
                space= enterScanner.nextLine();
                death();
                break;
            case 2:
                System.out.println("Good choice.You wont find Mountain anyway!");
                space = enterScanner.nextLine();
                System.out.println("By Your courage You earned 10 Energy!");
                space= enterScanner.nextLine();
                playerEnergy = playerEnergy+10;
                System.out.println("Player Energy: "+playerEnergy+" MP's");
                space= enterScanner.nextLine();
                System.out.println("Unfortunatly energy wont help You now.");
                space= enterScanner.nextLine();
                System.out.println("\nYou was attacked and eaten by natives.\n");
                space= enterScanner.nextLine();
                death();
                break;

            default :
                System.out.println("Do Yo choosed direction?\nIf You stay here You will get instant death");
                westRevisited();

                break;
        }




    }
    public  void  westRevisited(){
        System.out.println("\n\nYou must choose if You want go for nearest Mountain or take muddy path");
        System.out.println(" 1. You want to go search Mountain\n 2. Let's go down the path!!!");
        westChoice1 = scanner.nextInt();

        switch (westChoice1)
        {
            case 1:
                System.out.println("When You was searching You was attacked by radioactive bees.");
                space = enterScanner.nextLine();
                System.out.println("Moments later, You were lying on the ground.");
                space= enterScanner.nextLine();
                death();
                break;
            case 2:
                System.out.println("Good choice.You wont find Mountain anyway!");
                space = enterScanner.nextLine();
                System.out.println("By Your courage You earned 10 Energy!");
                playerEnergy = playerEnergy+10;
                System.out.println("Player Energy: "+playerEnergy+" MP's");
                space= enterScanner.nextLine();
                System.out.println("Unfortunatly energy wont help You now");
                space = enterScanner.nextLine();
                System.out.println("\nYou was attacked and eaten by natives.");
                space= enterScanner.nextLine();
                death();
                break;

            default :
                System.out.println("Do You choosed direction?\nIf You stay here You will get instant death");
                westRevisited();

                break;
        }

    }
    public  void  dungeon(){
        System.out.println("The dungeons are completely painted red.");
        space = enterScanner.nextLine();
        System.out.println( "You find the torch at the entrance.");
        space = enterScanner.nextLine();
        System.out.println("It lies next to an old traveller who also tried to defeat the beast.");
        space = enterScanner.nextLine();
        System.out.println("\nITEM FOUND : TORCH\n");
        space = enterScanner.nextLine();
        System.out.println("You found main entry to Legendary Dragon.");
        System.out.println("Do You want to beat Beast or Escape?(BEAT/ESCAPE)");
        fightChoice1 = scanner.next();
        if(fightChoice1.equals("ESCAPE"))
        {
            System.out.println("Unfortunatly,that didnt worked out.");
            space = enterScanner.nextLine();
            System.out.println("\nYou were found by bandits.");
            System.out.println("\nThey killed and looted You.");
            space = enterScanner.nextLine();
            death();
        }
        else if(fightChoice1.equals("BEAT")){
            System.out.println("Lets go then!\nLets beat this Monster!!!\n");
            dungeonFight();
        }
        else
        {
            System.out.println("You dont have too much time in such dangerous place.");
            space=enterScanner.nextLine();
            System.out.println("While you couldn't decide, You were attacked and eaten by a herd of great spiders.");
            death();
        }

        space = enterScanner.nextLine();
        if(pass){
            System.out.println("Lets go to Town to get pass accepted!");
            townGateRevisited();
        }
    }
    public  void  dungeonFight() {
        System.out.println("***B O S S   M U S I C***");
        space= enterScanner.nextLine();
        System.out.println("Dragon: Haha.I know its You.");
        space = enterScanner.nextLine();
        System.out.println("Dragon: I could smell You from a mile away.");
        space = enterScanner.nextLine();
        System.out.println("Dragon: The smell of people is very strong.");
        space = enterScanner.nextLine();

        System.out.println("Dragon: I know what You up for.\n");

        System.out.println("Dragon: Let me do this quick and kill You before get exhaused *evil laugh*");


        System.out.println("\n\nDragon he waves his big paw.");
        space = enterScanner.nextLine();
        while(playerHp>0) {
            playerHp = playerHp - 10;
            playerArmorPoints = playerArmorPoints - 36;
            System.out.println("*" + playerName + " lost 10HP's and 36 AR's*\n");
            System.out.println(playerName+" now have "+playerHp+" HP's and "+playerArmorPoints+" AR's\n\n");


            System.out.println("What do You want to do?");
            System.out.println("1. Critical Hit.\n2. Normal Hit\n3. Go a little further\n4. Escape\n5. Nothing");
            attack_1 = scanner.nextInt();

            switch (attack_1) {
                case 1:
                    System.out.println("Critical wasnt very effective");
                    space = enterScanner.nextLine();
                    bossHP = bossHP - 240;
                    if(bossHP<0){bossHP=0;victory();}
                    System.out.println("Boss lost 240 HP| Remains: " + bossHP + "HP's");

                    break;

                case 2:
                    System.out.println("Normal hit worked");
                    space = enterScanner.nextLine();
                    bossHP = bossHP - 230;
                    if(bossHP<0){bossHP=0;victory();}
                    System.out.println("Boss lost 230 HP| Remains: " + bossHP + "HP's");

                    break;

                case 3:
                    System.out.println("You may move but it didnt do anything.");
                    space = enterScanner.nextLine();
                    System.out.println("Boss didnt lost HP| Remains: " + bossHP + "HP's");

                    break;

                case 4:
                    System.out.println("It couldn't have worked out");
                    space = enterScanner.nextLine();
                    System.out.println("Dragon's claw catch You.");
                    space = enterScanner.nextLine();
                    playerHp = playerHp - 56;
                    System.out.println("*" + playerName + " lost 56HP*");
                    System.out.println(playerName+" now have "+playerHp+" HP's and "+playerArmorPoints+" AR's");

                    if(playerHp<0){playerHp=0;death();}
                    break;


                default:
                    System.out.println("Well Dragon didnt let You rest Boy.");
                    space = enterScanner.nextLine();
                    System.out.println("He ate you before you had time to rest");
                    space = enterScanner.nextLine();
                    death();
                    break;
            }

            System.out.println("What do You want to do?");
            System.out.println("1. Critical Hit.\n2. Normal Hit\n3. Go a little further\n4. Escape\n5. Nothing");
            attack_2 = scanner.nextInt();


            switch (attack_2) {
                case 1:
                    System.out.println("Critical was very effective");
                    space = enterScanner.nextLine();
                    bossHP = bossHP - 740;
                    System.out.println("Boss lost 740 HP| Remains: " + bossHP + "HP's");
                    if(bossHP<0){bossHP=0;victory();}
                    break;

                case 2:
                    System.out.println("Normal hit worked");
                    space = enterScanner.nextLine();
                    bossHP = bossHP - 230;
                    if(bossHP<0){bossHP=0;victory();}
                    System.out.println("Boss lost 230 HP| Remains: " + bossHP + "HP's");
                    break;

                case 3:
                    System.out.println("You may move  but You cannot run from Your destiny.");
                    space = enterScanner.nextLine();
                    System.out.println("Boss didnt lost HP| Remains: " + bossHP + "HP's");
                    break;

                case 4:
                    System.out.println("It couldn't have worked out");
                    space = enterScanner.nextLine();
                    System.out.println("Dragon's claw catch you.");
                    space = enterScanner.nextLine();
                    playerHp = playerHp - 56;
                    System.out.println("*" + playerName + " lost 56HP*\n");
                    if(playerHp<0){playerHp=0;death();}
                    System.out.println(playerName+" now have "+playerHp+" HP's and "+playerArmorPoints+" AR's");

                    break;


                default:
                    System.out.println("Well Dragon didnt let u rest Boy.");
                    space = enterScanner.nextLine();
                    System.out.println("He ate you before you had time to rest");
                    space = enterScanner.nextLine();
                    death();
                    break;
            }

            System.out.println("What do You want to do?");
            System.out.println("1. Critical Hit.\n2. Normal Hit\n3. Go a little further\n4. Escape\n5. Nothing");
            attack_3 = scanner.nextInt();

            switch (attack_3) {
                case 1:
                    System.out.println("Critical wasnt effective");
                    space = enterScanner.nextLine();
                    bossHP = bossHP - 370;
                    if(bossHP<0){bossHP=0;victory();}
                    System.out.println("Boss lost 370 HP| Remains: " + bossHP + "HP's");

                    break;

                case 2:
                    System.out.println("Normal hit worked");
                    space = enterScanner.nextLine();
                    bossHP = bossHP - 230;
                    if(bossHP<0){bossHP=0;victory();}
                    System.out.println("Boss lost 115 HP| Remains: " + bossHP + "HP's");
                    break;

                case 3:
                    System.out.println("You may move but it didnt do anything.");
                    space = enterScanner.nextLine();
                    System.out.println("Boss didnt lost HP| Remains: " + bossHP + "HP's");
                    break;

                case 4:
                    System.out.println("It couldn't have worked out");
                    space = enterScanner.nextLine();
                    System.out.println("Dragon's claw catch you.");
                    space = enterScanner.nextLine();
                    playerHp = playerHp - 40;
                    System.out.println("*" + playerName + " lost 40HP*");
                    System.out.println(playerName+" now have "+playerHp+" HP's and "+playerArmorPoints+" AR's");
                    if(playerHp<0){playerHp=0;death();}
                    break;


                default:
                    System.out.println("Well Dragon didnt let u rest Boy.");
                    space = enterScanner.nextLine();
                    System.out.println("He ate you before you had time to rest");
                    space = enterScanner.nextLine();
                    death();
                    break;
            }
            if(bossHP<0){bossHP=0;victory();}
        }
        if(bossHP>0){

            System.out.println("What do You want to do?");
            System.out.println("1. Critical Hit.\n2. Normal Hit\n3. Go a little further\n4. Escape\n5. Nothing");
            attack_3 = scanner.nextInt();

            switch (attack_3) {
                case 1:
                    System.out.println("Critical wasnt effective");
                    space = enterScanner.nextLine();
                    bossHP = bossHP - 370;
                    if(bossHP<0){bossHP=0;victory();}
                    System.out.println("Boss lost 370 HP| Remains: " + bossHP + "HP's");

                    break;

                case 2:
                    System.out.println("Normal hit worked");
                    space = enterScanner.nextLine();
                    bossHP = bossHP - 230;
                    if(bossHP<0){bossHP=0;victory();}
                    System.out.println("Boss lost 115 HP| Remains: " + bossHP + "HP's");
                    break;

                case 3:
                    System.out.println("You may move but it didnt do anything.");
                    space = enterScanner.nextLine();
                    System.out.println("Boss didnt lost HP| Remains: " + bossHP + "HP's");
                    break;

                case 4:
                    System.out.println("It couldn't have worked out");
                    space = enterScanner.nextLine();
                    System.out.println("Dragon's claw catch You.");
                    space = enterScanner.nextLine();
                    playerHp = playerHp - 40;
                    System.out.println("*" + playerName + " lost 40HP*");
                    System.out.println(playerName+" now have "+playerHp+" HP's and "+playerArmorPoints+" AR's");
                    if(playerHp<0){playerHp=0;death();}
                    break;


                default:
                    System.out.println("Well Dragon didnt let You rest Boy.");
                    space = enterScanner.nextLine();
                    System.out.println("He ate You before You had time to rest");
                    space = enterScanner.nextLine();
                    death();
                    break;
            }

        } //zapetlanie wyrazow po nr 3



    }
    public  void  victory(){
        System.out.println("Congratulations!!!\n\nYou killed Legendary Dragon!\n ");
        space = enterScanner.nextLine();
        System.out.println("\nITEM FOUND : PASS COIN\n");
        space = enterScanner.nextLine();
        System.out.println("ITEM FOUND : Dragon bag");
        System.out.println(" *Durability: 30+");
        System.out.println(" *Capacity: 55+");
        System.out.println(" *Weight: 50-");
        System.out.println(" *Speed Reduction: 40-");
        space = enterScanner.nextLine();
        System.out.println("Lets go to Gate!");
        pass=true;
        townGateRevisited();

    }
}



/*Trzeba ogarnac jutro kod z try catch by upewnic sie ze wpisywane dane sa napewno odpowiednim typem danych
I tak probowalem z hasNextInt() i if ale to nie dziala .Tak samo to try catch

Ważne:
Pamietaj ze jak cos zmieniasz w townGate musisz takze w tym revisited. 1:23 ide spac| nastepnego dnia skonczone o 23:11 z
korektami gramatyki

Na jutro :
If haveNextInt() returns false, you need to throw away the bad input by calling nextLine(), or else
any following scanner calls will keep trying to process the same bad input without letting the user enter anything.
https://stackoverflow.com/questions/56505010/java-scanner-the-scanner-hasnextint-is-not-working-properly
 */