/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Description of the target environment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "targetEnvironmentType",
        defaultImpl = TargetEnvironment.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VmTargetEnvironment.class,
            name = "VM_TARGET_ENV")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class TargetEnvironment extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetCompartmentId"})
    protected TargetEnvironment(String targetCompartmentId) {
        super();
        this.targetCompartmentId = targetCompartmentId;
    }

    /** Target compartment identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
    private final String targetCompartmentId;

    /**
     * Target compartment identifier
     *
     * @return the value
     */
    public String getTargetCompartmentId() {
        return targetCompartmentId;
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
        sb.append("TargetEnvironment(");
        sb.append("super=").append(super.toString());
        sb.append("targetCompartmentId=").append(String.valueOf(this.targetCompartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetEnvironment)) {
            return false;
        }

        TargetEnvironment other = (TargetEnvironment) o;
        return java.util.Objects.equals(this.targetCompartmentId, other.targetCompartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetCompartmentId == null
                                ? 43
                                : this.targetCompartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of target environment. */
    public enum TargetEnvironmentType implements com.oracle.bmc.http.internal.BmcEnum {
        VmTargetEnv("VM_TARGET_ENV"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TargetEnvironmentType.class);

        private final String value;
        private static java.util.Map<String, TargetEnvironmentType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetEnvironmentType v : TargetEnvironmentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetEnvironmentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetEnvironmentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetEnvironmentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
