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

public class ThirdLayout extends Fragment{
    //declaring variable
    TextView txtViw3;
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
        View view= inflater.inflate(R.layout.layout_three,container,false);
        view.findViewById(R.id.lay3);
        txtViw3= view.findViewById(R.id.lay3);
        String string="Indian Express Limited is an Indian news media publishing company" +
                " It is published in Mumbai by Indian Express Group. In 1999, eight years after the group's founder Ramnath Goenka's death in 1991 " +
                "The Indian Express and The Financial Express in English, the Loksatta in Marathi and the Jansatta in Hindi";
        txtViw3.setText(string);//setting text
        return view;//returns view
        /*return means it return from method,causes a program control to transfer back to caller of method*/

    }
}
