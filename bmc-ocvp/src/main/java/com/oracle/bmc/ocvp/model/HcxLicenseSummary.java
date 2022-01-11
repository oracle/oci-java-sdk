/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * HCX on-premise license information summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HcxLicenseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HcxLicenseSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("activationKey")
        private String activationKey;

        public Builder activationKey(String activationKey) {
            this.activationKey = activationKey;
            this.__explicitlySet__.add("activationKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private HcxLicenseStatus status;

        public Builder status(HcxLicenseStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemName")
        private String systemName;

        public Builder systemName(String systemName) {
            this.systemName = systemName;
            this.__explicitlySet__.add("systemName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HcxLicenseSummary build() {
            HcxLicenseSummary __instance__ =
                    new HcxLicenseSummary(activationKey, status, systemName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HcxLicenseSummary o) {
            Builder copiedBuilder =
                    activationKey(o.getActivationKey())
                            .status(o.getStatus())
                            .systemName(o.getSystemName());

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

    /**
     * HCX on-premise license key value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activationKey")
    String activationKey;

    /**
     * status of HCX on-premise license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    HcxLicenseStatus status;

    /**
     * Name of the system that consumed the HCX on-premise license
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemName")
    String systemName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
