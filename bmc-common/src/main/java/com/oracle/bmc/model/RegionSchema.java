/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.model;

/** Class representing RegionSchema blob that can be used for parsing out region info details. */
public final class RegionSchema {
    private final String realmKey;
    private final String realmDomainComponent;
    private final String regionKey;
    private final String regionIdentifier;

    /** check if region schema is valid * */
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

    @java.beans.ConstructorProperties({
        "realmKey",
        "realmDomainComponent",
        "regionKey",
        "regionIdentifier"
    })
    public RegionSchema(
            final String realmKey,
            final String realmDomainComponent,
            final String regionKey,
            final String regionIdentifier) {
        this.realmKey = realmKey;
        this.realmDomainComponent = realmDomainComponent;
        this.regionKey = regionKey;
        this.regionIdentifier = regionIdentifier;
    }

    public String getRealmKey() {
        return this.realmKey;
    }

    public String getRealmDomainComponent() {
        return this.realmDomainComponent;
    }

    public String getRegionKey() {
        return this.regionKey;
    }

    public String getRegionIdentifier() {
        return this.regionIdentifier;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof RegionSchema)) return false;
        final RegionSchema other = (RegionSchema) o;
        final java.lang.Object this$realmKey = this.getRealmKey();
        final java.lang.Object other$realmKey = other.getRealmKey();
        if (this$realmKey == null ? other$realmKey != null : !this$realmKey.equals(other$realmKey))
            return false;
        final java.lang.Object this$realmDomainComponent = this.getRealmDomainComponent();
        final java.lang.Object other$realmDomainComponent = other.getRealmDomainComponent();
        if (this$realmDomainComponent == null
                ? other$realmDomainComponent != null
                : !this$realmDomainComponent.equals(other$realmDomainComponent)) return false;
        final java.lang.Object this$regionKey = this.getRegionKey();
        final java.lang.Object other$regionKey = other.getRegionKey();
        if (this$regionKey == null
                ? other$regionKey != null
                : !this$regionKey.equals(other$regionKey)) return false;
        final java.lang.Object this$regionIdentifier = this.getRegionIdentifier();
        final java.lang.Object other$regionIdentifier = other.getRegionIdentifier();
        if (this$regionIdentifier == null
                ? other$regionIdentifier != null
                : !this$regionIdentifier.equals(other$regionIdentifier)) return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $realmKey = this.getRealmKey();
        result = result * PRIME + ($realmKey == null ? 43 : $realmKey.hashCode());
        final java.lang.Object $realmDomainComponent = this.getRealmDomainComponent();
        result =
                result * PRIME
                        + ($realmDomainComponent == null ? 43 : $realmDomainComponent.hashCode());
        final java.lang.Object $regionKey = this.getRegionKey();
        result = result * PRIME + ($regionKey == null ? 43 : $regionKey.hashCode());
        final java.lang.Object $regionIdentifier = this.getRegionIdentifier();
        result = result * PRIME + ($regionIdentifier == null ? 43 : $regionIdentifier.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "RegionSchema(realmKey="
                + this.getRealmKey()
                + ", realmDomainComponent="
                + this.getRealmDomainComponent()
                + ", regionKey="
                + this.getRegionKey()
                + ", regionIdentifier="
                + this.getRegionIdentifier()
                + ")";
    }
}
