/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.auth.internal.JwtClaimsSet;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * Implementation of {@link ServiceAccountTokenSupplier} that allows to pass in a token path to read
 * kubernetes service account token If not set, then use default service account token path
 * /var/run/secrets/kubernetes.io/serviceaccount/toke
 */
public class DefaultServiceAccountTokenProvider extends AbstractServiceAccountTokenSupplier {
    private final String KUBERNETES_SERVICE_ACCOUNT_TOKEN_PATH =
            "/var/run/secrets/kubernetes.io/serviceaccount/token";
    private final String tokenPath;

    public DefaultServiceAccountTokenProvider() {
        this(null);
    }

    public DefaultServiceAccountTokenProvider(String tokenPath) {
        this.tokenPath = (tokenPath != null) ? tokenPath : KUBERNETES_SERVICE_ACCOUNT_TOKEN_PATH;
    }

    @Override
    protected String getTokenInner() throws IOException {
        return new String(Files.readAllBytes(Paths.get(this.tokenPath)));
    }
}
