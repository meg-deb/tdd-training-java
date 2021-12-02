public class DrinkMaker {
    CommunicatorWithTheUser communicatorWithTheUser;

    public DrinkMaker(CommunicatorWithTheUser communicatorWithTheUser){
        this.communicatorWithTheUser = communicatorWithTheUser;
    }

    public Drink make(String command) {
        int sugar;
        boolean stick;

        String[] order = command.split(":");

        if(order[0].equals("M")){
            communicatorWithTheUser.printMessage(command.substring(2));
            return null;
        }

        if(order.length > 1){
            sugar = Integer.parseInt(String.valueOf(order[1]));
            stick = true;
        }
        else{
            stick = false;
            sugar = 0;
        }

        if (order[0].equals("H")) {
            return new HotChocolate(sugar, stick);
        }
        else if (order[0].equals("C")) {
            return new Coffee(sugar, stick);
        }
        else{
            return new Tea(sugar, stick);
        }
    }
}