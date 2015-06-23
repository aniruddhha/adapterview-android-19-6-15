package com.melayer.listview;

import java.util.ArrayList;

import com.melayer.adapter.MyAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ArrayList<String> listData = new ArrayList<String>();
	private ListView listView;
	//private GridView gridView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listData.add("India");
		listData.add("China");
		listData.add("Japan");
		listData.add("US");
		listData.add("AUS");

		 MyAdapter adapter = new MyAdapter(this,listData);

	/*	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, listData);*/

		listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);
		
		/*gridView = (GridView) findViewById(R.id.listView);
		gridView.setAdapter(adapter);*/
	}
}
