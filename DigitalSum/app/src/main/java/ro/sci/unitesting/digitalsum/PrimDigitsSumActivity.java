package ro.sci.unitesting.digitalsum;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class PrimDigitsSumActivity extends Activity {

    private PrimeDigitsSum digitsSum = new PrimeDigitsSum();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_sum);
    }

    public void compute(View view) {

        String input = ((EditText)findViewById(R.id.digitInput)).getText().toString();
        try {

            long sum = digitsSum.calculateDigitsCum(input);
            ((TextView)findViewById(R.id.sum_out_put)).setText("" + sum);
        }catch (PrimeDigitsSum.InvalidNumberException ex) {
            new AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Invalid input: " + ex.getMessage())
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
    }
}
