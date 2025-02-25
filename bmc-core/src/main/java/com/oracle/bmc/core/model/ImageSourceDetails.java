/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
public class ImageSourceDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operatingSystem",
        "operatingSystemVersion",
        "sourceImageType"
    })
    protected ImageSourceDetails(
            String operatingSystem,
            String operatingSystemVersion,
            SourceImageType sourceImageType) {
        super();
        this.operatingSystem = operatingSystem;
        this.operatingSystemVersion = operatingSystemVersion;
        this.sourceImageType = sourceImageType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final String operatingSystem;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
    private final String operatingSystemVersion;

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    /**
     * The format of the image to be imported. Only monolithic
     * images are supported. This attribute is not used for exported Oracle images with the OCI image format.
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
            throw new IllegalArgumentException("Invalid SourceImageType: " + key);
        }
    };
    /**
     * The format of the image to be imported. Only monolithic
     * images are supported. This attribute is not used for exported Oracle images with the OCI image format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceImageType")
    private final SourceImageType sourceImageType;

    /**
     * The format of the image to be imported. Only monolithic
     * images are supported. This attribute is not used for exported Oracle images with the OCI image format.
     *
     * @return the value
     **/
    public SourceImageType getSourceImageType() {
        return sourceImageType;
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
        sb.append("ImageSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", operatingSystemVersion=").append(String.valueOf(this.operatingSystemVersion));
        sb.append(", sourceImageType=").append(String.valueOf(this.sourceImageType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageSourceDetails)) {
            return false;
        }

        ImageSourceDetails other = (ImageSourceDetails) o;
        return java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(
                        this.operatingSystemVersion, other.operatingSystemVersion)
                && java.util.Objects.equals(this.sourceImageType, other.sourceImageType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystemVersion == null
                                ? 43
                                : this.operatingSystemVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceImageType == null ? 43 : this.sourceImageType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
