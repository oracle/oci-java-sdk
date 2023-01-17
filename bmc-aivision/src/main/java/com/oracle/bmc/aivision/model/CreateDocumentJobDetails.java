/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The batch document analysis details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDocumentJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDocumentJobDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "inputLocation",
        "features",
        "outputLocation",
        "compartmentId",
        "displayName",
        "language",
        "documentType",
        "isZipOutputEnabled"
    })
    public CreateDocumentJobDetails(
            InputLocation inputLocation,
            java.util.List<DocumentFeature> features,
            OutputLocation outputLocation,
            String compartmentId,
            String displayName,
            DocumentLanguage language,
            DocumentType documentType,
            Boolean isZipOutputEnabled) {
        super();
        this.inputLocation = inputLocation;
        this.features = features;
        this.outputLocation = outputLocation;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.language = language;
        this.documentType = documentType;
        this.isZipOutputEnabled = isZipOutputEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
        private InputLocation inputLocation;

        public Builder inputLocation(InputLocation inputLocation) {
            this.inputLocation = inputLocation;
            this.__explicitlySet__.add("inputLocation");
            return this;
        }
        /**
         * The list of requested document analysis types.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<DocumentFeature> features;

        /**
         * The list of requested document analysis types.
         * @param features the value to set
         * @return this builder
         **/
        public Builder features(java.util.List<DocumentFeature> features) {
            this.features = features;
            this.__explicitlySet__.add("features");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
        private OutputLocation outputLocation;

        public Builder outputLocation(OutputLocation outputLocation) {
            this.outputLocation = outputLocation;
            this.__explicitlySet__.add("outputLocation");
            return this;
        }
        /**
         * The compartment identifier from the requester.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment identifier from the requester.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The document job display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The document job display name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The language of the document, abbreviated according to ISO 639-2.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private DocumentLanguage language;

        /**
         * The language of the document, abbreviated according to ISO 639-2.
         * @param language the value to set
         * @return this builder
         **/
        public Builder language(DocumentLanguage language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }
        /**
         * The type of documents.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documentType")
        private DocumentType documentType;

        /**
         * The type of documents.
         * @param documentType the value to set
         * @return this builder
         **/
        public Builder documentType(DocumentType documentType) {
            this.documentType = documentType;
            this.__explicitlySet__.add("documentType");
            return this;
        }
        /**
         * Whether or not to generate a ZIP file containing the results.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isZipOutputEnabled")
        private Boolean isZipOutputEnabled;

        /**
         * Whether or not to generate a ZIP file containing the results.
         * @param isZipOutputEnabled the value to set
         * @return this builder
         **/
        public Builder isZipOutputEnabled(Boolean isZipOutputEnabled) {
            this.isZipOutputEnabled = isZipOutputEnabled;
            this.__explicitlySet__.add("isZipOutputEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDocumentJobDetails build() {
            CreateDocumentJobDetails model =
                    new CreateDocumentJobDetails(
                            this.inputLocation,
                            this.features,
                            this.outputLocation,
                            this.compartmentId,
                            this.displayName,
                            this.language,
                            this.documentType,
                            this.isZipOutputEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDocumentJobDetails model) {
            if (model.wasPropertyExplicitlySet("inputLocation")) {
                this.inputLocation(model.getInputLocation());
            }
            if (model.wasPropertyExplicitlySet("features")) {
                this.features(model.getFeatures());
            }
            if (model.wasPropertyExplicitlySet("outputLocation")) {
                this.outputLocation(model.getOutputLocation());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("language")) {
                this.language(model.getLanguage());
            }
            if (model.wasPropertyExplicitlySet("documentType")) {
                this.documentType(model.getDocumentType());
            }
            if (model.wasPropertyExplicitlySet("isZipOutputEnabled")) {
                this.isZipOutputEnabled(model.getIsZipOutputEnabled());
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

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    private final InputLocation inputLocation;

    public InputLocation getInputLocation() {
        return inputLocation;
    }

    /**
     * The list of requested document analysis types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    private final java.util.List<DocumentFeature> features;

    /**
     * The list of requested document analysis types.
     * @return the value
     **/
    public java.util.List<DocumentFeature> getFeatures() {
        return features;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final OutputLocation outputLocation;

    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * The compartment identifier from the requester.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment identifier from the requester.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The document job display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The document job display name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The language of the document, abbreviated according to ISO 639-2.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final DocumentLanguage language;

    /**
     * The language of the document, abbreviated according to ISO 639-2.
     * @return the value
     **/
    public DocumentLanguage getLanguage() {
        return language;
    }

    /**
     * The type of documents.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentType")
    private final DocumentType documentType;

    /**
     * The type of documents.
     * @return the value
     **/
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Whether or not to generate a ZIP file containing the results.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isZipOutputEnabled")
    private final Boolean isZipOutputEnabled;

    /**
     * Whether or not to generate a ZIP file containing the results.
     * @return the value
     **/
    public Boolean getIsZipOutputEnabled() {
        return isZipOutputEnabled;
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
        sb.append("CreateDocumentJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("inputLocation=").append(String.valueOf(this.inputLocation));
        sb.append(", features=").append(String.valueOf(this.features));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(", documentType=").append(String.valueOf(this.documentType));
        sb.append(", isZipOutputEnabled=").append(String.valueOf(this.isZipOutputEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDocumentJobDetails)) {
            return false;
        }

        CreateDocumentJobDetails other = (CreateDocumentJobDetails) o;
        return java.util.Objects.equals(this.inputLocation, other.inputLocation)
                && java.util.Objects.equals(this.features, other.features)
                && java.util.Objects.equals(this.outputLocation, other.outputLocation)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.language, other.language)
                && java.util.Objects.equals(this.documentType, other.documentType)
                && java.util.Objects.equals(this.isZipOutputEnabled, other.isZipOutputEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inputLocation == null ? 43 : this.inputLocation.hashCode());
        result = (result * PRIME) + (this.features == null ? 43 : this.features.hashCode());
        result =
                (result * PRIME)
                        + (this.outputLocation == null ? 43 : this.outputLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        result = (result * PRIME) + (this.documentType == null ? 43 : this.documentType.hashCode());
        result =
                (result * PRIME)
                        + (this.isZipOutputEnabled == null
                                ? 43
                                : this.isZipOutputEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
