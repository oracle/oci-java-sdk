/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * General information of a Maintenance Window
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MaintenanceWindowSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MaintenanceWindowSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "compartmentId",
        "numberOfResources",
        "lifecycleState",
        "lifecycleDetails",
        "operationType",
        "operationStatus",
        "schedule",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MaintenanceWindowSummary(
            String id,
            String name,
            String compartmentId,
            Integer numberOfResources,
            MaintenanceWindowLifecycleState lifecycleState,
            MaintenanceWindowLifecycleDetails lifecycleDetails,
            MaintenanceWindowOperationType operationType,
            MaintenanceWindowOperationStatus operationStatus,
            MaintenanceWindowSchedule schedule,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.name = name;
        this.compartmentId = compartmentId;
        this.numberOfResources = numberOfResources;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.operationType = operationType;
        this.operationStatus = operationStatus;
        this.schedule = schedule;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of maintenance window.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of maintenance window.
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
         * Maintenance Window name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Maintenance Window name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
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
         * Number of resources of the Maintenance window.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfResources")
        private Integer numberOfResources;

        /**
         * Number of resources of the Maintenance window.
         *
         * @param numberOfResources the value to set
         * @return this builder
         **/
        public Builder numberOfResources(Integer numberOfResources) {
            this.numberOfResources = numberOfResources;
            this.__explicitlySet__.add("numberOfResources");
            return this;
        }
        /**
         * Lifecycle state of the monitored resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MaintenanceWindowLifecycleState lifecycleState;

        /**
         * Lifecycle state of the monitored resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(MaintenanceWindowLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Lifecycle Details of the Maintenance Window.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private MaintenanceWindowLifecycleDetails lifecycleDetails;

        /**
         * Lifecycle Details of the Maintenance Window.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(MaintenanceWindowLifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The name of the most recent operation of the Maintenance window.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private MaintenanceWindowOperationType operationType;

        /**
         * The name of the most recent operation of the Maintenance window.
         *
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(MaintenanceWindowOperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * Status of the most recent operation of the Maintenance Window.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private MaintenanceWindowOperationStatus operationStatus;

        /**
         * Status of the most recent operation of the Maintenance Window.
         *
         * @param operationStatus the value to set
         * @return this builder
         **/
        public Builder operationStatus(MaintenanceWindowOperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private MaintenanceWindowSchedule schedule;

        public Builder schedule(MaintenanceWindowSchedule schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceWindowSummary build() {
            MaintenanceWindowSummary model =
                    new MaintenanceWindowSummary(
                            this.id,
                            this.name,
                            this.compartmentId,
                            this.numberOfResources,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.operationType,
                            this.operationStatus,
                            this.schedule,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceWindowSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("numberOfResources")) {
                this.numberOfResources(model.getNumberOfResources());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of maintenance window.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of maintenance window.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Maintenance Window name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Maintenance Window name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Number of resources of the Maintenance window.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfResources")
    private final Integer numberOfResources;

    /**
     * Number of resources of the Maintenance window.
     *
     * @return the value
     **/
    public Integer getNumberOfResources() {
        return numberOfResources;
    }

    /**
     * Lifecycle state of the monitored resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MaintenanceWindowLifecycleState lifecycleState;

    /**
     * Lifecycle state of the monitored resource.
     * @return the value
     **/
    public MaintenanceWindowLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Lifecycle Details of the Maintenance Window.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final MaintenanceWindowLifecycleDetails lifecycleDetails;

    /**
     * Lifecycle Details of the Maintenance Window.
     * @return the value
     **/
    public MaintenanceWindowLifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The name of the most recent operation of the Maintenance window.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final MaintenanceWindowOperationType operationType;

    /**
     * The name of the most recent operation of the Maintenance window.
     *
     * @return the value
     **/
    public MaintenanceWindowOperationType getOperationType() {
        return operationType;
    }

    /**
     * Status of the most recent operation of the Maintenance Window.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final MaintenanceWindowOperationStatus operationStatus;

    /**
     * Status of the most recent operation of the Maintenance Window.
     *
     * @return the value
     **/
    public MaintenanceWindowOperationStatus getOperationStatus() {
        return operationStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final MaintenanceWindowSchedule schedule;

    public MaintenanceWindowSchedule getSchedule() {
        return schedule;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("MaintenanceWindowSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", numberOfResources=").append(String.valueOf(this.numberOfResources));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceWindowSummary)) {
            return false;
        }

        MaintenanceWindowSummary other = (MaintenanceWindowSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.numberOfResources, other.numberOfResources)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfResources == null ? 43 : this.numberOfResources.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result =
                (result * PRIME)
                        + (this.operationStatus == null ? 43 : this.operationStatus.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
