public class TransactionModel {

    @SerializedName("transactionId")
    private String transactionId;

    @SerializedName("shopUnid")
    private String shopUnid;

    @SerializedName("storeUnid")
    private String storeUnid;

    @SerializedName("storeName")
    private String storeName;

    @SerializedName("userid")
    private String userid;

    @SerializedName("userName")
    private String userName;

    @SerializedName("paymentType")
    private String paymentType;

    @SerializedName("date")
    private String date;

    @SerializedName("amount")
    private String amount;

    @SerializedName("billId_or_rePaidID")
    private String billIdOrRePaidId;

    // getters only (best practice)
}
