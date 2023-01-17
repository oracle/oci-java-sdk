/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.http.client.ClientProperty;

/**
 * This class has been deprecated, but left to make it easy to find the replacement for
 * JerseyLoggingClientConfigurator in OCI Java SDK version 3.0.0 and higher.
 *
 * <p>Since Jersey logging level and verbosity are simply a client properties, you can replace this
 * JerseyLoggingClientConfigurator by creating your own configurator, and using {@code
 * builder.property(JerseyClientProperty.create(LOGGING_FEATURE_VERBOSITY_CLIENT), verbosity)} and
 * {@code builder.property(JerseyClientProperty.create(LOGGING_FEATURE_LOGGER_LEVEL_CLIENT),
 * loggingLevel)}.
 *
 * @see com.oracle.bmc.http.client.HttpClientBuilder#property(ClientProperty, Object)
 * @deprecated use {@link com.oracle.bmc.http.client.HttpClientBuilder#}
 */
@Deprecated
public class JerseyLoggingClientConfigurator {}
