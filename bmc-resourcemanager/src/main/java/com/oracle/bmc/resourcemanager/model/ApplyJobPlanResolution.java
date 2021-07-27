/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Deprecated. Use the property {@code executionPlanStrategy} in {@code jobOperationDetails} instead.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplyJobPlanResolution.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ApplyJobPlanResolution {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("planJobId")
        private String planJobId;

        public Builder planJobId(String planJobId) {
            this.planJobId = planJobId;
            this.__explicitlySet__.add("planJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUseLatestJobId")
        private Boolean isUseLatestJobId;

        public Builder isUseLatestJobId(Boolean isUseLatestJobId) {
            this.isUseLatestJobId = isUseLatestJobId;
            this.__explicitlySet__.add("isUseLatestJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
        private Boolean isAutoApproved;

        public Builder isAutoApproved(Boolean isAutoApproved) {
            this.isAutoApproved = isAutoApproved;
            this.__explicitlySet__.add("isAutoApproved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplyJobPlanResolution build() {
            ApplyJobPlanResolution __instance__ =
                    new ApplyJobPlanResolution(planJobId, isUseLatestJobId, isAutoApproved);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplyJobPlanResolution o) {
            Builder copiedBuilder =
                    planJobId(o.getPlanJobId())
                            .isUseLatestJobId(o.getIsUseLatestJobId())
                            .isAutoApproved(o.getIsAutoApproved());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that specifies the most recently executed plan job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planJobId")
    String planJobId;

    /**
     * Specifies whether to use the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the most recently run plan job.
     * {@code True} if using the latest job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be a plan job that completed successfully.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUseLatestJobId")
    Boolean isUseLatestJobId;

    /**
     * Specifies whether to use the configuration directly, without reference to a Plan job.
     * {@code True} if using the configuration directly. Note that it is not necessary
     * for a Plan job to have run successfully.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    Boolean isAutoApproved;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
