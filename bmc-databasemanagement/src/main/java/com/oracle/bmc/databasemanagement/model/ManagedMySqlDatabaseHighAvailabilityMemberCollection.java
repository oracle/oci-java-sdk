/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Information pertaining to high availability of a MySQL server. <br>
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
        builder = ManagedMySqlDatabaseHighAvailabilityMemberCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedMySqlDatabaseHighAvailabilityMemberCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "groupName",
        "singlePrimaryMode",
        "groupAutoIncrement",
        "flowControl",
        "memberState",
        "memberRole",
        "viewId",
        "transactionsInGtidExecuted",
        "items",
        "statusSummary"
    })
    public ManagedMySqlDatabaseHighAvailabilityMemberCollection(
            String groupName,
            String singlePrimaryMode,
            Integer groupAutoIncrement,
            String flowControl,
            String memberState,
            String memberRole,
            String viewId,
            Long transactionsInGtidExecuted,
            java.util.List<ManagedMySqlDatabaseHighAvailabilityMemberSummary> items,
            MySqlHighAvailabilityStatusSummary statusSummary) {
        super();
        this.groupName = groupName;
        this.singlePrimaryMode = singlePrimaryMode;
        this.groupAutoIncrement = groupAutoIncrement;
        this.flowControl = flowControl;
        this.memberState = memberState;
        this.memberRole = memberRole;
        this.viewId = viewId;
        this.transactionsInGtidExecuted = transactionsInGtidExecuted;
        this.items = items;
        this.statusSummary = statusSummary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the group to which this server instance belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        /**
         * The name of the group to which this server instance belongs.
         *
         * @param groupName the value to set
         * @return this builder
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }
        /** Indicates if the replication group is running in single-primary mode. */
        @com.fasterxml.jackson.annotation.JsonProperty("singlePrimaryMode")
        private String singlePrimaryMode;

        /**
         * Indicates if the replication group is running in single-primary mode.
         *
         * @param singlePrimaryMode the value to set
         * @return this builder
         */
        public Builder singlePrimaryMode(String singlePrimaryMode) {
            this.singlePrimaryMode = singlePrimaryMode;
            this.__explicitlySet__.add("singlePrimaryMode");
            return this;
        }
        /**
         * The interval between successive values for auto-incremented columns for transactions that
         * execute on this server instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupAutoIncrement")
        private Integer groupAutoIncrement;

        /**
         * The interval between successive values for auto-incremented columns for transactions that
         * execute on this server instance.
         *
         * @param groupAutoIncrement the value to set
         * @return this builder
         */
        public Builder groupAutoIncrement(Integer groupAutoIncrement) {
            this.groupAutoIncrement = groupAutoIncrement;
            this.__explicitlySet__.add("groupAutoIncrement");
            return this;
        }
        /** The mode used for flow control. */
        @com.fasterxml.jackson.annotation.JsonProperty("flowControl")
        private String flowControl;

        /**
         * The mode used for flow control.
         *
         * @param flowControl the value to set
         * @return this builder
         */
        public Builder flowControl(String flowControl) {
            this.flowControl = flowControl;
            this.__explicitlySet__.add("flowControl");
            return this;
        }
        /** The state of this server as a group replication member. */
        @com.fasterxml.jackson.annotation.JsonProperty("memberState")
        private String memberState;

        /**
         * The state of this server as a group replication member.
         *
         * @param memberState the value to set
         * @return this builder
         */
        public Builder memberState(String memberState) {
            this.memberState = memberState;
            this.__explicitlySet__.add("memberState");
            return this;
        }
        /** The role of this server as a group replication member. */
        @com.fasterxml.jackson.annotation.JsonProperty("memberRole")
        private String memberRole;

        /**
         * The role of this server as a group replication member.
         *
         * @param memberRole the value to set
         * @return this builder
         */
        public Builder memberRole(String memberRole) {
            this.memberRole = memberRole;
            this.__explicitlySet__.add("memberRole");
            return this;
        }
        /** The current view identifier for this group. */
        @com.fasterxml.jackson.annotation.JsonProperty("viewId")
        private String viewId;

        /**
         * The current view identifier for this group.
         *
         * @param viewId the value to set
         * @return this builder
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
            this.__explicitlySet__.add("viewId");
            return this;
        }
        /** The number of transactions that were replicated within the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("transactionsInGtidExecuted")
        private Long transactionsInGtidExecuted;

        /**
         * The number of transactions that were replicated within the cluster.
         *
         * @param transactionsInGtidExecuted the value to set
         * @return this builder
         */
        public Builder transactionsInGtidExecuted(Long transactionsInGtidExecuted) {
            this.transactionsInGtidExecuted = transactionsInGtidExecuted;
            this.__explicitlySet__.add("transactionsInGtidExecuted");
            return this;
        }
        /** A list of MySqlHighAvailabilityMember records. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ManagedMySqlDatabaseHighAvailabilityMemberSummary> items;

        /**
         * A list of MySqlHighAvailabilityMember records.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(
                java.util.List<ManagedMySqlDatabaseHighAvailabilityMemberSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusSummary")
        private MySqlHighAvailabilityStatusSummary statusSummary;

        public Builder statusSummary(MySqlHighAvailabilityStatusSummary statusSummary) {
            this.statusSummary = statusSummary;
            this.__explicitlySet__.add("statusSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabaseHighAvailabilityMemberCollection build() {
            ManagedMySqlDatabaseHighAvailabilityMemberCollection model =
                    new ManagedMySqlDatabaseHighAvailabilityMemberCollection(
                            this.groupName,
                            this.singlePrimaryMode,
                            this.groupAutoIncrement,
                            this.flowControl,
                            this.memberState,
                            this.memberRole,
                            this.viewId,
                            this.transactionsInGtidExecuted,
                            this.items,
                            this.statusSummary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabaseHighAvailabilityMemberCollection model) {
            if (model.wasPropertyExplicitlySet("groupName")) {
                this.groupName(model.getGroupName());
            }
            if (model.wasPropertyExplicitlySet("singlePrimaryMode")) {
                this.singlePrimaryMode(model.getSinglePrimaryMode());
            }
            if (model.wasPropertyExplicitlySet("groupAutoIncrement")) {
                this.groupAutoIncrement(model.getGroupAutoIncrement());
            }
            if (model.wasPropertyExplicitlySet("flowControl")) {
                this.flowControl(model.getFlowControl());
            }
            if (model.wasPropertyExplicitlySet("memberState")) {
                this.memberState(model.getMemberState());
            }
            if (model.wasPropertyExplicitlySet("memberRole")) {
                this.memberRole(model.getMemberRole());
            }
            if (model.wasPropertyExplicitlySet("viewId")) {
                this.viewId(model.getViewId());
            }
            if (model.wasPropertyExplicitlySet("transactionsInGtidExecuted")) {
                this.transactionsInGtidExecuted(model.getTransactionsInGtidExecuted());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("statusSummary")) {
                this.statusSummary(model.getStatusSummary());
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

    /** The name of the group to which this server instance belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

    /**
     * The name of the group to which this server instance belongs.
     *
     * @return the value
     */
    public String getGroupName() {
        return groupName;
    }

    /** Indicates if the replication group is running in single-primary mode. */
    @com.fasterxml.jackson.annotation.JsonProperty("singlePrimaryMode")
    private final String singlePrimaryMode;

    /**
     * Indicates if the replication group is running in single-primary mode.
     *
     * @return the value
     */
    public String getSinglePrimaryMode() {
        return singlePrimaryMode;
    }

    /**
     * The interval between successive values for auto-incremented columns for transactions that
     * execute on this server instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupAutoIncrement")
    private final Integer groupAutoIncrement;

    /**
     * The interval between successive values for auto-incremented columns for transactions that
     * execute on this server instance.
     *
     * @return the value
     */
    public Integer getGroupAutoIncrement() {
        return groupAutoIncrement;
    }

    /** The mode used for flow control. */
    @com.fasterxml.jackson.annotation.JsonProperty("flowControl")
    private final String flowControl;

    /**
     * The mode used for flow control.
     *
     * @return the value
     */
    public String getFlowControl() {
        return flowControl;
    }

    /** The state of this server as a group replication member. */
    @com.fasterxml.jackson.annotation.JsonProperty("memberState")
    private final String memberState;

    /**
     * The state of this server as a group replication member.
     *
     * @return the value
     */
    public String getMemberState() {
        return memberState;
    }

    /** The role of this server as a group replication member. */
    @com.fasterxml.jackson.annotation.JsonProperty("memberRole")
    private final String memberRole;

    /**
     * The role of this server as a group replication member.
     *
     * @return the value
     */
    public String getMemberRole() {
        return memberRole;
    }

    /** The current view identifier for this group. */
    @com.fasterxml.jackson.annotation.JsonProperty("viewId")
    private final String viewId;

    /**
     * The current view identifier for this group.
     *
     * @return the value
     */
    public String getViewId() {
        return viewId;
    }

    /** The number of transactions that were replicated within the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("transactionsInGtidExecuted")
    private final Long transactionsInGtidExecuted;

    /**
     * The number of transactions that were replicated within the cluster.
     *
     * @return the value
     */
    public Long getTransactionsInGtidExecuted() {
        return transactionsInGtidExecuted;
    }

    /** A list of MySqlHighAvailabilityMember records. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ManagedMySqlDatabaseHighAvailabilityMemberSummary> items;

    /**
     * A list of MySqlHighAvailabilityMember records.
     *
     * @return the value
     */
    public java.util.List<ManagedMySqlDatabaseHighAvailabilityMemberSummary> getItems() {
        return items;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("statusSummary")
    private final MySqlHighAvailabilityStatusSummary statusSummary;

    public MySqlHighAvailabilityStatusSummary getStatusSummary() {
        return statusSummary;
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
        sb.append("ManagedMySqlDatabaseHighAvailabilityMemberCollection(");
        sb.append("super=").append(super.toString());
        sb.append("groupName=").append(String.valueOf(this.groupName));
        sb.append(", singlePrimaryMode=").append(String.valueOf(this.singlePrimaryMode));
        sb.append(", groupAutoIncrement=").append(String.valueOf(this.groupAutoIncrement));
        sb.append(", flowControl=").append(String.valueOf(this.flowControl));
        sb.append(", memberState=").append(String.valueOf(this.memberState));
        sb.append(", memberRole=").append(String.valueOf(this.memberRole));
        sb.append(", viewId=").append(String.valueOf(this.viewId));
        sb.append(", transactionsInGtidExecuted=")
                .append(String.valueOf(this.transactionsInGtidExecuted));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", statusSummary=").append(String.valueOf(this.statusSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabaseHighAvailabilityMemberCollection)) {
            return false;
        }

        ManagedMySqlDatabaseHighAvailabilityMemberCollection other =
                (ManagedMySqlDatabaseHighAvailabilityMemberCollection) o;
        return java.util.Objects.equals(this.groupName, other.groupName)
                && java.util.Objects.equals(this.singlePrimaryMode, other.singlePrimaryMode)
                && java.util.Objects.equals(this.groupAutoIncrement, other.groupAutoIncrement)
                && java.util.Objects.equals(this.flowControl, other.flowControl)
                && java.util.Objects.equals(this.memberState, other.memberState)
                && java.util.Objects.equals(this.memberRole, other.memberRole)
                && java.util.Objects.equals(this.viewId, other.viewId)
                && java.util.Objects.equals(
                        this.transactionsInGtidExecuted, other.transactionsInGtidExecuted)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.statusSummary, other.statusSummary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result =
                (result * PRIME)
                        + (this.singlePrimaryMode == null ? 43 : this.singlePrimaryMode.hashCode());
        result =
                (result * PRIME)
                        + (this.groupAutoIncrement == null
                                ? 43
                                : this.groupAutoIncrement.hashCode());
        result = (result * PRIME) + (this.flowControl == null ? 43 : this.flowControl.hashCode());
        result = (result * PRIME) + (this.memberState == null ? 43 : this.memberState.hashCode());
        result = (result * PRIME) + (this.memberRole == null ? 43 : this.memberRole.hashCode());
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        result =
                (result * PRIME)
                        + (this.transactionsInGtidExecuted == null
                                ? 43
                                : this.transactionsInGtidExecuted.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.statusSummary == null ? 43 : this.statusSummary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
