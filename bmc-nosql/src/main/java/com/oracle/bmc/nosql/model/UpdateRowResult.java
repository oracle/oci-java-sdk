/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The result of an UpdateRow operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateRowResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateRowResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "version",
        "existingVersion",
        "existingValue",
        "generatedValue",
        "usage"
    })
    public UpdateRowResult(
            String version,
            String existingVersion,
            java.util.Map<String, Object> existingValue,
            String generatedValue,
            RequestUsage usage) {
        super();
        this.version = version;
        this.existingVersion = existingVersion;
        this.existingValue = existingValue;
        this.generatedValue = generatedValue;
        this.usage = usage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An opaque version string associated with the row. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * An opaque version string associated with the row.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The version string associated with the existing row. Returned if the put fails due to
         * options setting in the request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("existingVersion")
        private String existingVersion;

        /**
         * The version string associated with the existing row. Returned if the put fails due to
         * options setting in the request.
         *
         * @param existingVersion the value to set
         * @return this builder
         */
        public Builder existingVersion(String existingVersion) {
            this.existingVersion = existingVersion;
            this.__explicitlySet__.add("existingVersion");
            return this;
        }
        /** The map of values from a row. */
        @com.fasterxml.jackson.annotation.JsonProperty("existingValue")
        private java.util.Map<String, Object> existingValue;

        /**
         * The map of values from a row.
         *
         * @param existingValue the value to set
         * @return this builder
         */
        public Builder existingValue(java.util.Map<String, Object> existingValue) {
            this.existingValue = existingValue;
            this.__explicitlySet__.add("existingValue");
            return this;
        }
        /**
         * The value generated if the operation created a new value for an identity column. If the
         * table has no identity column, this value is null. If it has an identity column, and a
         * value was generated for that column, it is non-null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("generatedValue")
        private String generatedValue;

        /**
         * The value generated if the operation created a new value for an identity column. If the
         * table has no identity column, this value is null. If it has an identity column, and a
         * value was generated for that column, it is non-null.
         *
         * @param generatedValue the value to set
         * @return this builder
         */
        public Builder generatedValue(String generatedValue) {
            this.generatedValue = generatedValue;
            this.__explicitlySet__.add("generatedValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private RequestUsage usage;

        public Builder usage(RequestUsage usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRowResult build() {
            UpdateRowResult model =
                    new UpdateRowResult(
                            this.version,
                            this.existingVersion,
                            this.existingValue,
                            this.generatedValue,
                            this.usage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRowResult model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("existingVersion")) {
                this.existingVersion(model.getExistingVersion());
            }
            if (model.wasPropertyExplicitlySet("existingValue")) {
                this.existingValue(model.getExistingValue());
            }
            if (model.wasPropertyExplicitlySet("generatedValue")) {
                this.generatedValue(model.getGeneratedValue());
            }
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
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

    /** An opaque version string associated with the row. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * An opaque version string associated with the row.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /**
     * The version string associated with the existing row. Returned if the put fails due to options
     * setting in the request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("existingVersion")
    private final String existingVersion;

    /**
     * The version string associated with the existing row. Returned if the put fails due to options
     * setting in the request.
     *
     * @return the value
     */
    public String getExistingVersion() {
        return existingVersion;
    }

    /** The map of values from a row. */
    @com.fasterxml.jackson.annotation.JsonProperty("existingValue")
    private final java.util.Map<String, Object> existingValue;

    /**
     * The map of values from a row.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getExistingValue() {
        return existingValue;
    }

    /**
     * The value generated if the operation created a new value for an identity column. If the table
     * has no identity column, this value is null. If it has an identity column, and a value was
     * generated for that column, it is non-null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("generatedValue")
    private final String generatedValue;

    /**
     * The value generated if the operation created a new value for an identity column. If the table
     * has no identity column, this value is null. If it has an identity column, and a value was
     * generated for that column, it is non-null.
     *
     * @return the value
     */
    public String getGeneratedValue() {
        return generatedValue;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final RequestUsage usage;

    public RequestUsage getUsage() {
        return usage;
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
        sb.append("UpdateRowResult(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", existingVersion=").append(String.valueOf(this.existingVersion));
        sb.append(", existingValue=").append(String.valueOf(this.existingValue));
        sb.append(", generatedValue=").append(String.valueOf(this.generatedValue));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRowResult)) {
            return false;
        }

        UpdateRowResult other = (UpdateRowResult) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.existingVersion, other.existingVersion)
                && java.util.Objects.equals(this.existingValue, other.existingValue)
                && java.util.Objects.equals(this.generatedValue, other.generatedValue)
                && java.util.Objects.equals(this.usage, other.usage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.existingVersion == null ? 43 : this.existingVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.existingValue == null ? 43 : this.existingValue.hashCode());
        result =
                (result * PRIME)
                        + (this.generatedValue == null ? 43 : this.generatedValue.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
