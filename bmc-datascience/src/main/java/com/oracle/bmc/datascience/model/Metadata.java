/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Metadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Metadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

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
    String key;

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
    String value;

    /**
     * Description of model metadata
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Category of model metadata which should be null for defined metadata.For custom metadata is should be one of the following values "Performance,Training Profile,Training and Validation Datasets,Training Environment,other".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    String category;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
