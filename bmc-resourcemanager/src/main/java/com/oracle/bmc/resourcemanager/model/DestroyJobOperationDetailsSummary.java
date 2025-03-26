/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to destroy operations.
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
    builder = DestroyJobOperationDetailsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "operation"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DestroyJobOperationDetailsSummary extends JobOperationDetailsSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies the source of the execution plan to apply.
         * Currently, only {@code AUTO_APPROVED} is allowed, which indicates that the job
         * will be run without an execution plan.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
        private DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

        /**
         * Specifies the source of the execution plan to apply.
         * Currently, only {@code AUTO_APPROVED} is allowed, which indicates that the job
         * will be run without an execution plan.
         *
         * @param executionPlanStrategy the value to set
         * @return this builder
         **/
        public Builder executionPlanStrategy(
                DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy) {
            this.executionPlanStrategy = executionPlanStrategy;
            this.__explicitlySet__.add("executionPlanStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DestroyJobOperationDetailsSummary build() {
            DestroyJobOperationDetailsSummary model =
                    new DestroyJobOperationDetailsSummary(this.executionPlanStrategy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DestroyJobOperationDetailsSummary model) {
            if (model.wasPropertyExplicitlySet("executionPlanStrategy")) {
                this.executionPlanStrategy(model.getExecutionPlanStrategy());
            }
            return this;
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

    @Deprecated
    public DestroyJobOperationDetailsSummary(
            DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy) {
        super();
        this.executionPlanStrategy = executionPlanStrategy;
    }

    /**
     * Specifies the source of the execution plan to apply.
     * Currently, only {@code AUTO_APPROVED} is allowed, which indicates that the job
     * will be run without an execution plan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
    private final DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

    /**
     * Specifies the source of the execution plan to apply.
     * Currently, only {@code AUTO_APPROVED} is allowed, which indicates that the job
     * will be run without an execution plan.
     *
     * @return the value
     **/
    public DestroyJobOperationDetails.ExecutionPlanStrategy getExecutionPlanStrategy() {
        return executionPlanStrategy;
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
        sb.append("DestroyJobOperationDetailsSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", executionPlanStrategy=").append(String.valueOf(this.executionPlanStrategy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DestroyJobOperationDetailsSummary)) {
            return false;
        }

        DestroyJobOperationDetailsSummary other = (DestroyJobOperationDetailsSummary) o;
        return java.util.Objects.equals(this.executionPlanStrategy, other.executionPlanStrategy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.executionPlanStrategy == null
                                ? 43
                                : this.executionPlanStrategy.hashCode());
        return result;
    }
}
