/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Defines properties of each model metadata.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Metadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Metadata {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "value", "description", "category"})
    public Metadata(String key, String value, String description, String category) {
        super();
        this.key = key;
        this.value = value;
        this.description = description;
        this.category = category;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Key of the model Metadata. The key can either be user defined or OCI defined.
         *    List of OCI defined keys:
         *          * useCaseType
         *          * libraryName
         *          * libraryVersion
         *          * estimatorClass
         *          * hyperParameters
         *          * testartifactresults
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Key of the model Metadata. The key can either be user defined or OCI defined.
         *    List of OCI defined keys:
         *          * useCaseType
         *          * libraryName
         *          * libraryVersion
         *          * estimatorClass
         *          * hyperParameters
         *          * testartifactresults
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Allowed values for useCaseType:
         *              binary_classification, regression, multinomial_classification, clustering, recommender,
         *              dimensionality_reduction/representation, time_series_forecasting, anomaly_detection,
         *              topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
         * <p>
         * Allowed values for libraryName:
         *              scikit-learn, xgboost, tensorflow, pytorch, mxnet, keras, lightGBM, pymc3, pyOD, spacy,
         *              prophet, sktime, statsmodels, cuml, oracle_automl, h2o, transformers, nltk, emcee, pystan,
         *              bert, gensim, flair, word2vec, ensemble, other
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Allowed values for useCaseType:
         *              binary_classification, regression, multinomial_classification, clustering, recommender,
         *              dimensionality_reduction/representation, time_series_forecasting, anomaly_detection,
         *              topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
         * <p>
         * Allowed values for libraryName:
         *              scikit-learn, xgboost, tensorflow, pytorch, mxnet, keras, lightGBM, pymc3, pyOD, spacy,
         *              prophet, sktime, statsmodels, cuml, oracle_automl, h2o, transformers, nltk, emcee, pystan,
         *              bert, gensim, flair, word2vec, ensemble, other
         *
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Description of model metadata
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of model metadata
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Category of model metadata which should be null for defined metadata.For custom metadata is should be one of the following values "Performance,Training Profile,Training and Validation Datasets,Training Environment,other".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * Category of model metadata which should be null for defined metadata.For custom metadata is should be one of the following values "Performance,Training Profile,Training and Validation Datasets,Training Environment,other".
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Metadata build() {
            Metadata __instance__ = new Metadata(key, value, description, category);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Metadata o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .value(o.getValue())
                            .description(o.getDescription())
                            .category(o.getCategory());

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
     * Key of the model Metadata. The key can either be user defined or OCI defined.
     *    List of OCI defined keys:
     *          * useCaseType
     *          * libraryName
     *          * libraryVersion
     *          * estimatorClass
     *          * hyperParameters
     *          * testartifactresults
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Key of the model Metadata. The key can either be user defined or OCI defined.
     *    List of OCI defined keys:
     *          * useCaseType
     *          * libraryName
     *          * libraryVersion
     *          * estimatorClass
     *          * hyperParameters
     *          * testartifactresults
     *
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Allowed values for useCaseType:
     *              binary_classification, regression, multinomial_classification, clustering, recommender,
     *              dimensionality_reduction/representation, time_series_forecasting, anomaly_detection,
     *              topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
     * <p>
     * Allowed values for libraryName:
     *              scikit-learn, xgboost, tensorflow, pytorch, mxnet, keras, lightGBM, pymc3, pyOD, spacy,
     *              prophet, sktime, statsmodels, cuml, oracle_automl, h2o, transformers, nltk, emcee, pystan,
     *              bert, gensim, flair, word2vec, ensemble, other
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Allowed values for useCaseType:
     *              binary_classification, regression, multinomial_classification, clustering, recommender,
     *              dimensionality_reduction/representation, time_series_forecasting, anomaly_detection,
     *              topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
     * <p>
     * Allowed values for libraryName:
     *              scikit-learn, xgboost, tensorflow, pytorch, mxnet, keras, lightGBM, pymc3, pyOD, spacy,
     *              prophet, sktime, statsmodels, cuml, oracle_automl, h2o, transformers, nltk, emcee, pystan,
     *              bert, gensim, flair, word2vec, ensemble, other
     *
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Description of model metadata
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of model metadata
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Category of model metadata which should be null for defined metadata.For custom metadata is should be one of the following values "Performance,Training Profile,Training and Validation Datasets,Training Environment,other".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * Category of model metadata which should be null for defined metadata.For custom metadata is should be one of the following values "Performance,Training Profile,Training and Validation Datasets,Training Environment,other".
     * @return the value
     **/
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Metadata(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Metadata)) {
            return false;
        }

        Metadata other = (Metadata) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
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
