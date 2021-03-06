package com.example.campusguide.search.travelWindow

import com.example.campusguide.directions.DirectionsFlow
import com.example.campusguide.location.Location
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker

class TravelWindowClickListener(
    private val directions: DirectionsFlow,
    private val location: Location
) : GoogleMap.OnInfoWindowClickListener {
    override fun onInfoWindowClick(p0: Marker?) {
        p0?.remove()
        directions.startFlow(null, location)
    }
}
