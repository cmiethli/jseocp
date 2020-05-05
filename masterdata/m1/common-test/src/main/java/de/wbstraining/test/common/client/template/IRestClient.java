package de.wbstraining.test.common.client.template;

import de.wbstraining.client.marshall.IMarshaller;
import de.wbstraining.client.template.IRestClientWithUri;
import de.wbstraining.common.interfaces.IDto;
import de.wbstraining.common.interfaces.IOperations;
import io.restassured.specification.RequestSpecification;

public interface IRestClient<T extends IDto> extends IOperations<T>, IRestClientAsResponse<T>, IRestClientWithUri<T> {

    // template

    RequestSpecification givenReadAuthenticated();

    RequestSpecification givenDeleteAuthenticated();

    IMarshaller getMarshaller();

    String getUri();

}
