package com.melayer.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private LayoutParams params;
	private Context context;
	private ArrayList<String> listData;

	public MyAdapter(Context context, ArrayList<String> listData) {

		this.context = context;
		this.listData = listData;

		params = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT);
	}

	@Override
	public int getCount() {
		return listData.size();
	}

	@Override
	public Object getItem(int position) {
		return listData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return (position * 2);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		TextView text = new TextView(context);
		text.setLayoutParams(params);
		text.setText(listData.get(position));

		return text;
	}
}
