/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.internal.CrossTenancyRequestClientFilter;
import com.oracle.bmc.util.internal.Validate;

import java.util.Arrays;

/** A configurator that causes the client to set the cross-tenancy request header. */
public class CrossTenancyRequestConfigurator implements ClientConfigurator {
    private final ClientConfigurator baseConfigurator;
    private final String[] authorizedTenancyIds;

    /**
     * A configurator that sets the cross-tenancy request header, but otherwise behaves like the
     * {@link DefaultConnectorConfigurator}.
     *
     * @param authorizedTenancyIds tenancy OCIDs that might be accessed by requests made by the
     *     client configured
     */
    public CrossTenancyRequestConfigurator(String[] authorizedTenancyIds) {
        this(authorizedTenancyIds, new DefaultConnectorConfigurator());
    }

    /**
     * A configurator that sets the cross-tenancy request header, but otherwise behaves like the
     * passed in configurator.
     *
     * @param authorizedTenancyIds tenancy OCIDs that might be accessed by requests made by the
     *     client configured
     * @param baseConfigurator base configurator
     */
    public CrossTenancyRequestConfigurator(
            String[] authorizedTenancyIds, ClientConfigurator baseConfigurator) {
        this.baseConfigurator =
                Validate.notNull(baseConfigurator, "baseConfigurator may not be null");
        if (authorizedTenancyIds == null || authorizedTenancyIds.length == 0) {
            throw new IllegalArgumentException("Must provide at least one authorized tenancyId");
        }
        for (String authorizedTenancyId : authorizedTenancyIds) {
            if (authorizedTenancyId == null || authorizedTenancyId.isEmpty()) {
                throw new IllegalArgumentException("Authorized tenancyId was not valid");
            }
        }
        this.authorizedTenancyIds =
                Arrays.copyOf(authorizedTenancyIds, authorizedTenancyIds.length);
    }

    @Override
    public void customizeClient(HttpClientBuilder builder) {
        baseConfigurator.customizeClient(builder);
        builder.registerRequestInterceptor(
                CrossTenancyRequestClientFilter.PRIORITY,
                new CrossTenancyRequestClientFilter(authorizedTenancyIds));
    }
}
