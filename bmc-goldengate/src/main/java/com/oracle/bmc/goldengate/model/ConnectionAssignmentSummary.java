/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the Connection Assignment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConnectionAssignmentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConnectionAssignmentSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "connectionId",
        "deploymentId",
        "aliasName",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public ConnectionAssignmentSummary(
            String id,
            String compartmentId,
            String connectionId,
            String deploymentId,
            String aliasName,
            ConnectionAssignment.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.connectionId = connectionId;
        this.deploymentId = deploymentId;
        this.aliasName = aliasName;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the connection assignment being
         * referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the connection assignment being
         * referenced.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the connection being
         * referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionId")
        private String connectionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the connection being
         * referenced.
         *
         * @param connectionId the value to set
         * @return this builder
         **/
        public Builder connectionId(String connectionId) {
            this.connectionId = connectionId;
            this.__explicitlySet__.add("connectionId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deployment being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
        private String deploymentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deployment being referenced.
         *
         * @param deploymentId the value to set
         * @return this builder
         **/
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            this.__explicitlySet__.add("deploymentId");
            return this;
        }
        /**
         * Credential store alias.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
        private String aliasName;

        /**
         * Credential store alias.
         *
         * @param aliasName the value to set
         * @return this builder
         **/
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            this.__explicitlySet__.add("aliasName");
            return this;
        }
        /**
         * Possible lifecycle states for connection assignments.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ConnectionAssignment.LifecycleState lifecycleState;

        /**
         * Possible lifecycle states for connection assignments.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ConnectionAssignment.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionAssignmentSummary build() {
            ConnectionAssignmentSummary model =
                    new ConnectionAssignmentSummary(
                            this.id,
                            this.compartmentId,
                            this.connectionId,
                            this.deploymentId,
                            this.aliasName,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionAssignmentSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("connectionId")) {
                this.connectionId(model.getConnectionId());
            }
            if (model.wasPropertyExplicitlySet("deploymentId")) {
                this.deploymentId(model.getDeploymentId());
            }
            if (model.wasPropertyExplicitlySet("aliasName")) {
                this.aliasName(model.getAliasName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the connection assignment being
     * referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the connection assignment being
     * referenced.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the connection being
     * referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionId")
    private final String connectionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the connection being
     * referenced.
     *
     * @return the value
     **/
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deployment being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
    private final String deploymentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deployment being referenced.
     *
     * @return the value
     **/
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * Credential store alias.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
    private final String aliasName;

    /**
     * Credential store alias.
     *
     * @return the value
     **/
    public String getAliasName() {
        return aliasName;
    }

    /**
     * Possible lifecycle states for connection assignments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ConnectionAssignment.LifecycleState lifecycleState;

    /**
     * Possible lifecycle states for connection assignments.
     * @return the value
     **/
    public ConnectionAssignment.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ConnectionAssignmentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", connectionId=").append(String.valueOf(this.connectionId));
        sb.append(", deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", aliasName=").append(String.valueOf(this.aliasName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionAssignmentSummary)) {
            return false;
        }

        ConnectionAssignmentSummary other = (ConnectionAssignmentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.connectionId, other.connectionId)
                && java.util.Objects.equals(this.deploymentId, other.deploymentId)
                && java.util.Objects.equals(this.aliasName, other.aliasName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.connectionId == null ? 43 : this.connectionId.hashCode());
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.aliasName == null ? 43 : this.aliasName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
