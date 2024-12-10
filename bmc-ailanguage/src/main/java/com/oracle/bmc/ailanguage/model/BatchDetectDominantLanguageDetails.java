/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The documents details for language detect call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BatchDetectDominantLanguageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BatchDetectDominantLanguageDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "alias",
        "shouldIgnoreTransliteration",
        "charsToConsider",
        "endpointId",
        "compartmentId",
        "documents"
    })
    public BatchDetectDominantLanguageDetails(
            String alias,
            Boolean shouldIgnoreTransliteration,
            Integer charsToConsider,
            String endpointId,
            String compartmentId,
            java.util.List<DominantLanguageDocument> documents) {
        super();
        this.alias = alias;
        this.shouldIgnoreTransliteration = shouldIgnoreTransliteration;
        this.charsToConsider = charsToConsider;
        this.endpointId = endpointId;
        this.compartmentId = compartmentId;
        this.documents = documents;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique name across user tenancy in a region to identify an endpoint to be used for inferencing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * Unique name across user tenancy in a region to identify an endpoint to be used for inferencing.
         * @param alias the value to set
         * @return this builder
         **/
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }
        /**
         * Specifies whether to consider or ignore transliteration. For example "hi, aap kaise ho? sab kuch teek hai? I will call you tomorrow." would be detected as English when ignore transliteration=true, Hindi when ignoreTransliteration=false.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIgnoreTransliteration")
        private Boolean shouldIgnoreTransliteration;

        /**
         * Specifies whether to consider or ignore transliteration. For example "hi, aap kaise ho? sab kuch teek hai? I will call you tomorrow." would be detected as English when ignore transliteration=true, Hindi when ignoreTransliteration=false.
         * @param shouldIgnoreTransliteration the value to set
         * @return this builder
         **/
        public Builder shouldIgnoreTransliteration(Boolean shouldIgnoreTransliteration) {
            this.shouldIgnoreTransliteration = shouldIgnoreTransliteration;
            this.__explicitlySet__.add("shouldIgnoreTransliteration");
            return this;
        }
        /**
         * default value is None.
         * Specifies maximum number of characters to consider for determining the dominant language.
         * If unspecified, then optimum number characters will be considered.
         * If 0 is specified then all the characters are used to determine the language.
         * If the value is greater than 0, then specified number of characters will be considered from the beginning of the text.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("charsToConsider")
        private Integer charsToConsider;

        /**
         * default value is None.
         * Specifies maximum number of characters to consider for determining the dominant language.
         * If unspecified, then optimum number characters will be considered.
         * If 0 is specified then all the characters are used to determine the language.
         * If the value is greater than 0, then specified number of characters will be considered from the beginning of the text.
         *
         * @param charsToConsider the value to set
         * @return this builder
         **/
        public Builder charsToConsider(Integer charsToConsider) {
            this.charsToConsider = charsToConsider;
            this.__explicitlySet__.add("charsToConsider");
            return this;
        }
        /**
         * The endpoint which have to be used for inferencing. If endpointId and compartmentId is provided, then inference will be served from custom model which is mapped to this Endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
        private String endpointId;

        /**
         * The endpoint which have to be used for inferencing. If endpointId and compartmentId is provided, then inference will be served from custom model which is mapped to this Endpoint.
         * @param endpointId the value to set
         * @return this builder
         **/
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            this.__explicitlySet__.add("endpointId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that calls the API, inference will be served from pre trained model
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that calls the API, inference will be served from pre trained model
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * List of Documents for detect language.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<DominantLanguageDocument> documents;

        /**
         * List of Documents for detect language.
         * @param documents the value to set
         * @return this builder
         **/
        public Builder documents(java.util.List<DominantLanguageDocument> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BatchDetectDominantLanguageDetails build() {
            BatchDetectDominantLanguageDetails model =
                    new BatchDetectDominantLanguageDetails(
                            this.alias,
                            this.shouldIgnoreTransliteration,
                            this.charsToConsider,
                            this.endpointId,
                            this.compartmentId,
                            this.documents);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchDetectDominantLanguageDetails model) {
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            if (model.wasPropertyExplicitlySet("shouldIgnoreTransliteration")) {
                this.shouldIgnoreTransliteration(model.getShouldIgnoreTransliteration());
            }
            if (model.wasPropertyExplicitlySet("charsToConsider")) {
                this.charsToConsider(model.getCharsToConsider());
            }
            if (model.wasPropertyExplicitlySet("endpointId")) {
                this.endpointId(model.getEndpointId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("documents")) {
                this.documents(model.getDocuments());
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
     * Unique name across user tenancy in a region to identify an endpoint to be used for inferencing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * Unique name across user tenancy in a region to identify an endpoint to be used for inferencing.
     * @return the value
     **/
    public String getAlias() {
        return alias;
    }

    /**
     * Specifies whether to consider or ignore transliteration. For example "hi, aap kaise ho? sab kuch teek hai? I will call you tomorrow." would be detected as English when ignore transliteration=true, Hindi when ignoreTransliteration=false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIgnoreTransliteration")
    private final Boolean shouldIgnoreTransliteration;

    /**
     * Specifies whether to consider or ignore transliteration. For example "hi, aap kaise ho? sab kuch teek hai? I will call you tomorrow." would be detected as English when ignore transliteration=true, Hindi when ignoreTransliteration=false.
     * @return the value
     **/
    public Boolean getShouldIgnoreTransliteration() {
        return shouldIgnoreTransliteration;
    }

    /**
     * default value is None.
     * Specifies maximum number of characters to consider for determining the dominant language.
     * If unspecified, then optimum number characters will be considered.
     * If 0 is specified then all the characters are used to determine the language.
     * If the value is greater than 0, then specified number of characters will be considered from the beginning of the text.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("charsToConsider")
    private final Integer charsToConsider;

    /**
     * default value is None.
     * Specifies maximum number of characters to consider for determining the dominant language.
     * If unspecified, then optimum number characters will be considered.
     * If 0 is specified then all the characters are used to determine the language.
     * If the value is greater than 0, then specified number of characters will be considered from the beginning of the text.
     *
     * @return the value
     **/
    public Integer getCharsToConsider() {
        return charsToConsider;
    }

    /**
     * The endpoint which have to be used for inferencing. If endpointId and compartmentId is provided, then inference will be served from custom model which is mapped to this Endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
    private final String endpointId;

    /**
     * The endpoint which have to be used for inferencing. If endpointId and compartmentId is provided, then inference will be served from custom model which is mapped to this Endpoint.
     * @return the value
     **/
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that calls the API, inference will be served from pre trained model
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that calls the API, inference will be served from pre trained model
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * List of Documents for detect language.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<DominantLanguageDocument> documents;

    /**
     * List of Documents for detect language.
     * @return the value
     **/
    public java.util.List<DominantLanguageDocument> getDocuments() {
        return documents;
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
        sb.append("BatchDetectDominantLanguageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("alias=").append(String.valueOf(this.alias));
        sb.append(", shouldIgnoreTransliteration=")
                .append(String.valueOf(this.shouldIgnoreTransliteration));
        sb.append(", charsToConsider=").append(String.valueOf(this.charsToConsider));
        sb.append(", endpointId=").append(String.valueOf(this.endpointId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", documents=").append(String.valueOf(this.documents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchDetectDominantLanguageDetails)) {
            return false;
        }

        BatchDetectDominantLanguageDetails other = (BatchDetectDominantLanguageDetails) o;
        return java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(
                        this.shouldIgnoreTransliteration, other.shouldIgnoreTransliteration)
                && java.util.Objects.equals(this.charsToConsider, other.charsToConsider)
                && java.util.Objects.equals(this.endpointId, other.endpointId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.documents, other.documents)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIgnoreTransliteration == null
                                ? 43
                                : this.shouldIgnoreTransliteration.hashCode());
        result =
                (result * PRIME)
                        + (this.charsToConsider == null ? 43 : this.charsToConsider.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
