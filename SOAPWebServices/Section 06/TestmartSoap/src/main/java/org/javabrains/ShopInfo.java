package org.javabrains;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName = "lookupInput") String property)
	{
		String response = "Invalid property";
		
		if ("shopName".equals(property)) {
			response = "Test Mart";
		}
		else if("since".equals(property))
		{
			response = "since 2012";
		}
		
		return response;
	}
}
