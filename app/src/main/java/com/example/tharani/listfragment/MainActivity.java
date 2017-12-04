package com.example.tharani.listfragment;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListFragment.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onRssItemSelected(String link)
    {
        /**
         * in here creating an object of fragment manager..
         * that help us to handle  Android fragment trasaction between fragments.
         *
         */

        FragmentManager fragmentManager = getFragmentManager();
        //now in here  creating object of fragment transaction
         /*Interaction with fragments is done through FragmentManager*/
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        FirstLayout layoutOne;
        SecondLayout layoutTwo;
        ThirdLayout layoutThree;
        FourthLayout layoutFour;

        // now in here applying condition for linking the layout with frame layout..
        if (link.equals("layout_one"))//using if condition to decide whether a certain statement will get executed or not
        {
            layoutOne = new FirstLayout();
            fragmentTransaction.replace(R.id.fragment_container,layoutOne );
            fragmentTransaction.commit();
        } else if (link.equals("layout_two"))//else if followed by if condition if the statement gets false in if condition
        {
            layoutTwo = new SecondLayout();
            fragmentTransaction.replace(R.id.fragment_container, layoutTwo);
            fragmentTransaction.commit();
        } else if (link.equals("layout_three"))//else if followed by if condition if the statement gets false in if condition
        {
            layoutThree = new ThirdLayout();
            fragmentTransaction.replace(R.id.fragment_container, layoutThree);
            fragmentTransaction.commit();
        } else if (link.equals("layout_four"))//else if followed by if condition if the statement gets false in if condition
        {
            layoutFour = new FourthLayout();
            fragmentTransaction.replace(R.id.fragment_container, layoutFour);//else if followed by if condition if the statement gets false in if condition
            fragmentTransaction.commit();
        }
    }
}

