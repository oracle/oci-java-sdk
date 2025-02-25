/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Possible pre trained PII model information
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
    builder = PreTrainedPiiModelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PreTrainedPiiModelDetails extends ModelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }
        /**
         * Optional pre trained model version. if nothing specified latest pre trained model will be used.
         * Supported versions can be found at /modelTypes/{modelType}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Optional pre trained model version. if nothing specified latest pre trained model will be used.
         * Supported versions can be found at /modelTypes/{modelType}
         *
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PreTrainedPiiModelDetails build() {
            PreTrainedPiiModelDetails model =
                    new PreTrainedPiiModelDetails(this.languageCode, this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PreTrainedPiiModelDetails model) {
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    @Deprecated
    public PreTrainedPiiModelDetails(String languageCode, String version) {
        super(languageCode);
        this.version = version;
    }

    /**
     * Optional pre trained model version. if nothing specified latest pre trained model will be used.
     * Supported versions can be found at /modelTypes/{modelType}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Optional pre trained model version. if nothing specified latest pre trained model will be used.
     * Supported versions can be found at /modelTypes/{modelType}
     *
     * @return the value
     **/
    public String getVersion() {
        return version;
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
        sb.append("PreTrainedPiiModelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreTrainedPiiModelDetails)) {
            return false;
        }

        PreTrainedPiiModelDetails other = (PreTrainedPiiModelDetails) o;
        return java.util.Objects.equals(this.version, other.version) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        return result;
    }
}
