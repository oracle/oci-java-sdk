/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.http.client.HttpClientBuilder;

/** A client configurator object allows to use resteasy with JavaSDK. */
public class ResteasyClientConfigurator implements ClientConfigurator {

    @Override
    public void customizeClient(HttpClientBuilder builder) {}
}
