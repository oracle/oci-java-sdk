/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Use this configuration for selecting a model from Oracle model family. <br>
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
        builder = TtsOracleConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelFamily")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TtsOracleConfiguration extends TtsConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("modelDetails")
        private TtsOracleModelDetails modelDetails;

        public Builder modelDetails(TtsOracleModelDetails modelDetails) {
            this.modelDetails = modelDetails;
            this.__explicitlySet__.add("modelDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("speechSettings")
        private TtsOracleSpeechSettings speechSettings;

        public Builder speechSettings(TtsOracleSpeechSettings speechSettings) {
            this.speechSettings = speechSettings;
            this.__explicitlySet__.add("speechSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TtsOracleConfiguration build() {
            TtsOracleConfiguration model =
                    new TtsOracleConfiguration(this.modelDetails, this.speechSettings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TtsOracleConfiguration model) {
            if (model.wasPropertyExplicitlySet("modelDetails")) {
                this.modelDetails(model.getModelDetails());
            }
            if (model.wasPropertyExplicitlySet("speechSettings")) {
                this.speechSettings(model.getSpeechSettings());
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
    public TtsOracleConfiguration(
            TtsOracleModelDetails modelDetails, TtsOracleSpeechSettings speechSettings) {
        super();
        this.modelDetails = modelDetails;
        this.speechSettings = speechSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelDetails")
    private final TtsOracleModelDetails modelDetails;

    public TtsOracleModelDetails getModelDetails() {
        return modelDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("speechSettings")
    private final TtsOracleSpeechSettings speechSettings;

    public TtsOracleSpeechSettings getSpeechSettings() {
        return speechSettings;
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
        sb.append("TtsOracleConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", modelDetails=").append(String.valueOf(this.modelDetails));
        sb.append(", speechSettings=").append(String.valueOf(this.speechSettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TtsOracleConfiguration)) {
            return false;
        }

        TtsOracleConfiguration other = (TtsOracleConfiguration) o;
        return java.util.Objects.equals(this.modelDetails, other.modelDetails)
                && java.util.Objects.equals(this.speechSettings, other.speechSettings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.modelDetails == null ? 43 : this.modelDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.speechSettings == null ? 43 : this.speechSettings.hashCode());
        return result;
    }
}
