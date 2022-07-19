/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplyJobPlanResolution.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApplyJobPlanResolution {
    @Deprecated
    @java.beans.ConstructorProperties({"planJobId", "isUseLatestJobId", "isAutoApproved"})
    public ApplyJobPlanResolution(
            String planJobId, Boolean isUseLatestJobId, Boolean isAutoApproved) {
        super();
        this.planJobId = planJobId;
        this.isUseLatestJobId = isUseLatestJobId;
        this.isAutoApproved = isAutoApproved;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that specifies the most recently executed plan job.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planJobId")
        private String planJobId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that specifies the most recently executed plan job.
         *
         * @param planJobId the value to set
         * @return this builder
         **/
        public Builder planJobId(String planJobId) {
            this.planJobId = planJobId;
            this.__explicitlySet__.add("planJobId");
            return this;
        }
        /**
         * Specifies whether to use the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the most recently run plan job.
         * {@code True} if using the latest job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be a plan job that completed successfully.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUseLatestJobId")
        private Boolean isUseLatestJobId;

        /**
         * Specifies whether to use the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the most recently run plan job.
         * {@code True} if using the latest job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be a plan job that completed successfully.
         *
         * @param isUseLatestJobId the value to set
         * @return this builder
         **/
        public Builder isUseLatestJobId(Boolean isUseLatestJobId) {
            this.isUseLatestJobId = isUseLatestJobId;
            this.__explicitlySet__.add("isUseLatestJobId");
            return this;
        }
        /**
         * Specifies whether to use the configuration directly, without reference to a Plan job.
         * {@code True} if using the configuration directly. Note that it is not necessary
         * for a Plan job to have run successfully.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
        private Boolean isAutoApproved;

        /**
         * Specifies whether to use the configuration directly, without reference to a Plan job.
         * {@code True} if using the configuration directly. Note that it is not necessary
         * for a Plan job to have run successfully.
         *
         * @param isAutoApproved the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that specifies the most recently executed plan job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planJobId")
    private final String planJobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that specifies the most recently executed plan job.
     *
     * @return the value
     **/
    public String getPlanJobId() {
        return planJobId;
    }

    /**
     * Specifies whether to use the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the most recently run plan job.
     * {@code True} if using the latest job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be a plan job that completed successfully.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUseLatestJobId")
    private final Boolean isUseLatestJobId;

    /**
     * Specifies whether to use the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the most recently run plan job.
     * {@code True} if using the latest job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be a plan job that completed successfully.
     *
     * @return the value
     **/
    public Boolean getIsUseLatestJobId() {
        return isUseLatestJobId;
    }

    /**
     * Specifies whether to use the configuration directly, without reference to a Plan job.
     * {@code True} if using the configuration directly. Note that it is not necessary
     * for a Plan job to have run successfully.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    private final Boolean isAutoApproved;

    /**
     * Specifies whether to use the configuration directly, without reference to a Plan job.
     * {@code True} if using the configuration directly. Note that it is not necessary
     * for a Plan job to have run successfully.
     *
     * @return the value
     **/
    public Boolean getIsAutoApproved() {
        return isAutoApproved;
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
        sb.append("ApplyJobPlanResolution(");
        sb.append("planJobId=").append(String.valueOf(this.planJobId));
        sb.append(", isUseLatestJobId=").append(String.valueOf(this.isUseLatestJobId));
        sb.append(", isAutoApproved=").append(String.valueOf(this.isAutoApproved));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplyJobPlanResolution)) {
            return false;
        }

        ApplyJobPlanResolution other = (ApplyJobPlanResolution) o;
        return java.util.Objects.equals(this.planJobId, other.planJobId)
                && java.util.Objects.equals(this.isUseLatestJobId, other.isUseLatestJobId)
                && java.util.Objects.equals(this.isAutoApproved, other.isAutoApproved)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.planJobId == null ? 43 : this.planJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.isUseLatestJobId == null ? 43 : this.isUseLatestJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoApproved == null ? 43 : this.isAutoApproved.hashCode());
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
