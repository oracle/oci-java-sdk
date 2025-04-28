/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Defines properties of each model metadata. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Metadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Metadata extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "value",
        "description",
        "category",
        "keywords",
        "hasArtifact"
    })
    public Metadata(
            String key,
            String value,
            String description,
            String category,
            java.util.List<String> keywords,
            Boolean hasArtifact) {
        super();
        this.key = key;
        this.value = value;
        this.description = description;
        this.category = category;
        this.keywords = keywords;
        this.hasArtifact = hasArtifact;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Key of the model Metadata. The key can either be user defined or OCI defined. List of OCI
         * defined keys: * useCaseType * libraryName * libraryVersion * estimatorClass *
         * hyperParameters * testArtifactresults * fineTuningConfiguration * deploymentConfiguration
         * * readme * license * evaluationConfiguration
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Key of the model Metadata. The key can either be user defined or OCI defined. List of OCI
         * defined keys: * useCaseType * libraryName * libraryVersion * estimatorClass *
         * hyperParameters * testArtifactresults * fineTuningConfiguration * deploymentConfiguration
         * * readme * license * evaluationConfiguration
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Allowed values for useCaseType: binary_classification, regression,
         * multinomial_classification, clustering, recommender,
         * dimensionality_reduction/representation, time_series_forecasting, anomaly_detection,
         * topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
         *
         * <p>Allowed values for libraryName: scikit-learn, xgboost, tensorflow, pytorch, mxnet,
         * keras, lightGBM, pymc3, pyOD, spacy, prophet, sktime, statsmodels, cuml, oracle_automl,
         * h2o, transformers, nltk, emcee, pystan, bert, gensim, flair, word2vec, ensemble, other
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Allowed values for useCaseType: binary_classification, regression,
         * multinomial_classification, clustering, recommender,
         * dimensionality_reduction/representation, time_series_forecasting, anomaly_detection,
         * topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
         *
         * <p>Allowed values for libraryName: scikit-learn, xgboost, tensorflow, pytorch, mxnet,
         * keras, lightGBM, pymc3, pyOD, spacy, prophet, sktime, statsmodels, cuml, oracle_automl,
         * h2o, transformers, nltk, emcee, pystan, bert, gensim, flair, word2vec, ensemble, other
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Description of model metadata */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of model metadata
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Category of model metadata which should be null for defined metadata.For custom metadata
         * is should be one of the following values "Performance,Training Profile,Training and
         * Validation Datasets,Training Environment,Reports,Readme,other".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * Category of model metadata which should be null for defined metadata.For custom metadata
         * is should be one of the following values "Performance,Training Profile,Training and
         * Validation Datasets,Training Environment,Reports,Readme,other".
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** list of keywords for searching */
        @com.fasterxml.jackson.annotation.JsonProperty("keywords")
        private java.util.List<String> keywords;

        /**
         * list of keywords for searching
         *
         * @param keywords the value to set
         * @return this builder
         */
        public Builder keywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            this.__explicitlySet__.add("keywords");
            return this;
        }
        /** Is there any artifact present for the metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("hasArtifact")
        private Boolean hasArtifact;

        /**
         * Is there any artifact present for the metadata.
         *
         * @param hasArtifact the value to set
         * @return this builder
         */
        public Builder hasArtifact(Boolean hasArtifact) {
            this.hasArtifact = hasArtifact;
            this.__explicitlySet__.add("hasArtifact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Metadata build() {
            Metadata model =
                    new Metadata(
                            this.key,
                            this.value,
                            this.description,
                            this.category,
                            this.keywords,
                            this.hasArtifact);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Metadata model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("keywords")) {
                this.keywords(model.getKeywords());
            }
            if (model.wasPropertyExplicitlySet("hasArtifact")) {
                this.hasArtifact(model.getHasArtifact());
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

    /**
     * Key of the model Metadata. The key can either be user defined or OCI defined. List of OCI
     * defined keys: * useCaseType * libraryName * libraryVersion * estimatorClass * hyperParameters
     * * testArtifactresults * fineTuningConfiguration * deploymentConfiguration * readme * license
     * * evaluationConfiguration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Key of the model Metadata. The key can either be user defined or OCI defined. List of OCI
     * defined keys: * useCaseType * libraryName * libraryVersion * estimatorClass * hyperParameters
     * * testArtifactresults * fineTuningConfiguration * deploymentConfiguration * readme * license
     * * evaluationConfiguration
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * Allowed values for useCaseType: binary_classification, regression,
     * multinomial_classification, clustering, recommender, dimensionality_reduction/representation,
     * time_series_forecasting, anomaly_detection, topic_modeling, ner, sentiment_analysis,
     * image_classification, object_localization, other
     *
     * <p>Allowed values for libraryName: scikit-learn, xgboost, tensorflow, pytorch, mxnet, keras,
     * lightGBM, pymc3, pyOD, spacy, prophet, sktime, statsmodels, cuml, oracle_automl, h2o,
     * transformers, nltk, emcee, pystan, bert, gensim, flair, word2vec, ensemble, other
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Allowed values for useCaseType: binary_classification, regression,
     * multinomial_classification, clustering, recommender, dimensionality_reduction/representation,
     * time_series_forecasting, anomaly_detection, topic_modeling, ner, sentiment_analysis,
     * image_classification, object_localization, other
     *
     * <p>Allowed values for libraryName: scikit-learn, xgboost, tensorflow, pytorch, mxnet, keras,
     * lightGBM, pymc3, pyOD, spacy, prophet, sktime, statsmodels, cuml, oracle_automl, h2o,
     * transformers, nltk, emcee, pystan, bert, gensim, flair, word2vec, ensemble, other
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Description of model metadata */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of model metadata
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Category of model metadata which should be null for defined metadata.For custom metadata is
     * should be one of the following values "Performance,Training Profile,Training and Validation
     * Datasets,Training Environment,Reports,Readme,other".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * Category of model metadata which should be null for defined metadata.For custom metadata is
     * should be one of the following values "Performance,Training Profile,Training and Validation
     * Datasets,Training Environment,Reports,Readme,other".
     *
     * @return the value
     */
    public String getCategory() {
        return category;
    }

    /** list of keywords for searching */
    @com.fasterxml.jackson.annotation.JsonProperty("keywords")
    private final java.util.List<String> keywords;

    /**
     * list of keywords for searching
     *
     * @return the value
     */
    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /** Is there any artifact present for the metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("hasArtifact")
    private final Boolean hasArtifact;

    /**
     * Is there any artifact present for the metadata.
     *
     * @return the value
     */
    public Boolean getHasArtifact() {
        return hasArtifact;
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
        sb.append("Metadata(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", keywords=").append(String.valueOf(this.keywords));
        sb.append(", hasArtifact=").append(String.valueOf(this.hasArtifact));
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
                && java.util.Objects.equals(this.keywords, other.keywords)
                && java.util.Objects.equals(this.hasArtifact, other.hasArtifact)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.keywords == null ? 43 : this.keywords.hashCode());
        result = (result * PRIME) + (this.hasArtifact == null ? 43 : this.hasArtifact.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
