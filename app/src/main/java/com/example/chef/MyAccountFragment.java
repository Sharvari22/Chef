package com.example.chef;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.baoyachi.stepview.HorizontalStepView;
import com.baoyachi.stepview.VerticalStepView;
import com.baoyachi.stepview.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyAccountFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyAccountFragment extends Fragment {

    View view;
    LinearLayout hidden_layout1, hidden_layout2, hidden_layout3;
    CardView cardView1, cardView2, cardView3, cardView4, cardView5;
    ImageView arrow_more1, arrow_more2, arrow_more3;
    CheckBox day1, day2, day3, day4, day5, day6, day7;
    EditText chef_fname, chef_lname, chef_email, chef_phone, chef_address, chef_zip, chef_state, chef_city, from_time, to_time;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MyAccountFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyAccountFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyAccountFragment newInstance(String param1, String param2) {
        MyAccountFragment fragment = new MyAccountFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_account, container, false);
        hidden_layout1 = view.findViewById(R.id.hidden_layout1);
        hidden_layout2 = view.findViewById(R.id.hidden_layout2);
        hidden_layout3 = view.findViewById(R.id.hidden_layout3);
        cardView1 = view.findViewById(R.id.base_cardview1);
        cardView2 = view.findViewById(R.id.base_cardview2);
        cardView3 = view.findViewById(R.id.base_cardview3);
        cardView4 = view.findViewById(R.id.base_cardview4);
        cardView5 = view.findViewById(R.id.base_cardview5);
        arrow_more1 = view.findViewById(R.id.arrow_more1);
        arrow_more2 = view.findViewById(R.id.arrow_more2);
        arrow_more3 = view.findViewById(R.id.arrow_more3);
        day1 = view.findViewById(R.id.day1);
        day2 = view.findViewById(R.id.day2);
        day3 = view.findViewById(R.id.day3);
        day4 = view.findViewById(R.id.day4);
        day5 = view.findViewById(R.id.day5);
        day6 = view.findViewById(R.id.day6);
        day7 = view.findViewById(R.id.day7);
        chef_fname = view.findViewById(R.id.chef_fname);
        chef_lname = view.findViewById(R.id.chef_lname);
        chef_phone = view.findViewById(R.id.chef_phone);
        chef_email = view.findViewById(R.id.chef_email);
        chef_address = view.findViewById(R.id.chef_address);
        chef_state = view.findViewById(R.id.chef_state);
        chef_zip = view.findViewById(R.id.chef_zip);
        chef_city = view.findViewById(R.id.chef_city);
        from_time = view.findViewById(R.id.from_time);
        to_time = view.findViewById(R.id.to_time);

        arrow_more1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hidden_layout1.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView1,
                            new AutoTransition());
                    hidden_layout1.setVisibility(View.GONE);
                    arrow_more1.setImageResource(R.drawable.next_arrow);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView1,
                            new AutoTransition());
                    hidden_layout1.setVisibility(View.VISIBLE);
                    arrow_more1.setImageResource(R.drawable.arrow_close);
                }
            }
        });

        arrow_more2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hidden_layout2.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView2,
                            new AutoTransition());
                    hidden_layout2.setVisibility(View.GONE);
                    arrow_more2.setImageResource(R.drawable.next_arrow);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView2,
                            new AutoTransition());
                    hidden_layout2.setVisibility(View.VISIBLE);
                    arrow_more2.setImageResource(R.drawable.arrow_close);
                }

            }
        });

        arrow_more3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hidden_layout3.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView3,
                            new AutoTransition());
                    hidden_layout3.setVisibility(View.GONE);
                    arrow_more3.setImageResource(R.drawable.next_arrow);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView3,
                            new AutoTransition());
                    hidden_layout3.setVisibility(View.VISIBLE);
                    arrow_more3.setImageResource(R.drawable.arrow_close);
                }

            }
        });


        return view;
    }


}