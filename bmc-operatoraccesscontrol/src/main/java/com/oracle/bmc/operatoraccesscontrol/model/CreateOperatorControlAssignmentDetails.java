/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Details of the Operator Control assignment. An Operator Control Assignment identifies the target
 * resource that is placed under the governance of an Operator Control. Creating an Operator Control
 * Assignment Assignment with a time duration ensures that human accesses to the target resource
 * will be governed by Operator Control for the duration specified. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOperatorControlAssignmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOperatorControlAssignmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operatorControlId",
        "resourceId",
        "resourceName",
        "resourceType",
        "resourceCompartmentId",
        "timeAssignmentFrom",
        "timeAssignmentTo",
        "compartmentId",
        "isEnforcedAlways",
        "comment",
        "isLogForwarded",
        "remoteSyslogServerAddress",
        "remoteSyslogServerPort",
        "remoteSyslogServerCACert",
        "isHypervisorLogForwarded",
        "isAutoApproveDuringMaintenance",
        "freeformTags",
        "definedTags"
    })
    public CreateOperatorControlAssignmentDetails(
            String operatorControlId,
            String resourceId,
            String resourceName,
            ResourceTypes resourceType,
            String resourceCompartmentId,
            java.util.Date timeAssignmentFrom,
            java.util.Date timeAssignmentTo,
            String compartmentId,
            Boolean isEnforcedAlways,
            String comment,
            Boolean isLogForwarded,
            String remoteSyslogServerAddress,
            Integer remoteSyslogServerPort,
            String remoteSyslogServerCACert,
            Boolean isHypervisorLogForwarded,
            Boolean isAutoApproveDuringMaintenance,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.operatorControlId = operatorControlId;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.resourceCompartmentId = resourceCompartmentId;
        this.timeAssignmentFrom = timeAssignmentFrom;
        this.timeAssignmentTo = timeAssignmentTo;
        this.compartmentId = compartmentId;
        this.isEnforcedAlways = isEnforcedAlways;
        this.comment = comment;
        this.isLogForwarded = isLogForwarded;
        this.remoteSyslogServerAddress = remoteSyslogServerAddress;
        this.remoteSyslogServerPort = remoteSyslogServerPort;
        this.remoteSyslogServerCACert = remoteSyslogServerCACert;
        this.isHypervisorLogForwarded = isHypervisorLogForwarded;
        this.isAutoApproveDuringMaintenance = isAutoApproveDuringMaintenance;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the operator control that is being assigned to a target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("operatorControlId")
        private String operatorControlId;

        /**
         * The OCID of the operator control that is being assigned to a target resource.
         *
         * @param operatorControlId the value to set
         * @return this builder
         */
        public Builder operatorControlId(String operatorControlId) {
            this.operatorControlId = operatorControlId;
            this.__explicitlySet__.add("operatorControlId");
            return this;
        }
        /**
         * The OCID of the target resource being brought under the governance of the operator
         * control.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the target resource being brought under the governance of the operator
         * control.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Name of the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * Name of the target resource.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** Type of the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        /**
         * Type of the target resource.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** The OCID of the compartment that contains the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
        private String resourceCompartmentId;

        /**
         * The OCID of the compartment that contains the target resource.
         *
         * @param resourceCompartmentId the value to set
         * @return this builder
         */
        public Builder resourceCompartmentId(String resourceCompartmentId) {
            this.resourceCompartmentId = resourceCompartmentId;
            this.__explicitlySet__.add("resourceCompartmentId");
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
        /** If set, then the target resource is always governed by the operator control. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
        private Boolean isEnforcedAlways;

        /**
         * If set, then the target resource is always governed by the operator control.
         *
         * @param isEnforcedAlways the value to set
         * @return this builder
         */
        public Builder isEnforcedAlways(Boolean isEnforcedAlways) {
            this.isEnforcedAlways = isEnforcedAlways;
            this.__explicitlySet__.add("isEnforcedAlways");
            return this;
        }
        /** Comment about the assignment of the operator control to this target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Comment about the assignment of the operator control to this target resource.
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /** If set, then the audit logs will be forwarded to the relevant remote logging server */
        @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
        private Boolean isLogForwarded;

        /**
         * If set, then the audit logs will be forwarded to the relevant remote logging server
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
         * The address of the remote syslog server where the audit logs will be forwarded to.
         * Address in host or IP format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
        private String remoteSyslogServerAddress;

        /**
         * The address of the remote syslog server where the audit logs will be forwarded to.
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
        /**
         * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP
         * supported.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
        private Integer remoteSyslogServerPort;

        /**
         * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP
         * supported.
         *
         * @param remoteSyslogServerPort the value to set
         * @return this builder
         */
        public Builder remoteSyslogServerPort(Integer remoteSyslogServerPort) {
            this.remoteSyslogServerPort = remoteSyslogServerPort;
            this.__explicitlySet__.add("remoteSyslogServerPort");
            return this;
        }
        /**
         * The CA certificate of the remote syslog server. Identity of the remote syslog server will
         * be asserted based on this certificate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerCACert")
        private String remoteSyslogServerCACert;

        /**
         * The CA certificate of the remote syslog server. Identity of the remote syslog server will
         * be asserted based on this certificate.
         *
         * @param remoteSyslogServerCACert the value to set
         * @return this builder
         */
        public Builder remoteSyslogServerCACert(String remoteSyslogServerCACert) {
            this.remoteSyslogServerCACert = remoteSyslogServerCACert;
            this.__explicitlySet__.add("remoteSyslogServerCACert");
            return this;
        }
        /**
         * If set, then the hypervisor audit logs will be forwarded to the relevant remote syslog
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHypervisorLogForwarded")
        private Boolean isHypervisorLogForwarded;

        /**
         * If set, then the hypervisor audit logs will be forwarded to the relevant remote syslog
         * server
         *
         * @param isHypervisorLogForwarded the value to set
         * @return this builder
         */
        public Builder isHypervisorLogForwarded(Boolean isHypervisorLogForwarded) {
            this.isHypervisorLogForwarded = isHypervisorLogForwarded;
            this.__explicitlySet__.add("isHypervisorLogForwarded");
            return this;
        }
        /** The boolean if true would autoApprove during maintenance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
        private Boolean isAutoApproveDuringMaintenance;

        /**
         * The boolean if true would autoApprove during maintenance.
         *
         * @param isAutoApproveDuringMaintenance the value to set
         * @return this builder
         */
        public Builder isAutoApproveDuringMaintenance(Boolean isAutoApproveDuringMaintenance) {
            this.isAutoApproveDuringMaintenance = isAutoApproveDuringMaintenance;
            this.__explicitlySet__.add("isAutoApproveDuringMaintenance");
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

        public CreateOperatorControlAssignmentDetails build() {
            CreateOperatorControlAssignmentDetails model =
                    new CreateOperatorControlAssignmentDetails(
                            this.operatorControlId,
                            this.resourceId,
                            this.resourceName,
                            this.resourceType,
                            this.resourceCompartmentId,
                            this.timeAssignmentFrom,
                            this.timeAssignmentTo,
                            this.compartmentId,
                            this.isEnforcedAlways,
                            this.comment,
                            this.isLogForwarded,
                            this.remoteSyslogServerAddress,
                            this.remoteSyslogServerPort,
                            this.remoteSyslogServerCACert,
                            this.isHypervisorLogForwarded,
                            this.isAutoApproveDuringMaintenance,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOperatorControlAssignmentDetails model) {
            if (model.wasPropertyExplicitlySet("operatorControlId")) {
                this.operatorControlId(model.getOperatorControlId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceCompartmentId")) {
                this.resourceCompartmentId(model.getResourceCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeAssignmentFrom")) {
                this.timeAssignmentFrom(model.getTimeAssignmentFrom());
            }
            if (model.wasPropertyExplicitlySet("timeAssignmentTo")) {
                this.timeAssignmentTo(model.getTimeAssignmentTo());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isEnforcedAlways")) {
                this.isEnforcedAlways(model.getIsEnforcedAlways());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
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
            if (model.wasPropertyExplicitlySet("remoteSyslogServerCACert")) {
                this.remoteSyslogServerCACert(model.getRemoteSyslogServerCACert());
            }
            if (model.wasPropertyExplicitlySet("isHypervisorLogForwarded")) {
                this.isHypervisorLogForwarded(model.getIsHypervisorLogForwarded());
            }
            if (model.wasPropertyExplicitlySet("isAutoApproveDuringMaintenance")) {
                this.isAutoApproveDuringMaintenance(model.getIsAutoApproveDuringMaintenance());
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

    /** The OCID of the operator control that is being assigned to a target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorControlId")
    private final String operatorControlId;

    /**
     * The OCID of the operator control that is being assigned to a target resource.
     *
     * @return the value
     */
    public String getOperatorControlId() {
        return operatorControlId;
    }

    /**
     * The OCID of the target resource being brought under the governance of the operator control.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the target resource being brought under the governance of the operator control.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Name of the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * Name of the target resource.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** Type of the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceTypes resourceType;

    /**
     * Type of the target resource.
     *
     * @return the value
     */
    public ResourceTypes getResourceType() {
        return resourceType;
    }

    /** The OCID of the compartment that contains the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
    private final String resourceCompartmentId;

    /**
     * The OCID of the compartment that contains the target resource.
     *
     * @return the value
     */
    public String getResourceCompartmentId() {
        return resourceCompartmentId;
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

    /** If set, then the target resource is always governed by the operator control. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
    private final Boolean isEnforcedAlways;

    /**
     * If set, then the target resource is always governed by the operator control.
     *
     * @return the value
     */
    public Boolean getIsEnforcedAlways() {
        return isEnforcedAlways;
    }

    /** Comment about the assignment of the operator control to this target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Comment about the assignment of the operator control to this target resource.
     *
     * @return the value
     */
    public String getComment() {
        return comment;
    }

    /** If set, then the audit logs will be forwarded to the relevant remote logging server */
    @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
    private final Boolean isLogForwarded;

    /**
     * If set, then the audit logs will be forwarded to the relevant remote logging server
     *
     * @return the value
     */
    public Boolean getIsLogForwarded() {
        return isLogForwarded;
    }

    /**
     * The address of the remote syslog server where the audit logs will be forwarded to. Address in
     * host or IP format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
    private final String remoteSyslogServerAddress;

    /**
     * The address of the remote syslog server where the audit logs will be forwarded to. Address in
     * host or IP format.
     *
     * @return the value
     */
    public String getRemoteSyslogServerAddress() {
        return remoteSyslogServerAddress;
    }

    /**
     * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP
     * supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
    private final Integer remoteSyslogServerPort;

    /**
     * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP
     * supported.
     *
     * @return the value
     */
    public Integer getRemoteSyslogServerPort() {
        return remoteSyslogServerPort;
    }

    /**
     * The CA certificate of the remote syslog server. Identity of the remote syslog server will be
     * asserted based on this certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerCACert")
    private final String remoteSyslogServerCACert;

    /**
     * The CA certificate of the remote syslog server. Identity of the remote syslog server will be
     * asserted based on this certificate.
     *
     * @return the value
     */
    public String getRemoteSyslogServerCACert() {
        return remoteSyslogServerCACert;
    }

    /**
     * If set, then the hypervisor audit logs will be forwarded to the relevant remote syslog server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHypervisorLogForwarded")
    private final Boolean isHypervisorLogForwarded;

    /**
     * If set, then the hypervisor audit logs will be forwarded to the relevant remote syslog server
     *
     * @return the value
     */
    public Boolean getIsHypervisorLogForwarded() {
        return isHypervisorLogForwarded;
    }

    /** The boolean if true would autoApprove during maintenance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
    private final Boolean isAutoApproveDuringMaintenance;

    /**
     * The boolean if true would autoApprove during maintenance.
     *
     * @return the value
     */
    public Boolean getIsAutoApproveDuringMaintenance() {
        return isAutoApproveDuringMaintenance;
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
        sb.append("CreateOperatorControlAssignmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("operatorControlId=").append(String.valueOf(this.operatorControlId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceCompartmentId=").append(String.valueOf(this.resourceCompartmentId));
        sb.append(", timeAssignmentFrom=").append(String.valueOf(this.timeAssignmentFrom));
        sb.append(", timeAssignmentTo=").append(String.valueOf(this.timeAssignmentTo));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isEnforcedAlways=").append(String.valueOf(this.isEnforcedAlways));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", isLogForwarded=").append(String.valueOf(this.isLogForwarded));
        sb.append(", remoteSyslogServerAddress=")
                .append(String.valueOf(this.remoteSyslogServerAddress));
        sb.append(", remoteSyslogServerPort=").append(String.valueOf(this.remoteSyslogServerPort));
        sb.append(", remoteSyslogServerCACert=")
                .append(String.valueOf(this.remoteSyslogServerCACert));
        sb.append(", isHypervisorLogForwarded=")
                .append(String.valueOf(this.isHypervisorLogForwarded));
        sb.append(", isAutoApproveDuringMaintenance=")
                .append(String.valueOf(this.isAutoApproveDuringMaintenance));
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
        if (!(o instanceof CreateOperatorControlAssignmentDetails)) {
            return false;
        }

        CreateOperatorControlAssignmentDetails other = (CreateOperatorControlAssignmentDetails) o;
        return java.util.Objects.equals(this.operatorControlId, other.operatorControlId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceCompartmentId, other.resourceCompartmentId)
                && java.util.Objects.equals(this.timeAssignmentFrom, other.timeAssignmentFrom)
                && java.util.Objects.equals(this.timeAssignmentTo, other.timeAssignmentTo)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isEnforcedAlways, other.isEnforcedAlways)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.isLogForwarded, other.isLogForwarded)
                && java.util.Objects.equals(
                        this.remoteSyslogServerAddress, other.remoteSyslogServerAddress)
                && java.util.Objects.equals(
                        this.remoteSyslogServerPort, other.remoteSyslogServerPort)
                && java.util.Objects.equals(
                        this.remoteSyslogServerCACert, other.remoteSyslogServerCACert)
                && java.util.Objects.equals(
                        this.isHypervisorLogForwarded, other.isHypervisorLogForwarded)
                && java.util.Objects.equals(
                        this.isAutoApproveDuringMaintenance, other.isAutoApproveDuringMaintenance)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operatorControlId == null ? 43 : this.operatorControlId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCompartmentId == null
                                ? 43
                                : this.resourceCompartmentId.hashCode());
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnforcedAlways == null ? 43 : this.isEnforcedAlways.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
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
                        + (this.isHypervisorLogForwarded == null
                                ? 43
                                : this.isHypervisorLogForwarded.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoApproveDuringMaintenance == null
                                ? 43
                                : this.isAutoApproveDuringMaintenance.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
