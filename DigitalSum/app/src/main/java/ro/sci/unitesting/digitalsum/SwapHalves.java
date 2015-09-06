package ro.sci.unitesting.digitalsum;

/**
 * Created by Claudiu on 9/6/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Claudiu on 5/8/2015.
 */
public class SwapHalves extends Activity implements View.OnClickListener
{
    Button bSwap;
    EditText etSwap;
    TextView tvSwap;

    public void onCreate(Bundle bundleSwap)
    {
        super.onCreate(bundleSwap);
        setContentView(R.layout.swaphalves);

        bSwap = (Button)findViewById(R.id.bSwap);
        bSwap.setOnClickListener(this);

        etSwap = (EditText)findViewById(R.id.etSwap);
        tvSwap = (TextView)findViewById(R.id.tvSwap);
    }
    public String  swapping(String word)
    {
        if (word == null)
        {
            word="";
        }
        String firsthalf="";
        String secondhalf="";
        int length = word.length();
        if (length % 2 == 0)
        {
            firsthalf = word.substring(0,length/2);
            secondhalf = word.substring(length/2,length);
        }
        else if (length % 2 != 0)
        {
            firsthalf = word.substring(0,length/2+1);
            secondhalf = word.substring(length/2+1,length);
        }

        String swapped = secondhalf+firsthalf;
        return swapped;
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.bSwap:
                String enteredWord = etSwap.getText().toString();
                tvSwap.setText("Swapped Word: "+swapping(enteredWord));
                break;
        }
    }
}
