/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * An entity allows the labeler to identify an object in the record to label. This can be, for
 * example, a snippet of text, an entire image, or a bounding box within an image. All entity types
 * have an array of labels that are indexed. If more than one label is provided, but the
 * annotationType on the corresponding dataset is for a single class, the API rejects the create
 * annotation request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType",
        defaultImpl = Entity.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ImageObjectSelectionEntity.class,
            name = "IMAGEOBJECTSELECTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GenericEntity.class,
            name = "GENERIC"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = KeyValueSelectionEntity.class,
            name = "KEYVALUESELECTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TextSelectionEntity.class,
            name = "TEXTSELECTION")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class Entity extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected Entity() {
        super();
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
        sb.append("Entity(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Entity)) {
            return false;
        }

        Entity other = (Entity) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The entity type described in the annotation. GENERIC - An extensible entity type that is the
     * base entity type for some annotation formats. IMAGEOBJECTSELECTION- - This allows the labeler
     * to use specify a bounding polygon on the image to represent an object and apply labels to it.
     * TEXTSELECTION - This allows the labeler to highlight text, by specifying an offset and a
     * length, and apply labels to it. KEYVALUESELECTION - This allows the labeler to apply label
     * the highlighted text from OCR.
     */
    public enum EntityType implements com.oracle.bmc.http.internal.BmcEnum {
        Generic("GENERIC"),
        Imageobjectselection("IMAGEOBJECTSELECTION"),
        Textselection("TEXTSELECTION"),
        Keyvalueselection("KEYVALUESELECTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EntityType.class);

        private final String value;
        private static java.util.Map<String, EntityType> map;

        static {
            map = new java.util.HashMap<>();
            for (EntityType v : EntityType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EntityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EntityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EntityType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
