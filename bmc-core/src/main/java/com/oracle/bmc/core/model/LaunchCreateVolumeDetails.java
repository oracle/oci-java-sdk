/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Define a volume that will be created and attached or attached to an instance on creation.
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
    property = "volumeCreationType",
    defaultImpl = LaunchCreateVolumeDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LaunchCreateVolumeFromAttributes.class,
        name = "ATTRIBUTES"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LaunchCreateVolumeDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected LaunchCreateVolumeDetails() {
        super();
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
        sb.append("LaunchCreateVolumeDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchCreateVolumeDetails)) {
            return false;
        }

        LaunchCreateVolumeDetails other = (LaunchCreateVolumeDetails) o;
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
     * Specifies the method for volume creation.
     **/
    public enum VolumeCreationType {
        Attributes("ATTRIBUTES"),
        ;

        private final String value;
        private static java.util.Map<String, VolumeCreationType> map;

        static {
            map = new java.util.HashMap<>();
            for (VolumeCreationType v : VolumeCreationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        VolumeCreationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VolumeCreationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid VolumeCreationType: " + key);
        }
    };
}
