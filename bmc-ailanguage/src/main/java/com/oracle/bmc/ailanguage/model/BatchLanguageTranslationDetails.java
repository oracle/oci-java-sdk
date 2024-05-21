/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The documents details for translation call.
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
    builder = BatchLanguageTranslationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BatchLanguageTranslationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "targetLanguageCode", "documents"})
    public BatchLanguageTranslationDetails(
            String compartmentId,
            String targetLanguageCode,
            java.util.List<TextDocument> documents) {
        super();
        this.compartmentId = compartmentId;
        this.targetLanguageCode = targetLanguageCode;
        this.documents = documents;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * Language code supported
         * Arabic - ar
         * Brazilian Portuguese -  pt-BR
         * Canadian French - fr-CA
         * Croatian - hr
         * Czech - cs
         * Danish - da
         * Dutch - nl
         * English - en
         * Finnish - fi
         * French - fr
         * German - de
         * Greek - el
         * Hebrew - he
         * Hungarian - hu
         * Italian - it
         * Japanese - ja
         * Korean - ko
         * Norwegian - no
         * Polish - pl
         * Portuguese - pt
         * Romanian - ro
         * Russian - ru
         * Simplified Chinese - zh-CN
         * Slovak - sk
         * Slovenian - sl
         * Spanish - es
         * Swedish - sv
         * Thai - th
         * Traditional Chinese - zh-TW
         * Turkish - tr
         * Vietnamese - vi
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetLanguageCode")
        private String targetLanguageCode;

        /**
         * Language code supported
         * Arabic - ar
         * Brazilian Portuguese -  pt-BR
         * Canadian French - fr-CA
         * Croatian - hr
         * Czech - cs
         * Danish - da
         * Dutch - nl
         * English - en
         * Finnish - fi
         * French - fr
         * German - de
         * Greek - el
         * Hebrew - he
         * Hungarian - hu
         * Italian - it
         * Japanese - ja
         * Korean - ko
         * Norwegian - no
         * Polish - pl
         * Portuguese - pt
         * Romanian - ro
         * Russian - ru
         * Simplified Chinese - zh-CN
         * Slovak - sk
         * Slovenian - sl
         * Spanish - es
         * Swedish - sv
         * Thai - th
         * Traditional Chinese - zh-TW
         * Turkish - tr
         * Vietnamese - vi
         *
         * @param targetLanguageCode the value to set
         * @return this builder
         **/
        public Builder targetLanguageCode(String targetLanguageCode) {
            this.targetLanguageCode = targetLanguageCode;
            this.__explicitlySet__.add("targetLanguageCode");
            return this;
        }
        /**
         * List of documents for translation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<TextDocument> documents;

        /**
         * List of documents for translation.
         * @param documents the value to set
         * @return this builder
         **/
        public Builder documents(java.util.List<TextDocument> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BatchLanguageTranslationDetails build() {
            BatchLanguageTranslationDetails model =
                    new BatchLanguageTranslationDetails(
                            this.compartmentId, this.targetLanguageCode, this.documents);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchLanguageTranslationDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetLanguageCode")) {
                this.targetLanguageCode(model.getTargetLanguageCode());
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
     * Language code supported
     * Arabic - ar
     * Brazilian Portuguese -  pt-BR
     * Canadian French - fr-CA
     * Croatian - hr
     * Czech - cs
     * Danish - da
     * Dutch - nl
     * English - en
     * Finnish - fi
     * French - fr
     * German - de
     * Greek - el
     * Hebrew - he
     * Hungarian - hu
     * Italian - it
     * Japanese - ja
     * Korean - ko
     * Norwegian - no
     * Polish - pl
     * Portuguese - pt
     * Romanian - ro
     * Russian - ru
     * Simplified Chinese - zh-CN
     * Slovak - sk
     * Slovenian - sl
     * Spanish - es
     * Swedish - sv
     * Thai - th
     * Traditional Chinese - zh-TW
     * Turkish - tr
     * Vietnamese - vi
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetLanguageCode")
    private final String targetLanguageCode;

    /**
     * Language code supported
     * Arabic - ar
     * Brazilian Portuguese -  pt-BR
     * Canadian French - fr-CA
     * Croatian - hr
     * Czech - cs
     * Danish - da
     * Dutch - nl
     * English - en
     * Finnish - fi
     * French - fr
     * German - de
     * Greek - el
     * Hebrew - he
     * Hungarian - hu
     * Italian - it
     * Japanese - ja
     * Korean - ko
     * Norwegian - no
     * Polish - pl
     * Portuguese - pt
     * Romanian - ro
     * Russian - ru
     * Simplified Chinese - zh-CN
     * Slovak - sk
     * Slovenian - sl
     * Spanish - es
     * Swedish - sv
     * Thai - th
     * Traditional Chinese - zh-TW
     * Turkish - tr
     * Vietnamese - vi
     *
     * @return the value
     **/
    public String getTargetLanguageCode() {
        return targetLanguageCode;
    }

    /**
     * List of documents for translation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<TextDocument> documents;

    /**
     * List of documents for translation.
     * @return the value
     **/
    public java.util.List<TextDocument> getDocuments() {
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
        sb.append("BatchLanguageTranslationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetLanguageCode=").append(String.valueOf(this.targetLanguageCode));
        sb.append(", documents=").append(String.valueOf(this.documents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchLanguageTranslationDetails)) {
            return false;
        }

        BatchLanguageTranslationDetails other = (BatchLanguageTranslationDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetLanguageCode, other.targetLanguageCode)
                && java.util.Objects.equals(this.documents, other.documents)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetLanguageCode == null
                                ? 43
                                : this.targetLanguageCode.hashCode());
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
