public class TransactionViewModel extends ViewModel {

    private TransactionRepository repository;

    public TransactionViewModel() {
        repository = new TransactionRepository();
    }

    public LiveData<Resource<List<TransactionModel>>> getTransactions(String shopUnid) {
        return repository.getTransactions(shopUnid);
    }
}
