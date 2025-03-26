/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import javax.ws.rs.client.ClientBuilder;

/**
 * Interface implemented by classes that set
 * the underlying client configuration properties
 * on the ClientBuilder
 */
public interface SetsClientBuilderProperties {

    /**
     * Sets the custom ConnectorProvider to use. Subclasses can override this to
     * be a no-op if they do not want to use the custom connector, or wish to
     * set their own.
     *
     * @param builder
     *            The builder to set the provider on
     */
    void setConnectorProvider(ClientBuilder builder);

    /**
     * Sets the SSL context on the builder.
     * <p>
     * Separate so subclasses can call if desired.
     *
     * @param builder
     *            The client builder to use.
     */
    void setSslContext(ClientBuilder builder);
}
