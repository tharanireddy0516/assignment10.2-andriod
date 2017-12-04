package com.example.tharani.listfragment;
/*import is libraries imported for writing the code
* Bundle handles the orientation of the activity
*/

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Tharani on 12/4/2017.
 */

public class FourthLayout extends Fragment {
    /*A Fragment represents a behavior or a portion of user interface in an Activity
   * It is a piece of activity which enables more activity design and is a kind of sub activity
   * It has its own behavior,life cycle,layout*/
    //declaration of variables
    //declaration
    TextView txtViw4;

    /**
     * implementing the onCreateView() to provide a layout for a fragment..
     * @param inflater-A LayoutInflater is one of the Android System Services that is responsible for taking your XML files that define a layout,
     *                and converting them into View objects
     * @param container- is important in order for the system to apply layout
     *                   parameters to the root view of the inflated layout, specified
     *                   by the parent view in which it's going.
     * @param savedInstanceState-parameter is a Bundle that provides data
     *                          about the previous instance of the fragment
     * @return- View this is the root of fragment's layout*/
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_four, container, false);
        view.findViewById(R.id.lay4);
        //in here casting variable
        txtViw4 = view.findViewById(R.id.lay4);
        String string = "The Daily Express is a daily national middle market tabloid newspaper in the United Kingdom\n" +
                " It is the flagship title of Express Newspapers, a subsidiary of Northern & Shell" +
                " was first published as a broadsheet in 1900 by Sir Arthur Pearson. Its sister paper, the Sunday Express, was launched in 1918";
        txtViw4.setText(string);//setting the text
        //returning view
        return view;
        /*return means it return from method,causes a program control to transfer back to caller of method*/
    }
}
