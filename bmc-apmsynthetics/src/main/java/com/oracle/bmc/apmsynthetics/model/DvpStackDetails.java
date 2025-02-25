/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of a Dedicated Vantage Point (DVP) stack in Resource Manager.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dvpStackType",
    defaultImpl = DvpStackDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OracleRMStack.class,
        name = "ORACLE_RM_STACK"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DvpStackDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dvpVersion"})
    protected DvpStackDetails(String dvpVersion) {
        super();
        this.dvpVersion = dvpVersion;
    }

    /**
     * Version of the dedicated vantage point.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dvpVersion")
    private final String dvpVersion;

    /**
     * Version of the dedicated vantage point.
     * @return the value
     **/
    public String getDvpVersion() {
        return dvpVersion;
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
        sb.append("DvpStackDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dvpVersion=").append(String.valueOf(this.dvpVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DvpStackDetails)) {
            return false;
        }

        DvpStackDetails other = (DvpStackDetails) o;
        return java.util.Objects.equals(this.dvpVersion, other.dvpVersion) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dvpVersion == null ? 43 : this.dvpVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of stack.
     **/
    public enum DvpStackType {
        OracleRmStack("ORACLE_RM_STACK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DvpStackType.class);

        private final String value;
        private static java.util.Map<String, DvpStackType> map;

        static {
            map = new java.util.HashMap<>();
            for (DvpStackType v : DvpStackType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DvpStackType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DvpStackType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DvpStackType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
