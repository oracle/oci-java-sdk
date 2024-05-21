/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The job details for a batch document analysis.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DocumentJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DocumentJob extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "features",
        "language",
        "documentType",
        "inputLocation",
        "timeAccepted",
        "timeStarted",
        "timeFinished",
        "percentComplete",
        "outputLocation",
        "lifecycleState",
        "isZipOutputEnabled",
        "lifecycleDetails"
    })
    public DocumentJob(
            String id,
            String compartmentId,
            String displayName,
            java.util.List<DocumentFeature> features,
            DocumentLanguage language,
            DocumentType documentType,
            InputLocation inputLocation,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Float percentComplete,
            OutputLocation outputLocation,
            LifecycleState lifecycleState,
            Boolean isZipOutputEnabled,
            LifecycleDetails lifecycleDetails) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.features = features;
        this.language = language;
        this.documentType = documentType;
        this.inputLocation = inputLocation;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.percentComplete = percentComplete;
        this.outputLocation = outputLocation;
        this.lifecycleState = lifecycleState;
        this.isZipOutputEnabled = isZipOutputEnabled;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The job id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The job id.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment that starts the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that starts the job.
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
        /**
         * The document language, abbreviated according to ISO 639-2.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private DocumentLanguage language;

        /**
         * The document language, abbreviated according to ISO 639-2.
         * @param language the value to set
         * @return this builder
         **/
        public Builder language(DocumentLanguage language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }
        /**
         * The type of document.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documentType")
        private DocumentType documentType;

        /**
         * The type of document.
         * @param documentType the value to set
         * @return this builder
         **/
        public Builder documentType(DocumentType documentType) {
            this.documentType = documentType;
            this.__explicitlySet__.add("documentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
        private InputLocation inputLocation;

        public Builder inputLocation(InputLocation inputLocation) {
            this.inputLocation = inputLocation;
            this.__explicitlySet__.add("inputLocation");
            return this;
        }
        /**
         * The job acceptance time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The job acceptance time.
         * @param timeAccepted the value to set
         * @return this builder
         **/
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * The job start time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The job start time.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The job finish time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The job finish time.
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * How much progress the operation has made, compared to the total amount of work to be performed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        /**
         * How much progress the operation has made, compared to the total amount of work to be performed.
         * @param percentComplete the value to set
         * @return this builder
         **/
        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
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
         * The current state of the batch document job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the batch document job.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
        /**
         * The detailed status of FAILED state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * The detailed status of FAILED state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentJob build() {
            DocumentJob model =
                    new DocumentJob(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.features,
                            this.language,
                            this.documentType,
                            this.inputLocation,
                            this.timeAccepted,
                            this.timeStarted,
                            this.timeFinished,
                            this.percentComplete,
                            this.outputLocation,
                            this.lifecycleState,
                            this.isZipOutputEnabled,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DocumentJob model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("features")) {
                this.features(model.getFeatures());
            }
            if (model.wasPropertyExplicitlySet("language")) {
                this.language(model.getLanguage());
            }
            if (model.wasPropertyExplicitlySet("documentType")) {
                this.documentType(model.getDocumentType());
            }
            if (model.wasPropertyExplicitlySet("inputLocation")) {
                this.inputLocation(model.getInputLocation());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("outputLocation")) {
                this.outputLocation(model.getOutputLocation());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("isZipOutputEnabled")) {
                this.isZipOutputEnabled(model.getIsZipOutputEnabled());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
     * The job id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The job id.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment that starts the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that starts the job.
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

    /**
     * The document language, abbreviated according to ISO 639-2.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final DocumentLanguage language;

    /**
     * The document language, abbreviated according to ISO 639-2.
     * @return the value
     **/
    public DocumentLanguage getLanguage() {
        return language;
    }

    /**
     * The type of document.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentType")
    private final DocumentType documentType;

    /**
     * The type of document.
     * @return the value
     **/
    public DocumentType getDocumentType() {
        return documentType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    private final InputLocation inputLocation;

    public InputLocation getInputLocation() {
        return inputLocation;
    }

    /**
     * The job acceptance time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The job acceptance time.
     * @return the value
     **/
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * The job start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The job start time.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The job finish time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The job finish time.
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * How much progress the operation has made, compared to the total amount of work to be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Float percentComplete;

    /**
     * How much progress the operation has made, compared to the total amount of work to be performed.
     * @return the value
     **/
    public Float getPercentComplete() {
        return percentComplete;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final OutputLocation outputLocation;

    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * The current state of the batch document job.
     **/
    public enum LifecycleState {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Accepted("ACCEPTED"),
        Canceled("CANCELED"),
        InProgress("IN_PROGRESS"),
        Canceling("CANCELING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the batch document job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the batch document job.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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

    /**
     * The detailed status of FAILED state.
     **/
    public enum LifecycleDetails {
        PartiallySucceeded("PARTIALLY_SUCCEEDED"),
        CompletelyFailed("COMPLETELY_FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleDetails.class);

        private final String value;
        private static java.util.Map<String, LifecycleDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleDetails v : LifecycleDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The detailed status of FAILED state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * The detailed status of FAILED state.
     * @return the value
     **/
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("DocumentJob(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", features=").append(String.valueOf(this.features));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(", documentType=").append(String.valueOf(this.documentType));
        sb.append(", inputLocation=").append(String.valueOf(this.inputLocation));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isZipOutputEnabled=").append(String.valueOf(this.isZipOutputEnabled));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DocumentJob)) {
            return false;
        }

        DocumentJob other = (DocumentJob) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.features, other.features)
                && java.util.Objects.equals(this.language, other.language)
                && java.util.Objects.equals(this.documentType, other.documentType)
                && java.util.Objects.equals(this.inputLocation, other.inputLocation)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.outputLocation, other.outputLocation)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isZipOutputEnabled, other.isZipOutputEnabled)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.features == null ? 43 : this.features.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        result = (result * PRIME) + (this.documentType == null ? 43 : this.documentType.hashCode());
        result =
                (result * PRIME)
                        + (this.inputLocation == null ? 43 : this.inputLocation.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result =
                (result * PRIME)
                        + (this.outputLocation == null ? 43 : this.outputLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isZipOutputEnabled == null
                                ? 43
                                : this.isZipOutputEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
