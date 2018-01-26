/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@lombok.experimental.NonFinal
@lombok.AllArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType",
    defaultImpl = ImageSourceDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ImageSourceViaObjectStorageTupleDetails.class,
        name = "objectStorageTuple"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ImageSourceViaObjectStorageUriDetails.class,
        name = "objectStorageUri"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ImageSourceDetails {

    /**
     * The format of the image to be imported.  Exported Oracle images are QCOW2.  Only monolithic
     * images are supported.
     *
     **/
    public enum SourceImageType {
        Qcow2("QCOW2"),
        Vmdk("VMDK"),
        ;

        private final String value;
        private static java.util.Map<String, SourceImageType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceImageType v : SourceImageType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SourceImageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceImageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid SourceImageType: " + key);
        }
    };
    /**
     * The format of the image to be imported.  Exported Oracle images are QCOW2.  Only monolithic
     * images are supported.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceImageType")
    SourceImageType sourceImageType;
}
