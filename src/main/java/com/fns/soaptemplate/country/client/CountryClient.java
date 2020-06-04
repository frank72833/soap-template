package com.fns.soaptemplate.country.client;

import com.fns.soaptemplate.country.client.gen.GetCountryRequest;
import com.fns.soaptemplate.country.client.gen.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CountryClient extends WebServiceGatewaySupport {
    public GetCountryResponse getCountry(String country) {
        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request);

        return response;
    }
}
