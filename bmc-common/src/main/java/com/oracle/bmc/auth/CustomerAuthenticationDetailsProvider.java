/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.OCID;

import com.oracle.bmc.util.internal.StringUtils;
import org.slf4j.Logger;

public abstract class CustomerAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider {

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CustomerAuthenticationDetailsProvider.class);

    @Override
    public String getKeyId() {
        if (!OCID.isValid(getTenantId())) {
            if (StringUtils.isBlank(getTenantId())) {
                LOG.warn("tenantId may not be null");
            } else LOG.warn("tenantId '{}' does not match expected pattern", getTenantId());
        }
        if (!OCID.isValid(getUserId())) {
            if (StringUtils.isBlank(getUserId())) {
                LOG.warn("userId may not be null");
            } else LOG.warn("userId '{}' does not match expected pattern", getUserId());
        }

        String keyId = CustomerKeyIdFormatter.createKeyId(this);
        LOG.debug("Using keyId: {}", keyId);
        return keyId;
    }
}
