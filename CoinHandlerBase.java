package VendingMachine;

public abstract class CoinHandlerBase {
	    protected CoinHandlerBase _successor;

	    public void SetSuccessor(CoinHandlerBase successor)
	    {
	        _successor = successor;
	    }

	    public abstract CoinEvaluationResult EvaluateCoin(Coin coin);
}
