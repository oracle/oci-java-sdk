/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An object that defines a work request. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WorkRequest extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationType",
        "status",
        "id",
        "description",
        "displayName",
        "message",
        "parentId",
        "childrenId",
        "compartmentId",
        "resources",
        "packageNames",
        "windowsUpdateNames",
        "moduleSpecs",
        "percentComplete",
        "timeCreated",
        "timeUpdated",
        "timeStarted",
        "timeFinished",
        "initiatorId",
        "managementStation",
        "timeScheduled",
        "contentLocation",
        "eventId",
        "contentChecksum",
        "retryOfId",
        "retryIntervals",
        "isManagedByAutonomousLinux"
    })
    public WorkRequest(
            WorkRequestOperationType operationType,
            OperationStatus status,
            String id,
            String description,
            String displayName,
            String message,
            String parentId,
            java.util.List<String> childrenId,
            String compartmentId,
            java.util.List<WorkRequestResource> resources,
            java.util.List<String> packageNames,
            java.util.List<String> windowsUpdateNames,
            java.util.List<ModuleSpecDetails> moduleSpecs,
            Float percentComplete,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            String initiatorId,
            WorkRequestManagementStationDetails managementStation,
            java.util.Date timeScheduled,
            String contentLocation,
            String eventId,
            String contentChecksum,
            String retryOfId,
            java.util.List<Integer> retryIntervals,
            Boolean isManagedByAutonomousLinux) {
        super();
        this.operationType = operationType;
        this.status = status;
        this.id = id;
        this.description = description;
        this.displayName = displayName;
        this.message = message;
        this.parentId = parentId;
        this.childrenId = childrenId;
        this.compartmentId = compartmentId;
        this.resources = resources;
        this.packageNames = packageNames;
        this.windowsUpdateNames = windowsUpdateNames;
        this.moduleSpecs = moduleSpecs;
        this.percentComplete = percentComplete;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.initiatorId = initiatorId;
        this.managementStation = managementStation;
        this.timeScheduled = timeScheduled;
        this.contentLocation = contentLocation;
        this.eventId = eventId;
        this.contentChecksum = contentChecksum;
        this.retryOfId = retryOfId;
        this.retryIntervals = retryIntervals;
        this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private WorkRequestOperationType operationType;

        /**
         * Type of the work request.
         *
         * @param operationType the value to set
         * @return this builder
         */
        public Builder operationType(WorkRequestOperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /** Status of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private OperationStatus status;

        /**
         * Status of the work request.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(OperationStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the work request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the work request.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A short description about the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description about the work request.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** A short display name for the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A short display name for the work request.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A progress or error message, if there is any. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A progress or error message, if there is any.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The OCID of the parent work request, if there is any. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * The OCID of the parent work request, if there is any.
         *
         * @param parentId the value to set
         * @return this builder
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /** The list of OCIDs for the child work requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("childrenId")
        private java.util.List<String> childrenId;

        /**
         * The list of OCIDs for the child work requests.
         *
         * @param childrenId the value to set
         * @return this builder
         */
        public Builder childrenId(java.util.List<String> childrenId) {
            this.childrenId = childrenId;
            this.__explicitlySet__.add("childrenId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the work request. Work requests should be scoped to the
         * same compartment as the resource it affects. If the work request affects multiple
         * resources the different compartments, the services selects the compartment of the primary
         * resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the work request. Work requests should be scoped to the
         * same compartment as the resource it affects. If the work request affects multiple
         * resources the different compartments, the services selects the compartment of the primary
         * resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * the resources affected by the work request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<WorkRequestResource> resources;

        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * the resources affected by the work request.
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<WorkRequestResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /** A list of package names to be installed, updated, or removed. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
        private java.util.List<String> packageNames;

        /**
         * A list of package names to be installed, updated, or removed.
         *
         * @param packageNames the value to set
         * @return this builder
         */
        public Builder packageNames(java.util.List<String> packageNames) {
            this.packageNames = packageNames;
            this.__explicitlySet__.add("packageNames");
            return this;
        }
        /**
         * The UUIDs of the target Windows update (only used when operation type is
         * INSTALL_WINDOWS_UPDATES).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("windowsUpdateNames")
        private java.util.List<String> windowsUpdateNames;

        /**
         * The UUIDs of the target Windows update (only used when operation type is
         * INSTALL_WINDOWS_UPDATES).
         *
         * @param windowsUpdateNames the value to set
         * @return this builder
         */
        public Builder windowsUpdateNames(java.util.List<String> windowsUpdateNames) {
            this.windowsUpdateNames = windowsUpdateNames;
            this.__explicitlySet__.add("windowsUpdateNames");
            return this;
        }
        /** The list of appstream modules being operated on. */
        @com.fasterxml.jackson.annotation.JsonProperty("moduleSpecs")
        private java.util.List<ModuleSpecDetails> moduleSpecs;

        /**
         * The list of appstream modules being operated on.
         *
         * @param moduleSpecs the value to set
         * @return this builder
         */
        public Builder moduleSpecs(java.util.List<ModuleSpecDetails> moduleSpecs) {
            this.moduleSpecs = moduleSpecs;
            this.__explicitlySet__.add("moduleSpecs");
            return this;
        }
        /** The percentage complete of the operation tracked by this work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        /**
         * The percentage complete of the operation tracked by this work request.
         *
         * @param percentComplete the value to set
         * @return this builder
         */
        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * The date and time the work request was created (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the work request was created (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the work request started (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the work request started (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The date and time the work request started (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the work request started (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the work request completed (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the work request completed (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the resource that initiated the work request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("initiatorId")
        private String initiatorId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the resource that initiated the work request.
         *
         * @param initiatorId the value to set
         * @return this builder
         */
        public Builder initiatorId(String initiatorId) {
            this.initiatorId = initiatorId;
            this.__explicitlySet__.add("initiatorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementStation")
        private WorkRequestManagementStationDetails managementStation;

        public Builder managementStation(WorkRequestManagementStationDetails managementStation) {
            this.managementStation = managementStation;
            this.__explicitlySet__.add("managementStation");
            return this;
        }
        /**
         * The scheduled date and time to retry the work request (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The scheduled date and time to retry the work request (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /**
         * The location of the bundle in the filesystem of the resource associated to this work
         * request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contentLocation")
        private String contentLocation;

        /**
         * The location of the bundle in the filesystem of the resource associated to this work
         * request.
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            this.__explicitlySet__.add("contentLocation");
            return this;
        }
        /**
         * The event id of the content. This property is required when the work request type is
         * IMPORT_CONTENT or REMOVE_CONTENT.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eventId")
        private String eventId;

        /**
         * The event id of the content. This property is required when the work request type is
         * IMPORT_CONTENT or REMOVE_CONTENT.
         *
         * @param eventId the value to set
         * @return this builder
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            this.__explicitlySet__.add("eventId");
            return this;
        }
        /**
         * The EventFingerprint associated with the content. This property is required when the work
         * request type is IMPORT_CONTENT or REMOVE_CONTENT.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contentChecksum")
        private String contentChecksum;

        /**
         * The EventFingerprint associated with the content. This property is required when the work
         * request type is IMPORT_CONTENT or REMOVE_CONTENT.
         *
         * @param contentChecksum the value to set
         * @return this builder
         */
        public Builder contentChecksum(String contentChecksum) {
            this.contentChecksum = contentChecksum;
            this.__explicitlySet__.add("contentChecksum");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the original work request that is being retried.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retryOfId")
        private String retryOfId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the original work request that is being retried.
         *
         * @param retryOfId the value to set
         * @return this builder
         */
        public Builder retryOfId(String retryOfId) {
            this.retryOfId = retryOfId;
            this.__explicitlySet__.add("retryOfId");
            return this;
        }
        /** Indicates whether this work request is managed by the Autonomous Linux service. */
        @com.fasterxml.jackson.annotation.JsonProperty("retryIntervals")
        private java.util.List<Integer> retryIntervals;

        /**
         * Indicates whether this work request is managed by the Autonomous Linux service.
         *
         * @param retryIntervals the value to set
         * @return this builder
         */
        public Builder retryIntervals(java.util.List<Integer> retryIntervals) {
            this.retryIntervals = retryIntervals;
            this.__explicitlySet__.add("retryIntervals");
            return this;
        }
        /** Indicates whether this work request is managed by the Autonomous Linux service. */
        @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
        private Boolean isManagedByAutonomousLinux;

        /**
         * Indicates whether this work request is managed by the Autonomous Linux service.
         *
         * @param isManagedByAutonomousLinux the value to set
         * @return this builder
         */
        public Builder isManagedByAutonomousLinux(Boolean isManagedByAutonomousLinux) {
            this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            this.__explicitlySet__.add("isManagedByAutonomousLinux");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequest build() {
            WorkRequest model =
                    new WorkRequest(
                            this.operationType,
                            this.status,
                            this.id,
                            this.description,
                            this.displayName,
                            this.message,
                            this.parentId,
                            this.childrenId,
                            this.compartmentId,
                            this.resources,
                            this.packageNames,
                            this.windowsUpdateNames,
                            this.moduleSpecs,
                            this.percentComplete,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeStarted,
                            this.timeFinished,
                            this.initiatorId,
                            this.managementStation,
                            this.timeScheduled,
                            this.contentLocation,
                            this.eventId,
                            this.contentChecksum,
                            this.retryOfId,
                            this.retryIntervals,
                            this.isManagedByAutonomousLinux);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequest model) {
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
            }
            if (model.wasPropertyExplicitlySet("childrenId")) {
                this.childrenId(model.getChildrenId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
            }
            if (model.wasPropertyExplicitlySet("packageNames")) {
                this.packageNames(model.getPackageNames());
            }
            if (model.wasPropertyExplicitlySet("windowsUpdateNames")) {
                this.windowsUpdateNames(model.getWindowsUpdateNames());
            }
            if (model.wasPropertyExplicitlySet("moduleSpecs")) {
                this.moduleSpecs(model.getModuleSpecs());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("initiatorId")) {
                this.initiatorId(model.getInitiatorId());
            }
            if (model.wasPropertyExplicitlySet("managementStation")) {
                this.managementStation(model.getManagementStation());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("contentLocation")) {
                this.contentLocation(model.getContentLocation());
            }
            if (model.wasPropertyExplicitlySet("eventId")) {
                this.eventId(model.getEventId());
            }
            if (model.wasPropertyExplicitlySet("contentChecksum")) {
                this.contentChecksum(model.getContentChecksum());
            }
            if (model.wasPropertyExplicitlySet("retryOfId")) {
                this.retryOfId(model.getRetryOfId());
            }
            if (model.wasPropertyExplicitlySet("retryIntervals")) {
                this.retryIntervals(model.getRetryIntervals());
            }
            if (model.wasPropertyExplicitlySet("isManagedByAutonomousLinux")) {
                this.isManagedByAutonomousLinux(model.getIsManagedByAutonomousLinux());
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

    /** Type of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final WorkRequestOperationType operationType;

    /**
     * Type of the work request.
     *
     * @return the value
     */
    public WorkRequestOperationType getOperationType() {
        return operationType;
    }

    /** Status of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final OperationStatus status;

    /**
     * Status of the work request.
     *
     * @return the value
     */
    public OperationStatus getStatus() {
        return status;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the work request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the work request.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A short description about the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description about the work request.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** A short display name for the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A short display name for the work request.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A progress or error message, if there is any. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A progress or error message, if there is any.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** The OCID of the parent work request, if there is any. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * The OCID of the parent work request, if there is any.
     *
     * @return the value
     */
    public String getParentId() {
        return parentId;
    }

    /** The list of OCIDs for the child work requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("childrenId")
    private final java.util.List<String> childrenId;

    /**
     * The list of OCIDs for the child work requests.
     *
     * @return the value
     */
    public java.util.List<String> getChildrenId() {
        return childrenId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the work request. Work requests should be scoped to the same
     * compartment as the resource it affects. If the work request affects multiple resources the
     * different compartments, the services selects the compartment of the primary resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the work request. Work requests should be scoped to the same
     * compartment as the resource it affects. If the work request affects multiple resources the
     * different compartments, the services selects the compartment of the primary resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The list of
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * resources affected by the work request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<WorkRequestResource> resources;

    /**
     * The list of
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * resources affected by the work request.
     *
     * @return the value
     */
    public java.util.List<WorkRequestResource> getResources() {
        return resources;
    }

    /** A list of package names to be installed, updated, or removed. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
    private final java.util.List<String> packageNames;

    /**
     * A list of package names to be installed, updated, or removed.
     *
     * @return the value
     */
    public java.util.List<String> getPackageNames() {
        return packageNames;
    }

    /**
     * The UUIDs of the target Windows update (only used when operation type is
     * INSTALL_WINDOWS_UPDATES).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("windowsUpdateNames")
    private final java.util.List<String> windowsUpdateNames;

    /**
     * The UUIDs of the target Windows update (only used when operation type is
     * INSTALL_WINDOWS_UPDATES).
     *
     * @return the value
     */
    public java.util.List<String> getWindowsUpdateNames() {
        return windowsUpdateNames;
    }

    /** The list of appstream modules being operated on. */
    @com.fasterxml.jackson.annotation.JsonProperty("moduleSpecs")
    private final java.util.List<ModuleSpecDetails> moduleSpecs;

    /**
     * The list of appstream modules being operated on.
     *
     * @return the value
     */
    public java.util.List<ModuleSpecDetails> getModuleSpecs() {
        return moduleSpecs;
    }

    /** The percentage complete of the operation tracked by this work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Float percentComplete;

    /**
     * The percentage complete of the operation tracked by this work request.
     *
     * @return the value
     */
    public Float getPercentComplete() {
        return percentComplete;
    }

    /**
     * The date and time the work request was created (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the work request was created (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the work request started (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the work request started (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time the work request started (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the work request started (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the work request completed (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the work request completed (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resource that initiated the work request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initiatorId")
    private final String initiatorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resource that initiated the work request.
     *
     * @return the value
     */
    public String getInitiatorId() {
        return initiatorId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("managementStation")
    private final WorkRequestManagementStationDetails managementStation;

    public WorkRequestManagementStationDetails getManagementStation() {
        return managementStation;
    }

    /**
     * The scheduled date and time to retry the work request (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The scheduled date and time to retry the work request (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * The location of the bundle in the filesystem of the resource associated to this work request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentLocation")
    private final String contentLocation;

    /**
     * The location of the bundle in the filesystem of the resource associated to this work request.
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * The event id of the content. This property is required when the work request type is
     * IMPORT_CONTENT or REMOVE_CONTENT.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventId")
    private final String eventId;

    /**
     * The event id of the content. This property is required when the work request type is
     * IMPORT_CONTENT or REMOVE_CONTENT.
     *
     * @return the value
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * The EventFingerprint associated with the content. This property is required when the work
     * request type is IMPORT_CONTENT or REMOVE_CONTENT.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentChecksum")
    private final String contentChecksum;

    /**
     * The EventFingerprint associated with the content. This property is required when the work
     * request type is IMPORT_CONTENT or REMOVE_CONTENT.
     *
     * @return the value
     */
    public String getContentChecksum() {
        return contentChecksum;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the original work request that is being retried.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retryOfId")
    private final String retryOfId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the original work request that is being retried.
     *
     * @return the value
     */
    public String getRetryOfId() {
        return retryOfId;
    }

    /** Indicates whether this work request is managed by the Autonomous Linux service. */
    @com.fasterxml.jackson.annotation.JsonProperty("retryIntervals")
    private final java.util.List<Integer> retryIntervals;

    /**
     * Indicates whether this work request is managed by the Autonomous Linux service.
     *
     * @return the value
     */
    public java.util.List<Integer> getRetryIntervals() {
        return retryIntervals;
    }

    /** Indicates whether this work request is managed by the Autonomous Linux service. */
    @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
    private final Boolean isManagedByAutonomousLinux;

    /**
     * Indicates whether this work request is managed by the Autonomous Linux service.
     *
     * @return the value
     */
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
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
        sb.append("WorkRequest(");
        sb.append("super=").append(super.toString());
        sb.append("operationType=").append(String.valueOf(this.operationType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", childrenId=").append(String.valueOf(this.childrenId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", packageNames=").append(String.valueOf(this.packageNames));
        sb.append(", windowsUpdateNames=").append(String.valueOf(this.windowsUpdateNames));
        sb.append(", moduleSpecs=").append(String.valueOf(this.moduleSpecs));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", initiatorId=").append(String.valueOf(this.initiatorId));
        sb.append(", managementStation=").append(String.valueOf(this.managementStation));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", contentLocation=").append(String.valueOf(this.contentLocation));
        sb.append(", eventId=").append(String.valueOf(this.eventId));
        sb.append(", contentChecksum=").append(String.valueOf(this.contentChecksum));
        sb.append(", retryOfId=").append(String.valueOf(this.retryOfId));
        sb.append(", retryIntervals=").append(String.valueOf(this.retryIntervals));
        sb.append(", isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequest)) {
            return false;
        }

        WorkRequest other = (WorkRequest) o;
        return java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.childrenId, other.childrenId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.packageNames, other.packageNames)
                && java.util.Objects.equals(this.windowsUpdateNames, other.windowsUpdateNames)
                && java.util.Objects.equals(this.moduleSpecs, other.moduleSpecs)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.initiatorId, other.initiatorId)
                && java.util.Objects.equals(this.managementStation, other.managementStation)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.eventId, other.eventId)
                && java.util.Objects.equals(this.contentChecksum, other.contentChecksum)
                && java.util.Objects.equals(this.retryOfId, other.retryOfId)
                && java.util.Objects.equals(this.retryIntervals, other.retryIntervals)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.childrenId == null ? 43 : this.childrenId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + (this.packageNames == null ? 43 : this.packageNames.hashCode());
        result =
                (result * PRIME)
                        + (this.windowsUpdateNames == null
                                ? 43
                                : this.windowsUpdateNames.hashCode());
        result = (result * PRIME) + (this.moduleSpecs == null ? 43 : this.moduleSpecs.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.initiatorId == null ? 43 : this.initiatorId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementStation == null ? 43 : this.managementStation.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.eventId == null ? 43 : this.eventId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentChecksum == null ? 43 : this.contentChecksum.hashCode());
        result = (result * PRIME) + (this.retryOfId == null ? 43 : this.retryOfId.hashCode());
        result =
                (result * PRIME)
                        + (this.retryIntervals == null ? 43 : this.retryIntervals.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
