
/**
 * this is the main module for the crusader

 *
 * Merusadas
 *
 */
import java.util.List;
import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        String choice = " ";
        char cho = ' ';
        System.out.println("Are you VIT or SPT sader?");
        choice = scan.next();
        cho = choice.toUpperCase().charAt(0);
        if(cho=='V')
        {
        System.out.println("Welcome to the crusader Divine Innovocation calculator");
        System.out.println("Created by: Merusadas");
        System.out.println();
        
        System.out.println("Enter a dungeon or training room and use Sign of Protection");
        System.out.println("What is your current Vit?");
        double vit = 0;
        vit = scan.nextDouble(); //testValue: 4599
        
        
        
        System.out.println("What is your DI lv?");
        int diLevel = 0;
        diLevel = scan.nextInt(); //test value: 50
        double diStat = 0;
        switch (diLevel)
        {
            case 1: diStat = 20;
            break;
            case 2: diStat = 22;
            break;
            case 3: diStat = 26;
            break;
            case 4: diStat = 28;
            break;
            case 5: diStat = 31;
            break; 
            case 6: diStat = 35;
            break;
            case 7: diStat = 38;
            break;
            case 8: diStat = 41;
            break;
            case 9: diStat = 45;
            break;
            case 10: diStat = 48;
            break;
            case 11: diStat = 53;
            break;
            case 12: diStat = 56;
            break;
            case 13: diStat = 61;
            break;
            case 14: diStat = 65;
            break;
            case 15: diStat = 69;
            break;
            case 16: diStat = 74;
            break;
            case 17: diStat = 79;
            break;
            case 18: diStat = 84;
            break;
            case 19: diStat = 89;
            break;
            case 20: diStat = 94;
            break;
            case 21: diStat = 99;
            break;
            case 22: diStat = 105;
            break;
            case 23: diStat = 110;
            break;
            case 24: diStat = 116;
            break;
            case 25: diStat = 122;
            break;
            case 26: diStat = 128;
            break;
            case 27: diStat = 134;
            break;
            case 28: diStat = 140;
            break;
            case 29: diStat = 147;
            break;
            case 30: diStat = 153;
            break;
            case 31: diStat = 160;
            break;
            case 32: diStat = 166;
            break;
            case 33: diStat = 173;
            break;
            case 34: diStat = 180;
            break;
            case 35: diStat = 188;
            break;
            case 36: diStat = 194;
            break;
            case 37: diStat = 201;
            break;
            case 38: diStat = 209;
            break;
            case 39: diStat = 217;
            break;
            case 40: diStat = 224;
            break;
            case 41: diStat = 234;
            break;
            case 42: diStat = 241;
            break;
            case 43: diStat = 250;
            break;
            case 44: diStat = 258;
            break;
            case 45: diStat = 267;
            break;
            case 46: diStat = 275;
            break;
            case 47: diStat = 285;
            break;
            case 48: diStat = 293;
            break;
            case 49: diStat = 303;
            break;
            case 50: diStat = 311;
            break;
            case 51: diStat = 319;
            break; 
            case 52: diStat = 328;
            break;
            case 53: diStat = 337;
            break;
            case 54: diStat = 344;
            break;
            case 55: diStat = 354;
            break;
            case 56: diStat = 362;
            default: System.out.println("Your DI level is either very high for our server saders to achieve, or negative");
            break;
        }
        char resultVow = ' ';
        char resultSin = ' ';
        String userInput=" ";    
        do
        {
        System.out.println("Are you using vow9 as your DI gears? (please type either Y or N)");
        userInput = scan.next();
        userInput = userInput.toUpperCase();
        resultVow = userInput.charAt(0);
        if(resultVow != 'Y' && resultVow != 'N')
        System.out.println("Please type an appropriate response");
    }while(resultVow != 'Y'&& resultVow != 'N');
        
        if(resultVow == 'N')
        {
            do
            {
        System.out.println("Are you using 3 Seven sins as your DI gears? (please type either Y or N)");
        userInput = scan.next();
        userInput = userInput.toUpperCase();
        resultSin = userInput.charAt(0);
        if(resultSin != 'Y' && resultSin != 'N')
        System.out.println("Please type an appropriate response");
    }while(resultSin != 'Y' && resultSin != 'N');
       }
        if(resultVow == 'Y' && resultSin == 'Y')
        {
            System.out.println("You cannot have 9 vows and 3 sins together");
        }
        if(resultVow == 'Y')
        {
            diStat += 50;
            System.out.println("Your DI level is: "+diLevel+ " with the vows, total of "+(int)diStat+" STR is given");
        }
        else if(resultSin == 'Y')
        {
        diStat = diStat*1.20;
        System.out.println("Your DI level is: "+diLevel+" with 3 sins, total of "+(int)diStat+" STR is given");   
        }   
     
        else
        {
            System.out.println("Your DI level is: "+diLevel+" and it gives "+diStat+" amount of STR");
        }
        double totalBuff = 0;
        totalBuff = ((vit/630)+1)*(diStat);
        System.out.println("Your current DI buffs you by "+(int)totalBuff +" STR for the party");
        System.out.println();
        System.out.println("Lets calculate DI buff you want to test");
        char repeat = ' ';
        double newVit = 0;
        int newdiLevel = 0;
        double newTotalBuff = 0;
        do
        {
            System.out.println("How much vit will it have?");
            newVit = scan.nextDouble();
            System.out.println("What is the DI level?");
            newdiLevel = scan.nextInt();
            double newdiStat = 0;
            
        switch (newdiLevel)
        {
            case 1: newdiStat = 20;
            break;
            case 2: newdiStat = 22;
            break;
            case 3: newdiStat = 26;
            break;
            case 4: newdiStat = 28;
            break;
            case 5: newdiStat = 31;
            break; 
            case 6: newdiStat = 35;
            break;
            case 7: newdiStat = 38;
            break;
            case 8: newdiStat = 41;
            break;
            case 9: newdiStat = 45;
            break;
            case 10: newdiStat = 48;
            break;
            case 11: newdiStat = 53;
            break;
            case 12: newdiStat = 56;
            break;
            case 13: newdiStat = 61;
            break;
            case 14: newdiStat = 65;
            break;
            case 15: newdiStat = 69;
            break;
            case 16: newdiStat = 74;
            break;
            case 17: newdiStat = 79;
            break;
            case 18: newdiStat = 84;
            break;
            case 19: newdiStat = 89;
            break;
            case 20: newdiStat = 94;
            break;
            case 21: newdiStat = 99;
            break;
            case 22: newdiStat = 105;
            break;
            case 23: newdiStat = 110;
            break;
            case 24: newdiStat = 116;
            break;
            case 25: newdiStat = 122;
            break;
            case 26: newdiStat = 128;
            break;
            case 27: newdiStat = 134;
            break;
            case 28: newdiStat = 140;
            break;
            case 29: newdiStat = 147;
            break;
            case 30: newdiStat = 153;
            break;
            case 31: newdiStat = 160;
            break;
            case 32: newdiStat = 166;
            break;
            case 33: newdiStat = 173;
            break;
            case 34: newdiStat = 180;
            break;
            case 35: newdiStat = 188;
            break;
            case 36: newdiStat = 194;
            break;
            case 37: newdiStat = 201;
            break;
            case 38: newdiStat = 209;
            break;
            case 39: newdiStat = 217;
            break;
            case 40: newdiStat = 224;
            break;
            case 41: newdiStat = 234;
            break;
            case 42: newdiStat = 241;
            break;
            case 43: newdiStat = 250;
            break;
            case 44: newdiStat = 258;
            break;
            case 45: newdiStat = 267;
            break;
            case 46: newdiStat = 275;
            break;
            case 47: newdiStat = 285;
            break;
            case 48: newdiStat = 293;
            break;
            case 49: newdiStat = 303;
            break;
            case 50: newdiStat = 311;
            break;
            case 51: newdiStat = 319;
            break; 
            case 52: newdiStat = 328;
            break;
            case 53: newdiStat = 337;
            break;
            case 54: newdiStat = 344;
            break;
            case 55: newdiStat = 354;
            break;
            case 56: newdiStat = 362;
            default: System.out.println("Your DI level is either very high for our server saders to achieve, or negative");
            break;
        }
        do
        {
        System.out.println("Are you using vow9 as your DI gears? (please type either Y or N)");
        userInput = scan.next();
        userInput = userInput.toUpperCase();
        resultVow = userInput.charAt(0);
        if(resultVow != 'Y' && resultVow != 'N')
        System.out.println("Please type an appropriate response");
    }while(resultVow != 'Y'&& resultVow != 'N');
        
        if(resultVow == 'N')
        {
            do
            {
        System.out.println("Are you using 3 Seven sins as your DI gears? (please type either Y or N)");
        userInput = scan.next();
        userInput = userInput.toUpperCase();
        resultSin = userInput.charAt(0);
        if(resultSin != 'Y' && resultSin != 'N')
        System.out.println("Please type an appropriate response");
    }while(resultSin != 'Y' && resultSin != 'N');
       }
        if(resultVow == 'Y' && resultSin == 'Y')
        {
            System.out.println("You cannot have 9 vows and 3 sins together");
        }
        if(resultVow == 'Y')
        {
            newdiStat += 50;
            System.out.println("Your DI level is: "+newdiLevel+ " with the vows, total of "+(int)newdiStat+" STR is given");
        }
        else if(resultSin == 'Y')
        {
        newdiStat = newdiStat*1.20;
        System.out.println("Your DI level is: "+newdiLevel+" with 3 sins, total of "+(int)newdiStat+" STR is given");   
        }   
     
        else
        {
            System.out.println("Your DI level is: "+newdiLevel+" and it gives "+(int)newdiStat+" amount of STR");
        }
        newTotalBuff = ((newVit/630)+1)*(newdiStat);
        System.out.println("Your DI in theory will buff by "+(int)newTotalBuff+" STR");
        System.out.println("Your current DI buff by "+(int)totalBuff+" STR");
        if(totalBuff > newTotalBuff)
        {
            System.out.println("Your current gears buff more by "+(int)(totalBuff -newTotalBuff)+" STR");
            }
        if(newTotalBuff > totalBuff)
        {
            System.out.println("Your gears in theory will buff more by "+(int)(newTotalBuff - totalBuff)+" STR");
        }
        System.out.println("Would you like to try again");
        userInput = scan.next();
        userInput =  userInput.toUpperCase();
        repeat = userInput.charAt(0);
        System.out.println();
}while(repeat == 'Y');
}
if(cho == 'S')
{
System.out.println("Welcome to the crusader Divine Innovocation calculator");
        System.out.println("Created by: Merusadas");
        System.out.println();
        
        System.out.println("Enter a dungeon or training room and use Sign of Protection");
        System.out.println("What is your current Spt?");
        double vit = 0;
        vit = scan.nextDouble(); //testValue: 4599
        
        
        
        System.out.println("What is your DI lv?");
        int diLevel = 0;
        diLevel = scan.nextInt(); //test value: 50
        double diStat = 0;
        switch (diLevel)
        {
            case 1: diStat = 20;
            break;
            case 2: diStat = 22;
            break;
            case 3: diStat = 26;
            break;
            case 4: diStat = 28;
            break;
            case 5: diStat = 31;
            break; 
            case 6: diStat = 35;
            break;
            case 7: diStat = 38;
            break;
            case 8: diStat = 41;
            break;
            case 9: diStat = 45;
            break;
            case 10: diStat = 48;
            break;
            case 11: diStat = 53;
            break;
            case 12: diStat = 56;
            break;
            case 13: diStat = 61;
            break;
            case 14: diStat = 65;
            break;
            case 15: diStat = 69;
            break;
            case 16: diStat = 74;
            break;
            case 17: diStat = 79;
            break;
            case 18: diStat = 84;
            break;
            case 19: diStat = 89;
            break;
            case 20: diStat = 94;
            break;
            case 21: diStat = 99;
            break;
            case 22: diStat = 105;
            break;
            case 23: diStat = 110;
            break;
            case 24: diStat = 116;
            break;
            case 25: diStat = 122;
            break;
            case 26: diStat = 128;
            break;
            case 27: diStat = 134;
            break;
            case 28: diStat = 140;
            break;
            case 29: diStat = 147;
            break;
            case 30: diStat = 153;
            break;
            case 31: diStat = 160;
            break;
            case 32: diStat = 166;
            break;
            case 33: diStat = 173;
            break;
            case 34: diStat = 180;
            break;
            case 35: diStat = 188;
            break;
            case 36: diStat = 194;
            break;
            case 37: diStat = 201;
            break;
            case 38: diStat = 209;
            break;
            case 39: diStat = 217;
            break;
            case 40: diStat = 224;
            break;
            case 41: diStat = 234;
            break;
            case 42: diStat = 241;
            break;
            case 43: diStat = 250;
            break;
            case 44: diStat = 258;
            break;
            case 45: diStat = 267;
            break;
            case 46: diStat = 275;
            break;
            case 47: diStat = 285;
            break;
            case 48: diStat = 293;
            break;
            case 49: diStat = 303;
            break;
            case 50: diStat = 311;
            break;
            case 51: diStat = 319;
            break; 
            case 52: diStat = 328;
            break;
            case 53: diStat = 337;
            break;
            case 54: diStat = 344;
            break;
            case 55: diStat = 354;
            break;
            case 56: diStat = 362;
            default: System.out.println("Your DI level is either very high for our server saders to achieve, or negative");
            break;
        }
        char resultVow = ' ';
        char resultSin = ' ';
        String userInput=" ";    
        do
        {
        System.out.println("Are you using vow9 as your DI gears? (please type either Y or N)");
        userInput = scan.next();
        userInput = userInput.toUpperCase();
        resultVow = userInput.charAt(0);
        if(resultVow != 'Y' && resultVow != 'N')
        System.out.println("Please type an appropriate response");
    }while(resultVow != 'Y'&& resultVow != 'N');
        
        if(resultVow == 'N')
        {
            do
            {
        System.out.println("Are you using 3 Seven sins as your DI gears? (please type either Y or N)");
        userInput = scan.next();
        userInput = userInput.toUpperCase();
        resultSin = userInput.charAt(0);
        if(resultSin != 'Y' && resultSin != 'N')
        System.out.println("Please type an appropriate response");
    }while(resultSin != 'Y' && resultSin != 'N');
       }
        if(resultVow == 'Y' && resultSin == 'Y')
        {
            System.out.println("You cannot have 9 vows and 3 sins together");
        }
        if(resultVow == 'Y')
        {
            diStat += 44;
            System.out.println("Your DI level is: "+diLevel+ " with the vows, total of "+(int)diStat+" Int is given");
        }
        else if(resultSin == 'Y')
        {
        diStat = diStat*1.20;
        System.out.println("Your DI level is: "+diLevel+" with 3 sins, total of "+(int)diStat+" Int is given");   
        }   
     
        else
        {
            System.out.println("Your DI level is: "+diLevel+" and it gives "+diStat+" amount of Int");
        }
        double totalBuff = 0;
        totalBuff = ((vit/630)+1)*(diStat);
        System.out.println("Your current DI buffs you by "+(int)totalBuff +" Int for the party");
        System.out.println();
        System.out.println("Lets calculate DI buff you want to test");
        char repeat = ' ';
        double newVit = 0;
        int newdiLevel = 0;
        double newTotalBuff = 0;
        do
        {
            System.out.println("How much spt will it have?");
            newVit = scan.nextDouble();
            System.out.println("What is the DI level?");
            newdiLevel = scan.nextInt();
            double newdiStat = 0;
            
        switch (newdiLevel)
        {
            case 1: newdiStat = 20;
            break;
            case 2: newdiStat = 22;
            break;
            case 3: newdiStat = 26;
            break;
            case 4: newdiStat = 28;
            break;
            case 5: newdiStat = 31;
            break; 
            case 6: newdiStat = 35;
            break;
            case 7: newdiStat = 38;
            break;
            case 8: newdiStat = 41;
            break;
            case 9: newdiStat = 45;
            break;
            case 10: newdiStat = 48;
            break;
            case 11: newdiStat = 53;
            break;
            case 12: newdiStat = 56;
            break;
            case 13: newdiStat = 61;
            break;
            case 14: newdiStat = 65;
            break;
            case 15: newdiStat = 69;
            break;
            case 16: newdiStat = 74;
            break;
            case 17: newdiStat = 79;
            break;
            case 18: newdiStat = 84;
            break;
            case 19: newdiStat = 89;
            break;
            case 20: newdiStat = 94;
            break;
            case 21: newdiStat = 99;
            break;
            case 22: newdiStat = 105;
            break;
            case 23: newdiStat = 110;
            break;
            case 24: newdiStat = 116;
            break;
            case 25: newdiStat = 122;
            break;
            case 26: newdiStat = 128;
            break;
            case 27: newdiStat = 134;
            break;
            case 28: newdiStat = 140;
            break;
            case 29: newdiStat = 147;
            break;
            case 30: newdiStat = 153;
            break;
            case 31: newdiStat = 160;
            break;
            case 32: newdiStat = 166;
            break;
            case 33: newdiStat = 173;
            break;
            case 34: newdiStat = 180;
            break;
            case 35: newdiStat = 188;
            break;
            case 36: newdiStat = 194;
            break;
            case 37: newdiStat = 201;
            break;
            case 38: newdiStat = 209;
            break;
            case 39: newdiStat = 217;
            break;
            case 40: newdiStat = 224;
            break;
            case 41: newdiStat = 234;
            break;
            case 42: newdiStat = 241;
            break;
            case 43: newdiStat = 250;
            break;
            case 44: newdiStat = 258;
            break;
            case 45: newdiStat = 267;
            break;
            case 46: newdiStat = 275;
            break;
            case 47: newdiStat = 285;
            break;
            case 48: newdiStat = 293;
            break;
            case 49: newdiStat = 303;
            break;
            case 50: newdiStat = 311;
            break;
            case 51: newdiStat = 319;
            break; 
            case 52: newdiStat = 328;
            break;
            case 53: newdiStat = 337;
            break;
            case 54: newdiStat = 344;
            break;
            case 55: newdiStat = 354;
            break;
            case 56: newdiStat = 362;
            default: System.out.println("Your DI level is either very high for our server saders to achieve, or negative");
            break;
        }
        do
        {
        System.out.println("Are you using vow9 as your DI gears? (please type either Y or N)");
        userInput = scan.next();
        userInput = userInput.toUpperCase();
        resultVow = userInput.charAt(0);
        if(resultVow != 'Y' && resultVow != 'N')
        System.out.println("Please type an appropriate response");
    }while(resultVow != 'Y'&& resultVow != 'N');
        
        if(resultVow == 'N')
        {
            do
            {
        System.out.println("Are you using 3 Seven sins as your DI gears? (please type either Y or N)");
        userInput = scan.next();
        userInput = userInput.toUpperCase();
        resultSin = userInput.charAt(0);
        if(resultSin != 'Y' && resultSin != 'N')
        System.out.println("Please type an appropriate response");
    }while(resultSin != 'Y' && resultSin != 'N');
       }
        if(resultVow == 'Y' && resultSin == 'Y')
        {
            System.out.println("You cannot have 9 vows and 3 sins together");
        }
        if(resultVow == 'Y')
        {
            newdiStat += 50;
            System.out.println("Your DI level is: "+newdiLevel+ " with the vows, total of "+(int)newdiStat+" INT is given");
        }
        else if(resultSin == 'Y')
        {
        newdiStat = newdiStat*1.20;
        System.out.println("Your DI level is: "+newdiLevel+" with 3 sins, total of "+(int)newdiStat+" INT is given");   
        }   
     
        else
        {
            System.out.println("Your DI level is: "+newdiLevel+" and it gives "+(int)newdiStat+" amount of INT");
        }
        newTotalBuff = ((newVit/630)+1)*(newdiStat);
        System.out.println("Your DI in theory will buff by "+(int)newTotalBuff+" INT");
        System.out.println("Your current DI buff by "+(int)totalBuff+" INT");
        if(totalBuff > newTotalBuff)
        {
            System.out.println("Your current gears buff more by "+(int)(totalBuff -newTotalBuff)+" INT");
            }
        if(newTotalBuff > totalBuff)
        {
            System.out.println("Your gears in theory will buff more by "+(int)(newTotalBuff - totalBuff)+" INT");
        }
        System.out.println("Would you like to try again");
        userInput = scan.next();
        userInput =  userInput.toUpperCase();
        repeat = userInput.charAt(0);
        System.out.println();
}while(repeat == 'Y');
}
}
}