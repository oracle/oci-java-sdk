/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define supported admission controllers.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdmissionControllerOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdmissionControllerOptions {
    @Deprecated
    @java.beans.ConstructorProperties({"isPodSecurityPolicyEnabled"})
    public AdmissionControllerOptions(Boolean isPodSecurityPolicyEnabled) {
        super();
        this.isPodSecurityPolicyEnabled = isPodSecurityPolicyEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether or not to enable the Pod Security Policy admission controller.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPodSecurityPolicyEnabled")
        private Boolean isPodSecurityPolicyEnabled;

        /**
         * Whether or not to enable the Pod Security Policy admission controller.
         * @param isPodSecurityPolicyEnabled the value to set
         * @return this builder
         **/
        public Builder isPodSecurityPolicyEnabled(Boolean isPodSecurityPolicyEnabled) {
            this.isPodSecurityPolicyEnabled = isPodSecurityPolicyEnabled;
            this.__explicitlySet__.add("isPodSecurityPolicyEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdmissionControllerOptions build() {
            AdmissionControllerOptions __instance__ =
                    new AdmissionControllerOptions(isPodSecurityPolicyEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdmissionControllerOptions o) {
            Builder copiedBuilder = isPodSecurityPolicyEnabled(o.getIsPodSecurityPolicyEnabled());

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
     * Whether or not to enable the Pod Security Policy admission controller.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPodSecurityPolicyEnabled")
    private final Boolean isPodSecurityPolicyEnabled;

    /**
     * Whether or not to enable the Pod Security Policy admission controller.
     * @return the value
     **/
    public Boolean getIsPodSecurityPolicyEnabled() {
        return isPodSecurityPolicyEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdmissionControllerOptions(");
        sb.append("isPodSecurityPolicyEnabled=")
                .append(String.valueOf(this.isPodSecurityPolicyEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdmissionControllerOptions)) {
            return false;
        }

        AdmissionControllerOptions other = (AdmissionControllerOptions) o;
        return java.util.Objects.equals(
                        this.isPodSecurityPolicyEnabled, other.isPodSecurityPolicyEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPodSecurityPolicyEnabled == null
                                ? 43
                                : this.isPodSecurityPolicyEnabled.hashCode());
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
