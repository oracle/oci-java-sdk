/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Details to change managed MySQL database management type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ChangeMysqlDatabaseManagementTypeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChangeMysqlDatabaseManagementTypeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"managementType", "operation"})
    public ChangeMysqlDatabaseManagementTypeDetails(
            ManagedMySqlDatabase.HeatWaveManagementType managementType, Operation operation) {
        super();
        this.managementType = managementType;
        this.operation = operation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of HeatWave management. */
        @com.fasterxml.jackson.annotation.JsonProperty("managementType")
        private ManagedMySqlDatabase.HeatWaveManagementType managementType;

        /**
         * The type of HeatWave management.
         *
         * @param managementType the value to set
         * @return this builder
         */
        public Builder managementType(ManagedMySqlDatabase.HeatWaveManagementType managementType) {
            this.managementType = managementType;
            this.__explicitlySet__.add("managementType");
            return this;
        }
        /**
         * The type of operation to perform: update managementType, enable or disable database
         * management.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Operation operation;

        /**
         * The type of operation to perform: update managementType, enable or disable database
         * management.
         *
         * @param operation the value to set
         * @return this builder
         */
        public Builder operation(Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeMysqlDatabaseManagementTypeDetails build() {
            ChangeMysqlDatabaseManagementTypeDetails model =
                    new ChangeMysqlDatabaseManagementTypeDetails(
                            this.managementType, this.operation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeMysqlDatabaseManagementTypeDetails model) {
            if (model.wasPropertyExplicitlySet("managementType")) {
                this.managementType(model.getManagementType());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
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

    /** The type of HeatWave management. */
    @com.fasterxml.jackson.annotation.JsonProperty("managementType")
    private final ManagedMySqlDatabase.HeatWaveManagementType managementType;

    /**
     * The type of HeatWave management.
     *
     * @return the value
     */
    public ManagedMySqlDatabase.HeatWaveManagementType getManagementType() {
        return managementType;
    }

    /**
     * The type of operation to perform: update managementType, enable or disable database
     * management.
     */
    public enum Operation implements com.oracle.bmc.http.internal.BmcEnum {
        EnableDbmgmt("ENABLE_DBMGMT"),
        UpdateDbmgmtType("UPDATE_DBMGMT_TYPE"),
        DisableDbmgmt("DISABLE_DBMGMT"),
        ;

        private final String value;
        private static java.util.Map<String, Operation> map;

        static {
            map = new java.util.HashMap<>();
            for (Operation v : Operation.values()) {
                map.put(v.getValue(), v);
            }
        }

        Operation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Operation: " + key);
        }
    };
    /**
     * The type of operation to perform: update managementType, enable or disable database
     * management.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Operation operation;

    /**
     * The type of operation to perform: update managementType, enable or disable database
     * management.
     *
     * @return the value
     */
    public Operation getOperation() {
        return operation;
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
        sb.append("ChangeMysqlDatabaseManagementTypeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("managementType=").append(String.valueOf(this.managementType));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeMysqlDatabaseManagementTypeDetails)) {
            return false;
        }

        ChangeMysqlDatabaseManagementTypeDetails other =
                (ChangeMysqlDatabaseManagementTypeDetails) o;
        return java.util.Objects.equals(this.managementType, other.managementType)
                && java.util.Objects.equals(this.operation, other.operation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managementType == null ? 43 : this.managementType.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
