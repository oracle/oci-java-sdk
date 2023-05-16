/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Unit details of a data object column. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "unitCategory",
        defaultImpl = DataObjectColumnUnit.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataObjectCoreColumnUnit.class,
            name = "CORE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataObjectTimeColumnUnit.class,
            name = "TIME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataObjectOtherStandardColumnUnit.class,
            name = "OTHER_STANDARD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataObjectCustomColumnUnit.class,
            name = "CUSTOM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataObjectTemperatureColumnUnit.class,
            name = "TEMPERATURE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataObjectPowerColumnUnit.class,
            name = "POWER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataObjectRateColumnUnit.class,
            name = "RATE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataObjectFrequencyColumnUnit.class,
            name = "FREQUENCY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataObjectDataSizeColumnUnit.class,
            name = "DATA_SIZE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DataObjectColumnUnit
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName"})
    protected DataObjectColumnUnit(String displayName) {
        super();
        this.displayName = displayName;
    }

    /** Display name of the column's unit. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the column's unit.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
        sb.append("DataObjectColumnUnit(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataObjectColumnUnit)) {
            return false;
        }

        DataObjectColumnUnit other = (DataObjectColumnUnit) o;
        return java.util.Objects.equals(this.displayName, other.displayName) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Category of the column's unit. */
    public enum UnitCategory implements com.oracle.bmc.http.internal.BmcEnum {
        DataSize("DATA_SIZE"),
        Time("TIME"),
        Power("POWER"),
        Temperature("TEMPERATURE"),
        Core("CORE"),
        Rate("RATE"),
        Frequency("FREQUENCY"),
        OtherStandard("OTHER_STANDARD"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UnitCategory.class);

        private final String value;
        private static java.util.Map<String, UnitCategory> map;

        static {
            map = new java.util.HashMap<>();
            for (UnitCategory v : UnitCategory.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UnitCategory(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UnitCategory create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UnitCategory', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
