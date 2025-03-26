/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * File format details used for importing dataset
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImportFormat.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImportFormat extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version"})
    public ImportFormat(Name name, Version version) {
        super();
        this.name = name;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of import format
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private Name name;

        /**
         * Name of import format
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(Name name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Version of import format
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Version version;

        /**
         * Version of import format
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(Version version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportFormat build() {
            ImportFormat model = new ImportFormat(this.name, this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportFormat model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /**
     * Name of import format
     **/
    public enum Name {
        JsonlConsolidated("JSONL_CONSOLIDATED"),
        JsonlCompactPlusContent("JSONL_COMPACT_PLUS_CONTENT"),
        Conll("CONLL"),
        Spacy("SPACY"),
        Coco("COCO"),
        Yolo("YOLO"),
        PascalVoc("PASCAL_VOC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Name.class);

        private final String value;
        private static java.util.Map<String, Name> map;

        static {
            map = new java.util.HashMap<>();
            for (Name v : Name.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Name(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Name create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Name', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Name of import format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final Name name;

    /**
     * Name of import format
     * @return the value
     **/
    public Name getName() {
        return name;
    }

    /**
     * Version of import format
     **/
    public enum Version {
        V2003("V2003"),
        V5("V5"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Version.class);

        private final String value;
        private static java.util.Map<String, Version> map;

        static {
            map = new java.util.HashMap<>();
            for (Version v : Version.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Version(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Version create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Version', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Version of import format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Version version;

    /**
     * Version of import format
     * @return the value
     **/
    public Version getVersion() {
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
        sb.append("ImportFormat(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportFormat)) {
            return false;
        }

        ImportFormat other = (ImportFormat) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
