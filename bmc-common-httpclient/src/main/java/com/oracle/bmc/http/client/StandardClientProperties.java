/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.security.KeyStore;
import java.time.Duration;

public final class StandardClientProperties {
    private StandardClientProperties() {}

    public static final ClientProperty<Duration> READ_TIMEOUT =
            ClientProperty.create("readTimeout");
    public static final ClientProperty<Duration> CONNECT_TIMEOUT =
            ClientProperty.create("connectTimeout");
    public static final ClientProperty<Integer> ASYNC_POOL_SIZE =
            ClientProperty.create("asyncPoolSize");
    public static final ClientProperty<Boolean> BUFFER_REQUEST =
            ClientProperty.create("bufferRequest");
    public static final ClientProperty<KeyStoreWithPassword> KEY_STORE =
            ClientProperty.create("keyStore");
    public static final ClientProperty<KeyStore> TRUST_STORE = ClientProperty.create("trustStore");
    public static final ClientProperty<HostnameVerifier> HOSTNAME_VERIFIER =
            ClientProperty.create("hostnameVerifier");
    public static final ClientProperty<SSLContext> SSL_CONTEXT =
            ClientProperty.create("sslContext");
    public static final ClientProperty<ProxyConfiguration> PROXY = ClientProperty.create("proxy");
}
