package VendingMachine;

public class TwentyPenceHandler extends CoinHandlerBase{
	@Override
	public CoinEvaluationResult EvaluateCoin(Coin coin)
    {
        if (Math.abs(coin.weight - 5) < 0.01 && Math.abs(coin.diameter - 21.4) < 0.1)
        {
            System.out.println("Captured 20 pence");
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
