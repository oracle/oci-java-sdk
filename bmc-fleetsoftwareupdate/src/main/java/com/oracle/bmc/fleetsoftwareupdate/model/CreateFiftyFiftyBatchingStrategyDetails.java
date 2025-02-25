/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Fifty-Fifty batching strategy details to use during PRECHECK and APPLY Cycle Actions.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateFiftyFiftyBatchingStrategyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateFiftyFiftyBatchingStrategyDetails extends CreateBatchingStrategyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * True to wait for customer to resume the Apply Action once the first half is done.
         * False to automatically patch the second half.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isWaitForBatchResume")
        private Boolean isWaitForBatchResume;

        /**
         * True to wait for customer to resume the Apply Action once the first half is done.
         * False to automatically patch the second half.
         *
         * @param isWaitForBatchResume the value to set
         * @return this builder
         **/
        public Builder isWaitForBatchResume(Boolean isWaitForBatchResume) {
            this.isWaitForBatchResume = isWaitForBatchResume;
            this.__explicitlySet__.add("isWaitForBatchResume");
            return this;
        }
        /**
         * True to force rolling patching.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isForceRolling")
        private Boolean isForceRolling;

        /**
         * True to force rolling patching.
         *
         * @param isForceRolling the value to set
         * @return this builder
         **/
        public Builder isForceRolling(Boolean isForceRolling) {
            this.isForceRolling = isForceRolling;
            this.__explicitlySet__.add("isForceRolling");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateFiftyFiftyBatchingStrategyDetails build() {
            CreateFiftyFiftyBatchingStrategyDetails model =
                    new CreateFiftyFiftyBatchingStrategyDetails(
                            this.isWaitForBatchResume, this.isForceRolling);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFiftyFiftyBatchingStrategyDetails model) {
            if (model.wasPropertyExplicitlySet("isWaitForBatchResume")) {
                this.isWaitForBatchResume(model.getIsWaitForBatchResume());
            }
            if (model.wasPropertyExplicitlySet("isForceRolling")) {
                this.isForceRolling(model.getIsForceRolling());
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
    public CreateFiftyFiftyBatchingStrategyDetails(
            Boolean isWaitForBatchResume, Boolean isForceRolling) {
        super();
        this.isWaitForBatchResume = isWaitForBatchResume;
        this.isForceRolling = isForceRolling;
    }

    /**
     * True to wait for customer to resume the Apply Action once the first half is done.
     * False to automatically patch the second half.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isWaitForBatchResume")
    private final Boolean isWaitForBatchResume;

    /**
     * True to wait for customer to resume the Apply Action once the first half is done.
     * False to automatically patch the second half.
     *
     * @return the value
     **/
    public Boolean getIsWaitForBatchResume() {
        return isWaitForBatchResume;
    }

    /**
     * True to force rolling patching.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForceRolling")
    private final Boolean isForceRolling;

    /**
     * True to force rolling patching.
     *
     * @return the value
     **/
    public Boolean getIsForceRolling() {
        return isForceRolling;
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
        sb.append("CreateFiftyFiftyBatchingStrategyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isWaitForBatchResume=").append(String.valueOf(this.isWaitForBatchResume));
        sb.append(", isForceRolling=").append(String.valueOf(this.isForceRolling));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFiftyFiftyBatchingStrategyDetails)) {
            return false;
        }

        CreateFiftyFiftyBatchingStrategyDetails other = (CreateFiftyFiftyBatchingStrategyDetails) o;
        return java.util.Objects.equals(this.isWaitForBatchResume, other.isWaitForBatchResume)
                && java.util.Objects.equals(this.isForceRolling, other.isForceRolling)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isWaitForBatchResume == null
                                ? 43
                                : this.isWaitForBatchResume.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceRolling == null ? 43 : this.isForceRolling.hashCode());
        return result;
    }
}
