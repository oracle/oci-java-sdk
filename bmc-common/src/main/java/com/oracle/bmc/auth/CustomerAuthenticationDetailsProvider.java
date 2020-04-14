/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.OCID;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public abstract class CustomerAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider {

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
