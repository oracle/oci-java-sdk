/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details for audit policy provisioning.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProvisionAuditPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProvisionAuditPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isDataSafeServiceAccountExcluded")
        private Boolean isDataSafeServiceAccountExcluded;

        public Builder isDataSafeServiceAccountExcluded(Boolean isDataSafeServiceAccountExcluded) {
            this.isDataSafeServiceAccountExcluded = isDataSafeServiceAccountExcluded;
            this.__explicitlySet__.add("isDataSafeServiceAccountExcluded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("provisionAuditConditions")
        private java.util.List<ProvisionAuditConditions> provisionAuditConditions;

        public Builder provisionAuditConditions(
                java.util.List<ProvisionAuditConditions> provisionAuditConditions) {
            this.provisionAuditConditions = provisionAuditConditions;
            this.__explicitlySet__.add("provisionAuditConditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProvisionAuditPolicyDetails build() {
            ProvisionAuditPolicyDetails __instance__ =
                    new ProvisionAuditPolicyDetails(
                            isDataSafeServiceAccountExcluded, provisionAuditConditions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProvisionAuditPolicyDetails o) {
            Builder copiedBuilder =
                    isDataSafeServiceAccountExcluded(o.getIsDataSafeServiceAccountExcluded())
                            .provisionAuditConditions(o.getProvisionAuditConditions());

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
     * Option provided to users at the target to indicate whether the Data Safe service account has to be excluded while provisioning the audit policies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDataSafeServiceAccountExcluded")
    Boolean isDataSafeServiceAccountExcluded;

    /**
     * The audit policy details for provisioning.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisionAuditConditions")
    java.util.List<ProvisionAuditConditions> provisionAuditConditions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
