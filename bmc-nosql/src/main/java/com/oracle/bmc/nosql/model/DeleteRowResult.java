/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The result of a DeleteRow operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DeleteRowResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeleteRowResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isSuccess", "existingVersion", "existingValue", "usage"})
    public DeleteRowResult(
            Boolean isSuccess,
            String existingVersion,
            java.util.Map<String, Object> existingValue,
            RequestUsage usage) {
        super();
        this.isSuccess = isSuccess;
        this.existingVersion = existingVersion;
        this.existingValue = existingValue;
        this.usage = usage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Convey the success or failure of the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSuccess")
        private Boolean isSuccess;

        /**
         * Convey the success or failure of the operation.
         *
         * @param isSuccess the value to set
         * @return this builder
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            this.__explicitlySet__.add("isSuccess");
            return this;
        }
        /**
         * The version string associated with the existing row. Returned if the delete fails due to
         * options setting in the request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("existingVersion")
        private String existingVersion;

        /**
         * The version string associated with the existing row. Returned if the delete fails due to
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

        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private RequestUsage usage;

        public Builder usage(RequestUsage usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeleteRowResult build() {
            DeleteRowResult model =
                    new DeleteRowResult(
                            this.isSuccess, this.existingVersion, this.existingValue, this.usage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteRowResult model) {
            if (model.wasPropertyExplicitlySet("isSuccess")) {
                this.isSuccess(model.getIsSuccess());
            }
            if (model.wasPropertyExplicitlySet("existingVersion")) {
                this.existingVersion(model.getExistingVersion());
            }
            if (model.wasPropertyExplicitlySet("existingValue")) {
                this.existingValue(model.getExistingValue());
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

    /** Convey the success or failure of the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSuccess")
    private final Boolean isSuccess;

    /**
     * Convey the success or failure of the operation.
     *
     * @return the value
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * The version string associated with the existing row. Returned if the delete fails due to
     * options setting in the request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("existingVersion")
    private final String existingVersion;

    /**
     * The version string associated with the existing row. Returned if the delete fails due to
     * options setting in the request.
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
        sb.append("DeleteRowResult(");
        sb.append("super=").append(super.toString());
        sb.append("isSuccess=").append(String.valueOf(this.isSuccess));
        sb.append(", existingVersion=").append(String.valueOf(this.existingVersion));
        sb.append(", existingValue=").append(String.valueOf(this.existingValue));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteRowResult)) {
            return false;
        }

        DeleteRowResult other = (DeleteRowResult) o;
        return java.util.Objects.equals(this.isSuccess, other.isSuccess)
                && java.util.Objects.equals(this.existingVersion, other.existingVersion)
                && java.util.Objects.equals(this.existingValue, other.existingValue)
                && java.util.Objects.equals(this.usage, other.usage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isSuccess == null ? 43 : this.isSuccess.hashCode());
        result =
                (result * PRIME)
                        + (this.existingVersion == null ? 43 : this.existingVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.existingValue == null ? 43 : this.existingValue.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
