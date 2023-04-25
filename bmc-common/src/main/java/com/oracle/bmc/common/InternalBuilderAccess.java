/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.common;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;

import java.util.List;
import java.util.Map;

@InternalSdk
public class InternalBuilderAccess {
    private InternalBuilderAccess() {}

    public static Service getService(ClientBuilderBase<?, ?> builder) {
        return builder.service;
    }

    public static ClientConfiguration getConfiguration(ClientBuilderBase<?, ?> builder) {
        return builder.configuration;
    }

    public static ClientConfigurator getClientConfigurator(ClientBuilderBase<?, ?> builder) {
        return builder.clientConfigurator;
    }

    public static List<ClientConfigurator> getAdditionalClientConfigurators(
            ClientBuilderBase<?, ?> builder) {
        return builder.additionalClientConfigurators;
    }

    public static RequestSignerFactory getRequestSignerFactory(ClientBuilderBase<?, ?> builder) {
        return builder.requestSignerFactory;
    }

    public static Map<SigningStrategy, RequestSignerFactory>
            getSigningStrategyRequestSignerFactories(ClientBuilderBase<?, ?> builder) {
        return builder.signingStrategyRequestSignerFactories;
    }

    public static String getEndpoint(ClientBuilderBase<?, ?> builder) {
        return builder.endpoint;
    }

    public static HttpProvider getHttpProvider(ClientBuilderBase<?, ?> builder) {
        return builder.httpProvider;
    }

    public static Region getRegion(RegionalClientBuilder<?, ?> builder) {
        return builder.region;
    }
}
