public class TransactionActivity extends AppCompatActivity {

    private TransactionViewModel viewModel;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private TransactionAdapter adapter; // your custom Recyclerview adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);

        adapter = new TransactionAdapter();
        recyclerView.setAdapter(adapter);

        viewModel = new ViewModelProvider(this).get(TransactionViewModel.class);

        observeData();
        viewModel.getTransactions("SHOP123");  // dynamic value
    }

    private void observeData() {
        viewModel.getTransactions("SHOP123").observe(this, resource -> {

            switch (resource.status) {

                case LOADING:
                    progressBar.setVisibility(View.VISIBLE);
                    break;

                case SUCCESS:
                    progressBar.setVisibility(View.GONE);
                    adapter.submitList(resource.data);
                    break;

                case ERROR:
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(this, resource.message, Toast.LENGTH_SHORT).show();
                    break;
            }
        });
    }
}
