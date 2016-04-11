package VendingMachine;

public class OnePoundHandler extends CoinHandlerBase{
	@Override
	public CoinEvaluationResult EvaluateCoin(Coin coin)
    {
        if (Math.abs(coin.weight - 9.5) < 0.02 && Math.abs(coin.diameter - 22.5) < 0.13)
        {
            System.out.println("Captured 1 pound");
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
