public class DrinkMaker {
    CoffeeMachineUI coffeeMachineUI;

    public Drink make(String command) {
        String drinkType = null;
        Integer sugar = 0;
        boolean stick;

        char[] charsInCommand = command.toCharArray();

        if(charsInCommand[0] == 'M'){
            coffeeMachineUI.printMessage(command);
        }
        else if(charsInCommand[0] == 'H'){
            drinkType = "Hot Chocolate";
        }
        else if(charsInCommand[0] == 'T'){
            drinkType = "Tea";
        }
        else{
            drinkType = "Coffee";
        }

        if(charsInCommand[2] != ':'){
            sugar = Integer.parseInt(String.valueOf(charsInCommand[2]));
            stick = true;
        }
        else{
            stick = false;
        }

        if (drinkType == "Hot Chocolate") {
            return new HotChocolate(sugar, stick);
        }
        else if (drinkType == "Coffee") {
            return new Coffee(sugar, stick);
        }
        else{
            return new Tea(sugar, stick);
        }

    }
}