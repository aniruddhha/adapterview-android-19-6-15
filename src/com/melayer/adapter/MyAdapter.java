package com.melayer.adapter;

import java.util.ArrayList;

import com.melayer.listview.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private LayoutParams params;
	private Context context;
	private ArrayList<String> listData;

	private LayoutInflater inflater;

	public MyAdapter(Context context, ArrayList<String> listData) {

		this.context = context;
		this.listData = listData;

		params = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT);

		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

		/*TextView text = new TextView(context);
		text.setLayoutParams(params);
		text.setText(listData.get(position));*/
		
		View v  = inflater.inflate(R.layout.my_compound_view, null, false);
		
		TextView txt = (TextView) v.findViewById(R.id.txtView);
		txt.setText(listData.get(position));
		
		ImageView img = (ImageView) v.findViewById(R.id.imgView);

		return v;
	}
}
