/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Used for representing the metadata of the catalog. This denotes the version and format of the CSV
 * file for parsing. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetadataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MetadataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"formatVersion"})
    public MetadataDetails(FormatVersion formatVersion) {
        super();
        this.formatVersion = formatVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The version for the format of the catalog file being uploaded. */
        @com.fasterxml.jackson.annotation.JsonProperty("formatVersion")
        private FormatVersion formatVersion;

        /**
         * The version for the format of the catalog file being uploaded.
         *
         * @param formatVersion the value to set
         * @return this builder
         */
        public Builder formatVersion(FormatVersion formatVersion) {
            this.formatVersion = formatVersion;
            this.__explicitlySet__.add("formatVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetadataDetails build() {
            MetadataDetails model = new MetadataDetails(this.formatVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetadataDetails model) {
            if (model.wasPropertyExplicitlySet("formatVersion")) {
                this.formatVersion(model.getFormatVersion());
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

    /** The version for the format of the catalog file being uploaded. */
    public enum FormatVersion implements com.oracle.bmc.http.internal.BmcEnum {
        V1("V1"),
        V2("V2"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FormatVersion.class);

        private final String value;
        private static java.util.Map<String, FormatVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (FormatVersion v : FormatVersion.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FormatVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FormatVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FormatVersion', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The version for the format of the catalog file being uploaded. */
    @com.fasterxml.jackson.annotation.JsonProperty("formatVersion")
    private final FormatVersion formatVersion;

    /**
     * The version for the format of the catalog file being uploaded.
     *
     * @return the value
     */
    public FormatVersion getFormatVersion() {
        return formatVersion;
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
        sb.append("MetadataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("formatVersion=").append(String.valueOf(this.formatVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetadataDetails)) {
            return false;
        }

        MetadataDetails other = (MetadataDetails) o;
        return java.util.Objects.equals(this.formatVersion, other.formatVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.formatVersion == null ? 43 : this.formatVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
