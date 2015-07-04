package ajitsingh.com.androiddatabasedemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import ajitsingh.com.androiddatabasedemo.R;
import ajitsingh.com.androiddatabasedemo.database_helper.DatabaseHelper;
import ajitsingh.com.androiddatabasedemo.table.ProductTable;


public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ListView productList = (ListView) findViewById(R.id.products_list);

    DatabaseHelper databaseHelper = new DatabaseHelper(this);
    String[] from = new String[] {ProductTable.NAME, ProductTable.PRICE};
    int[] to = new int[] {R.id.product_name, R.id.product_price};

    productList.setAdapter(new SimpleCursorAdapter(this, R.layout.product_row, databaseHelper.getProductCursor(), from, to));
  }
}
