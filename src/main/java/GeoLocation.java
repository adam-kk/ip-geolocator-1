package geolocator;

/**
 * Class for wrapping geolocation of an IP address.
 */

import java.lang.Record;

 record GeoLocation(String as, String city, String country, String countryCode, String isp, double lat, double lon, String org, String query, String region, String regionName, String timezone, String zip){}
