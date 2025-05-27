/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details about the given software update. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "softwareUpdateType",
        defaultImpl = SoftwareUpdate.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = BdsSoftwareUpdate.class,
            name = "BDS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class SoftwareUpdate extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "softwareUpdateKey",
        "softwareUpdateVersion",
        "timeReleased",
        "lifecycleState"
    })
    protected SoftwareUpdate(
            String softwareUpdateKey,
            String softwareUpdateVersion,
            java.util.Date timeReleased,
            LifecycleState lifecycleState) {
        super();
        this.softwareUpdateKey = softwareUpdateKey;
        this.softwareUpdateVersion = softwareUpdateVersion;
        this.timeReleased = timeReleased;
        this.lifecycleState = lifecycleState;
    }

    /** Unique identifier of a given software update */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateKey")
    private final String softwareUpdateKey;

    /**
     * Unique identifier of a given software update
     *
     * @return the value
     */
    public String getSoftwareUpdateKey() {
        return softwareUpdateKey;
    }

    /** The version of the software update. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateVersion")
    private final String softwareUpdateVersion;

    /**
     * The version of the software update.
     *
     * @return the value
     */
    public String getSoftwareUpdateVersion() {
        return softwareUpdateVersion;
    }

    /** The time when the software update was released. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The time when the software update was released.
     *
     * @return the value
     */
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /** The lifecycle state of the software update. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Waiting("WAITING"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The lifecycle state of the software update. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycle state of the software update.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("SoftwareUpdate(");
        sb.append("super=").append(super.toString());
        sb.append("softwareUpdateKey=").append(String.valueOf(this.softwareUpdateKey));
        sb.append(", softwareUpdateVersion=").append(String.valueOf(this.softwareUpdateVersion));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwareUpdate)) {
            return false;
        }

        SoftwareUpdate other = (SoftwareUpdate) o;
        return java.util.Objects.equals(this.softwareUpdateKey, other.softwareUpdateKey)
                && java.util.Objects.equals(this.softwareUpdateVersion, other.softwareUpdateVersion)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.softwareUpdateKey == null ? 43 : this.softwareUpdateKey.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareUpdateVersion == null
                                ? 43
                                : this.softwareUpdateVersion.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * type of current software update. - Big Data Service's micro service. BDS version will be
     * changed after upgrade.
     */
    public enum SoftwareUpdateType implements com.oracle.bmc.http.internal.BmcEnum {
        Bds("BDS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SoftwareUpdateType.class);

        private final String value;
        private static java.util.Map<String, SoftwareUpdateType> map;

        static {
            map = new java.util.HashMap<>();
            for (SoftwareUpdateType v : SoftwareUpdateType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SoftwareUpdateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SoftwareUpdateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SoftwareUpdateType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
