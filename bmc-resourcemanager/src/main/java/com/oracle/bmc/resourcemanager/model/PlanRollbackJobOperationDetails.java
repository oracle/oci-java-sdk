/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to a plan rollback job. For more information about plan rollback
 * jobs, see [Creating a Plan Rollback
 * Job](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/create-job-plan-rollback.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PlanRollbackJobOperationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "operation")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PlanRollbackJobOperationDetails extends JobOperationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("terraformAdvancedOptions")
        private TerraformAdvancedOptions terraformAdvancedOptions;

        public Builder terraformAdvancedOptions(TerraformAdvancedOptions terraformAdvancedOptions) {
            this.terraformAdvancedOptions = terraformAdvancedOptions;
            this.__explicitlySet__.add("terraformAdvancedOptions");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of a successful apply job to use for the plan rollback job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetRollbackJobId")
        private String targetRollbackJobId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of a successful apply job to use for the plan rollback job.
         *
         * @param targetRollbackJobId the value to set
         * @return this builder
         */
        public Builder targetRollbackJobId(String targetRollbackJobId) {
            this.targetRollbackJobId = targetRollbackJobId;
            this.__explicitlySet__.add("targetRollbackJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PlanRollbackJobOperationDetails build() {
            PlanRollbackJobOperationDetails model =
                    new PlanRollbackJobOperationDetails(
                            this.terraformAdvancedOptions, this.targetRollbackJobId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PlanRollbackJobOperationDetails model) {
            if (model.wasPropertyExplicitlySet("terraformAdvancedOptions")) {
                this.terraformAdvancedOptions(model.getTerraformAdvancedOptions());
            }
            if (model.wasPropertyExplicitlySet("targetRollbackJobId")) {
                this.targetRollbackJobId(model.getTargetRollbackJobId());
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

    @Deprecated
    public PlanRollbackJobOperationDetails(
            TerraformAdvancedOptions terraformAdvancedOptions, String targetRollbackJobId) {
        super();
        this.terraformAdvancedOptions = terraformAdvancedOptions;
        this.targetRollbackJobId = targetRollbackJobId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("terraformAdvancedOptions")
    private final TerraformAdvancedOptions terraformAdvancedOptions;

    public TerraformAdvancedOptions getTerraformAdvancedOptions() {
        return terraformAdvancedOptions;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * successful apply job to use for the plan rollback job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRollbackJobId")
    private final String targetRollbackJobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * successful apply job to use for the plan rollback job.
     *
     * @return the value
     */
    public String getTargetRollbackJobId() {
        return targetRollbackJobId;
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
        sb.append("PlanRollbackJobOperationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", terraformAdvancedOptions=")
                .append(String.valueOf(this.terraformAdvancedOptions));
        sb.append(", targetRollbackJobId=").append(String.valueOf(this.targetRollbackJobId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlanRollbackJobOperationDetails)) {
            return false;
        }

        PlanRollbackJobOperationDetails other = (PlanRollbackJobOperationDetails) o;
        return java.util.Objects.equals(
                        this.terraformAdvancedOptions, other.terraformAdvancedOptions)
                && java.util.Objects.equals(this.targetRollbackJobId, other.targetRollbackJobId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.terraformAdvancedOptions == null
                                ? 43
                                : this.terraformAdvancedOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.targetRollbackJobId == null
                                ? 43
                                : this.targetRollbackJobId.hashCode());
        return result;
    }
}
