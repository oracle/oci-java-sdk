/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The information about the OrganizationTenancy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OrganizationTenancy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OrganizationTenancy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OrganizationTenancyLifecycleState lifecycleState;

        public Builder lifecycleState(OrganizationTenancyLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private OrganizationTenancyRole role;

        public Builder role(OrganizationTenancyRole role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeJoined")
        private java.util.Date timeJoined;

        public Builder timeJoined(java.util.Date timeJoined) {
            this.timeJoined = timeJoined;
            this.__explicitlySet__.add("timeJoined");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLeft")
        private java.util.Date timeLeft;

        public Builder timeLeft(java.util.Date timeLeft) {
            this.timeLeft = timeLeft;
            this.__explicitlySet__.add("timeLeft");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isApprovedForTransfer")
        private Boolean isApprovedForTransfer;

        public Builder isApprovedForTransfer(Boolean isApprovedForTransfer) {
            this.isApprovedForTransfer = isApprovedForTransfer;
            this.__explicitlySet__.add("isApprovedForTransfer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrganizationTenancy build() {
            OrganizationTenancy __instance__ =
                    new OrganizationTenancy(
                            tenancyId,
                            name,
                            lifecycleState,
                            role,
                            timeJoined,
                            timeLeft,
                            isApprovedForTransfer);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrganizationTenancy o) {
            Builder copiedBuilder =
                    tenancyId(o.getTenancyId())
                            .name(o.getName())
                            .lifecycleState(o.getLifecycleState())
                            .role(o.getRole())
                            .timeJoined(o.getTimeJoined())
                            .timeLeft(o.getTimeLeft())
                            .isApprovedForTransfer(o.getIsApprovedForTransfer());

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
     * OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    String tenancyId;

    /**
     * Name of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Lifecycle state of the OrganizationTenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    OrganizationTenancyLifecycleState lifecycleState;

    /**
     * Role of the OrganizationTenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    OrganizationTenancyRole role;

    /**
     * Date-time when this tenancy joined the organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeJoined")
    java.util.Date timeJoined;

    /**
     * Date-time when this tenancy left the organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLeft")
    java.util.Date timeLeft;

    /**
     * Flag to indicate the tenancy is approved for transfer to another organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isApprovedForTransfer")
    Boolean isApprovedForTransfer;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
