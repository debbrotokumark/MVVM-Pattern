public class TransactionRepository {

    private ApiService apiService;

    public TransactionRepository() {
        apiService = RetrofitClient.getApiService();
    }

    public LiveData<Resource<List<TransactionModel>>> getTransactions(String shopUnid) {

        MutableLiveData<Resource<List<TransactionModel>>> liveData = new MutableLiveData<>();
        liveData.setValue(Resource.loading());

        apiService.getTransactions("4g(h5P3^f0#k^&351@7*!3218", shopUnid)
                .enqueue(new Callback<TransactionResponse>() {
                    @Override
                    public void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {

                        if (response.isSuccessful() && response.body() != null) {

                            if ("000".equals(response.body().getErrorCode())) {
                                liveData.setValue(Resource.success(response.body().getData()));
                            } else {
                                liveData.setValue(Resource.error("No data found"));
                            }

                        } else {
                            liveData.setValue(Resource.error("Server Error: " + response.code()));
                        }
                    }

                    @Override
                    public void onFailure(Call<TransactionResponse> call, Throwable t) {
                        liveData.setValue(Resource.error("Network Error: " + t.getMessage()));
                    }
                });

        return liveData;
    }
}
