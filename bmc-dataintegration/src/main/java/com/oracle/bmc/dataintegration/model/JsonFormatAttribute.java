/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The JSON file format attribute. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JsonFormatAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JsonFormatAttribute extends AbstractFormatAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFilePattern")
        private Boolean isFilePattern;

        public Builder isFilePattern(Boolean isFilePattern) {
            this.isFilePattern = isFilePattern;
            this.__explicitlySet__.add("isFilePattern");
            return this;
        }
        /** The encoding for the file. */
        @com.fasterxml.jackson.annotation.JsonProperty("encoding")
        private String encoding;

        /**
         * The encoding for the file.
         *
         * @param encoding the value to set
         * @return this builder
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            this.__explicitlySet__.add("encoding");
            return this;
        }
        /**
         * Sample JSON with all fields of JSON schema specified in it for the JSON data files used
         * in Data Flow, Data Loader or Data Preview and should be specified in Base64 encoded
         * format. Maximum size is 2 MB.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sampleEntityData")
        private String sampleEntityData;

        /**
         * Sample JSON with all fields of JSON schema specified in it for the JSON data files used
         * in Data Flow, Data Loader or Data Preview and should be specified in Base64 encoded
         * format. Maximum size is 2 MB.
         *
         * @param sampleEntityData the value to set
         * @return this builder
         */
        public Builder sampleEntityData(String sampleEntityData) {
            this.sampleEntityData = sampleEntityData;
            this.__explicitlySet__.add("sampleEntityData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JsonFormatAttribute build() {
            JsonFormatAttribute model =
                    new JsonFormatAttribute(
                            this.isFilePattern, this.encoding, this.sampleEntityData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JsonFormatAttribute model) {
            if (model.wasPropertyExplicitlySet("isFilePattern")) {
                this.isFilePattern(model.getIsFilePattern());
            }
            if (model.wasPropertyExplicitlySet("encoding")) {
                this.encoding(model.getEncoding());
            }
            if (model.wasPropertyExplicitlySet("sampleEntityData")) {
                this.sampleEntityData(model.getSampleEntityData());
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
    public JsonFormatAttribute(Boolean isFilePattern, String encoding, String sampleEntityData) {
        super(isFilePattern);
        this.encoding = encoding;
        this.sampleEntityData = sampleEntityData;
    }

    /** The encoding for the file. */
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    private final String encoding;

    /**
     * The encoding for the file.
     *
     * @return the value
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sample JSON with all fields of JSON schema specified in it for the JSON data files used in
     * Data Flow, Data Loader or Data Preview and should be specified in Base64 encoded format.
     * Maximum size is 2 MB.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sampleEntityData")
    private final String sampleEntityData;

    /**
     * Sample JSON with all fields of JSON schema specified in it for the JSON data files used in
     * Data Flow, Data Loader or Data Preview and should be specified in Base64 encoded format.
     * Maximum size is 2 MB.
     *
     * @return the value
     */
    public String getSampleEntityData() {
        return sampleEntityData;
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
        sb.append("JsonFormatAttribute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", encoding=").append(String.valueOf(this.encoding));
        sb.append(", sampleEntityData=").append(String.valueOf(this.sampleEntityData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonFormatAttribute)) {
            return false;
        }

        JsonFormatAttribute other = (JsonFormatAttribute) o;
        return java.util.Objects.equals(this.encoding, other.encoding)
                && java.util.Objects.equals(this.sampleEntityData, other.sampleEntityData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.encoding == null ? 43 : this.encoding.hashCode());
        result =
                (result * PRIME)
                        + (this.sampleEntityData == null ? 43 : this.sampleEntityData.hashCode());
        return result;
    }
}
