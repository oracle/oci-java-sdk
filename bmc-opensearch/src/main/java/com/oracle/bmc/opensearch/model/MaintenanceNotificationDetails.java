/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Notification details for the maintenance activity.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MaintenanceNotificationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MaintenanceNotificationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "jiraTicket",
        "maintenanceNotificationType",
        "tenantIds",
        "clusterIds",
        "startTime",
        "endTime"
    })
    public MaintenanceNotificationDetails(
            String jiraTicket,
            MaintenanceNotificationType maintenanceNotificationType,
            java.util.List<String> tenantIds,
            java.util.List<String> clusterIds,
            String startTime,
            String endTime) {
        super();
        this.jiraTicket = jiraTicket;
        this.maintenanceNotificationType = maintenanceNotificationType;
        this.tenantIds = tenantIds;
        this.clusterIds = clusterIds;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Jira tickets for on-call engineer to send customer notification
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jiraTicket")
        private String jiraTicket;

        /**
         * Jira tickets for on-call engineer to send customer notification
         * @param jiraTicket the value to set
         * @return this builder
         **/
        public Builder jiraTicket(String jiraTicket) {
            this.jiraTicket = jiraTicket;
            this.__explicitlySet__.add("jiraTicket");
            return this;
        }
        /**
         * Maintenance Notification type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceNotificationType")
        private MaintenanceNotificationType maintenanceNotificationType;

        /**
         * Maintenance Notification type
         * @param maintenanceNotificationType the value to set
         * @return this builder
         **/
        public Builder maintenanceNotificationType(
                MaintenanceNotificationType maintenanceNotificationType) {
            this.maintenanceNotificationType = maintenanceNotificationType;
            this.__explicitlySet__.add("maintenanceNotificationType");
            return this;
        }
        /**
         * List of tenantIds where we need to send the maintenance notifications
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantIds")
        private java.util.List<String> tenantIds;

        /**
         * List of tenantIds where we need to send the maintenance notifications
         * @param tenantIds the value to set
         * @return this builder
         **/
        public Builder tenantIds(java.util.List<String> tenantIds) {
            this.tenantIds = tenantIds;
            this.__explicitlySet__.add("tenantIds");
            return this;
        }
        /**
         * List of OpenSearch clusterIds where we need to send the maintenance notifications
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterIds")
        private java.util.List<String> clusterIds;

        /**
         * List of OpenSearch clusterIds where we need to send the maintenance notifications
         * @param clusterIds the value to set
         * @return this builder
         **/
        public Builder clusterIds(java.util.List<String> clusterIds) {
            this.clusterIds = clusterIds;
            this.__explicitlySet__.add("clusterIds");
            return this;
        }
        /**
         * Start time for the notification activity in UTC like "2023-20-04 04:00:00.000Z"
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private String startTime;

        /**
         * Start time for the notification activity in UTC like "2023-20-04 04:00:00.000Z"
         * @param startTime the value to set
         * @return this builder
         **/
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /**
         * Start time for the notification activity in UTC like "2023-20-04 04:00:00.000Z"
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private String endTime;

        /**
         * Start time for the notification activity in UTC like "2023-20-04 04:00:00.000Z"
         * @param endTime the value to set
         * @return this builder
         **/
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceNotificationDetails build() {
            MaintenanceNotificationDetails model =
                    new MaintenanceNotificationDetails(
                            this.jiraTicket,
                            this.maintenanceNotificationType,
                            this.tenantIds,
                            this.clusterIds,
                            this.startTime,
                            this.endTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceNotificationDetails model) {
            if (model.wasPropertyExplicitlySet("jiraTicket")) {
                this.jiraTicket(model.getJiraTicket());
            }
            if (model.wasPropertyExplicitlySet("maintenanceNotificationType")) {
                this.maintenanceNotificationType(model.getMaintenanceNotificationType());
            }
            if (model.wasPropertyExplicitlySet("tenantIds")) {
                this.tenantIds(model.getTenantIds());
            }
            if (model.wasPropertyExplicitlySet("clusterIds")) {
                this.clusterIds(model.getClusterIds());
            }
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("endTime")) {
                this.endTime(model.getEndTime());
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
     * Jira tickets for on-call engineer to send customer notification
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jiraTicket")
    private final String jiraTicket;

    /**
     * Jira tickets for on-call engineer to send customer notification
     * @return the value
     **/
    public String getJiraTicket() {
        return jiraTicket;
    }

    /**
     * Maintenance Notification type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceNotificationType")
    private final MaintenanceNotificationType maintenanceNotificationType;

    /**
     * Maintenance Notification type
     * @return the value
     **/
    public MaintenanceNotificationType getMaintenanceNotificationType() {
        return maintenanceNotificationType;
    }

    /**
     * List of tenantIds where we need to send the maintenance notifications
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantIds")
    private final java.util.List<String> tenantIds;

    /**
     * List of tenantIds where we need to send the maintenance notifications
     * @return the value
     **/
    public java.util.List<String> getTenantIds() {
        return tenantIds;
    }

    /**
     * List of OpenSearch clusterIds where we need to send the maintenance notifications
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterIds")
    private final java.util.List<String> clusterIds;

    /**
     * List of OpenSearch clusterIds where we need to send the maintenance notifications
     * @return the value
     **/
    public java.util.List<String> getClusterIds() {
        return clusterIds;
    }

    /**
     * Start time for the notification activity in UTC like "2023-20-04 04:00:00.000Z"
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final String startTime;

    /**
     * Start time for the notification activity in UTC like "2023-20-04 04:00:00.000Z"
     * @return the value
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * Start time for the notification activity in UTC like "2023-20-04 04:00:00.000Z"
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final String endTime;

    /**
     * Start time for the notification activity in UTC like "2023-20-04 04:00:00.000Z"
     * @return the value
     **/
    public String getEndTime() {
        return endTime;
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
        sb.append("MaintenanceNotificationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("jiraTicket=").append(String.valueOf(this.jiraTicket));
        sb.append(", maintenanceNotificationType=")
                .append(String.valueOf(this.maintenanceNotificationType));
        sb.append(", tenantIds=").append(String.valueOf(this.tenantIds));
        sb.append(", clusterIds=").append(String.valueOf(this.clusterIds));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceNotificationDetails)) {
            return false;
        }

        MaintenanceNotificationDetails other = (MaintenanceNotificationDetails) o;
        return java.util.Objects.equals(this.jiraTicket, other.jiraTicket)
                && java.util.Objects.equals(
                        this.maintenanceNotificationType, other.maintenanceNotificationType)
                && java.util.Objects.equals(this.tenantIds, other.tenantIds)
                && java.util.Objects.equals(this.clusterIds, other.clusterIds)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.jiraTicket == null ? 43 : this.jiraTicket.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceNotificationType == null
                                ? 43
                                : this.maintenanceNotificationType.hashCode());
        result = (result * PRIME) + (this.tenantIds == null ? 43 : this.tenantIds.hashCode());
        result = (result * PRIME) + (this.clusterIds == null ? 43 : this.clusterIds.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
