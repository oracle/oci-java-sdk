/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey.sse;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.jersey.ClientBuilderDecorator;
import com.oracle.bmc.http.client.jersey.sse.internal.SseEventReader;

import java.io.InputStream;
import java.util.function.Function;

/**
 * SseSupport class registers the {@link SseEventReader} with the provided reader function and
 * builds a {@link ClientConfigurator}
 */
public class SseSupport {
    private final ClientConfigurator clientConfigurator;

    public SseSupport(Function<InputStream, ?> readerFunction) {
        if (readerFunction == null) {
            throw new IllegalArgumentException("readerFunction can't be null");
        }
        this.clientConfigurator =
                builder -> {
                    builder.property(
                            ClientBuilderDecorator.PROPERTY,
                            jerseyClientBuilder -> {
                                jerseyClientBuilder.register(new SseEventReader(readerFunction));
                                return jerseyClientBuilder.build();
                            });
                };
    }

    public ClientConfigurator getClientConfigurator() {
        return this.clientConfigurator;
    }
}
