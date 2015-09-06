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
public class SwapHalvesActivityTest extends ActivityInstrumentationTestCase2<SwapHalves> {


    public SwapHalvesActivityTest() {
        super(SwapHalves.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(true);
    }
    @LargeTest
    public void test_input() throws Exception {

        EditText input = (EditText) getActivity().findViewById(R.id.etSwap);
        setInputText(input, "123ty");

     String result = input.getText().toString();
        Assert.assertEquals("123ty", result);
    }


    @MediumTest
    public void testLayout() throws Exception {
        final Button swap =
                (Button) getActivity()
                        .findViewById(R.id.bSwap);

        Assert.assertNotNull(swap);

        Assert.assertNotNull(getActivity().findViewById(R.id.etSwap));
        Assert.assertNotNull(getActivity().findViewById(R.id.tvSwap));
    }


    @LargeTest
    public void test_swap_123() throws Exception {

        EditText input = (EditText) getActivity().findViewById(R.id.etSwap);
        setInputText(input, "123");

        final Button swap = (Button) getActivity().findViewById(R.id.bSwap);

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                swap.callOnClick();
            }
        });

        TextView result = (TextView) getActivity().findViewById(R.id.tvSwap);
        Assert.assertEquals("Swapped Word: 312", result.getText().toString());

    }
    public void test_swap_4325t() throws Exception {

        EditText input = (EditText) getActivity().findViewById(R.id.etSwap);
        setInputText(input, "4325t");


        final Button swap = (Button) getActivity().findViewById(R.id.bSwap);

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                swap.callOnClick();
            }
        });


        TextView result = (TextView) getActivity().findViewById(R.id.tvSwap);
        Assert.assertEquals("Swapped Word: 5t432", result.getText().toString());
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
