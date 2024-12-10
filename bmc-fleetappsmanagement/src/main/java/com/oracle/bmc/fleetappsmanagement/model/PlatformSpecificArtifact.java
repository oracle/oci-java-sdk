/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Patch artifact metadata Details which is platform specific.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PlatformSpecificArtifact.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PlatformSpecificArtifact
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"content", "osType", "architecture"})
    public PlatformSpecificArtifact(
            ContentDetails content, OsType osType, Architecture architecture) {
        super();
        this.content = content;
        this.osType = osType;
        this.architecture = architecture;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private ContentDetails content;

        public Builder content(ContentDetails content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * The OS type the patch is applicable for.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osType")
        private OsType osType;

        /**
         * The OS type the patch is applicable for.
         * @param osType the value to set
         * @return this builder
         **/
        public Builder osType(OsType osType) {
            this.osType = osType;
            this.__explicitlySet__.add("osType");
            return this;
        }
        /**
         * System architecture.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private Architecture architecture;

        /**
         * System architecture.
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(Architecture architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PlatformSpecificArtifact build() {
            PlatformSpecificArtifact model =
                    new PlatformSpecificArtifact(this.content, this.osType, this.architecture);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PlatformSpecificArtifact model) {
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("osType")) {
                this.osType(model.getOsType());
            }
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
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

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final ContentDetails content;

    public ContentDetails getContent() {
        return content;
    }

    /**
     * The OS type the patch is applicable for.
     **/
    public enum OsType {
        Windows("WINDOWS"),
        Linux("LINUX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(OsType.class);

        private final String value;
        private static java.util.Map<String, OsType> map;

        static {
            map = new java.util.HashMap<>();
            for (OsType v : OsType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OsType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OsType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OsType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The OS type the patch is applicable for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osType")
    private final OsType osType;

    /**
     * The OS type the patch is applicable for.
     * @return the value
     **/
    public OsType getOsType() {
        return osType;
    }

    /**
     * System architecture.
     **/
    public enum Architecture {
        Arm64("ARM_64"),
        X64("X64"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Architecture.class);

        private final String value;
        private static java.util.Map<String, Architecture> map;

        static {
            map = new java.util.HashMap<>();
            for (Architecture v : Architecture.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Architecture(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Architecture create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Architecture', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * System architecture.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final Architecture architecture;

    /**
     * System architecture.
     * @return the value
     **/
    public Architecture getArchitecture() {
        return architecture;
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
        sb.append("PlatformSpecificArtifact(");
        sb.append("super=").append(super.toString());
        sb.append("content=").append(String.valueOf(this.content));
        sb.append(", osType=").append(String.valueOf(this.osType));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlatformSpecificArtifact)) {
            return false;
        }

        PlatformSpecificArtifact other = (PlatformSpecificArtifact) o;
        return java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.osType, other.osType)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.osType == null ? 43 : this.osType.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
