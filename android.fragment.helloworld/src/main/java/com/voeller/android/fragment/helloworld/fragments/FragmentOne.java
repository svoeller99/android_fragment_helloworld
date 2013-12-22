package com.voeller.android.fragment.helloworld.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.voeller.android.fragment.helloworld.R;

public class FragmentOne extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.test_fragment_one, container, false);
		return view;
	}
	
	public void setText(String text) {
		TextView textView = (TextView)getView().findViewById(R.id.textViewFragmentOne);
		textView.setText(text);
	}
}
