/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Describes a work request. <br>
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
        "moduleSpecs",
        "percentComplete",
        "timeCreated",
        "timeUpdated",
        "timeStarted",
        "timeFinished",
        "initiatorId",
        "managementStation"
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
            java.util.List<ModuleSpecDetails> moduleSpecs,
            Float percentComplete,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            String initiatorId,
            WorkRequestManagementStationDetails managementStation) {
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
        this.moduleSpecs = moduleSpecs;
        this.percentComplete = percentComplete;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.initiatorId = initiatorId;
        this.managementStation = managementStation;
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
        /** The OCID of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the work request.
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
         * The OCID of the compartment that contains the work request. Work requests should be
         * scoped to the same compartment as the resource it affects. If the work request affects
         * multiple resources, and those resources are not in the same compartment, it is up to the
         * service team to pick the primary resource whose compartment should be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the work request. Work requests should be
         * scoped to the same compartment as the resource it affects. If the work request affects
         * multiple resources, and those resources are not in the same compartment, it is up to the
         * service team to pick the primary resource whose compartment should be used.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The list of OCIDs for the resources affected by the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<WorkRequestResource> resources;

        /**
         * The list of OCIDs for the resources affected by the work request.
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<WorkRequestResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /** A list of package names to be installed/updated/removed. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
        private java.util.List<String> packageNames;

        /**
         * A list of package names to be installed/updated/removed.
         *
         * @param packageNames the value to set
         * @return this builder
         */
        public Builder packageNames(java.util.List<String> packageNames) {
            this.packageNames = packageNames;
            this.__explicitlySet__.add("packageNames");
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
         * The date and time the work request was created - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the work request was created - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
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
         * The date and time the work request was created - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the work request was created - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
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
         * The date and time the work request was started - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the work request was started - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
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
         * The date and time the work request was finished - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the work request was finished - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** The OCID of the resource that initiated the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("initiatorId")
        private String initiatorId;

        /**
         * The OCID of the resource that initiated the work request.
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
                            this.moduleSpecs,
                            this.percentComplete,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeStarted,
                            this.timeFinished,
                            this.initiatorId,
                            this.managementStation);
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

    /** The OCID of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the work request.
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
     * The OCID of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource it affects. If the work request affects multiple
     * resources, and those resources are not in the same compartment, it is up to the service team
     * to pick the primary resource whose compartment should be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource it affects. If the work request affects multiple
     * resources, and those resources are not in the same compartment, it is up to the service team
     * to pick the primary resource whose compartment should be used.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The list of OCIDs for the resources affected by the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<WorkRequestResource> resources;

    /**
     * The list of OCIDs for the resources affected by the work request.
     *
     * @return the value
     */
    public java.util.List<WorkRequestResource> getResources() {
        return resources;
    }

    /** A list of package names to be installed/updated/removed. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
    private final java.util.List<String> packageNames;

    /**
     * A list of package names to be installed/updated/removed.
     *
     * @return the value
     */
    public java.util.List<String> getPackageNames() {
        return packageNames;
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
     * The date and time the work request was created - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the work request was created - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the work request was created - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the work request was created - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time the work request was started - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the work request was started - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the work request was finished - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the work request was finished - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** The OCID of the resource that initiated the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("initiatorId")
    private final String initiatorId;

    /**
     * The OCID of the resource that initiated the work request.
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
        sb.append(", moduleSpecs=").append(String.valueOf(this.moduleSpecs));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", initiatorId=").append(String.valueOf(this.initiatorId));
        sb.append(", managementStation=").append(String.valueOf(this.managementStation));
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
                && java.util.Objects.equals(this.moduleSpecs, other.moduleSpecs)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.initiatorId, other.initiatorId)
                && java.util.Objects.equals(this.managementStation, other.managementStation)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
