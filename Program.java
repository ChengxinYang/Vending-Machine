package VendingMachine;

class Program
{
    public static void main(String args[])
    {
        FivePenceHandler h5 = new FivePenceHandler();
        TenPenceHandler h10 = new TenPenceHandler();
        TwentyPenceHandler h20 = new TwentyPenceHandler();
        FiftyPenceHandler h50 = new FiftyPenceHandler();
        OnePoundHandler h100 = new OnePoundHandler();
        
        //set successor for each of the processing object
        h5.SetSuccessor(h10);
        h10.SetSuccessor(h20);
        h20.SetSuccessor(h50);
        h50.SetSuccessor(h100);

        //test using 3 types of coins
        //ten pence
        Coin tenPence = new Coin();
        tenPence.weight = 6.5F;
        tenPence.diameter = 24.49F;
        
        //fifty pence
        Coin fiftyPence = new Coin();
        fiftyPence.weight = 8.01F;
        fiftyPence.diameter = 27.31F;
        
        //counterfeit pound
        Coin counterfeitPound = new Coin();
        counterfeitPound.weight = 9F;
        counterfeitPound.diameter = 22.5F;
        
        System.out.println(h5.EvaluateCoin(tenPence));
        System.out.println();
        System.out.println();
        System.out.println(h5.EvaluateCoin(fiftyPence));
        System.out.println();
        System.out.println();
        System.out.println(h5.EvaluateCoin(counterfeitPound));
    }
}