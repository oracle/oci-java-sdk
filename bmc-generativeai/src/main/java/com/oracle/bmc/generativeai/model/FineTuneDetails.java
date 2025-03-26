/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Details about fine-tuning a custom model.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FineTuneDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FineTuneDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"trainingDataset", "dedicatedAiClusterId", "trainingConfig"})
    public FineTuneDetails(
            Dataset trainingDataset, String dedicatedAiClusterId, TrainingConfig trainingConfig) {
        super();
        this.trainingDataset = trainingDataset;
        this.dedicatedAiClusterId = dedicatedAiClusterId;
        this.trainingConfig = trainingConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("trainingDataset")
        private Dataset trainingDataset;

        public Builder trainingDataset(Dataset trainingDataset) {
            this.trainingDataset = trainingDataset;
            this.__explicitlySet__.add("trainingDataset");
            return this;
        }
        /**
         * The OCID of the dedicated AI cluster this fine-tuning runs on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedAiClusterId")
        private String dedicatedAiClusterId;

        /**
         * The OCID of the dedicated AI cluster this fine-tuning runs on.
         * @param dedicatedAiClusterId the value to set
         * @return this builder
         **/
        public Builder dedicatedAiClusterId(String dedicatedAiClusterId) {
            this.dedicatedAiClusterId = dedicatedAiClusterId;
            this.__explicitlySet__.add("dedicatedAiClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trainingConfig")
        private TrainingConfig trainingConfig;

        public Builder trainingConfig(TrainingConfig trainingConfig) {
            this.trainingConfig = trainingConfig;
            this.__explicitlySet__.add("trainingConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FineTuneDetails build() {
            FineTuneDetails model =
                    new FineTuneDetails(
                            this.trainingDataset, this.dedicatedAiClusterId, this.trainingConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FineTuneDetails model) {
            if (model.wasPropertyExplicitlySet("trainingDataset")) {
                this.trainingDataset(model.getTrainingDataset());
            }
            if (model.wasPropertyExplicitlySet("dedicatedAiClusterId")) {
                this.dedicatedAiClusterId(model.getDedicatedAiClusterId());
            }
            if (model.wasPropertyExplicitlySet("trainingConfig")) {
                this.trainingConfig(model.getTrainingConfig());
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

    @com.fasterxml.jackson.annotation.JsonProperty("trainingDataset")
    private final Dataset trainingDataset;

    public Dataset getTrainingDataset() {
        return trainingDataset;
    }

    /**
     * The OCID of the dedicated AI cluster this fine-tuning runs on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedAiClusterId")
    private final String dedicatedAiClusterId;

    /**
     * The OCID of the dedicated AI cluster this fine-tuning runs on.
     * @return the value
     **/
    public String getDedicatedAiClusterId() {
        return dedicatedAiClusterId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("trainingConfig")
    private final TrainingConfig trainingConfig;

    public TrainingConfig getTrainingConfig() {
        return trainingConfig;
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
        sb.append("FineTuneDetails(");
        sb.append("super=").append(super.toString());
        sb.append("trainingDataset=").append(String.valueOf(this.trainingDataset));
        sb.append(", dedicatedAiClusterId=").append(String.valueOf(this.dedicatedAiClusterId));
        sb.append(", trainingConfig=").append(String.valueOf(this.trainingConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FineTuneDetails)) {
            return false;
        }

        FineTuneDetails other = (FineTuneDetails) o;
        return java.util.Objects.equals(this.trainingDataset, other.trainingDataset)
                && java.util.Objects.equals(this.dedicatedAiClusterId, other.dedicatedAiClusterId)
                && java.util.Objects.equals(this.trainingConfig, other.trainingConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.trainingDataset == null ? 43 : this.trainingDataset.hashCode());
        result =
                (result * PRIME)
                        + (this.dedicatedAiClusterId == null
                                ? 43
                                : this.dedicatedAiClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.trainingConfig == null ? 43 : this.trainingConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
