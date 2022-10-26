/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Specifies the details of the MSET model during the create call. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ModelTrainingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ModelTrainingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetFap", "trainingFraction", "dataAssetIds"})
    public ModelTrainingDetails(
            Float targetFap, Float trainingFraction, java.util.List<String> dataAssetIds) {
        super();
        this.targetFap = targetFap;
        this.trainingFraction = trainingFraction;
        this.dataAssetIds = dataAssetIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A target model accuracy metric user provides as their requirement */
        @com.fasterxml.jackson.annotation.JsonProperty("targetFap")
        private Float targetFap;

        /**
         * A target model accuracy metric user provides as their requirement
         *
         * @param targetFap the value to set
         * @return this builder
         */
        public Builder targetFap(Float targetFap) {
            this.targetFap = targetFap;
            this.__explicitlySet__.add("targetFap");
            return this;
        }
        /**
         * Fraction of total data that is used for training the model. The remaining is used for
         * validation of the model.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trainingFraction")
        private Float trainingFraction;

        /**
         * Fraction of total data that is used for training the model. The remaining is used for
         * validation of the model.
         *
         * @param trainingFraction the value to set
         * @return this builder
         */
        public Builder trainingFraction(Float trainingFraction) {
            this.trainingFraction = trainingFraction;
            this.__explicitlySet__.add("trainingFraction");
            return this;
        }
        /**
         * The list of OCIDs of the data assets to train the model. The dataAssets have to be in the
         * same project where the ai model would reside.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetIds")
        private java.util.List<String> dataAssetIds;

        /**
         * The list of OCIDs of the data assets to train the model. The dataAssets have to be in the
         * same project where the ai model would reside.
         *
         * @param dataAssetIds the value to set
         * @return this builder
         */
        public Builder dataAssetIds(java.util.List<String> dataAssetIds) {
            this.dataAssetIds = dataAssetIds;
            this.__explicitlySet__.add("dataAssetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelTrainingDetails build() {
            ModelTrainingDetails model =
                    new ModelTrainingDetails(
                            this.targetFap, this.trainingFraction, this.dataAssetIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelTrainingDetails model) {
            if (model.wasPropertyExplicitlySet("targetFap")) {
                this.targetFap(model.getTargetFap());
            }
            if (model.wasPropertyExplicitlySet("trainingFraction")) {
                this.trainingFraction(model.getTrainingFraction());
            }
            if (model.wasPropertyExplicitlySet("dataAssetIds")) {
                this.dataAssetIds(model.getDataAssetIds());
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

    /** A target model accuracy metric user provides as their requirement */
    @com.fasterxml.jackson.annotation.JsonProperty("targetFap")
    private final Float targetFap;

    /**
     * A target model accuracy metric user provides as their requirement
     *
     * @return the value
     */
    public Float getTargetFap() {
        return targetFap;
    }

    /**
     * Fraction of total data that is used for training the model. The remaining is used for
     * validation of the model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trainingFraction")
    private final Float trainingFraction;

    /**
     * Fraction of total data that is used for training the model. The remaining is used for
     * validation of the model.
     *
     * @return the value
     */
    public Float getTrainingFraction() {
        return trainingFraction;
    }

    /**
     * The list of OCIDs of the data assets to train the model. The dataAssets have to be in the
     * same project where the ai model would reside.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetIds")
    private final java.util.List<String> dataAssetIds;

    /**
     * The list of OCIDs of the data assets to train the model. The dataAssets have to be in the
     * same project where the ai model would reside.
     *
     * @return the value
     */
    public java.util.List<String> getDataAssetIds() {
        return dataAssetIds;
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
        sb.append("ModelTrainingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetFap=").append(String.valueOf(this.targetFap));
        sb.append(", trainingFraction=").append(String.valueOf(this.trainingFraction));
        sb.append(", dataAssetIds=").append(String.valueOf(this.dataAssetIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelTrainingDetails)) {
            return false;
        }

        ModelTrainingDetails other = (ModelTrainingDetails) o;
        return java.util.Objects.equals(this.targetFap, other.targetFap)
                && java.util.Objects.equals(this.trainingFraction, other.trainingFraction)
                && java.util.Objects.equals(this.dataAssetIds, other.dataAssetIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetFap == null ? 43 : this.targetFap.hashCode());
        result =
                (result * PRIME)
                        + (this.trainingFraction == null ? 43 : this.trainingFraction.hashCode());
        result = (result * PRIME) + (this.dataAssetIds == null ? 43 : this.dataAssetIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
