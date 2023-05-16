/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to destroy operations. <br>
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
        builder = CreateDestroyJobOperationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "operation")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDestroyJobOperationDetails extends CreateJobOperationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isProviderUpgradeRequired")
        private Boolean isProviderUpgradeRequired;

        public Builder isProviderUpgradeRequired(Boolean isProviderUpgradeRequired) {
            this.isProviderUpgradeRequired = isProviderUpgradeRequired;
            this.__explicitlySet__.add("isProviderUpgradeRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("terraformAdvancedOptions")
        private TerraformAdvancedOptions terraformAdvancedOptions;

        public Builder terraformAdvancedOptions(TerraformAdvancedOptions terraformAdvancedOptions) {
            this.terraformAdvancedOptions = terraformAdvancedOptions;
            this.__explicitlySet__.add("terraformAdvancedOptions");
            return this;
        }
        /**
         * Specifies the source of the execution plan to apply. Currently, only {@code
         * AUTO_APPROVED} is allowed, which indicates that the job will be run without an execution
         * plan.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
        private DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

        /**
         * Specifies the source of the execution plan to apply. Currently, only {@code
         * AUTO_APPROVED} is allowed, which indicates that the job will be run without an execution
         * plan.
         *
         * @param executionPlanStrategy the value to set
         * @return this builder
         */
        public Builder executionPlanStrategy(
                DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy) {
            this.executionPlanStrategy = executionPlanStrategy;
            this.__explicitlySet__.add("executionPlanStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDestroyJobOperationDetails build() {
            CreateDestroyJobOperationDetails model =
                    new CreateDestroyJobOperationDetails(
                            this.isProviderUpgradeRequired,
                            this.terraformAdvancedOptions,
                            this.executionPlanStrategy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDestroyJobOperationDetails model) {
            if (model.wasPropertyExplicitlySet("isProviderUpgradeRequired")) {
                this.isProviderUpgradeRequired(model.getIsProviderUpgradeRequired());
            }
            if (model.wasPropertyExplicitlySet("terraformAdvancedOptions")) {
                this.terraformAdvancedOptions(model.getTerraformAdvancedOptions());
            }
            if (model.wasPropertyExplicitlySet("executionPlanStrategy")) {
                this.executionPlanStrategy(model.getExecutionPlanStrategy());
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
    public CreateDestroyJobOperationDetails(
            Boolean isProviderUpgradeRequired,
            TerraformAdvancedOptions terraformAdvancedOptions,
            DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy) {
        super(isProviderUpgradeRequired);
        this.terraformAdvancedOptions = terraformAdvancedOptions;
        this.executionPlanStrategy = executionPlanStrategy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("terraformAdvancedOptions")
    private final TerraformAdvancedOptions terraformAdvancedOptions;

    public TerraformAdvancedOptions getTerraformAdvancedOptions() {
        return terraformAdvancedOptions;
    }

    /**
     * Specifies the source of the execution plan to apply. Currently, only {@code AUTO_APPROVED} is
     * allowed, which indicates that the job will be run without an execution plan.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
    private final DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

    /**
     * Specifies the source of the execution plan to apply. Currently, only {@code AUTO_APPROVED} is
     * allowed, which indicates that the job will be run without an execution plan.
     *
     * @return the value
     */
    public DestroyJobOperationDetails.ExecutionPlanStrategy getExecutionPlanStrategy() {
        return executionPlanStrategy;
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
        sb.append("CreateDestroyJobOperationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", terraformAdvancedOptions=")
                .append(String.valueOf(this.terraformAdvancedOptions));
        sb.append(", executionPlanStrategy=").append(String.valueOf(this.executionPlanStrategy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDestroyJobOperationDetails)) {
            return false;
        }

        CreateDestroyJobOperationDetails other = (CreateDestroyJobOperationDetails) o;
        return java.util.Objects.equals(
                        this.terraformAdvancedOptions, other.terraformAdvancedOptions)
                && java.util.Objects.equals(this.executionPlanStrategy, other.executionPlanStrategy)
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
                        + (this.executionPlanStrategy == null
                                ? 43
                                : this.executionPlanStrategy.hashCode());
        return result;
    }
}
