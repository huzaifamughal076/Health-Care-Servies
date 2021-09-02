package com.example.healthcareservices.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.healthcareservices.Activities.ChatsSettingActivity;
import com.example.healthcareservices.Activities.HelpSettingActivity;
import com.example.healthcareservices.Activities.NotificatoinActivity;
import com.example.healthcareservices.Activities.SeittingActivity;
import com.example.healthcareservices.Activities.ShareSettingActivity;
import com.example.healthcareservices.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {
    CardView accounnt_settings, account_notifications, account_chats, account_share, account_help;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        accounnt_settings = v.findViewById(R.id.account_setting);
        account_notifications = v.findViewById(R.id.notification_settings);
        account_chats = v.findViewById(R.id.chats_settings);
        account_share = v.findViewById(R.id.share_settings);
        account_help = v.findViewById(R.id.help_settings);



        accounnt_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SeittingActivity.class);
                startActivity(intent);
                try {
                    finalize();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }

        });


        account_notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), NotificatoinActivity.class);
                startActivity(intent);
                try {
                    finalize();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }

        });
        account_chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), ChatsSettingActivity.class);
                startActivity(intent);
                try {
                    finalize();
                }catch (Throwable throwable){
                    throwable.printStackTrace();
                }

            }
        });


        account_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), ShareSettingActivity.class);
                startActivity(intent);
                try {
                    finalize();
                }catch (Throwable throwable){
                    throwable.printStackTrace();
                }

            }
        });

        account_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), HelpSettingActivity.class);
                startActivity(intent);
                try {
                    finalize();
                }catch (Throwable throwable){
                    throwable.printStackTrace();
                }

            }
        });



        return v;
    }

    private void setfragment(Fragment page) {


        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, page);
        fragmentTransaction.commit();

    }
}