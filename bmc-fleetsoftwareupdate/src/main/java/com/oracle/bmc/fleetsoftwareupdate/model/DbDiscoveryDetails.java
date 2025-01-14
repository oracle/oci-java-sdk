/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * 'DB' type Exadata Fleet Update Discovery details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DbDiscoveryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbDiscoveryDetails extends DiscoveryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private DiscoveryServiceTypes serviceType;

        public Builder serviceType(DiscoveryServiceTypes serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /**
         * Database Major Version of targets to be included in the Exadata Fleet Update Discovery
         * results.
         * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions
         * Only Database targets that match the version specified in this value would be added to
         * the Exadata Fleet Update Discovery results.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMajorVersion")
        private DbSourceMajorVersions sourceMajorVersion;

        /**
         * Database Major Version of targets to be included in the Exadata Fleet Update Discovery
         * results.
         * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions
         * Only Database targets that match the version specified in this value would be added to
         * the Exadata Fleet Update Discovery results.
         *
         * @param sourceMajorVersion the value to set
         * @return this builder
         */
        public Builder sourceMajorVersion(DbSourceMajorVersions sourceMajorVersion) {
            this.sourceMajorVersion = sourceMajorVersion;
            this.__explicitlySet__.add("sourceMajorVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("criteria")
        private DbFleetDiscoveryDetails criteria;

        public Builder criteria(DbFleetDiscoveryDetails criteria) {
            this.criteria = criteria;
            this.__explicitlySet__.add("criteria");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbDiscoveryDetails build() {
            DbDiscoveryDetails model =
                    new DbDiscoveryDetails(
                            this.serviceType, this.sourceMajorVersion, this.criteria);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbDiscoveryDetails model) {
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("sourceMajorVersion")) {
                this.sourceMajorVersion(model.getSourceMajorVersion());
            }
            if (model.wasPropertyExplicitlySet("criteria")) {
                this.criteria(model.getCriteria());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public DbDiscoveryDetails(
            DiscoveryServiceTypes serviceType,
            DbSourceMajorVersions sourceMajorVersion,
            DbFleetDiscoveryDetails criteria) {
        super(serviceType);
        this.sourceMajorVersion = sourceMajorVersion;
        this.criteria = criteria;
    }

    /**
     * Database Major Version of targets to be included in the Exadata Fleet Update Discovery
     * results.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions
     * Only Database targets that match the version specified in this value would be added to the
     * Exadata Fleet Update Discovery results.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMajorVersion")
    private final DbSourceMajorVersions sourceMajorVersion;

    /**
     * Database Major Version of targets to be included in the Exadata Fleet Update Discovery
     * results.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions
     * Only Database targets that match the version specified in this value would be added to the
     * Exadata Fleet Update Discovery results.
     *
     * @return the value
     */
    public DbSourceMajorVersions getSourceMajorVersion() {
        return sourceMajorVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    private final DbFleetDiscoveryDetails criteria;

    public DbFleetDiscoveryDetails getCriteria() {
        return criteria;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbDiscoveryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceMajorVersion=").append(String.valueOf(this.sourceMajorVersion));
        sb.append(", criteria=").append(String.valueOf(this.criteria));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbDiscoveryDetails)) {
            return false;
        }

        DbDiscoveryDetails other = (DbDiscoveryDetails) o;
        return java.util.Objects.equals(this.sourceMajorVersion, other.sourceMajorVersion)
                && java.util.Objects.equals(this.criteria, other.criteria)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sourceMajorVersion == null
                                ? 43
                                : this.sourceMajorVersion.hashCode());
        result = (result * PRIME) + (this.criteria == null ? 43 : this.criteria.hashCode());
        return result;
    }
}
