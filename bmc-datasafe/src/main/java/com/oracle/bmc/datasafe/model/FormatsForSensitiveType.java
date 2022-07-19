/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A list of library masking formats compatible with an existing sensitive type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FormatsForSensitiveType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FormatsForSensitiveType {
    @Deprecated
    @java.beans.ConstructorProperties({"sensitiveTypeId", "maskingFormats"})
    public FormatsForSensitiveType(
            String sensitiveTypeId, java.util.List<FormatSummary> maskingFormats) {
        super();
        this.sensitiveTypeId = sensitiveTypeId;
        this.maskingFormats = maskingFormats;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the sensitive type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        /**
         * The OCID of the sensitive type.
         * @param sensitiveTypeId the value to set
         * @return this builder
         **/
        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }
        /**
         * An array of the library masking formats compatible with the sensitive type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
        private java.util.List<FormatSummary> maskingFormats;

        /**
         * An array of the library masking formats compatible with the sensitive type.
         * @param maskingFormats the value to set
         * @return this builder
         **/
        public Builder maskingFormats(java.util.List<FormatSummary> maskingFormats) {
            this.maskingFormats = maskingFormats;
            this.__explicitlySet__.add("maskingFormats");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FormatsForSensitiveType build() {
            FormatsForSensitiveType __instance__ =
                    new FormatsForSensitiveType(sensitiveTypeId, maskingFormats);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FormatsForSensitiveType o) {
            Builder copiedBuilder =
                    sensitiveTypeId(o.getSensitiveTypeId()).maskingFormats(o.getMaskingFormats());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The OCID of the sensitive type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    private final String sensitiveTypeId;

    /**
     * The OCID of the sensitive type.
     * @return the value
     **/
    public String getSensitiveTypeId() {
        return sensitiveTypeId;
    }

    /**
     * An array of the library masking formats compatible with the sensitive type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
    private final java.util.List<FormatSummary> maskingFormats;

    /**
     * An array of the library masking formats compatible with the sensitive type.
     * @return the value
     **/
    public java.util.List<FormatSummary> getMaskingFormats() {
        return maskingFormats;
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
        sb.append("FormatsForSensitiveType(");
        sb.append("sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(", maskingFormats=").append(String.valueOf(this.maskingFormats));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormatsForSensitiveType)) {
            return false;
        }

        FormatsForSensitiveType other = (FormatsForSensitiveType) o;
        return java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.maskingFormats, other.maskingFormats)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sensitiveTypeId == null ? 43 : this.sensitiveTypeId.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingFormats == null ? 43 : this.maskingFormats.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
