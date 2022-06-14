/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * An Operator Control Assignment identifies the target resource that is placed under the governance of an Operator Control. Creating an Operator Control Assignment Assignment with a time duration ensures that
 * human accesses to the target resource will be governed by Operator Control for the duration specified.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OperatorControlAssignment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperatorControlAssignment {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "operatorControlId",
        "resourceId",
        "resourceName",
        "resourceCompartmentId",
        "compartmentId",
        "resourceType",
        "timeAssignmentFrom",
        "timeAssignmentTo",
        "isEnforcedAlways",
        "lifecycleState",
        "assignerId",
        "timeOfAssignment",
        "comment",
        "unassignerId",
        "timeOfDeletion",
        "detachmentDescription",
        "isLogForwarded",
        "remoteSyslogServerAddress",
        "remoteSyslogServerPort",
        "remoteSyslogServerCACert",
        "isAutoApproveDuringMaintenance",
        "errorCode",
        "errorMessage",
        "freeformTags",
        "definedTags"
    })
    public OperatorControlAssignment(
            String id,
            String operatorControlId,
            String resourceId,
            String resourceName,
            String resourceCompartmentId,
            String compartmentId,
            ResourceTypes resourceType,
            java.util.Date timeAssignmentFrom,
            java.util.Date timeAssignmentTo,
            Boolean isEnforcedAlways,
            OperatorControlAssignmentLifecycleStates lifecycleState,
            String assignerId,
            java.util.Date timeOfAssignment,
            String comment,
            String unassignerId,
            java.util.Date timeOfDeletion,
            String detachmentDescription,
            Boolean isLogForwarded,
            String remoteSyslogServerAddress,
            Integer remoteSyslogServerPort,
            String remoteSyslogServerCACert,
            Boolean isAutoApproveDuringMaintenance,
            Integer errorCode,
            String errorMessage,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.operatorControlId = operatorControlId;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceCompartmentId = resourceCompartmentId;
        this.compartmentId = compartmentId;
        this.resourceType = resourceType;
        this.timeAssignmentFrom = timeAssignmentFrom;
        this.timeAssignmentTo = timeAssignmentTo;
        this.isEnforcedAlways = isEnforcedAlways;
        this.lifecycleState = lifecycleState;
        this.assignerId = assignerId;
        this.timeOfAssignment = timeOfAssignment;
        this.comment = comment;
        this.unassignerId = unassignerId;
        this.timeOfDeletion = timeOfDeletion;
        this.detachmentDescription = detachmentDescription;
        this.isLogForwarded = isLogForwarded;
        this.remoteSyslogServerAddress = remoteSyslogServerAddress;
        this.remoteSyslogServerPort = remoteSyslogServerPort;
        this.remoteSyslogServerCACert = remoteSyslogServerCACert;
        this.isAutoApproveDuringMaintenance = isAutoApproveDuringMaintenance;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the operator control assignment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the operator control assignment.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatorControlId")
        private String operatorControlId;

        /**
         * The OCID of the operator control.
         * @param operatorControlId the value to set
         * @return this builder
         **/
        public Builder operatorControlId(String operatorControlId) {
            this.operatorControlId = operatorControlId;
            this.__explicitlySet__.add("operatorControlId");
            return this;
        }
        /**
         * The OCID of the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the target resource.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * Name of the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * Name of the target resource.
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The OCID of the compartment that contains the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
        private String resourceCompartmentId;

        /**
         * The OCID of the compartment that contains the target resource.
         * @param resourceCompartmentId the value to set
         * @return this builder
         **/
        public Builder resourceCompartmentId(String resourceCompartmentId) {
            this.resourceCompartmentId = resourceCompartmentId;
            this.__explicitlySet__.add("resourceCompartmentId");
            return this;
        }
        /**
         * The OCID of the comparment that contains the operator control assignment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the comparment that contains the operator control assignment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * resourceType for which the OperatorControlAssignment is applicable
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        /**
         * resourceType for which the OperatorControlAssignment is applicable
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The time at which the target resource will be brought under the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentFrom")
        private java.util.Date timeAssignmentFrom;

        /**
         * The time at which the target resource will be brought under the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeAssignmentFrom the value to set
         * @return this builder
         **/
        public Builder timeAssignmentFrom(java.util.Date timeAssignmentFrom) {
            this.timeAssignmentFrom = timeAssignmentFrom;
            this.__explicitlySet__.add("timeAssignmentFrom");
            return this;
        }
        /**
         * The time at which the target resource will leave the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentTo")
        private java.util.Date timeAssignmentTo;

        /**
         * The time at which the target resource will leave the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeAssignmentTo the value to set
         * @return this builder
         **/
        public Builder timeAssignmentTo(java.util.Date timeAssignmentTo) {
            this.timeAssignmentTo = timeAssignmentTo;
            this.__explicitlySet__.add("timeAssignmentTo");
            return this;
        }
        /**
         * If set, then the target resource is always governed by the operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
        private Boolean isEnforcedAlways;

        /**
         * If set, then the target resource is always governed by the operator control.
         * @param isEnforcedAlways the value to set
         * @return this builder
         **/
        public Builder isEnforcedAlways(Boolean isEnforcedAlways) {
            this.isEnforcedAlways = isEnforcedAlways;
            this.__explicitlySet__.add("isEnforcedAlways");
            return this;
        }
        /**
         * The current lifcycle state of the OperatorControl.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperatorControlAssignmentLifecycleStates lifecycleState;

        /**
         * The current lifcycle state of the OperatorControl.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(OperatorControlAssignmentLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The OCID of the user who created this operator control assignment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assignerId")
        private String assignerId;

        /**
         * The OCID of the user who created this operator control assignment.
         * @param assignerId the value to set
         * @return this builder
         **/
        public Builder assignerId(String assignerId) {
            this.assignerId = assignerId;
            this.__explicitlySet__.add("assignerId");
            return this;
        }
        /**
         * Time when the operator control assignment is created in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAssignment")
        private java.util.Date timeOfAssignment;

        /**
         * Time when the operator control assignment is created in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfAssignment the value to set
         * @return this builder
         **/
        public Builder timeOfAssignment(java.util.Date timeOfAssignment) {
            this.timeOfAssignment = timeOfAssignment;
            this.__explicitlySet__.add("timeOfAssignment");
            return this;
        }
        /**
         * Comment about the assignment of the operator control to this target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Comment about the assignment of the operator control to this target resource.
         * @param comment the value to set
         * @return this builder
         **/
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /**
         * User id who released the operatorControl.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unassignerId")
        private String unassignerId;

        /**
         * User id who released the operatorControl.
         * @param unassignerId the value to set
         * @return this builder
         **/
        public Builder unassignerId(String unassignerId) {
            this.unassignerId = unassignerId;
            this.__explicitlySet__.add("unassignerId");
            return this;
        }
        /**
         * Time on which the operator control assignment was deleted in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * Time on which the operator control assignment was deleted in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         **/
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /**
         * description containing reason for releasing of OperatorControl.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detachmentDescription")
        private String detachmentDescription;

        /**
         * description containing reason for releasing of OperatorControl.
         * @param detachmentDescription the value to set
         * @return this builder
         **/
        public Builder detachmentDescription(String detachmentDescription) {
            this.detachmentDescription = detachmentDescription;
            this.__explicitlySet__.add("detachmentDescription");
            return this;
        }
        /**
         * If set indicates that the audit logs are being forwarded to the relevant remote logging server
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
        private Boolean isLogForwarded;

        /**
         * If set indicates that the audit logs are being forwarded to the relevant remote logging server
         * @param isLogForwarded the value to set
         * @return this builder
         **/
        public Builder isLogForwarded(Boolean isLogForwarded) {
            this.isLogForwarded = isLogForwarded;
            this.__explicitlySet__.add("isLogForwarded");
            return this;
        }
        /**
         * The address of the remote syslog server where the audit logs are being forwarded to. Address in host or IP format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
        private String remoteSyslogServerAddress;

        /**
         * The address of the remote syslog server where the audit logs are being forwarded to. Address in host or IP format.
         * @param remoteSyslogServerAddress the value to set
         * @return this builder
         **/
        public Builder remoteSyslogServerAddress(String remoteSyslogServerAddress) {
            this.remoteSyslogServerAddress = remoteSyslogServerAddress;
            this.__explicitlySet__.add("remoteSyslogServerAddress");
            return this;
        }
        /**
         * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP supported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
        private Integer remoteSyslogServerPort;

        /**
         * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP supported.
         * @param remoteSyslogServerPort the value to set
         * @return this builder
         **/
        public Builder remoteSyslogServerPort(Integer remoteSyslogServerPort) {
            this.remoteSyslogServerPort = remoteSyslogServerPort;
            this.__explicitlySet__.add("remoteSyslogServerPort");
            return this;
        }
        /**
         * The CA certificate of the remote syslog server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerCACert")
        private String remoteSyslogServerCACert;

        /**
         * The CA certificate of the remote syslog server.
         * @param remoteSyslogServerCACert the value to set
         * @return this builder
         **/
        public Builder remoteSyslogServerCACert(String remoteSyslogServerCACert) {
            this.remoteSyslogServerCACert = remoteSyslogServerCACert;
            this.__explicitlySet__.add("remoteSyslogServerCACert");
            return this;
        }
        /**
         * The boolean if true would autoApprove during maintenance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
        private Boolean isAutoApproveDuringMaintenance;

        /**
         * The boolean if true would autoApprove during maintenance.
         * @param isAutoApproveDuringMaintenance the value to set
         * @return this builder
         **/
        public Builder isAutoApproveDuringMaintenance(Boolean isAutoApproveDuringMaintenance) {
            this.isAutoApproveDuringMaintenance = isAutoApproveDuringMaintenance;
            this.__explicitlySet__.add("isAutoApproveDuringMaintenance");
            return this;
        }
        /**
         * The code identifying the error occurred during Assignment operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private Integer errorCode;

        /**
         * The code identifying the error occurred during Assignment operation.
         * @param errorCode the value to set
         * @return this builder
         **/
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }
        /**
         * The message describing the error occurred during Assignment operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * The message describing the error occurred during Assignment operation.
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
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
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperatorControlAssignment build() {
            OperatorControlAssignment __instance__ =
                    new OperatorControlAssignment(
                            id,
                            operatorControlId,
                            resourceId,
                            resourceName,
                            resourceCompartmentId,
                            compartmentId,
                            resourceType,
                            timeAssignmentFrom,
                            timeAssignmentTo,
                            isEnforcedAlways,
                            lifecycleState,
                            assignerId,
                            timeOfAssignment,
                            comment,
                            unassignerId,
                            timeOfDeletion,
                            detachmentDescription,
                            isLogForwarded,
                            remoteSyslogServerAddress,
                            remoteSyslogServerPort,
                            remoteSyslogServerCACert,
                            isAutoApproveDuringMaintenance,
                            errorCode,
                            errorMessage,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorControlAssignment o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .operatorControlId(o.getOperatorControlId())
                            .resourceId(o.getResourceId())
                            .resourceName(o.getResourceName())
                            .resourceCompartmentId(o.getResourceCompartmentId())
                            .compartmentId(o.getCompartmentId())
                            .resourceType(o.getResourceType())
                            .timeAssignmentFrom(o.getTimeAssignmentFrom())
                            .timeAssignmentTo(o.getTimeAssignmentTo())
                            .isEnforcedAlways(o.getIsEnforcedAlways())
                            .lifecycleState(o.getLifecycleState())
                            .assignerId(o.getAssignerId())
                            .timeOfAssignment(o.getTimeOfAssignment())
                            .comment(o.getComment())
                            .unassignerId(o.getUnassignerId())
                            .timeOfDeletion(o.getTimeOfDeletion())
                            .detachmentDescription(o.getDetachmentDescription())
                            .isLogForwarded(o.getIsLogForwarded())
                            .remoteSyslogServerAddress(o.getRemoteSyslogServerAddress())
                            .remoteSyslogServerPort(o.getRemoteSyslogServerPort())
                            .remoteSyslogServerCACert(o.getRemoteSyslogServerCACert())
                            .isAutoApproveDuringMaintenance(o.getIsAutoApproveDuringMaintenance())
                            .errorCode(o.getErrorCode())
                            .errorMessage(o.getErrorMessage())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The OCID of the operator control assignment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the operator control assignment.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatorControlId")
    private final String operatorControlId;

    /**
     * The OCID of the operator control.
     * @return the value
     **/
    public String getOperatorControlId() {
        return operatorControlId;
    }

    /**
     * The OCID of the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the target resource.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Name of the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * Name of the target resource.
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The OCID of the compartment that contains the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
    private final String resourceCompartmentId;

    /**
     * The OCID of the compartment that contains the target resource.
     * @return the value
     **/
    public String getResourceCompartmentId() {
        return resourceCompartmentId;
    }

    /**
     * The OCID of the comparment that contains the operator control assignment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the comparment that contains the operator control assignment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * resourceType for which the OperatorControlAssignment is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceTypes resourceType;

    /**
     * resourceType for which the OperatorControlAssignment is applicable
     * @return the value
     **/
    public ResourceTypes getResourceType() {
        return resourceType;
    }

    /**
     * The time at which the target resource will be brought under the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentFrom")
    private final java.util.Date timeAssignmentFrom;

    /**
     * The time at which the target resource will be brought under the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeAssignmentFrom() {
        return timeAssignmentFrom;
    }

    /**
     * The time at which the target resource will leave the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentTo")
    private final java.util.Date timeAssignmentTo;

    /**
     * The time at which the target resource will leave the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeAssignmentTo() {
        return timeAssignmentTo;
    }

    /**
     * If set, then the target resource is always governed by the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
    private final Boolean isEnforcedAlways;

    /**
     * If set, then the target resource is always governed by the operator control.
     * @return the value
     **/
    public Boolean getIsEnforcedAlways() {
        return isEnforcedAlways;
    }

    /**
     * The current lifcycle state of the OperatorControl.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OperatorControlAssignmentLifecycleStates lifecycleState;

    /**
     * The current lifcycle state of the OperatorControl.
     * @return the value
     **/
    public OperatorControlAssignmentLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The OCID of the user who created this operator control assignment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignerId")
    private final String assignerId;

    /**
     * The OCID of the user who created this operator control assignment.
     * @return the value
     **/
    public String getAssignerId() {
        return assignerId;
    }

    /**
     * Time when the operator control assignment is created in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAssignment")
    private final java.util.Date timeOfAssignment;

    /**
     * Time when the operator control assignment is created in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfAssignment() {
        return timeOfAssignment;
    }

    /**
     * Comment about the assignment of the operator control to this target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Comment about the assignment of the operator control to this target resource.
     * @return the value
     **/
    public String getComment() {
        return comment;
    }

    /**
     * User id who released the operatorControl.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unassignerId")
    private final String unassignerId;

    /**
     * User id who released the operatorControl.
     * @return the value
     **/
    public String getUnassignerId() {
        return unassignerId;
    }

    /**
     * Time on which the operator control assignment was deleted in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * Time on which the operator control assignment was deleted in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /**
     * description containing reason for releasing of OperatorControl.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detachmentDescription")
    private final String detachmentDescription;

    /**
     * description containing reason for releasing of OperatorControl.
     * @return the value
     **/
    public String getDetachmentDescription() {
        return detachmentDescription;
    }

    /**
     * If set indicates that the audit logs are being forwarded to the relevant remote logging server
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
    private final Boolean isLogForwarded;

    /**
     * If set indicates that the audit logs are being forwarded to the relevant remote logging server
     * @return the value
     **/
    public Boolean getIsLogForwarded() {
        return isLogForwarded;
    }

    /**
     * The address of the remote syslog server where the audit logs are being forwarded to. Address in host or IP format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
    private final String remoteSyslogServerAddress;

    /**
     * The address of the remote syslog server where the audit logs are being forwarded to. Address in host or IP format.
     * @return the value
     **/
    public String getRemoteSyslogServerAddress() {
        return remoteSyslogServerAddress;
    }

    /**
     * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
    private final Integer remoteSyslogServerPort;

    /**
     * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP supported.
     * @return the value
     **/
    public Integer getRemoteSyslogServerPort() {
        return remoteSyslogServerPort;
    }

    /**
     * The CA certificate of the remote syslog server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerCACert")
    private final String remoteSyslogServerCACert;

    /**
     * The CA certificate of the remote syslog server.
     * @return the value
     **/
    public String getRemoteSyslogServerCACert() {
        return remoteSyslogServerCACert;
    }

    /**
     * The boolean if true would autoApprove during maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
    private final Boolean isAutoApproveDuringMaintenance;

    /**
     * The boolean if true would autoApprove during maintenance.
     * @return the value
     **/
    public Boolean getIsAutoApproveDuringMaintenance() {
        return isAutoApproveDuringMaintenance;
    }

    /**
     * The code identifying the error occurred during Assignment operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final Integer errorCode;

    /**
     * The code identifying the error occurred during Assignment operation.
     * @return the value
     **/
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * The message describing the error occurred during Assignment operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * The message describing the error occurred during Assignment operation.
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OperatorControlAssignment(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", operatorControlId=").append(String.valueOf(this.operatorControlId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceCompartmentId=").append(String.valueOf(this.resourceCompartmentId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", timeAssignmentFrom=").append(String.valueOf(this.timeAssignmentFrom));
        sb.append(", timeAssignmentTo=").append(String.valueOf(this.timeAssignmentTo));
        sb.append(", isEnforcedAlways=").append(String.valueOf(this.isEnforcedAlways));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", assignerId=").append(String.valueOf(this.assignerId));
        sb.append(", timeOfAssignment=").append(String.valueOf(this.timeOfAssignment));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", unassignerId=").append(String.valueOf(this.unassignerId));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", detachmentDescription=").append(String.valueOf(this.detachmentDescription));
        sb.append(", isLogForwarded=").append(String.valueOf(this.isLogForwarded));
        sb.append(", remoteSyslogServerAddress=")
                .append(String.valueOf(this.remoteSyslogServerAddress));
        sb.append(", remoteSyslogServerPort=").append(String.valueOf(this.remoteSyslogServerPort));
        sb.append(", remoteSyslogServerCACert=")
                .append(String.valueOf(this.remoteSyslogServerCACert));
        sb.append(", isAutoApproveDuringMaintenance=")
                .append(String.valueOf(this.isAutoApproveDuringMaintenance));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperatorControlAssignment)) {
            return false;
        }

        OperatorControlAssignment other = (OperatorControlAssignment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.operatorControlId, other.operatorControlId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceCompartmentId, other.resourceCompartmentId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.timeAssignmentFrom, other.timeAssignmentFrom)
                && java.util.Objects.equals(this.timeAssignmentTo, other.timeAssignmentTo)
                && java.util.Objects.equals(this.isEnforcedAlways, other.isEnforcedAlways)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.assignerId, other.assignerId)
                && java.util.Objects.equals(this.timeOfAssignment, other.timeOfAssignment)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.unassignerId, other.unassignerId)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.detachmentDescription, other.detachmentDescription)
                && java.util.Objects.equals(this.isLogForwarded, other.isLogForwarded)
                && java.util.Objects.equals(
                        this.remoteSyslogServerAddress, other.remoteSyslogServerAddress)
                && java.util.Objects.equals(
                        this.remoteSyslogServerPort, other.remoteSyslogServerPort)
                && java.util.Objects.equals(
                        this.remoteSyslogServerCACert, other.remoteSyslogServerCACert)
                && java.util.Objects.equals(
                        this.isAutoApproveDuringMaintenance, other.isAutoApproveDuringMaintenance)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.operatorControlId == null ? 43 : this.operatorControlId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCompartmentId == null
                                ? 43
                                : this.resourceCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAssignmentFrom == null
                                ? 43
                                : this.timeAssignmentFrom.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAssignmentTo == null ? 43 : this.timeAssignmentTo.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnforcedAlways == null ? 43 : this.isEnforcedAlways.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.assignerId == null ? 43 : this.assignerId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfAssignment == null ? 43 : this.timeOfAssignment.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.unassignerId == null ? 43 : this.unassignerId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result =
                (result * PRIME)
                        + (this.detachmentDescription == null
                                ? 43
                                : this.detachmentDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.isLogForwarded == null ? 43 : this.isLogForwarded.hashCode());
        result =
                (result * PRIME)
                        + (this.remoteSyslogServerAddress == null
                                ? 43
                                : this.remoteSyslogServerAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.remoteSyslogServerPort == null
                                ? 43
                                : this.remoteSyslogServerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.remoteSyslogServerCACert == null
                                ? 43
                                : this.remoteSyslogServerCACert.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoApproveDuringMaintenance == null
                                ? 43
                                : this.isAutoApproveDuringMaintenance.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
