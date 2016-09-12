package br.com.aboutbe.beachpoint.location;

import android.app.Fragment;
import android.content.Context;
import android.location.LocationManager;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.model.LatLng;

public class UserLocation extends Fragment
        implements GoogleApiClient.OnConnectionFailedListener {

    GoogleApiClient gApiClient;


    public void UserLocation() {
        /*
        if (gApiClient == null) {
            gApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(locationServices.API)
                    .build();
        }
        */
    }
    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    public LatLng getPosition() {
        return new LatLng(-8.115393, -34.89187);
    }
}
