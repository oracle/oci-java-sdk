/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

/**
 * This class is deprecated and just left here to document the proper way to configure the Apache
 * Connector now.
 *
 * <p>For clients that should not buffer requests into memory: <code>
 * ObjectStorageClient nonBufferingObjectStorageClient = ObjectStorageClient .builder()
 * .clientConfigurator(builder -> { builder.property(StandardClientProperties.BUFFER_REQUEST,
 * false); builder.property(ApacheClientProperties.RETRY_HANDLER, null);
 * builder.property(ApacheClientProperties.REUSE_STRATEGY, null); }) .region(Region.US_PHOENIX_1)
 * .build(provider);</code>
 *
 * <p>For clients that should buffer requests into memory: <code>
 * IdentityClient bufferingIdentityClient = IdentityClient .builder() .clientConfigurator(builder
 * -> { builder.property(StandardClientProperties.BUFFER_REQUEST, true);
 * builder.property(ApacheClientProperties.RETRY_HANDLER, null);
 * builder.property(ApacheClientProperties.REUSE_STRATEGY, null); }) .region(Region.US_PHOENIX_1)
 * .build(provider);</code>
 *
 * <p>Also consider using {@code
 * com.oracle.bmc.http.client.jersey.apacheconfigurator.ApacheConfigurator} from the {@code
 * oci-java-sdk-addons-apache-configurator-jersey} add-on module; or {@code
 * com.oracle.bmc.http.client.jersey3.apacheconfigurator.ApacheConfigurator} from the {@code
 * oci-java-sdk-addons-apache-configurator-jersey3} add-on module.
 *
 * @deprecated use ApacheClientProperties instead.
 */
@Deprecated
public class ApacheConfigurator {
    private ApacheConfigurator() {
        // prevent instantiation
    }
}
