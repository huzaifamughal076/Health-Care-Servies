package com.example.healthcareservices.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.healthcareservices.Adapters.MyListAdapter;
import com.example.healthcareservices.Adapters.MyListData;
import com.example.healthcareservices.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChatsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChatsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ChatsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ChatsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChatsFragment newInstance(String param1, String param2) {
        ChatsFragment fragment = new ChatsFragment();
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
        View v =  inflater.inflate(R.layout.fragment_chats, container, false);


        MyListData[] myListData = new MyListData[] {
                new MyListData("Dr.Danish","Hello", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Awais","How can i help you", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Hassan","Yes, What can i do for you", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Huzaifa Mughal","It's Okay", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Mateen","Sure", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Sobia","Quiet Imoressive", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Rehan","Really>", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Zaid Mughal","Is any body home?", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Rahim","Hi!", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Afaq","Good to Know", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Gullam Mohi ud Din","Don't Worry", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Afzal","Calm Down please", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Auns Mughal","Happy to know that", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Mudassir","Yeah.", android.R.drawable.ic_dialog_email),
                new MyListData("Dr.Rehman","What!", android.R.drawable.ic_dialog_email),


        };


        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycularview);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);








        return  v;
    }
}