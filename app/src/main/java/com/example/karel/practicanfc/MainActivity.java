package com.example.karel.practicanfc;

import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "NfcDemo";

    private TextView kTextView;
    private NfcAdapter kNfcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kTextView = (TextView) findViewById(R.id.textView_explanation);

        kNfcAdapter = NfcAdapter.getDefaultAdapter(this);

        if (kNfcAdapter == null) {
            Toast.makeText(this, "This device doesn't support NFC.", Toast.LENGTH_LONG).show();
            finish();
            return;

        }

        if (!kNfcAdapter.isEnabled()) {
            kTextView.setText("NFC is Disabled.");
        } else {
           kTextView.setText("NFC is Enabled");
        }

    }
}
