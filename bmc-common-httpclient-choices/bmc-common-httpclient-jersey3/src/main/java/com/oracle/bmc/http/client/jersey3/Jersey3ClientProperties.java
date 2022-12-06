/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import org.glassfish.jersey.spi.ExecutorServiceProvider;

/** Properties for the Jersey HTTP client. */
public enum Jersey3ClientProperties {
    ;

    public static final Jersey3ClientProperty<Boolean> USE_APACHE_CONNECTOR =
            Jersey3ClientProperty.create("com.oracle.bmc.http.client.jersey3.use_apache_connector");

    /**
     * Jersey provides a default {@link ExecutorServiceProvider}, but in stand-alone applications,
     * its threads fail to terminate, because they are not daemon threads.
     *
     * <p>By default, the OCI Java SDK uses its own {@link ExecutorServiceProvider} instead of
     * Jersey's default. Setting this property to true changes the OCI Java SDK behavior to use
     * Jersey's default and not its own.
     *
     * <p>Note, this property is pointless if a specific {@link ExecutorServiceProvider} is
     * specified using EXECUTOR_SERVICE_PROVIDER.
     */
    public static final Jersey3ClientProperty<Boolean>
            USE_JERSEY_DEFAULT_EXECUTOR_SERVICE_PROVIDER =
                    Jersey3ClientProperty.create(
                            "com.oracle.bmc.http.client.jersey3.use_jersey_default_executor_service_provider");

    public static final Jersey3ClientProperty<ExecutorServiceProvider> EXECUTOR_SERVICE_PROVIDER =
            Jersey3ClientProperty.create(
                    "com.oracle.bmc.http.client.jersey3.executor_service_provider");
}
