package com.android.example.fragmentact;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MessageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_message, container, false);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        TextView text = getView().findViewById(R.id.messageTextView);
        text.setText(getArguments().getString(MainActivity.MY_KEY));
    }

    public static MessageFragment sendData(String messageFromMain) {

        Bundle arguments = new Bundle();
        MessageFragment fragment = new MessageFragment();
        arguments.putString(MainActivity.MY_KEY, messageFromMain);
        fragment.setArguments(arguments);

        return fragment;
    }
}
