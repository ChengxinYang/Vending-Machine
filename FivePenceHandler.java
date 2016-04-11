package VendingMachine;

public class FivePenceHandler extends CoinHandlerBase{
	@Override
	public CoinEvaluationResult EvaluateCoin(Coin coin)
    {
        if (Math.abs(coin.weight - 3.25) < 0.02 && Math.abs(coin.diameter - 18) < 0.1)
        {
            System.out.println("Captured 5 pence");
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
