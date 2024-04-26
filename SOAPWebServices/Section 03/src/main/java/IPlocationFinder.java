import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class IPlocationFinder {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("You need to pass in one IP addess");

		} else {
			String ipAddress = args[0];

			// Here we need to call Service Point Interface
			GeoIPService ipService = new GeoIPService(); // Service name in WSDL
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap(); // Port inside WSDL
			String ipLocation = geoIPServiceSoap.getIpLocation20(ipAddress);
			System.out.println(ipLocation);
		}
	}
}
