package ro.sci.unitesting.digitalsum;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.Button;
import android.widget.TextView;

import junit.framework.Assert;

/**
 * Created by sebi on 5/28/15.
 * Simple ActivityTest used to check the main functionality of PrimDigitsSumActivity.
 */
public class CalculatorActivityTest extends ActivityInstrumentationTestCase2<Calculator> {


    public CalculatorActivityTest() {
        super(Calculator.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(true);
    }


    @MediumTest
    public void testNumbers() throws Exception {
        final Button button1 =
                (Button) getActivity()
                        .findViewById(R.id.button1);
        Assert.assertNotNull(button1);
       // Assert.assertNotNull(getActivity().findViewById(R.id.digitInput));
        Assert.assertNotNull(getActivity().findViewById(R.id.screen));
    }
    @LargeTest
    // TODO - CODE REVIEW - andrei | 9/10/15 - Why is this a LargeTest? You should read up on what Small/Medium/Large Tests mean.
    // TODO - CODE REVIEW - andrei | 9/10/15 - Please use camelCasing in test methods as well.
    public void test_button_1() throws Exception {

        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button1 = (Button) getActivity().findViewById(R.id.button1);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button1.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("1", result.getText().toString());
    }
    @LargeTest
    public void test_button_2() throws Exception {

        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button2 = (Button) getActivity().findViewById(R.id.button2);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button2.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("2", result.getText().toString());
    }
    @LargeTest
    public void test_combination_of_two_numbers() throws Exception {
        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button2 = (Button) getActivity().findViewById(R.id.button2);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button2.callOnClick();
            }
        });
        final Button button3 = (Button) getActivity().findViewById(R.id.button3);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button3.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("23", result.getText().toString());
    }
    @LargeTest
    public void test_simple_add() throws Exception {
        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button2 = (Button) getActivity().findViewById(R.id.button2);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button2.callOnClick();
            }
        });
        final Button add = (Button) getActivity().findViewById(R.id.buttonAdd);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                add.callOnClick();
            }
        });
        final Button button3 = (Button) getActivity().findViewById(R.id.button3);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button3.callOnClick();
            }
        });
        final Button equal = (Button) getActivity().findViewById(R.id.buttonExe);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                equal.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("5.0", result.getText().toString());
    }
    @LargeTest
    public void test_simple_substraction() throws Exception {
        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button2 = (Button) getActivity().findViewById(R.id.button2);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button2.callOnClick();
            }
        });
        final Button add = (Button) getActivity().findViewById(R.id.buttonSub);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                add.callOnClick();
            }
        });
        final Button button3 = (Button) getActivity().findViewById(R.id.button3);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button3.callOnClick();
            }
        });
        final Button equal = (Button) getActivity().findViewById(R.id.buttonExe);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                equal.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("-1.0", result.getText().toString());
    }
    @LargeTest
    public void test_simple_division() throws Exception {
        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button9 = (Button) getActivity().findViewById(R.id.button9);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button9.callOnClick();
            }
        });
        final Button div = (Button) getActivity().findViewById(R.id.buttonDiv);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                div.callOnClick();
            }
        });
        final Button button7 = (Button) getActivity().findViewById(R.id.button7);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button7.callOnClick();
            }
        });
        final Button equal = (Button) getActivity().findViewById(R.id.buttonExe);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                equal.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("1.2857143", result.getText().toString());
    }
    @LargeTest
    public void test_simple_multiplication() throws Exception {
        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button6 = (Button) getActivity().findViewById(R.id.button6);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button6.callOnClick();
            }
        });
        final Button multi = (Button) getActivity().findViewById(R.id.buttonMulti);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                multi.callOnClick();
            }
        });
        final Button button4 = (Button) getActivity().findViewById(R.id.button4);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button4.callOnClick();
            }
        });
        final Button equal = (Button) getActivity().findViewById(R.id.buttonExe);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                equal.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("24.0", result.getText().toString());
    }
    @LargeTest
    public void test_simple_modulo() throws Exception {
        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button6 = (Button) getActivity().findViewById(R.id.button6);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button6.callOnClick();
            }
        });
        final Button button0 = (Button) getActivity().findViewById(R.id.button0);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button0.callOnClick();
            }
        });
        final Button modulo = (Button) getActivity().findViewById(R.id.buttonMod);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                modulo.callOnClick();
            }
        });
        final Button button4 = (Button) getActivity().findViewById(R.id.button4);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button4.callOnClick();
            }
        });
        final Button button5 = (Button) getActivity().findViewById(R.id.button5);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button5.callOnClick();
            }
        });
        final Button equal = (Button) getActivity().findViewById(R.id.buttonExe);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                equal.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("15.0", result.getText().toString());
    }
    @LargeTest
    public void test_power_raise() throws Exception {
        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button6 = (Button) getActivity().findViewById(R.id.button6);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button6.callOnClick();
            }
        });
        final Button power = (Button) getActivity().findViewById(R.id.buttonPow);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                power.callOnClick();
            }
        });
        final Button button3 = (Button) getActivity().findViewById(R.id.button3);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button3.callOnClick();
            }
        });
        final Button equal = (Button) getActivity().findViewById(R.id.buttonExe);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                equal.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("216.0", result.getText().toString());
    }
    @LargeTest
    public void test_SQRT() throws Exception {
        //EditText input = (EditText) getActivity().findViewById(R.id.digitInput);
        //setInputText(input, "123");
        final Button button6 = (Button) getActivity().findViewById(R.id.button6);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button6.callOnClick();
            }
        });
        final Button button4 = (Button) getActivity().findViewById(R.id.button4);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                button4.callOnClick();
            }
        });
        final Button SQRT= (Button) getActivity().findViewById(R.id.buttonSqr);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                SQRT.callOnClick();
            }
        });

        final Button equal = (Button) getActivity().findViewById(R.id.buttonExe);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                equal.callOnClick();
            }
        });
        TextView result = (TextView) getActivity().findViewById(R.id.screen);
        Assert.assertEquals("8.0", result.getText().toString());
    }


    /*private void setInputText(final EditText input, String text) throws Exception {
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
    } */

}
