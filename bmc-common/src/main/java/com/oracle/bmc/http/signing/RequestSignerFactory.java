/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;

/**
 * Factory class to create RequestSigner instances.
 */
public interface RequestSignerFactory {

    /**
     * Creates a new RequestSigner instance from the given provider and type of service.
     *
     * @param service The service type.
     * @param authProvider The auth provider.
     * @return A new RequestSigner instance.
     */
    RequestSigner createRequestSigner(Service service, AuthenticationDetailsProvider authProvider);
}
