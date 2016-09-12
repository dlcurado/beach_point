package br.com.aboutbe.beachpoint;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.MarkerOptions;

import br.com.aboutbe.beachpoint.location.UserLocation;


public class MapPointActivity extends FragmentActivity
        implements OnMapReadyCallback{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_point);
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        UserLocation userLocation = new UserLocation();
        googleMap.addMarker(new MarkerOptions()
                .position(userLocation.getPosition())
                .title("Marca")
        );
    }
}
