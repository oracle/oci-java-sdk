/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The documents details to detect personal identification information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BatchDetectLanguagePiiEntitiesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BatchDetectLanguagePiiEntitiesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "alias",
        "endpointId",
        "compartmentId",
        "documents",
        "masking",
        "profile"
    })
    public BatchDetectLanguagePiiEntitiesDetails(
            String alias,
            String endpointId,
            String compartmentId,
            java.util.List<TextDocument> documents,
            java.util.Map<String, PiiEntityMasking> masking,
            Profile profile) {
        super();
        this.alias = alias;
        this.endpointId = endpointId;
        this.compartmentId = compartmentId;
        this.documents = documents;
        this.masking = masking;
        this.profile = profile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique name across user tenancy in a region to identify an endpoint to be used for
         * inferencing.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * Unique name across user tenancy in a region to identify an endpoint to be used for
         * inferencing.
         *
         * @param alias the value to set
         * @return this builder
         */
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }
        /**
         * The endpoint which have to be used for inferencing. If endpointId and compartmentId is
         * provided, then inference will be served from custom model which is mapped to this
         * Endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
        private String endpointId;

        /**
         * The endpoint which have to be used for inferencing. If endpointId and compartmentId is
         * provided, then inference will be served from custom model which is mapped to this
         * Endpoint.
         *
         * @param endpointId the value to set
         * @return this builder
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            this.__explicitlySet__.add("endpointId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that calls the API, inference will be served from pre trained model
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that calls the API, inference will be served from pre trained model
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** List of documents to detect personal identification information. */
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<TextDocument> documents;

        /**
         * List of documents to detect personal identification information.
         *
         * @param documents the value to set
         * @return this builder
         */
        public Builder documents(java.util.List<TextDocument> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }
        /** Mask recognized PII entities with different modes. */
        @com.fasterxml.jackson.annotation.JsonProperty("masking")
        private java.util.Map<String, PiiEntityMasking> masking;

        /**
         * Mask recognized PII entities with different modes.
         *
         * @param masking the value to set
         * @return this builder
         */
        public Builder masking(java.util.Map<String, PiiEntityMasking> masking) {
            this.masking = masking;
            this.__explicitlySet__.add("masking");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("profile")
        private Profile profile;

        public Builder profile(Profile profile) {
            this.profile = profile;
            this.__explicitlySet__.add("profile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BatchDetectLanguagePiiEntitiesDetails build() {
            BatchDetectLanguagePiiEntitiesDetails model =
                    new BatchDetectLanguagePiiEntitiesDetails(
                            this.alias,
                            this.endpointId,
                            this.compartmentId,
                            this.documents,
                            this.masking,
                            this.profile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchDetectLanguagePiiEntitiesDetails model) {
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
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
            if (model.wasPropertyExplicitlySet("masking")) {
                this.masking(model.getMasking());
            }
            if (model.wasPropertyExplicitlySet("profile")) {
                this.profile(model.getProfile());
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
     * Unique name across user tenancy in a region to identify an endpoint to be used for
     * inferencing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * Unique name across user tenancy in a region to identify an endpoint to be used for
     * inferencing.
     *
     * @return the value
     */
    public String getAlias() {
        return alias;
    }

    /**
     * The endpoint which have to be used for inferencing. If endpointId and compartmentId is
     * provided, then inference will be served from custom model which is mapped to this Endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
    private final String endpointId;

    /**
     * The endpoint which have to be used for inferencing. If endpointId and compartmentId is
     * provided, then inference will be served from custom model which is mapped to this Endpoint.
     *
     * @return the value
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that calls the API, inference will be served from pre trained model
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that calls the API, inference will be served from pre trained model
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** List of documents to detect personal identification information. */
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<TextDocument> documents;

    /**
     * List of documents to detect personal identification information.
     *
     * @return the value
     */
    public java.util.List<TextDocument> getDocuments() {
        return documents;
    }

    /** Mask recognized PII entities with different modes. */
    @com.fasterxml.jackson.annotation.JsonProperty("masking")
    private final java.util.Map<String, PiiEntityMasking> masking;

    /**
     * Mask recognized PII entities with different modes.
     *
     * @return the value
     */
    public java.util.Map<String, PiiEntityMasking> getMasking() {
        return masking;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    private final Profile profile;

    public Profile getProfile() {
        return profile;
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
        sb.append("BatchDetectLanguagePiiEntitiesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("alias=").append(String.valueOf(this.alias));
        sb.append(", endpointId=").append(String.valueOf(this.endpointId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", documents=").append(String.valueOf(this.documents));
        sb.append(", masking=").append(String.valueOf(this.masking));
        sb.append(", profile=").append(String.valueOf(this.profile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchDetectLanguagePiiEntitiesDetails)) {
            return false;
        }

        BatchDetectLanguagePiiEntitiesDetails other = (BatchDetectLanguagePiiEntitiesDetails) o;
        return java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.endpointId, other.endpointId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.documents, other.documents)
                && java.util.Objects.equals(this.masking, other.masking)
                && java.util.Objects.equals(this.profile, other.profile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result = (result * PRIME) + (this.masking == null ? 43 : this.masking.hashCode());
        result = (result * PRIME) + (this.profile == null ? 43 : this.profile.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
