/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Update cloud guard configuration details for a tenancy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("reportingRegion")
        private String reportingRegion;

        public Builder reportingRegion(String reportingRegion) {
            this.reportingRegion = reportingRegion;
            this.__explicitlySet__.add("reportingRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private CloudGuardStatus status;

        public Builder status(CloudGuardStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("selfManageResources")
        private Boolean selfManageResources;

        public Builder selfManageResources(Boolean selfManageResources) {
            this.selfManageResources = selfManageResources;
            this.__explicitlySet__.add("selfManageResources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConfigurationDetails build() {
            UpdateConfigurationDetails __instance__ =
                    new UpdateConfigurationDetails(reportingRegion, status, selfManageResources);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConfigurationDetails o) {
            Builder copiedBuilder =
                    reportingRegion(o.getReportingRegion())
                            .status(o.getStatus())
                            .selfManageResources(o.getSelfManageResources());

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
     * The reporting region value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reportingRegion")
    String reportingRegion;

    /**
     * Status of Cloud Guard Tenant
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    CloudGuardStatus status;

    /**
     * Identifies if Oracle managed resources will be created by customers.
     * If no value is specified false is the default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selfManageResources")
    Boolean selfManageResources;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
