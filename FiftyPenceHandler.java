package VendingMachine;

public class FiftyPenceHandler extends CoinHandlerBase {
	@Override
	public CoinEvaluationResult EvaluateCoin(Coin coin)
    {
        if (Math.abs(coin.weight - 8) < 0.02 && Math.abs(coin.diameter - 27.3) < 0.15)
        {
            System.out.println("Captured 50 pence");
            return CoinEvaluationResult.Accepted;
        }
        if (_successor != null)
        {
            return _successor.EvaluateCoin(coin);
        }
        System.out.println("a counterfeit has been checked"); 
        return CoinEvaluationResult.Rejected;
    }

}
