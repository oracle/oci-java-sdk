/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
     * The unique service name, ex "BLOCKSTORAGE"
     */
    String getServiceName();

    /**
     * The service endpoint prefix that will be used, ex "iaas" for
     * "https://iaas.us-phoenix-1.oraclecloud.com".
     */
    String getServiceEndpointPrefix();
}
