/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
    @java.beans.ConstructorProperties({
        "algorithmHint",
        "targetFap",
        "trainingFraction",
        "windowSize",
        "dataAssetIds"
    })
    public ModelTrainingDetails(
            AlgorithmHint algorithmHint,
            Float targetFap,
            Float trainingFraction,
            Integer windowSize,
            java.util.List<String> dataAssetIds) {
        super();
        this.algorithmHint = algorithmHint;
        this.targetFap = targetFap;
        this.trainingFraction = trainingFraction;
        this.windowSize = windowSize;
        this.dataAssetIds = dataAssetIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** User can choose specific algorithm for training. */
        @com.fasterxml.jackson.annotation.JsonProperty("algorithmHint")
        private AlgorithmHint algorithmHint;

        /**
         * User can choose specific algorithm for training.
         *
         * @param algorithmHint the value to set
         * @return this builder
         */
        public Builder algorithmHint(AlgorithmHint algorithmHint) {
            this.algorithmHint = algorithmHint;
            this.__explicitlySet__.add("algorithmHint");
            return this;
        }
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
        /** This value would determine the window size of the training algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("windowSize")
        private Integer windowSize;

        /**
         * This value would determine the window size of the training algorithm.
         *
         * @param windowSize the value to set
         * @return this builder
         */
        public Builder windowSize(Integer windowSize) {
            this.windowSize = windowSize;
            this.__explicitlySet__.add("windowSize");
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
                            this.algorithmHint,
                            this.targetFap,
                            this.trainingFraction,
                            this.windowSize,
                            this.dataAssetIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelTrainingDetails model) {
            if (model.wasPropertyExplicitlySet("algorithmHint")) {
                this.algorithmHint(model.getAlgorithmHint());
            }
            if (model.wasPropertyExplicitlySet("targetFap")) {
                this.targetFap(model.getTargetFap());
            }
            if (model.wasPropertyExplicitlySet("trainingFraction")) {
                this.trainingFraction(model.getTrainingFraction());
            }
            if (model.wasPropertyExplicitlySet("windowSize")) {
                this.windowSize(model.getWindowSize());
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

    /** User can choose specific algorithm for training. */
    public enum AlgorithmHint implements com.oracle.bmc.http.internal.BmcEnum {
        MultivariateMset("MULTIVARIATE_MSET"),
        UnivariateOcsvm("UNIVARIATE_OCSVM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AlgorithmHint.class);

        private final String value;
        private static java.util.Map<String, AlgorithmHint> map;

        static {
            map = new java.util.HashMap<>();
            for (AlgorithmHint v : AlgorithmHint.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AlgorithmHint(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AlgorithmHint create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AlgorithmHint', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** User can choose specific algorithm for training. */
    @com.fasterxml.jackson.annotation.JsonProperty("algorithmHint")
    private final AlgorithmHint algorithmHint;

    /**
     * User can choose specific algorithm for training.
     *
     * @return the value
     */
    public AlgorithmHint getAlgorithmHint() {
        return algorithmHint;
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

    /** This value would determine the window size of the training algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("windowSize")
    private final Integer windowSize;

    /**
     * This value would determine the window size of the training algorithm.
     *
     * @return the value
     */
    public Integer getWindowSize() {
        return windowSize;
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
        sb.append("algorithmHint=").append(String.valueOf(this.algorithmHint));
        sb.append(", targetFap=").append(String.valueOf(this.targetFap));
        sb.append(", trainingFraction=").append(String.valueOf(this.trainingFraction));
        sb.append(", windowSize=").append(String.valueOf(this.windowSize));
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
        return java.util.Objects.equals(this.algorithmHint, other.algorithmHint)
                && java.util.Objects.equals(this.targetFap, other.targetFap)
                && java.util.Objects.equals(this.trainingFraction, other.trainingFraction)
                && java.util.Objects.equals(this.windowSize, other.windowSize)
                && java.util.Objects.equals(this.dataAssetIds, other.dataAssetIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.algorithmHint == null ? 43 : this.algorithmHint.hashCode());
        result = (result * PRIME) + (this.targetFap == null ? 43 : this.targetFap.hashCode());
        result =
                (result * PRIME)
                        + (this.trainingFraction == null ? 43 : this.trainingFraction.hashCode());
        result = (result * PRIME) + (this.windowSize == null ? 43 : this.windowSize.hashCode());
        result = (result * PRIME) + (this.dataAssetIds == null ? 43 : this.dataAssetIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
