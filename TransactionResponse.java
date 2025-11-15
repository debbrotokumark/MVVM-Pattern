public class TransactionResponse {
    @SerializedName("errorCode")
    private String errorCode;

    @SerializedName("data")
    private List<TransactionModel> data;

    public String getErrorCode() {
        return errorCode;
    }

    public List<TransactionModel> getData() {
        return data;
    }
}
