/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The details of the batch image analysis. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateImageJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateImageJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "inputLocation",
        "features",
        "outputLocation",
        "compartmentId",
        "displayName",
        "isZipOutputEnabled"
    })
    public CreateImageJobDetails(
            InputLocation inputLocation,
            java.util.List<ImageFeature> features,
            OutputLocation outputLocation,
            String compartmentId,
            String displayName,
            Boolean isZipOutputEnabled) {
        super();
        this.inputLocation = inputLocation;
        this.features = features;
        this.outputLocation = outputLocation;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
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
        /** The list of requested image analysis types. */
        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<ImageFeature> features;

        /**
         * The list of requested image analysis types.
         *
         * @param features the value to set
         * @return this builder
         */
        public Builder features(java.util.List<ImageFeature> features) {
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
        /** The compartment identifier from the requester. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment identifier from the requester.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The image job display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The image job display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Whether or not to generate a ZIP file containing the results. */
        @com.fasterxml.jackson.annotation.JsonProperty("isZipOutputEnabled")
        private Boolean isZipOutputEnabled;

        /**
         * Whether or not to generate a ZIP file containing the results.
         *
         * @param isZipOutputEnabled the value to set
         * @return this builder
         */
        public Builder isZipOutputEnabled(Boolean isZipOutputEnabled) {
            this.isZipOutputEnabled = isZipOutputEnabled;
            this.__explicitlySet__.add("isZipOutputEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateImageJobDetails build() {
            CreateImageJobDetails model =
                    new CreateImageJobDetails(
                            this.inputLocation,
                            this.features,
                            this.outputLocation,
                            this.compartmentId,
                            this.displayName,
                            this.isZipOutputEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateImageJobDetails model) {
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
            if (model.wasPropertyExplicitlySet("isZipOutputEnabled")) {
                this.isZipOutputEnabled(model.getIsZipOutputEnabled());
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

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    private final InputLocation inputLocation;

    public InputLocation getInputLocation() {
        return inputLocation;
    }

    /** The list of requested image analysis types. */
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    private final java.util.List<ImageFeature> features;

    /**
     * The list of requested image analysis types.
     *
     * @return the value
     */
    public java.util.List<ImageFeature> getFeatures() {
        return features;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final OutputLocation outputLocation;

    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    /** The compartment identifier from the requester. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment identifier from the requester.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The image job display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The image job display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Whether or not to generate a ZIP file containing the results. */
    @com.fasterxml.jackson.annotation.JsonProperty("isZipOutputEnabled")
    private final Boolean isZipOutputEnabled;

    /**
     * Whether or not to generate a ZIP file containing the results.
     *
     * @return the value
     */
    public Boolean getIsZipOutputEnabled() {
        return isZipOutputEnabled;
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
        sb.append("CreateImageJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("inputLocation=").append(String.valueOf(this.inputLocation));
        sb.append(", features=").append(String.valueOf(this.features));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isZipOutputEnabled=").append(String.valueOf(this.isZipOutputEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateImageJobDetails)) {
            return false;
        }

        CreateImageJobDetails other = (CreateImageJobDetails) o;
        return java.util.Objects.equals(this.inputLocation, other.inputLocation)
                && java.util.Objects.equals(this.features, other.features)
                && java.util.Objects.equals(this.outputLocation, other.outputLocation)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
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
        result =
                (result * PRIME)
                        + (this.isZipOutputEnabled == null
                                ? 43
                                : this.isZipOutputEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
