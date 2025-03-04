/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * The information about new Transcription Job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateTranscriptionJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateTranscriptionJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "description",
        "additionalTranscriptionFormats",
        "modelDetails",
        "normalization",
        "inputLocation",
        "outputLocation",
        "freeformTags",
        "definedTags"
    })
    public CreateTranscriptionJobDetails(
            String displayName,
            String compartmentId,
            String description,
            java.util.List<AdditionalTranscriptionFormats> additionalTranscriptionFormats,
            TranscriptionModelDetails modelDetails,
            TranscriptionNormalization normalization,
            InputLocation inputLocation,
            OutputLocation outputLocation,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.additionalTranscriptionFormats = additionalTranscriptionFormats;
        this.modelDetails = modelDetails;
        this.normalization = normalization;
        this.inputLocation = inputLocation;
        this.outputLocation = outputLocation;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A user-friendly display name for the job. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the job.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment where you want to create the job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment where you want to create the job.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A short description of the job. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the job.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Transcription Format. By default, the JSON format is used. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalTranscriptionFormats")
        private java.util.List<AdditionalTranscriptionFormats> additionalTranscriptionFormats;

        /**
         * Transcription Format. By default, the JSON format is used.
         *
         * @param additionalTranscriptionFormats the value to set
         * @return this builder
         */
        public Builder additionalTranscriptionFormats(
                java.util.List<AdditionalTranscriptionFormats> additionalTranscriptionFormats) {
            this.additionalTranscriptionFormats = additionalTranscriptionFormats;
            this.__explicitlySet__.add("additionalTranscriptionFormats");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelDetails")
        private TranscriptionModelDetails modelDetails;

        public Builder modelDetails(TranscriptionModelDetails modelDetails) {
            this.modelDetails = modelDetails;
            this.__explicitlySet__.add("modelDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("normalization")
        private TranscriptionNormalization normalization;

        public Builder normalization(TranscriptionNormalization normalization) {
            this.normalization = normalization;
            this.__explicitlySet__.add("normalization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
        private InputLocation inputLocation;

        public Builder inputLocation(InputLocation inputLocation) {
            this.inputLocation = inputLocation;
            this.__explicitlySet__.add("inputLocation");
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}.
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"},
         * "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"},
         * "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTranscriptionJobDetails build() {
            CreateTranscriptionJobDetails model =
                    new CreateTranscriptionJobDetails(
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.additionalTranscriptionFormats,
                            this.modelDetails,
                            this.normalization,
                            this.inputLocation,
                            this.outputLocation,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTranscriptionJobDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("additionalTranscriptionFormats")) {
                this.additionalTranscriptionFormats(model.getAdditionalTranscriptionFormats());
            }
            if (model.wasPropertyExplicitlySet("modelDetails")) {
                this.modelDetails(model.getModelDetails());
            }
            if (model.wasPropertyExplicitlySet("normalization")) {
                this.normalization(model.getNormalization());
            }
            if (model.wasPropertyExplicitlySet("inputLocation")) {
                this.inputLocation(model.getInputLocation());
            }
            if (model.wasPropertyExplicitlySet("outputLocation")) {
                this.outputLocation(model.getOutputLocation());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** A user-friendly display name for the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the job.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want to create the job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want to create the job.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A short description of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the job.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** */
    public enum AdditionalTranscriptionFormats implements com.oracle.bmc.http.internal.BmcEnum {
        Srt("SRT"),
        ;

        private final String value;
        private static java.util.Map<String, AdditionalTranscriptionFormats> map;

        static {
            map = new java.util.HashMap<>();
            for (AdditionalTranscriptionFormats v : AdditionalTranscriptionFormats.values()) {
                map.put(v.getValue(), v);
            }
        }

        AdditionalTranscriptionFormats(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AdditionalTranscriptionFormats create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AdditionalTranscriptionFormats: " + key);
        }
    };
    /** Transcription Format. By default, the JSON format is used. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalTranscriptionFormats")
    private final java.util.List<AdditionalTranscriptionFormats> additionalTranscriptionFormats;

    /**
     * Transcription Format. By default, the JSON format is used.
     *
     * @return the value
     */
    public java.util.List<AdditionalTranscriptionFormats> getAdditionalTranscriptionFormats() {
        return additionalTranscriptionFormats;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelDetails")
    private final TranscriptionModelDetails modelDetails;

    public TranscriptionModelDetails getModelDetails() {
        return modelDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("normalization")
    private final TranscriptionNormalization normalization;

    public TranscriptionNormalization getNormalization() {
        return normalization;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    private final InputLocation inputLocation;

    public InputLocation getInputLocation() {
        return inputLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final OutputLocation outputLocation;

    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"},
     * "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"},
     * "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateTranscriptionJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", additionalTranscriptionFormats=")
                .append(String.valueOf(this.additionalTranscriptionFormats));
        sb.append(", modelDetails=").append(String.valueOf(this.modelDetails));
        sb.append(", normalization=").append(String.valueOf(this.normalization));
        sb.append(", inputLocation=").append(String.valueOf(this.inputLocation));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTranscriptionJobDetails)) {
            return false;
        }

        CreateTranscriptionJobDetails other = (CreateTranscriptionJobDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.additionalTranscriptionFormats, other.additionalTranscriptionFormats)
                && java.util.Objects.equals(this.modelDetails, other.modelDetails)
                && java.util.Objects.equals(this.normalization, other.normalization)
                && java.util.Objects.equals(this.inputLocation, other.inputLocation)
                && java.util.Objects.equals(this.outputLocation, other.outputLocation)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalTranscriptionFormats == null
                                ? 43
                                : this.additionalTranscriptionFormats.hashCode());
        result = (result * PRIME) + (this.modelDetails == null ? 43 : this.modelDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.normalization == null ? 43 : this.normalization.hashCode());
        result =
                (result * PRIME)
                        + (this.inputLocation == null ? 43 : this.inputLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.outputLocation == null ? 43 : this.outputLocation.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
