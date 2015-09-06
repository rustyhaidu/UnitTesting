package ro.sci.unitesting.digitalsum;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import junit.framework.Assert;

/**
 * Created by sebi on 5/28/15.
 * Simple ActivityTest used to check the main functionality of PrimDigitsSumActivity.
 */
public class DigiSumActivityTest extends ActivityInstrumentationTestCase2<PrimDigitsSumActivity> {


    public DigiSumActivityTest() {
        super(PrimDigitsSumActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(true);
    }


    @MediumTest
    public void testLayout() throws Exception {
        final Button compute =
                (Button) getActivity()
                        .findViewById(R.id.compute);

        Assert.assertNotNull(compute);


        Assert.assertNotNull(getActivity().findViewById(R.id.digitInput));

        Assert.assertNotNull(getActivity().findViewById(R.id.sum_out_put));
    }


    @LargeTest
    public void test_compute_123() throws Exception {

        EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        setInputText(input, "123");


        final Button compute = (Button) getActivity().findViewById(R.id.compute);

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                compute.callOnClick();
            }
        });


        TextView result = (TextView) getActivity().findViewById(R.id.sum_out_put);
        Assert.assertEquals("5", result.getText().toString());

    }

    private void setInputText(final EditText input, String text) throws Exception {
        // Send string input value
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                input.requestFocus();
            }
        });

        getInstrumentation().waitForIdleSync();
        getInstrumentation().sendStringSync(text);
        getInstrumentation().waitForIdleSync();
    }

}
