/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of the tag metadata.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TagMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TagMetadata extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tagType", "tagUnit"})
    public TagMetadata(TagType tagType, TagUnit tagUnit) {
        super();
        this.tagType = tagType;
        this.tagUnit = tagUnit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type associated with the tag key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagType")
        private TagType tagType;

        /**
         * Type associated with the tag key.
         *
         * @param tagType the value to set
         * @return this builder
         **/
        public Builder tagType(TagType tagType) {
            this.tagType = tagType;
            this.__explicitlySet__.add("tagType");
            return this;
        }
        /**
         * Unit associated with the tag key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagUnit")
        private TagUnit tagUnit;

        /**
         * Unit associated with the tag key.
         *
         * @param tagUnit the value to set
         * @return this builder
         **/
        public Builder tagUnit(TagUnit tagUnit) {
            this.tagUnit = tagUnit;
            this.__explicitlySet__.add("tagUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TagMetadata build() {
            TagMetadata model = new TagMetadata(this.tagType, this.tagUnit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TagMetadata model) {
            if (model.wasPropertyExplicitlySet("tagType")) {
                this.tagType(model.getTagType());
            }
            if (model.wasPropertyExplicitlySet("tagUnit")) {
                this.tagUnit(model.getTagUnit());
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
     * Type associated with the tag key.
     *
     **/
    public enum TagType {
        String("STRING"),
        Numeric("NUMERIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TagType.class);

        private final String value;
        private static java.util.Map<String, TagType> map;

        static {
            map = new java.util.HashMap<>();
            for (TagType v : TagType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TagType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TagType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TagType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type associated with the tag key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagType")
    private final TagType tagType;

    /**
     * Type associated with the tag key.
     *
     * @return the value
     **/
    public TagType getTagType() {
        return tagType;
    }

    /**
     * Unit associated with the tag key.
     *
     **/
    public enum TagUnit {
        EpochTimeMs("EPOCH_TIME_MS"),
        Bytes("BYTES"),
        Count("COUNT"),
        DurationMs("DURATION_MS"),
        TraceStatus("TRACE_STATUS"),
        Percentage("PERCENTAGE"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TagUnit.class);

        private final String value;
        private static java.util.Map<String, TagUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (TagUnit v : TagUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TagUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TagUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TagUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Unit associated with the tag key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagUnit")
    private final TagUnit tagUnit;

    /**
     * Unit associated with the tag key.
     *
     * @return the value
     **/
    public TagUnit getTagUnit() {
        return tagUnit;
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
        sb.append("TagMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("tagType=").append(String.valueOf(this.tagType));
        sb.append(", tagUnit=").append(String.valueOf(this.tagUnit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TagMetadata)) {
            return false;
        }

        TagMetadata other = (TagMetadata) o;
        return java.util.Objects.equals(this.tagType, other.tagType)
                && java.util.Objects.equals(this.tagUnit, other.tagUnit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tagType == null ? 43 : this.tagType.hashCode());
        result = (result * PRIME) + (this.tagUnit == null ? 43 : this.tagUnit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
