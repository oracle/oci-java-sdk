/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for change Autonomous Container Database Dataguard role <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ChangeDataguardRoleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ChangeDataguardRoleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "role",
        "autonomousContainerDatabaseDataguardAssociationId",
        "connectionStringsType"
    })
    public ChangeDataguardRoleDetails(
            Role role,
            String autonomousContainerDatabaseDataguardAssociationId,
            ConnectionStringsType connectionStringsType) {
        super();
        this.role = role;
        this.autonomousContainerDatabaseDataguardAssociationId =
                autonomousContainerDatabaseDataguardAssociationId;
        this.connectionStringsType = connectionStringsType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
         * Autonomous Data Guard is enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
         * Autonomous Data Guard is enabled.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * The Autonomous Container Database-Autonomous Data Guard association
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "autonomousContainerDatabaseDataguardAssociationId")
        private String autonomousContainerDatabaseDataguardAssociationId;

        /**
         * The Autonomous Container Database-Autonomous Data Guard association
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param autonomousContainerDatabaseDataguardAssociationId the value to set
         * @return this builder
         */
        public Builder autonomousContainerDatabaseDataguardAssociationId(
                String autonomousContainerDatabaseDataguardAssociationId) {
            this.autonomousContainerDatabaseDataguardAssociationId =
                    autonomousContainerDatabaseDataguardAssociationId;
            this.__explicitlySet__.add("autonomousContainerDatabaseDataguardAssociationId");
            return this;
        }
        /** type of connection strings when converting database to snapshot mode */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionStringsType")
        private ConnectionStringsType connectionStringsType;

        /**
         * type of connection strings when converting database to snapshot mode
         *
         * @param connectionStringsType the value to set
         * @return this builder
         */
        public Builder connectionStringsType(ConnectionStringsType connectionStringsType) {
            this.connectionStringsType = connectionStringsType;
            this.__explicitlySet__.add("connectionStringsType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeDataguardRoleDetails build() {
            ChangeDataguardRoleDetails model =
                    new ChangeDataguardRoleDetails(
                            this.role,
                            this.autonomousContainerDatabaseDataguardAssociationId,
                            this.connectionStringsType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeDataguardRoleDetails model) {
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet(
                    "autonomousContainerDatabaseDataguardAssociationId")) {
                this.autonomousContainerDatabaseDataguardAssociationId(
                        model.getAutonomousContainerDatabaseDataguardAssociationId());
            }
            if (model.wasPropertyExplicitlySet("connectionStringsType")) {
                this.connectionStringsType(model.getConnectionStringsType());
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

    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     */
    public enum Role implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),
        SnapshotStandby("SNAPSHOT_STANDBY"),
        ;

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                map.put(v.getValue(), v);
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Role: " + key);
        }
    };
    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     *
     * @return the value
     */
    public Role getRole() {
        return role;
    }

    /**
     * The Autonomous Container Database-Autonomous Data Guard association
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty(
            "autonomousContainerDatabaseDataguardAssociationId")
    private final String autonomousContainerDatabaseDataguardAssociationId;

    /**
     * The Autonomous Container Database-Autonomous Data Guard association
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getAutonomousContainerDatabaseDataguardAssociationId() {
        return autonomousContainerDatabaseDataguardAssociationId;
    }

    /** type of connection strings when converting database to snapshot mode */
    public enum ConnectionStringsType implements com.oracle.bmc.http.internal.BmcEnum {
        SnapshotServices("SNAPSHOT_SERVICES"),
        PrimaryServices("PRIMARY_SERVICES"),
        ;

        private final String value;
        private static java.util.Map<String, ConnectionStringsType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConnectionStringsType v : ConnectionStringsType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConnectionStringsType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConnectionStringsType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConnectionStringsType: " + key);
        }
    };
    /** type of connection strings when converting database to snapshot mode */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStringsType")
    private final ConnectionStringsType connectionStringsType;

    /**
     * type of connection strings when converting database to snapshot mode
     *
     * @return the value
     */
    public ConnectionStringsType getConnectionStringsType() {
        return connectionStringsType;
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
        sb.append("ChangeDataguardRoleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("role=").append(String.valueOf(this.role));
        sb.append(", autonomousContainerDatabaseDataguardAssociationId=")
                .append(String.valueOf(this.autonomousContainerDatabaseDataguardAssociationId));
        sb.append(", connectionStringsType=").append(String.valueOf(this.connectionStringsType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDataguardRoleDetails)) {
            return false;
        }

        ChangeDataguardRoleDetails other = (ChangeDataguardRoleDetails) o;
        return java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseDataguardAssociationId,
                        other.autonomousContainerDatabaseDataguardAssociationId)
                && java.util.Objects.equals(this.connectionStringsType, other.connectionStringsType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseDataguardAssociationId == null
                                ? 43
                                : this.autonomousContainerDatabaseDataguardAssociationId
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStringsType == null
                                ? 43
                                : this.connectionStringsType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
