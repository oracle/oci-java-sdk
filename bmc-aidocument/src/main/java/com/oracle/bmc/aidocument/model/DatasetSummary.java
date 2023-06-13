/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * Summary of count of samples used during model training.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DatasetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatasetSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "trainingSampleCount",
        "validationSampleCount",
        "testSampleCount"
    })
    public DatasetSummary(
            Integer trainingSampleCount, Integer validationSampleCount, Integer testSampleCount) {
        super();
        this.trainingSampleCount = trainingSampleCount;
        this.validationSampleCount = validationSampleCount;
        this.testSampleCount = testSampleCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Number of samples used for training the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trainingSampleCount")
        private Integer trainingSampleCount;

        /**
         * Number of samples used for training the model.
         * @param trainingSampleCount the value to set
         * @return this builder
         **/
        public Builder trainingSampleCount(Integer trainingSampleCount) {
            this.trainingSampleCount = trainingSampleCount;
            this.__explicitlySet__.add("trainingSampleCount");
            return this;
        }
        /**
         * Number of samples used for validating the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("validationSampleCount")
        private Integer validationSampleCount;

        /**
         * Number of samples used for validating the model.
         * @param validationSampleCount the value to set
         * @return this builder
         **/
        public Builder validationSampleCount(Integer validationSampleCount) {
            this.validationSampleCount = validationSampleCount;
            this.__explicitlySet__.add("validationSampleCount");
            return this;
        }
        /**
         * Number of samples used for testing the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("testSampleCount")
        private Integer testSampleCount;

        /**
         * Number of samples used for testing the model.
         * @param testSampleCount the value to set
         * @return this builder
         **/
        public Builder testSampleCount(Integer testSampleCount) {
            this.testSampleCount = testSampleCount;
            this.__explicitlySet__.add("testSampleCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatasetSummary build() {
            DatasetSummary model =
                    new DatasetSummary(
                            this.trainingSampleCount,
                            this.validationSampleCount,
                            this.testSampleCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatasetSummary model) {
            if (model.wasPropertyExplicitlySet("trainingSampleCount")) {
                this.trainingSampleCount(model.getTrainingSampleCount());
            }
            if (model.wasPropertyExplicitlySet("validationSampleCount")) {
                this.validationSampleCount(model.getValidationSampleCount());
            }
            if (model.wasPropertyExplicitlySet("testSampleCount")) {
                this.testSampleCount(model.getTestSampleCount());
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

    /**
     * Number of samples used for training the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trainingSampleCount")
    private final Integer trainingSampleCount;

    /**
     * Number of samples used for training the model.
     * @return the value
     **/
    public Integer getTrainingSampleCount() {
        return trainingSampleCount;
    }

    /**
     * Number of samples used for validating the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validationSampleCount")
    private final Integer validationSampleCount;

    /**
     * Number of samples used for validating the model.
     * @return the value
     **/
    public Integer getValidationSampleCount() {
        return validationSampleCount;
    }

    /**
     * Number of samples used for testing the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testSampleCount")
    private final Integer testSampleCount;

    /**
     * Number of samples used for testing the model.
     * @return the value
     **/
    public Integer getTestSampleCount() {
        return testSampleCount;
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
        sb.append("DatasetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("trainingSampleCount=").append(String.valueOf(this.trainingSampleCount));
        sb.append(", validationSampleCount=").append(String.valueOf(this.validationSampleCount));
        sb.append(", testSampleCount=").append(String.valueOf(this.testSampleCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatasetSummary)) {
            return false;
        }

        DatasetSummary other = (DatasetSummary) o;
        return java.util.Objects.equals(this.trainingSampleCount, other.trainingSampleCount)
                && java.util.Objects.equals(this.validationSampleCount, other.validationSampleCount)
                && java.util.Objects.equals(this.testSampleCount, other.testSampleCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.trainingSampleCount == null
                                ? 43
                                : this.trainingSampleCount.hashCode());
        result =
                (result * PRIME)
                        + (this.validationSampleCount == null
                                ? 43
                                : this.validationSampleCount.hashCode());
        result =
                (result * PRIME)
                        + (this.testSampleCount == null ? 43 : this.testSampleCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
