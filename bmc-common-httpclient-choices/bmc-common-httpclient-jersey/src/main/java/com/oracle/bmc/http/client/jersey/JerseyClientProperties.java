/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

/** Properties for the Jersey HTTP client. */
public enum JerseyClientProperties {
    ;

    public static final JerseyClientProperty<Boolean> USE_APACHE_CONNECTOR =
            JerseyClientProperty.create("com.oracle.bmc.http.client.jersey.use_apache_connector");
}
