/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Possible Discovery filters.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = GiFleetDiscoveryFilter.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GiDefinedTagsFilter.class,
        name = "DEFINED_TAG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GiCompartmentIdFilter.class,
        name = "COMPARTMENT_ID"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GiFreeformTagsFilter.class,
        name = "FREEFORM_TAG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GiResourceIdFilter.class,
        name = "RESOURCE_ID"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GiVersionFilter.class,
        name = "VERSION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class GiFleetDiscoveryFilter extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mode"})
    protected GiFleetDiscoveryFilter(Mode mode) {
        super();
        this.mode = mode;
    }

    /**
     * INCLUDE or EXCLUDE the filter results in the discovery for GI targets.
     * Supported for 'FSUCOLLECTION' RESOURCE_ID filter only.
     *
     **/
    public enum Mode {
        Include("INCLUDE"),
        Exclude("EXCLUDE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Mode.class);

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Mode', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * INCLUDE or EXCLUDE the filter results in the discovery for GI targets.
     * Supported for 'FSUCOLLECTION' RESOURCE_ID filter only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * INCLUDE or EXCLUDE the filter results in the discovery for GI targets.
     * Supported for 'FSUCOLLECTION' RESOURCE_ID filter only.
     *
     * @return the value
     **/
    public Mode getMode() {
        return mode;
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
        sb.append("GiFleetDiscoveryFilter(");
        sb.append("super=").append(super.toString());
        sb.append("mode=").append(String.valueOf(this.mode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GiFleetDiscoveryFilter)) {
            return false;
        }

        GiFleetDiscoveryFilter other = (GiFleetDiscoveryFilter) o;
        return java.util.Objects.equals(this.mode, other.mode) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of filters supported for GI targets discovery.
     *
     **/
    public enum Type {
        CompartmentId("COMPARTMENT_ID"),
        Version("VERSION"),
        FreeformTag("FREEFORM_TAG"),
        DefinedTag("DEFINED_TAG"),
        ResourceId("RESOURCE_ID"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
