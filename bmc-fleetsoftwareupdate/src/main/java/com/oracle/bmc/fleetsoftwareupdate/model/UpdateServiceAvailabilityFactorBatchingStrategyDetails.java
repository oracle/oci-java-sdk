/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Service Availability Factor batching strategy details to use during PRECHECK and APPLY Cycle
 * Actions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateServiceAvailabilityFactorBatchingStrategyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateServiceAvailabilityFactorBatchingStrategyDetails
        extends UpdateBatchingStrategyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Percentage of availability in the service during the Patch operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentage")
        private Integer percentage;

        /**
         * Percentage of availability in the service during the Patch operation.
         *
         * @param percentage the value to set
         * @return this builder
         */
        public Builder percentage(Integer percentage) {
            this.percentage = percentage;
            this.__explicitlySet__.add("percentage");
            return this;
        }
        /** True to force rolling patching. */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceRolling")
        private Boolean isForceRolling;

        /**
         * True to force rolling patching.
         *
         * @param isForceRolling the value to set
         * @return this builder
         */
        public Builder isForceRolling(Boolean isForceRolling) {
            this.isForceRolling = isForceRolling;
            this.__explicitlySet__.add("isForceRolling");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateServiceAvailabilityFactorBatchingStrategyDetails build() {
            UpdateServiceAvailabilityFactorBatchingStrategyDetails model =
                    new UpdateServiceAvailabilityFactorBatchingStrategyDetails(
                            this.percentage, this.isForceRolling);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateServiceAvailabilityFactorBatchingStrategyDetails model) {
            if (model.wasPropertyExplicitlySet("percentage")) {
                this.percentage(model.getPercentage());
            }
            if (model.wasPropertyExplicitlySet("isForceRolling")) {
                this.isForceRolling(model.getIsForceRolling());
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
    public UpdateServiceAvailabilityFactorBatchingStrategyDetails(
            Integer percentage, Boolean isForceRolling) {
        super();
        this.percentage = percentage;
        this.isForceRolling = isForceRolling;
    }

    /** Percentage of availability in the service during the Patch operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentage")
    private final Integer percentage;

    /**
     * Percentage of availability in the service during the Patch operation.
     *
     * @return the value
     */
    public Integer getPercentage() {
        return percentage;
    }

    /** True to force rolling patching. */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceRolling")
    private final Boolean isForceRolling;

    /**
     * True to force rolling patching.
     *
     * @return the value
     */
    public Boolean getIsForceRolling() {
        return isForceRolling;
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
        sb.append("UpdateServiceAvailabilityFactorBatchingStrategyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", percentage=").append(String.valueOf(this.percentage));
        sb.append(", isForceRolling=").append(String.valueOf(this.isForceRolling));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateServiceAvailabilityFactorBatchingStrategyDetails)) {
            return false;
        }

        UpdateServiceAvailabilityFactorBatchingStrategyDetails other =
                (UpdateServiceAvailabilityFactorBatchingStrategyDetails) o;
        return java.util.Objects.equals(this.percentage, other.percentage)
                && java.util.Objects.equals(this.isForceRolling, other.isForceRolling)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.percentage == null ? 43 : this.percentage.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceRolling == null ? 43 : this.isForceRolling.hashCode());
        return result;
    }
}
