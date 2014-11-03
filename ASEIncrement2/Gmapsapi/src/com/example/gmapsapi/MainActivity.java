package com.example.gmapsapi;

import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;




public class MainActivity extends ActionBarActivity {
	private final LatLng LOCATION_BURNABY = new LatLng(49.27645,-122.917587);

	
	private GoogleMap map;


		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		map =((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
     public void onClick_City(View v){
    	 CameraUpdate update = CameraUpdateFactory.newLatLng(LOCATION_BURNABY);
    	 map.animateCamera(update);
    	 
    }
    
    public void onClick_Search(View v){
    }
    public void onClick_Place(View v){
    }
    
    
}
