/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to update a managed instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateManagedInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateManagedInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "primaryManagementStationId",
        "secondaryManagementStationId",
        "notificationTopicId",
        "autonomousSettings"
    })
    public UpdateManagedInstanceDetails(
            String description,
            String primaryManagementStationId,
            String secondaryManagementStationId,
            String notificationTopicId,
            UpdatableAutonomousSettings autonomousSettings) {
        super();
        this.description = description;
        this.primaryManagementStationId = primaryManagementStationId;
        this.secondaryManagementStationId = secondaryManagementStationId;
        this.notificationTopicId = notificationTopicId;
        this.autonomousSettings = autonomousSettings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * User-specified description of the managed instance. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified description of the managed instance. Avoid entering confidential
         * information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station for the instance to use as primary management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryManagementStationId")
        private String primaryManagementStationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station for the instance to use as primary management station.
         *
         * @param primaryManagementStationId the value to set
         * @return this builder
         */
        public Builder primaryManagementStationId(String primaryManagementStationId) {
            this.primaryManagementStationId = primaryManagementStationId;
            this.__explicitlySet__.add("primaryManagementStationId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station for the instance to use as secondary management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secondaryManagementStationId")
        private String secondaryManagementStationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station for the instance to use as secondary management station.
         *
         * @param secondaryManagementStationId the value to set
         * @return this builder
         */
        public Builder secondaryManagementStationId(String secondaryManagementStationId) {
            this.secondaryManagementStationId = secondaryManagementStationId;
            this.__explicitlySet__.add("secondaryManagementStationId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the Oracle Notifications service (ONS) topic. ONS is the channel used to send
         * notifications to the customer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the Oracle Notifications service (ONS) topic. ONS is the channel used to send
         * notifications to the customer.
         *
         * @param notificationTopicId the value to set
         * @return this builder
         */
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = notificationTopicId;
            this.__explicitlySet__.add("notificationTopicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousSettings")
        private UpdatableAutonomousSettings autonomousSettings;

        public Builder autonomousSettings(UpdatableAutonomousSettings autonomousSettings) {
            this.autonomousSettings = autonomousSettings;
            this.__explicitlySet__.add("autonomousSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateManagedInstanceDetails build() {
            UpdateManagedInstanceDetails model =
                    new UpdateManagedInstanceDetails(
                            this.description,
                            this.primaryManagementStationId,
                            this.secondaryManagementStationId,
                            this.notificationTopicId,
                            this.autonomousSettings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateManagedInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("primaryManagementStationId")) {
                this.primaryManagementStationId(model.getPrimaryManagementStationId());
            }
            if (model.wasPropertyExplicitlySet("secondaryManagementStationId")) {
                this.secondaryManagementStationId(model.getSecondaryManagementStationId());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicId")) {
                this.notificationTopicId(model.getNotificationTopicId());
            }
            if (model.wasPropertyExplicitlySet("autonomousSettings")) {
                this.autonomousSettings(model.getAutonomousSettings());
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
     * User-specified description of the managed instance. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description of the managed instance. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station for the instance to use as primary management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryManagementStationId")
    private final String primaryManagementStationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station for the instance to use as primary management station.
     *
     * @return the value
     */
    public String getPrimaryManagementStationId() {
        return primaryManagementStationId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station for the instance to use as secondary management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryManagementStationId")
    private final String secondaryManagementStationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station for the instance to use as secondary management station.
     *
     * @return the value
     */
    public String getSecondaryManagementStationId() {
        return secondaryManagementStationId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications
     * to the customer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications
     * to the customer.
     *
     * @return the value
     */
    public String getNotificationTopicId() {
        return notificationTopicId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("autonomousSettings")
    private final UpdatableAutonomousSettings autonomousSettings;

    public UpdatableAutonomousSettings getAutonomousSettings() {
        return autonomousSettings;
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
        sb.append("UpdateManagedInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", primaryManagementStationId=")
                .append(String.valueOf(this.primaryManagementStationId));
        sb.append(", secondaryManagementStationId=")
                .append(String.valueOf(this.secondaryManagementStationId));
        sb.append(", notificationTopicId=").append(String.valueOf(this.notificationTopicId));
        sb.append(", autonomousSettings=").append(String.valueOf(this.autonomousSettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateManagedInstanceDetails)) {
            return false;
        }

        UpdateManagedInstanceDetails other = (UpdateManagedInstanceDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.primaryManagementStationId, other.primaryManagementStationId)
                && java.util.Objects.equals(
                        this.secondaryManagementStationId, other.secondaryManagementStationId)
                && java.util.Objects.equals(this.notificationTopicId, other.notificationTopicId)
                && java.util.Objects.equals(this.autonomousSettings, other.autonomousSettings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryManagementStationId == null
                                ? 43
                                : this.primaryManagementStationId.hashCode());
        result =
                (result * PRIME)
                        + (this.secondaryManagementStationId == null
                                ? 43
                                : this.secondaryManagementStationId.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicId == null
                                ? 43
                                : this.notificationTopicId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousSettings == null
                                ? 43
                                : this.autonomousSettings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
