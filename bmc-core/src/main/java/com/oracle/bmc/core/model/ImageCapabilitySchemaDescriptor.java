/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Image Capability Schema Descriptor is a type of capability for an image.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "descriptorType",
    defaultImpl = ImageCapabilitySchemaDescriptor.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EnumStringImageCapabilitySchemaDescriptor.class,
        name = "enumstring"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EnumIntegerImageCapabilityDescriptor.class,
        name = "enuminteger"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BooleanImageCapabilitySchemaDescriptor.class,
        name = "boolean"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ImageCapabilitySchemaDescriptor
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"source"})
    protected ImageCapabilitySchemaDescriptor(Source source) {
        super();
        this.source = source;
    }

    /**
     **/
    public enum Source {
        Global("GLOBAL"),
        Image("IMAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Source.class);

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Source', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final Source source;

    public Source getSource() {
        return source;
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
        sb.append("ImageCapabilitySchemaDescriptor(");
        sb.append("super=").append(super.toString());
        sb.append("source=").append(String.valueOf(this.source));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageCapabilitySchemaDescriptor)) {
            return false;
        }

        ImageCapabilitySchemaDescriptor other = (ImageCapabilitySchemaDescriptor) o;
        return java.util.Objects.equals(this.source, other.source) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
