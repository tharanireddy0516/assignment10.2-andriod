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

public class SecondLayout extends Fragment {
    //declaring variable
    TextView txtViw2;
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
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.layout_two,container,false);
        view.findViewById(R.id.lay2);
        txtViw2= view.findViewById(R.id.lay2);
        String string="The Hindu, started in 1878 as a weekly, became a daily in 1889 -\n" +
                "And from then on has been steadily growing to the circulation of 15,58,379 copies " +
                "The Hindu's independent editorial stand and its reliable and balanced presentation of the news have over the years" ;
        txtViw2.setText(string);
        return view;//returns view
        /*return means it return from method,causes a program control to transfer back to caller of method*/
    }
}
