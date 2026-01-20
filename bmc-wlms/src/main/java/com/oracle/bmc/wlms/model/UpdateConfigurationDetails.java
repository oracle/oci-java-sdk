/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The configuration for service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"discoveryInterval", "domainSearchPaths"})
    public UpdateConfigurationDetails(
            Integer discoveryInterval, java.util.List<String> domainSearchPaths) {
        super();
        this.discoveryInterval = discoveryInterval;
        this.domainSearchPaths = domainSearchPaths;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Frequency of domain discovery to be run on the service. The unit is in hours. */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryInterval")
        private Integer discoveryInterval;

        /**
         * Frequency of domain discovery to be run on the service. The unit is in hours.
         *
         * @param discoveryInterval the value to set
         * @return this builder
         */
        public Builder discoveryInterval(Integer discoveryInterval) {
            this.discoveryInterval = discoveryInterval;
            this.__explicitlySet__.add("discoveryInterval");
            return this;
        }
        /** The whitelisted paths which domain discovery are run against. */
        @com.fasterxml.jackson.annotation.JsonProperty("domainSearchPaths")
        private java.util.List<String> domainSearchPaths;

        /**
         * The whitelisted paths which domain discovery are run against.
         *
         * @param domainSearchPaths the value to set
         * @return this builder
         */
        public Builder domainSearchPaths(java.util.List<String> domainSearchPaths) {
            this.domainSearchPaths = domainSearchPaths;
            this.__explicitlySet__.add("domainSearchPaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConfigurationDetails build() {
            UpdateConfigurationDetails model =
                    new UpdateConfigurationDetails(this.discoveryInterval, this.domainSearchPaths);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("discoveryInterval")) {
                this.discoveryInterval(model.getDiscoveryInterval());
            }
            if (model.wasPropertyExplicitlySet("domainSearchPaths")) {
                this.domainSearchPaths(model.getDomainSearchPaths());
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

    /** Frequency of domain discovery to be run on the service. The unit is in hours. */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryInterval")
    private final Integer discoveryInterval;

    /**
     * Frequency of domain discovery to be run on the service. The unit is in hours.
     *
     * @return the value
     */
    public Integer getDiscoveryInterval() {
        return discoveryInterval;
    }

    /** The whitelisted paths which domain discovery are run against. */
    @com.fasterxml.jackson.annotation.JsonProperty("domainSearchPaths")
    private final java.util.List<String> domainSearchPaths;

    /**
     * The whitelisted paths which domain discovery are run against.
     *
     * @return the value
     */
    public java.util.List<String> getDomainSearchPaths() {
        return domainSearchPaths;
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
        sb.append("UpdateConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("discoveryInterval=").append(String.valueOf(this.discoveryInterval));
        sb.append(", domainSearchPaths=").append(String.valueOf(this.domainSearchPaths));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConfigurationDetails)) {
            return false;
        }

        UpdateConfigurationDetails other = (UpdateConfigurationDetails) o;
        return java.util.Objects.equals(this.discoveryInterval, other.discoveryInterval)
                && java.util.Objects.equals(this.domainSearchPaths, other.domainSearchPaths)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.discoveryInterval == null ? 43 : this.discoveryInterval.hashCode());
        result =
                (result * PRIME)
                        + (this.domainSearchPaths == null ? 43 : this.domainSearchPaths.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
