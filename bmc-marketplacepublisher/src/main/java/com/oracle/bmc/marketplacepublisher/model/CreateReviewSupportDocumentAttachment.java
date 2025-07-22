/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Reviewsupport document attachment for the listing revision. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateReviewSupportDocumentAttachment.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "attachmentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateReviewSupportDocumentAttachment
        extends CreateListingRevisionAttachmentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("listingRevisionId")
        private String listingRevisionId;

        public Builder listingRevisionId(String listingRevisionId) {
            this.listingRevisionId = listingRevisionId;
            this.__explicitlySet__.add("listingRevisionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** Name of the review support document */
        @com.fasterxml.jackson.annotation.JsonProperty("documentName")
        private String documentName;

        /**
         * Name of the review support document
         *
         * @param documentName the value to set
         * @return this builder
         */
        public Builder documentName(String documentName) {
            this.documentName = documentName;
            this.__explicitlySet__.add("documentName");
            return this;
        }
        /** Type of review support document */
        @com.fasterxml.jackson.annotation.JsonProperty("templateCode")
        private String templateCode;

        /**
         * Type of review support document
         *
         * @param templateCode the value to set
         * @return this builder
         */
        public Builder templateCode(String templateCode) {
            this.templateCode = templateCode;
            this.__explicitlySet__.add("templateCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateReviewSupportDocumentAttachment build() {
            CreateReviewSupportDocumentAttachment model =
                    new CreateReviewSupportDocumentAttachment(
                            this.listingRevisionId,
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.documentName,
                            this.templateCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateReviewSupportDocumentAttachment model) {
            if (model.wasPropertyExplicitlySet("listingRevisionId")) {
                this.listingRevisionId(model.getListingRevisionId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("documentName")) {
                this.documentName(model.getDocumentName());
            }
            if (model.wasPropertyExplicitlySet("templateCode")) {
                this.templateCode(model.getTemplateCode());
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

    @Deprecated
    public CreateReviewSupportDocumentAttachment(
            String listingRevisionId,
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String documentName,
            String templateCode) {
        super(listingRevisionId, displayName, description, freeformTags, definedTags);
        this.documentName = documentName;
        this.templateCode = templateCode;
    }

    /** Name of the review support document */
    @com.fasterxml.jackson.annotation.JsonProperty("documentName")
    private final String documentName;

    /**
     * Name of the review support document
     *
     * @return the value
     */
    public String getDocumentName() {
        return documentName;
    }

    /** Type of review support document */
    @com.fasterxml.jackson.annotation.JsonProperty("templateCode")
    private final String templateCode;

    /**
     * Type of review support document
     *
     * @return the value
     */
    public String getTemplateCode() {
        return templateCode;
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
        sb.append("CreateReviewSupportDocumentAttachment(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", documentName=").append(String.valueOf(this.documentName));
        sb.append(", templateCode=").append(String.valueOf(this.templateCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateReviewSupportDocumentAttachment)) {
            return false;
        }

        CreateReviewSupportDocumentAttachment other = (CreateReviewSupportDocumentAttachment) o;
        return java.util.Objects.equals(this.documentName, other.documentName)
                && java.util.Objects.equals(this.templateCode, other.templateCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.documentName == null ? 43 : this.documentName.hashCode());
        result = (result * PRIME) + (this.templateCode == null ? 43 : this.templateCode.hashCode());
        return result;
    }
}
