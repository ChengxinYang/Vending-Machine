package VendingMachine;

public class TenPenceHandler extends CoinHandlerBase{
	 @Override
	 public CoinEvaluationResult EvaluateCoin(Coin coin)
	    {
	        if (Math.abs(coin.weight - 6.5) < 0.03 && Math.abs(coin.diameter - 24.5) < 0.15)
	        {
	            System.out.println("Captured 10 pence");
	            return CoinEvaluationResult.Accepted;
	        }
	        if (_successor != null)
	        {
	            return _successor.EvaluateCoin(coin);
	        }
	        else{
	        	System.out.println("a counterfeit has been checked");
	        	return CoinEvaluationResult.Rejected;
	        }
	    }

}
