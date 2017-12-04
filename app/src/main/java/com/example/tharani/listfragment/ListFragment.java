package com.example.tharani.listfragment;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Tharani on 12/4/2017.
 */

public class ListFragment extends Fragment {
    /*A Fragment represents a behavior or a portion of user interface in an Activity
   * It is a piece of activity which enables more activity design and is a kind of sub activity
   * It has its own behavior,life cycle,layout*/
    //declaration of variables
    private OnItemSelectedListener listener;
    /**
     * now onCreateView Called to create the view hierarchy associated with the fragment.
     * @param inflater LayoutInflater is one of the Android System Services that is responsible for taking your XML files that define a layout,
     *                and converting them into View objects
     * @param container- is important in order for the system to apply layout
     *                   parameters to the root view of the inflated layout, specified
     *                   by the parent view in which it's going.
     * @param savedInstanceState-parameter is a Bundle that provides data
     *                          about the previous instance of the fragment
     * @return- View this is the root of fragment's layout*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        // casting variable
        Button review1 = view.findViewById(R.id.button);
        Button review2 = view.findViewById(R.id.button2);
        Button review3 = view.findViewById(R.id.button3);
        Button review4 = view.findViewById(R.id.button4);
        // setting on setOnClickListener for review1
        review1.setOnClickListener(new View.OnClickListener()
        {
            /*here updating details of all four layout classes*/
            public void onClick(View v) {
                updateDetail("layout_one");
            }
        });
        // setting on setOnClickListener for review2
        review2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                updateDetail("layout_two");
            }
        });
        // setting on setOnClickListener for review3
        review3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                updateDetail("layout_three");
            }
        });
        // setting on setOnClickListener for review4
        review4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                updateDetail("layout_four");
            }
        });
// returning view
        return view;
    }

    public interface OnItemSelectedListener {
        void onRssItemSelected(String link);
    }

    @Override
    public void onAttach(Context context)
            //Context allows access to application-specific resources and classes
    {
        super.onAttach(context);
        if (context instanceof OnItemSelectedListener)
        //using if condition to decide whether a certain statement will get executed or not
        {
            listener = (OnItemSelectedListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + " must implement ListFragment.OnItemSelectedListener");
            /*ClassCastException isThrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance*/
        }

    }

    public void updateDetail(String s) {//here details will get updated
        listener.onRssItemSelected(s);//An event listener is an interface in the View class that contains a single callback method.
    }
}


