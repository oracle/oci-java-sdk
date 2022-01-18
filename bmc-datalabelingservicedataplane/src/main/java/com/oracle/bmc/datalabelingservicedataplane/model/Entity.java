/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * An entity allows the labeler to identify an object in the record to label.  This can be, for example, a snippet of text, an entire image, or a bounding box within an image.  All entity types have an array of labels that are indexed. If more than one label is provided, but the annotationType on the corresponding dataset is for a single class, the API rejects the create annotation request.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entityType",
    defaultImpl = Entity.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ImageObjectSelectionEntity.class,
        name = "IMAGEOBJECTSELECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GenericEntity.class,
        name = "GENERIC"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TextSelectionEntity.class,
        name = "TEXTSELECTION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Entity {

    /**
     * The entity type described in the annotation.
     * GENERIC  - An extensible entity type that is the base entity type for some annotation formats.
     * IMAGEOBJECTSELECTION- - This allows the labeler to use specify a bounding polygon on the image to represent an object and apply labels to it.
     * TEXTSELECTION - This allows the labeler to highlight text, by specifying an offset and a length, and apply labels to it.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum EntityType {
        Generic("GENERIC"),
        Imageobjectselection("IMAGEOBJECTSELECTION"),
        Textselection("TEXTSELECTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
