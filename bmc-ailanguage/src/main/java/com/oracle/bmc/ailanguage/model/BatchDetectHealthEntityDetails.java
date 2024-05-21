/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The documents details for health entities detect call.
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
    builder = BatchDetectHealthEntityDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BatchDetectHealthEntityDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "endpointId",
        "documents",
        "linkOntologies",
        "isDetectAssertions",
        "isDetectRelationships",
        "profile"
    })
    public BatchDetectHealthEntityDetails(
            String endpointId,
            java.util.List<TextDocument> documents,
            java.util.List<String> linkOntologies,
            Boolean isDetectAssertions,
            Boolean isDetectRelationships,
            Profile profile) {
        super();
        this.endpointId = endpointId;
        this.documents = documents;
        this.linkOntologies = linkOntologies;
        this.isDetectAssertions = isDetectAssertions;
        this.isDetectRelationships = isDetectRelationships;
        this.profile = profile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The endpoint which have to be used for inferencing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
        private String endpointId;

        /**
         * The endpoint which have to be used for inferencing.
         * @param endpointId the value to set
         * @return this builder
         **/
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            this.__explicitlySet__.add("endpointId");
            return this;
        }
        /**
         * List of Documents for detect health entities.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<TextDocument> documents;

        /**
         * List of Documents for detect health entities.
         * @param documents the value to set
         * @return this builder
         **/
        public Builder documents(java.util.List<TextDocument> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }
        /**
         * List of NLP health ontologies to be linked
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("linkOntologies")
        private java.util.List<String> linkOntologies;

        /**
         * List of NLP health ontologies to be linked
         * @param linkOntologies the value to set
         * @return this builder
         **/
        public Builder linkOntologies(java.util.List<String> linkOntologies) {
            this.linkOntologies = linkOntologies;
            this.__explicitlySet__.add("linkOntologies");
            return this;
        }
        /**
         * is assertion on input text required. default value true.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDetectAssertions")
        private Boolean isDetectAssertions;

        /**
         * is assertion on input text required. default value true.
         * @param isDetectAssertions the value to set
         * @return this builder
         **/
        public Builder isDetectAssertions(Boolean isDetectAssertions) {
            this.isDetectAssertions = isDetectAssertions;
            this.__explicitlySet__.add("isDetectAssertions");
            return this;
        }
        /**
         * is relationship on input text required. default value true.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDetectRelationships")
        private Boolean isDetectRelationships;

        /**
         * is relationship on input text required. default value true.
         * @param isDetectRelationships the value to set
         * @return this builder
         **/
        public Builder isDetectRelationships(Boolean isDetectRelationships) {
            this.isDetectRelationships = isDetectRelationships;
            this.__explicitlySet__.add("isDetectRelationships");
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

        public BatchDetectHealthEntityDetails build() {
            BatchDetectHealthEntityDetails model =
                    new BatchDetectHealthEntityDetails(
                            this.endpointId,
                            this.documents,
                            this.linkOntologies,
                            this.isDetectAssertions,
                            this.isDetectRelationships,
                            this.profile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchDetectHealthEntityDetails model) {
            if (model.wasPropertyExplicitlySet("endpointId")) {
                this.endpointId(model.getEndpointId());
            }
            if (model.wasPropertyExplicitlySet("documents")) {
                this.documents(model.getDocuments());
            }
            if (model.wasPropertyExplicitlySet("linkOntologies")) {
                this.linkOntologies(model.getLinkOntologies());
            }
            if (model.wasPropertyExplicitlySet("isDetectAssertions")) {
                this.isDetectAssertions(model.getIsDetectAssertions());
            }
            if (model.wasPropertyExplicitlySet("isDetectRelationships")) {
                this.isDetectRelationships(model.getIsDetectRelationships());
            }
            if (model.wasPropertyExplicitlySet("profile")) {
                this.profile(model.getProfile());
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
     * The endpoint which have to be used for inferencing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
    private final String endpointId;

    /**
     * The endpoint which have to be used for inferencing.
     * @return the value
     **/
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * List of Documents for detect health entities.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<TextDocument> documents;

    /**
     * List of Documents for detect health entities.
     * @return the value
     **/
    public java.util.List<TextDocument> getDocuments() {
        return documents;
    }

    /**
     * List of NLP health ontologies to be linked
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("linkOntologies")
    private final java.util.List<String> linkOntologies;

    /**
     * List of NLP health ontologies to be linked
     * @return the value
     **/
    public java.util.List<String> getLinkOntologies() {
        return linkOntologies;
    }

    /**
     * is assertion on input text required. default value true.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDetectAssertions")
    private final Boolean isDetectAssertions;

    /**
     * is assertion on input text required. default value true.
     * @return the value
     **/
    public Boolean getIsDetectAssertions() {
        return isDetectAssertions;
    }

    /**
     * is relationship on input text required. default value true.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDetectRelationships")
    private final Boolean isDetectRelationships;

    /**
     * is relationship on input text required. default value true.
     * @return the value
     **/
    public Boolean getIsDetectRelationships() {
        return isDetectRelationships;
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
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BatchDetectHealthEntityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("endpointId=").append(String.valueOf(this.endpointId));
        sb.append(", documents=").append(String.valueOf(this.documents));
        sb.append(", linkOntologies=").append(String.valueOf(this.linkOntologies));
        sb.append(", isDetectAssertions=").append(String.valueOf(this.isDetectAssertions));
        sb.append(", isDetectRelationships=").append(String.valueOf(this.isDetectRelationships));
        sb.append(", profile=").append(String.valueOf(this.profile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchDetectHealthEntityDetails)) {
            return false;
        }

        BatchDetectHealthEntityDetails other = (BatchDetectHealthEntityDetails) o;
        return java.util.Objects.equals(this.endpointId, other.endpointId)
                && java.util.Objects.equals(this.documents, other.documents)
                && java.util.Objects.equals(this.linkOntologies, other.linkOntologies)
                && java.util.Objects.equals(this.isDetectAssertions, other.isDetectAssertions)
                && java.util.Objects.equals(this.isDetectRelationships, other.isDetectRelationships)
                && java.util.Objects.equals(this.profile, other.profile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result =
                (result * PRIME)
                        + (this.linkOntologies == null ? 43 : this.linkOntologies.hashCode());
        result =
                (result * PRIME)
                        + (this.isDetectAssertions == null
                                ? 43
                                : this.isDetectAssertions.hashCode());
        result =
                (result * PRIME)
                        + (this.isDetectRelationships == null
                                ? 43
                                : this.isDetectRelationships.hashCode());
        result = (result * PRIME) + (this.profile == null ? 43 : this.profile.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
