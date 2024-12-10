/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * Details for promoting a {@code DnssecKeyVersion} on a zone.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PromoteZoneDnssecKeyVersionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PromoteZoneDnssecKeyVersionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dnssecKeyVersionUuid"})
    public PromoteZoneDnssecKeyVersionDetails(String dnssecKeyVersionUuid) {
        super();
        this.dnssecKeyVersionUuid = dnssecKeyVersionUuid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The UUID of the {@code DnssecKeyVersion} that is being promoted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnssecKeyVersionUuid")
        private String dnssecKeyVersionUuid;

        /**
         * The UUID of the {@code DnssecKeyVersion} that is being promoted.
         *
         * @param dnssecKeyVersionUuid the value to set
         * @return this builder
         **/
        public Builder dnssecKeyVersionUuid(String dnssecKeyVersionUuid) {
            this.dnssecKeyVersionUuid = dnssecKeyVersionUuid;
            this.__explicitlySet__.add("dnssecKeyVersionUuid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PromoteZoneDnssecKeyVersionDetails build() {
            PromoteZoneDnssecKeyVersionDetails model =
                    new PromoteZoneDnssecKeyVersionDetails(this.dnssecKeyVersionUuid);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PromoteZoneDnssecKeyVersionDetails model) {
            if (model.wasPropertyExplicitlySet("dnssecKeyVersionUuid")) {
                this.dnssecKeyVersionUuid(model.getDnssecKeyVersionUuid());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The UUID of the {@code DnssecKeyVersion} that is being promoted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnssecKeyVersionUuid")
    private final String dnssecKeyVersionUuid;

    /**
     * The UUID of the {@code DnssecKeyVersion} that is being promoted.
     *
     * @return the value
     **/
    public String getDnssecKeyVersionUuid() {
        return dnssecKeyVersionUuid;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PromoteZoneDnssecKeyVersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dnssecKeyVersionUuid=").append(String.valueOf(this.dnssecKeyVersionUuid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PromoteZoneDnssecKeyVersionDetails)) {
            return false;
        }

        PromoteZoneDnssecKeyVersionDetails other = (PromoteZoneDnssecKeyVersionDetails) o;
        return java.util.Objects.equals(this.dnssecKeyVersionUuid, other.dnssecKeyVersionUuid)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dnssecKeyVersionUuid == null
                                ? 43
                                : this.dnssecKeyVersionUuid.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
