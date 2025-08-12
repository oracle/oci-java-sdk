/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The audit policy provisioning conditions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType",
        defaultImpl = PolicyCondition.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AttributeSetCondition.class,
            name = "ATTRIBUTE_SET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UserCondition.class, name = "USER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = RoleCondition.class, name = "ROLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AllUserCondition.class,
            name = "ALL_USERS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class PolicyCondition extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"entitySelection", "operationStatus"})
    protected PolicyCondition(EntitySelection entitySelection, OperationStatus operationStatus) {
        super();
        this.entitySelection = entitySelection;
        this.operationStatus = operationStatus;
    }

    /** Specifies whether to include or exclude the specified users or roles. */
    public enum EntitySelection implements com.oracle.bmc.http.internal.BmcEnum {
        Include("INCLUDE"),
        Exclude("EXCLUDE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EntitySelection.class);

        private final String value;
        private static java.util.Map<String, EntitySelection> map;

        static {
            map = new java.util.HashMap<>();
            for (EntitySelection v : EntitySelection.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EntitySelection(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EntitySelection create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EntitySelection', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies whether to include or exclude the specified users or roles. */
    @com.fasterxml.jackson.annotation.JsonProperty("entitySelection")
    private final EntitySelection entitySelection;

    /**
     * Specifies whether to include or exclude the specified users or roles.
     *
     * @return the value
     */
    public EntitySelection getEntitySelection() {
        return entitySelection;
    }

    /** The operation status that the policy must be enabled for. */
    public enum OperationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Success("SUCCESS"),
        Failure("FAILURE"),
        Both("BOTH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationStatus.class);

        private final String value;
        private static java.util.Map<String, OperationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationStatus v : OperationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The operation status that the policy must be enabled for. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final OperationStatus operationStatus;

    /**
     * The operation status that the policy must be enabled for.
     *
     * @return the value
     */
    public OperationStatus getOperationStatus() {
        return operationStatus;
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
        sb.append("PolicyCondition(");
        sb.append("super=").append(super.toString());
        sb.append("entitySelection=").append(String.valueOf(this.entitySelection));
        sb.append(", operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PolicyCondition)) {
            return false;
        }

        PolicyCondition other = (PolicyCondition) o;
        return java.util.Objects.equals(this.entitySelection, other.entitySelection)
                && java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.entitySelection == null ? 43 : this.entitySelection.hashCode());
        result =
                (result * PRIME)
                        + (this.operationStatus == null ? 43 : this.operationStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of users or roles that the unified audit policy is applied to. */
    public enum EntityType implements com.oracle.bmc.http.internal.BmcEnum {
        User("USER"),
        Role("ROLE"),
        AllUsers("ALL_USERS"),
        AttributeSet("ATTRIBUTE_SET"),

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
