package ds.quicksort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IPAddress implements Comparable<IPAddress> {
	private long ipFrom;
	private long ipTo;
	private String countryCode;
	private String countryName;
	private String regionName;
	private String cityName;
	
	public long getIpFrom() {
		return ipFrom;
	}


	public void setIpFrom(long ipFrom) {
		this.ipFrom = ipFrom;
	}


	public long getIpTo() {
		return ipTo;
	}


	public void setIpTo(long ipTo) {
		this.ipTo = ipTo;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String getRegionName() {
		return regionName;
	}


	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	
	public IPAddress(long ipFrom, long ipTo, String countryCode, String countryName, String regionName, String cityName) {
		this.cityName = cityName;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.ipFrom = ipFrom;
		this.ipTo = ipTo;
		this.regionName = regionName;
	}
	

	@Override
	public int compareTo(IPAddress o) {
		// TODO Auto-generated method stub
		if(this.ipFrom > o.ipFrom) return 1;
		else if(this.ipFrom < o.ipFrom) return -1;
		else return 0;
	}
}
