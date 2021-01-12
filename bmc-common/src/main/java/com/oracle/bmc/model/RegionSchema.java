/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.model;

import lombok.Value;

/**
 * Class representing RegionSchema blob that can be used for parsing out region info details.
 */
@Value
public class RegionSchema {

    private String realmKey;

    private String realmDomainComponent;

    private String regionKey;

    private String regionIdentifier;

    /** check if region schema is valid **/
    public static boolean isValid(final RegionSchema regionSchema) {

        if (regionSchema.getRealmKey() == null
                || regionSchema.getRealmDomainComponent() == null
                || regionSchema.getRegionIdentifier() == null
                || regionSchema.getRegionKey() == null) {
            return false;
        }
        if (regionSchema.getRealmKey() != null && regionSchema.getRealmKey().isEmpty()) {
            return false;
        }
        if (regionSchema.getRegionIdentifier() != null
                && regionSchema.getRegionIdentifier().isEmpty()) {
            return false;
        }
        if (regionSchema.getRealmDomainComponent() != null
                && regionSchema.getRealmDomainComponent().isEmpty()) {
            return false;
        }
        if (regionSchema.getRegionKey() != null && regionSchema.getRegionKey().isEmpty()) {
            return false;
        }
        return true;
    }
}
