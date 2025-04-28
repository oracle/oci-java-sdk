/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of the audit policy provisioning conditions. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EnableConditions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnableConditions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entitySelection",
        "entityType",
        "operationStatus",
        "entityNames"
    })
    public EnableConditions(
            EntitySelection entitySelection,
            EntityType entityType,
            OperationStatus operationStatus,
            java.util.List<String> entityNames) {
        super();
        this.entitySelection = entitySelection;
        this.entityType = entityType;
        this.operationStatus = operationStatus;
        this.entityNames = entityNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The entity include or exclude selection. */
        @com.fasterxml.jackson.annotation.JsonProperty("entitySelection")
        private EntitySelection entitySelection;

        /**
         * The entity include or exclude selection.
         *
         * @param entitySelection the value to set
         * @return this builder
         */
        public Builder entitySelection(EntitySelection entitySelection) {
            this.entitySelection = entitySelection;
            this.__explicitlySet__.add("entitySelection");
            return this;
        }
        /** The entity type that the policy must be enabled for. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private EntityType entityType;

        /**
         * The entity type that the policy must be enabled for.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(EntityType entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /** The operation status that the policy must be enabled for. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        /**
         * The operation status that the policy must be enabled for.
         *
         * @param operationStatus the value to set
         * @return this builder
         */
        public Builder operationStatus(OperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }
        /** List of users or roles that the policy must be enabled for. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityNames")
        private java.util.List<String> entityNames;

        /**
         * List of users or roles that the policy must be enabled for.
         *
         * @param entityNames the value to set
         * @return this builder
         */
        public Builder entityNames(java.util.List<String> entityNames) {
            this.entityNames = entityNames;
            this.__explicitlySet__.add("entityNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableConditions build() {
            EnableConditions model =
                    new EnableConditions(
                            this.entitySelection,
                            this.entityType,
                            this.operationStatus,
                            this.entityNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableConditions model) {
            if (model.wasPropertyExplicitlySet("entitySelection")) {
                this.entitySelection(model.getEntitySelection());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("entityNames")) {
                this.entityNames(model.getEntityNames());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The entity include or exclude selection. */
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
    /** The entity include or exclude selection. */
    @com.fasterxml.jackson.annotation.JsonProperty("entitySelection")
    private final EntitySelection entitySelection;

    /**
     * The entity include or exclude selection.
     *
     * @return the value
     */
    public EntitySelection getEntitySelection() {
        return entitySelection;
    }

    /** The entity type that the policy must be enabled for. */
    public enum EntityType implements com.oracle.bmc.http.internal.BmcEnum {
        User("USER"),
        Role("ROLE"),
        AllUsers("ALL_USERS"),

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
    /** The entity type that the policy must be enabled for. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final EntityType entityType;

    /**
     * The entity type that the policy must be enabled for.
     *
     * @return the value
     */
    public EntityType getEntityType() {
        return entityType;
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

    /** List of users or roles that the policy must be enabled for. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityNames")
    private final java.util.List<String> entityNames;

    /**
     * List of users or roles that the policy must be enabled for.
     *
     * @return the value
     */
    public java.util.List<String> getEntityNames() {
        return entityNames;
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
        sb.append("EnableConditions(");
        sb.append("super=").append(super.toString());
        sb.append("entitySelection=").append(String.valueOf(this.entitySelection));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", entityNames=").append(String.valueOf(this.entityNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableConditions)) {
            return false;
        }

        EnableConditions other = (EnableConditions) o;
        return java.util.Objects.equals(this.entitySelection, other.entitySelection)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.entityNames, other.entityNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.entitySelection == null ? 43 : this.entitySelection.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.operationStatus == null ? 43 : this.operationStatus.hashCode());
        result = (result * PRIME) + (this.entityNames == null ? 43 : this.entityNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
