/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.common;

import com.oracle.bmc.Service;
import org.slf4j.Logger;

import java.util.Locale;
import java.util.Optional;

/**
 * A builder for clients that can be configured to target a certain region
 *
 * @param <B> actual builder class
 * @param <C> client class
 */
public abstract class RegionalClientBuilder<B extends RegionalClientBuilder, C>
        extends ClientBuilderBase<B, C> {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RegionalClientBuilder.class);

    public RegionalClientBuilder(Service service) {
        super(service);
    }

    /**
     * Set the region for the client to be created.
     *
     * @param region region
     * @return this builder
     */
    public B region(com.oracle.bmc.Region region) {
        Optional<String> endpoint = region.getEndpoint(service);
        if (endpoint.isPresent()) {
            endpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + service + " is not known in region " + region);
        }
        return (B) this;
    }

    /**
     * Set the region for the client to be created.
     *
     * @param regionId region
     * @return this builder
     */
    public B region(String regionId) {
        regionId = regionId.toLowerCase(Locale.ENGLISH);
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            return region(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(service, regionId);
            return endpoint(endpoint);
        }
    }
}
