/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

/**
 * Interface representing a service definition.
 * <p>
 * See {@link Services} to create new instances.
 */
@InternalSdk
public interface Service {

    /**
     * The unique service name, ex "BLOCKSTORAGE". Must not be null.
     */
    String getServiceName();

    /**
     * The service endpoint prefix that will be used, ex "iaas" for
     * "https://iaas.us-phoenix-1.oraclecloud.com".
     */
    String getServiceEndpointPrefix();

    /**
     * The service endpoint template that will be used, ex
     * "{serviceEndpointPrefix}.{region}.service.oci.oraclecloud.com".
     * <p>
     * This overrides the template used in {@link DefaultEndpointConfiguration}, but
     * can still use the same variables.
     */
    String getServiceEndpointTemplate();
}
