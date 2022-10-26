/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Details of the operator control assignment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OperatorControlAssignmentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OperatorControlAssignmentSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "operatorControlId",
        "resourceId",
        "compartmentId",
        "resourceType",
        "timeAssignmentFrom",
        "timeAssignmentTo",
        "isEnforcedAlways",
        "timeOfAssignment",
        "errorCode",
        "errorMessage",
        "isLogForwarded",
        "remoteSyslogServerAddress",
        "remoteSyslogServerPort",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags"
    })
    public OperatorControlAssignmentSummary(
            String id,
            String operatorControlId,
            String resourceId,
            String compartmentId,
            ResourceTypes resourceType,
            java.util.Date timeAssignmentFrom,
            java.util.Date timeAssignmentTo,
            Boolean isEnforcedAlways,
            java.util.Date timeOfAssignment,
            Integer errorCode,
            String errorMessage,
            Boolean isLogForwarded,
            String remoteSyslogServerAddress,
            Integer remoteSyslogServerPort,
            OperatorControlAssignmentLifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.operatorControlId = operatorControlId;
        this.resourceId = resourceId;
        this.compartmentId = compartmentId;
        this.resourceType = resourceType;
        this.timeAssignmentFrom = timeAssignmentFrom;
        this.timeAssignmentTo = timeAssignmentTo;
        this.isEnforcedAlways = isEnforcedAlways;
        this.timeOfAssignment = timeOfAssignment;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.isLogForwarded = isLogForwarded;
        this.remoteSyslogServerAddress = remoteSyslogServerAddress;
        this.remoteSyslogServerPort = remoteSyslogServerPort;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the operator control assignment. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the operator control assignment.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the operator control. */
        @com.fasterxml.jackson.annotation.JsonProperty("operatorControlId")
        private String operatorControlId;

        /**
         * The OCID of the operator control.
         *
         * @param operatorControlId the value to set
         * @return this builder
         */
        public Builder operatorControlId(String operatorControlId) {
            this.operatorControlId = operatorControlId;
            this.__explicitlySet__.add("operatorControlId");
            return this;
        }
        /** The OCID of the target resource being governed by the operator control. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the target resource being governed by the operator control.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** The OCID of the compartment that contains the operator control assignment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the operator control assignment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** resourceType for which the OperatorControlAssignment is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        /**
         * resourceType for which the OperatorControlAssignment is applicable
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The time at which the target resource will be brought under the governance of the
         * operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentFrom")
        private java.util.Date timeAssignmentFrom;

        /**
         * The time at which the target resource will be brought under the governance of the
         * operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeAssignmentFrom the value to set
         * @return this builder
         */
        public Builder timeAssignmentFrom(java.util.Date timeAssignmentFrom) {
            this.timeAssignmentFrom = timeAssignmentFrom;
            this.__explicitlySet__.add("timeAssignmentFrom");
            return this;
        }
        /**
         * The time at which the target resource will leave the governance of the operator control
         * in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentTo")
        private java.util.Date timeAssignmentTo;

        /**
         * The time at which the target resource will leave the governance of the operator control
         * in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeAssignmentTo the value to set
         * @return this builder
         */
        public Builder timeAssignmentTo(java.util.Date timeAssignmentTo) {
            this.timeAssignmentTo = timeAssignmentTo;
            this.__explicitlySet__.add("timeAssignmentTo");
            return this;
        }
        /**
         * If true, then the target resource is always governed by the operator control. Otherwise
         * governance is time-based as specified by timeAssignmentTo and timeAssignmentFrom.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
        private Boolean isEnforcedAlways;

        /**
         * If true, then the target resource is always governed by the operator control. Otherwise
         * governance is time-based as specified by timeAssignmentTo and timeAssignmentFrom.
         *
         * @param isEnforcedAlways the value to set
         * @return this builder
         */
        public Builder isEnforcedAlways(Boolean isEnforcedAlways) {
            this.isEnforcedAlways = isEnforcedAlways;
            this.__explicitlySet__.add("isEnforcedAlways");
            return this;
        }
        /**
         * Time when the operator control assignment is created in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAssignment")
        private java.util.Date timeOfAssignment;

        /**
         * Time when the operator control assignment is created in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfAssignment the value to set
         * @return this builder
         */
        public Builder timeOfAssignment(java.util.Date timeOfAssignment) {
            this.timeOfAssignment = timeOfAssignment;
            this.__explicitlySet__.add("timeOfAssignment");
            return this;
        }
        /** The code identifying the error occurred during Assignment operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private Integer errorCode;

        /**
         * The code identifying the error occurred during Assignment operation.
         *
         * @param errorCode the value to set
         * @return this builder
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }
        /** The message describing the error occurred during Assignment operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * The message describing the error occurred during Assignment operation.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /** If set, then the audit logs are being forwarded to the relevant remote logging server */
        @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
        private Boolean isLogForwarded;

        /**
         * If set, then the audit logs are being forwarded to the relevant remote logging server
         *
         * @param isLogForwarded the value to set
         * @return this builder
         */
        public Builder isLogForwarded(Boolean isLogForwarded) {
            this.isLogForwarded = isLogForwarded;
            this.__explicitlySet__.add("isLogForwarded");
            return this;
        }
        /**
         * The address of the remote syslog server where the audit logs are being forwarded to.
         * Address in host or IP format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
        private String remoteSyslogServerAddress;

        /**
         * The address of the remote syslog server where the audit logs are being forwarded to.
         * Address in host or IP format.
         *
         * @param remoteSyslogServerAddress the value to set
         * @return this builder
         */
        public Builder remoteSyslogServerAddress(String remoteSyslogServerAddress) {
            this.remoteSyslogServerAddress = remoteSyslogServerAddress;
            this.__explicitlySet__.add("remoteSyslogServerAddress");
            return this;
        }
        /** The listening port of the remote syslog server. The port range is 0 - 65535. */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
        private Integer remoteSyslogServerPort;

        /**
         * The listening port of the remote syslog server. The port range is 0 - 65535.
         *
         * @param remoteSyslogServerPort the value to set
         * @return this builder
         */
        public Builder remoteSyslogServerPort(Integer remoteSyslogServerPort) {
            this.remoteSyslogServerPort = remoteSyslogServerPort;
            this.__explicitlySet__.add("remoteSyslogServerPort");
            return this;
        }
        /** The current lifcycle state of the OperatorControl. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperatorControlAssignmentLifecycleStates lifecycleState;

        /**
         * The current lifcycle state of the OperatorControl.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OperatorControlAssignmentLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** More in detail about the lifeCycleState. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * More in detail about the lifeCycleState.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only.
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /** Defined tags for this resource. Each key is predefined and scoped to a namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperatorControlAssignmentSummary build() {
            OperatorControlAssignmentSummary model =
                    new OperatorControlAssignmentSummary(
                            this.id,
                            this.operatorControlId,
                            this.resourceId,
                            this.compartmentId,
                            this.resourceType,
                            this.timeAssignmentFrom,
                            this.timeAssignmentTo,
                            this.isEnforcedAlways,
                            this.timeOfAssignment,
                            this.errorCode,
                            this.errorMessage,
                            this.isLogForwarded,
                            this.remoteSyslogServerAddress,
                            this.remoteSyslogServerPort,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorControlAssignmentSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("operatorControlId")) {
                this.operatorControlId(model.getOperatorControlId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("timeAssignmentFrom")) {
                this.timeAssignmentFrom(model.getTimeAssignmentFrom());
            }
            if (model.wasPropertyExplicitlySet("timeAssignmentTo")) {
                this.timeAssignmentTo(model.getTimeAssignmentTo());
            }
            if (model.wasPropertyExplicitlySet("isEnforcedAlways")) {
                this.isEnforcedAlways(model.getIsEnforcedAlways());
            }
            if (model.wasPropertyExplicitlySet("timeOfAssignment")) {
                this.timeOfAssignment(model.getTimeOfAssignment());
            }
            if (model.wasPropertyExplicitlySet("errorCode")) {
                this.errorCode(model.getErrorCode());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("isLogForwarded")) {
                this.isLogForwarded(model.getIsLogForwarded());
            }
            if (model.wasPropertyExplicitlySet("remoteSyslogServerAddress")) {
                this.remoteSyslogServerAddress(model.getRemoteSyslogServerAddress());
            }
            if (model.wasPropertyExplicitlySet("remoteSyslogServerPort")) {
                this.remoteSyslogServerPort(model.getRemoteSyslogServerPort());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The OCID of the operator control assignment. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the operator control assignment.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the operator control. */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorControlId")
    private final String operatorControlId;

    /**
     * The OCID of the operator control.
     *
     * @return the value
     */
    public String getOperatorControlId() {
        return operatorControlId;
    }

    /** The OCID of the target resource being governed by the operator control. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the target resource being governed by the operator control.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** The OCID of the compartment that contains the operator control assignment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the operator control assignment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** resourceType for which the OperatorControlAssignment is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceTypes resourceType;

    /**
     * resourceType for which the OperatorControlAssignment is applicable
     *
     * @return the value
     */
    public ResourceTypes getResourceType() {
        return resourceType;
    }

    /**
     * The time at which the target resource will be brought under the governance of the operator
     * control in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentFrom")
    private final java.util.Date timeAssignmentFrom;

    /**
     * The time at which the target resource will be brought under the governance of the operator
     * control in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeAssignmentFrom() {
        return timeAssignmentFrom;
    }

    /**
     * The time at which the target resource will leave the governance of the operator control in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentTo")
    private final java.util.Date timeAssignmentTo;

    /**
     * The time at which the target resource will leave the governance of the operator control in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeAssignmentTo() {
        return timeAssignmentTo;
    }

    /**
     * If true, then the target resource is always governed by the operator control. Otherwise
     * governance is time-based as specified by timeAssignmentTo and timeAssignmentFrom.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
    private final Boolean isEnforcedAlways;

    /**
     * If true, then the target resource is always governed by the operator control. Otherwise
     * governance is time-based as specified by timeAssignmentTo and timeAssignmentFrom.
     *
     * @return the value
     */
    public Boolean getIsEnforcedAlways() {
        return isEnforcedAlways;
    }

    /**
     * Time when the operator control assignment is created in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAssignment")
    private final java.util.Date timeOfAssignment;

    /**
     * Time when the operator control assignment is created in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeOfAssignment() {
        return timeOfAssignment;
    }

    /** The code identifying the error occurred during Assignment operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final Integer errorCode;

    /**
     * The code identifying the error occurred during Assignment operation.
     *
     * @return the value
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /** The message describing the error occurred during Assignment operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * The message describing the error occurred during Assignment operation.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /** If set, then the audit logs are being forwarded to the relevant remote logging server */
    @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
    private final Boolean isLogForwarded;

    /**
     * If set, then the audit logs are being forwarded to the relevant remote logging server
     *
     * @return the value
     */
    public Boolean getIsLogForwarded() {
        return isLogForwarded;
    }

    /**
     * The address of the remote syslog server where the audit logs are being forwarded to. Address
     * in host or IP format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
    private final String remoteSyslogServerAddress;

    /**
     * The address of the remote syslog server where the audit logs are being forwarded to. Address
     * in host or IP format.
     *
     * @return the value
     */
    public String getRemoteSyslogServerAddress() {
        return remoteSyslogServerAddress;
    }

    /** The listening port of the remote syslog server. The port range is 0 - 65535. */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
    private final Integer remoteSyslogServerPort;

    /**
     * The listening port of the remote syslog server. The port range is 0 - 65535.
     *
     * @return the value
     */
    public Integer getRemoteSyslogServerPort() {
        return remoteSyslogServerPort;
    }

    /** The current lifcycle state of the OperatorControl. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OperatorControlAssignmentLifecycleStates lifecycleState;

    /**
     * The current lifcycle state of the OperatorControl.
     *
     * @return the value
     */
    public OperatorControlAssignmentLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** More in detail about the lifeCycleState. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * More in detail about the lifeCycleState.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /** Defined tags for this resource. Each key is predefined and scoped to a namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("OperatorControlAssignmentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", operatorControlId=").append(String.valueOf(this.operatorControlId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", timeAssignmentFrom=").append(String.valueOf(this.timeAssignmentFrom));
        sb.append(", timeAssignmentTo=").append(String.valueOf(this.timeAssignmentTo));
        sb.append(", isEnforcedAlways=").append(String.valueOf(this.isEnforcedAlways));
        sb.append(", timeOfAssignment=").append(String.valueOf(this.timeOfAssignment));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", isLogForwarded=").append(String.valueOf(this.isLogForwarded));
        sb.append(", remoteSyslogServerAddress=")
                .append(String.valueOf(this.remoteSyslogServerAddress));
        sb.append(", remoteSyslogServerPort=").append(String.valueOf(this.remoteSyslogServerPort));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperatorControlAssignmentSummary)) {
            return false;
        }

        OperatorControlAssignmentSummary other = (OperatorControlAssignmentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.operatorControlId, other.operatorControlId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.timeAssignmentFrom, other.timeAssignmentFrom)
                && java.util.Objects.equals(this.timeAssignmentTo, other.timeAssignmentTo)
                && java.util.Objects.equals(this.isEnforcedAlways, other.isEnforcedAlways)
                && java.util.Objects.equals(this.timeOfAssignment, other.timeOfAssignment)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.isLogForwarded, other.isLogForwarded)
                && java.util.Objects.equals(
                        this.remoteSyslogServerAddress, other.remoteSyslogServerAddress)
                && java.util.Objects.equals(
                        this.remoteSyslogServerPort, other.remoteSyslogServerPort)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
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
                        + (this.timeOfAssignment == null ? 43 : this.timeOfAssignment.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
