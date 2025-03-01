# SOAP Web Services 16 - Handling Faults

- When we implement Exception throwing from Java class, we can see following in **WSDL**.

```
@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws InvalidInputException
	{
		String response = null;
		
		if ("shopName".equals(property)) {
			response = "Test Mart";
		}
		else if("since".equals(property))
		{
			response = "since 2012";
		}
		else {
			throw new InvalidInputException("Invalid Input", property + " is not a valid input");
		}
		
		return response;
	}
}
```

- You can see `<fault ... />`, for possible **exception** in **WSDL**.

- SOAP response needs to be technology independent, meaning no reason to return **Java** **stack trace**.

```
<operation name="getShopInfo">
<input wsam:Action="http://javabrains.org/ShopInfo/getShopInfoRequest" message="tns:getShopInfo"/>
<output wsam:Action="http://javabrains.org/ShopInfo/getShopInfoResponse" message="tns:getShopInfoResponse"/>
<fault message="tns:InvalidInputException" name="InvalidInputException" wsam:Action="http://javabrains.org/ShopInfo/getShopInfo/Fault/InvalidInputException"/>
</operation>
```

- Response for invalid query in SOAP UI.

```
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <S:Fault xmlns:ns4="http://www.w3.org/2003/05/soap-envelope">
         <faultcode>S:Server</faultcode>
         <faultstring>Invalid Input</faultstring>
         <detail>
            <ns2:InvalidInputException xmlns:ns2="http://javabrains.org/">
               <defaultInfo>? is not a valid input</defaultInfo>
               <message>Invalid Input</message>
            </ns2:InvalidInputException>
         </detail>
      </S:Fault>
   </S:Body>
</S:Envelope>
```