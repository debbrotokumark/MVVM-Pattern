public interface ApiService {

    @FormUrlEncoded
    @POST("your_php_file.php") 
    Call<TransactionResponse> getTransactions(
            @Field("key") String key,
            @Field("shopUnid") String shopUnid
    );
}
