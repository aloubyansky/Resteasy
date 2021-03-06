package org.jboss.resteasy.microprofile.client;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.eclipse.microprofile.rest.client.spi.RestClientBuilderResolver;

public class BuilderResolver extends RestClientBuilderResolver {
    @Override
    public RestClientBuilder newBuilder() {
        return new RestClientBuilderImpl();
    }
}
