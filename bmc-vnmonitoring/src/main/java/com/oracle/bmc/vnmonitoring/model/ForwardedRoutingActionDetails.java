/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines details for the forwarded routing action.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ForwardedRoutingActionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ForwardedRoutingActionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"isRestrictedOrPartial", "forwardedRoutingConfiguration"})
    public ForwardedRoutingActionDetails(
            Boolean isRestrictedOrPartial,
            ForwardedRoutingConfiguration forwardedRoutingConfiguration) {
        super();
        this.isRestrictedOrPartial = isRestrictedOrPartial;
        this.forwardedRoutingConfiguration = forwardedRoutingConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, the forwarded routing configuration details are incomplete.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
        private Boolean isRestrictedOrPartial;

        /**
         * If true, the forwarded routing configuration details are incomplete.
         * @param isRestrictedOrPartial the value to set
         * @return this builder
         **/
        public Builder isRestrictedOrPartial(Boolean isRestrictedOrPartial) {
            this.isRestrictedOrPartial = isRestrictedOrPartial;
            this.__explicitlySet__.add("isRestrictedOrPartial");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forwardedRoutingConfiguration")
        private ForwardedRoutingConfiguration forwardedRoutingConfiguration;

        public Builder forwardedRoutingConfiguration(
                ForwardedRoutingConfiguration forwardedRoutingConfiguration) {
            this.forwardedRoutingConfiguration = forwardedRoutingConfiguration;
            this.__explicitlySet__.add("forwardedRoutingConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ForwardedRoutingActionDetails build() {
            ForwardedRoutingActionDetails __instance__ =
                    new ForwardedRoutingActionDetails(
                            isRestrictedOrPartial, forwardedRoutingConfiguration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ForwardedRoutingActionDetails o) {
            Builder copiedBuilder =
                    isRestrictedOrPartial(o.getIsRestrictedOrPartial())
                            .forwardedRoutingConfiguration(o.getForwardedRoutingConfiguration());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * If true, the forwarded routing configuration details are incomplete.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
    private final Boolean isRestrictedOrPartial;

    /**
     * If true, the forwarded routing configuration details are incomplete.
     * @return the value
     **/
    public Boolean getIsRestrictedOrPartial() {
        return isRestrictedOrPartial;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("forwardedRoutingConfiguration")
    private final ForwardedRoutingConfiguration forwardedRoutingConfiguration;

    public ForwardedRoutingConfiguration getForwardedRoutingConfiguration() {
        return forwardedRoutingConfiguration;
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
        sb.append("ForwardedRoutingActionDetails(");
        sb.append("isRestrictedOrPartial=").append(String.valueOf(this.isRestrictedOrPartial));
        sb.append(", forwardedRoutingConfiguration=")
                .append(String.valueOf(this.forwardedRoutingConfiguration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ForwardedRoutingActionDetails)) {
            return false;
        }

        ForwardedRoutingActionDetails other = (ForwardedRoutingActionDetails) o;
        return java.util.Objects.equals(this.isRestrictedOrPartial, other.isRestrictedOrPartial)
                && java.util.Objects.equals(
                        this.forwardedRoutingConfiguration, other.forwardedRoutingConfiguration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRestrictedOrPartial == null
                                ? 43
                                : this.isRestrictedOrPartial.hashCode());
        result =
                (result * PRIME)
                        + (this.forwardedRoutingConfiguration == null
                                ? 43
                                : this.forwardedRoutingConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
