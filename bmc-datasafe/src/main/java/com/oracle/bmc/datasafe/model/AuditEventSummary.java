/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The resource represents the audit events collected from the target database by Oracle Data Safe.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuditEventSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AuditEventSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "dbUserName",
        "targetId",
        "targetName",
        "databaseType",
        "targetClass",
        "auditEventTime",
        "timeCollected",
        "osUserName",
        "operation",
        "operationStatus",
        "eventName",
        "errorCode",
        "errorMessage",
        "objectType",
        "objectName",
        "objectOwner",
        "clientHostname",
        "clientIp",
        "auditTrailId",
        "isAlerted",
        "actionTaken",
        "clientProgram",
        "commandText",
        "commandParam",
        "extendedEventAttributes",
        "auditLocation",
        "osTerminal",
        "clientId",
        "auditPolicies",
        "auditType",
        "freeformTags",
        "definedTags"
    })
    public AuditEventSummary(
            String id,
            String compartmentId,
            String dbUserName,
            String targetId,
            String targetName,
            DatabaseType databaseType,
            TargetClass targetClass,
            java.util.Date auditEventTime,
            java.util.Date timeCollected,
            String osUserName,
            String operation,
            OperationStatus operationStatus,
            String eventName,
            String errorCode,
            String errorMessage,
            String objectType,
            String objectName,
            String objectOwner,
            String clientHostname,
            String clientIp,
            String auditTrailId,
            Boolean isAlerted,
            String actionTaken,
            String clientProgram,
            String commandText,
            String commandParam,
            String extendedEventAttributes,
            AuditLocation auditLocation,
            String osTerminal,
            String clientId,
            String auditPolicies,
            AuditType auditType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.dbUserName = dbUserName;
        this.targetId = targetId;
        this.targetName = targetName;
        this.databaseType = databaseType;
        this.targetClass = targetClass;
        this.auditEventTime = auditEventTime;
        this.timeCollected = timeCollected;
        this.osUserName = osUserName;
        this.operation = operation;
        this.operationStatus = operationStatus;
        this.eventName = eventName;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.objectType = objectType;
        this.objectName = objectName;
        this.objectOwner = objectOwner;
        this.clientHostname = clientHostname;
        this.clientIp = clientIp;
        this.auditTrailId = auditTrailId;
        this.isAlerted = isAlerted;
        this.actionTaken = actionTaken;
        this.clientProgram = clientProgram;
        this.commandText = commandText;
        this.commandParam = commandParam;
        this.extendedEventAttributes = extendedEventAttributes;
        this.auditLocation = auditLocation;
        this.osTerminal = osTerminal;
        this.clientId = clientId;
        this.auditPolicies = auditPolicies;
        this.auditType = auditType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the audit event. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the audit event.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment containing the audit event. This is the same as that of audit
         * profile of the target database resource compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the audit event. This is the same as that of audit
         * profile of the target database resource compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name of the database user whose actions were audited. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private String dbUserName;

        /**
         * The name of the database user whose actions were audited.
         *
         * @param dbUserName the value to set
         * @return this builder
         */
        public Builder dbUserName(String dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }
        /** The OCID of the target database that was audited. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database that was audited.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The name of the target database that was audited. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private String targetName;

        /**
         * The name of the target database that was audited.
         *
         * @param targetName the value to set
         * @return this builder
         */
        public Builder targetName(String targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }
        /**
         * The type of the target database that was audited. Allowed values are -
         * DATABASE_CLOUD_SERVICE - Represents Oracle Database Cloud Services. - AUTONOMOUS_DATABASE
         * - Represents Oracle Autonomous Databases. - INSTALLED_DATABASE - Represents databases
         * running on-premises or on compute instances.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        /**
         * The type of the target database that was audited. Allowed values are -
         * DATABASE_CLOUD_SERVICE - Represents Oracle Database Cloud Services. - AUTONOMOUS_DATABASE
         * - Represents Oracle Autonomous Databases. - INSTALLED_DATABASE - Represents databases
         * running on-premises or on compute instances.
         *
         * @param databaseType the value to set
         * @return this builder
         */
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /** The class of the target that was audited. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetClass")
        private TargetClass targetClass;

        /**
         * The class of the target that was audited.
         *
         * @param targetClass the value to set
         * @return this builder
         */
        public Builder targetClass(TargetClass targetClass) {
            this.targetClass = targetClass;
            this.__explicitlySet__.add("targetClass");
            return this;
        }
        /** The time of the audit event occurrence in the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditEventTime")
        private java.util.Date auditEventTime;

        /**
         * The time of the audit event occurrence in the target database.
         *
         * @param auditEventTime the value to set
         * @return this builder
         */
        public Builder auditEventTime(java.util.Date auditEventTime) {
            this.auditEventTime = auditEventTime;
            this.__explicitlySet__.add("auditEventTime");
            return this;
        }
        /**
         * The timestamp when this audit event was collected from the target database by Data Safe.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        /**
         * The timestamp when this audit event was collected from the target database by Data Safe.
         *
         * @param timeCollected the value to set
         * @return this builder
         */
        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** The name of the operating system user for the database session. */
        @com.fasterxml.jackson.annotation.JsonProperty("osUserName")
        private String osUserName;

        /**
         * The name of the operating system user for the database session.
         *
         * @param osUserName the value to set
         * @return this builder
         */
        public Builder osUserName(String osUserName) {
            this.osUserName = osUserName;
            this.__explicitlySet__.add("osUserName");
            return this;
        }
        /**
         * The name of the action executed by the user on the target database. i.e ALTER, CREATE,
         * DROP.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        /**
         * The name of the action executed by the user on the target database. i.e ALTER, CREATE,
         * DROP.
         *
         * @param operation the value to set
         * @return this builder
         */
        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }
        /** Indicates whether the operation was a success or a failure. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        /**
         * Indicates whether the operation was a success or a failure.
         *
         * @param operationStatus the value to set
         * @return this builder
         */
        public Builder operationStatus(OperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }
        /**
         * The name of the detail action executed by the user on the target database. i.e ALTER
         * SEQUENCE, CREATE TRIGGER, CREATE INDEX.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eventName")
        private String eventName;

        /**
         * The name of the detail action executed by the user on the target database. i.e ALTER
         * SEQUENCE, CREATE TRIGGER, CREATE INDEX.
         *
         * @param eventName the value to set
         * @return this builder
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            this.__explicitlySet__.add("eventName");
            return this;
        }
        /** Oracle Error code generated by the action. Zero indicates the action was successful. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private String errorCode;

        /**
         * Oracle Error code generated by the action. Zero indicates the action was successful.
         *
         * @param errorCode the value to set
         * @return this builder
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }
        /** The detailed message on why the Error occurred. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * The detailed message on why the Error occurred.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * The type of the object in the source database affected by the action. i.e PL/SQL,
         * SYNONYM, PACKAGE BODY.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        /**
         * The type of the object in the source database affected by the action. i.e PL/SQL,
         * SYNONYM, PACKAGE BODY.
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** The name of the object affected by the action. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the object affected by the action.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** The schema name of the object affected by the action. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
        private String objectOwner;

        /**
         * The schema name of the object affected by the action.
         *
         * @param objectOwner the value to set
         * @return this builder
         */
        public Builder objectOwner(String objectOwner) {
            this.objectOwner = objectOwner;
            this.__explicitlySet__.add("objectOwner");
            return this;
        }
        /** The name of the host machine from which the session was spawned. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientHostname")
        private String clientHostname;

        /**
         * The name of the host machine from which the session was spawned.
         *
         * @param clientHostname the value to set
         * @return this builder
         */
        public Builder clientHostname(String clientHostname) {
            this.clientHostname = clientHostname;
            this.__explicitlySet__.add("clientHostname");
            return this;
        }
        /** The IP address of the host machine from which the session was spawned. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientIp")
        private String clientIp;

        /**
         * The IP address of the host machine from which the session was spawned.
         *
         * @param clientIp the value to set
         * @return this builder
         */
        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            this.__explicitlySet__.add("clientIp");
            return this;
        }
        /**
         * The OCID of the audit trail that generated this audit event. To be noted, this field has
         * been deprecated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("auditTrailId")
        private String auditTrailId;

        /**
         * The OCID of the audit trail that generated this audit event. To be noted, this field has
         * been deprecated.
         *
         * @param auditTrailId the value to set
         * @return this builder
         */
        public Builder auditTrailId(String auditTrailId) {
            this.auditTrailId = auditTrailId;
            this.__explicitlySet__.add("auditTrailId");
            return this;
        }
        /** Indicates whether an alert was raised for this audit event. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAlerted")
        private Boolean isAlerted;

        /**
         * Indicates whether an alert was raised for this audit event.
         *
         * @param isAlerted the value to set
         * @return this builder
         */
        public Builder isAlerted(Boolean isAlerted) {
            this.isAlerted = isAlerted;
            this.__explicitlySet__.add("isAlerted");
            return this;
        }
        /** The action taken for this audit event. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionTaken")
        private String actionTaken;

        /**
         * The action taken for this audit event.
         *
         * @param actionTaken the value to set
         * @return this builder
         */
        public Builder actionTaken(String actionTaken) {
            this.actionTaken = actionTaken;
            this.__explicitlySet__.add("actionTaken");
            return this;
        }
        /**
         * The application from which the audit event was generated. Examples SQL Plus or SQL
         * Developer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
        private String clientProgram;

        /**
         * The application from which the audit event was generated. Examples SQL Plus or SQL
         * Developer.
         *
         * @param clientProgram the value to set
         * @return this builder
         */
        public Builder clientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            this.__explicitlySet__.add("clientProgram");
            return this;
        }
        /** The SQL associated with the audit event. */
        @com.fasterxml.jackson.annotation.JsonProperty("commandText")
        private String commandText;

        /**
         * The SQL associated with the audit event.
         *
         * @param commandText the value to set
         * @return this builder
         */
        public Builder commandText(String commandText) {
            this.commandText = commandText;
            this.__explicitlySet__.add("commandText");
            return this;
        }
        /** List of bind variables associated with the command text. */
        @com.fasterxml.jackson.annotation.JsonProperty("commandParam")
        private String commandParam;

        /**
         * List of bind variables associated with the command text.
         *
         * @param commandParam the value to set
         * @return this builder
         */
        public Builder commandParam(String commandParam) {
            this.commandParam = commandParam;
            this.__explicitlySet__.add("commandParam");
            return this;
        }
        /**
         * List of all other attributes of the audit event seperated by a colon other than the one
         * returned in audit record.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedEventAttributes")
        private String extendedEventAttributes;

        /**
         * List of all other attributes of the audit event seperated by a colon other than the one
         * returned in audit record.
         *
         * @param extendedEventAttributes the value to set
         * @return this builder
         */
        public Builder extendedEventAttributes(String extendedEventAttributes) {
            this.extendedEventAttributes = extendedEventAttributes;
            this.__explicitlySet__.add("extendedEventAttributes");
            return this;
        }
        /** The location of the audit. Currently the value is audit table. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditLocation")
        private AuditLocation auditLocation;

        /**
         * The location of the audit. Currently the value is audit table.
         *
         * @param auditLocation the value to set
         * @return this builder
         */
        public Builder auditLocation(AuditLocation auditLocation) {
            this.auditLocation = auditLocation;
            this.__explicitlySet__.add("auditLocation");
            return this;
        }
        /** The operating system terminal of the user session. */
        @com.fasterxml.jackson.annotation.JsonProperty("osTerminal")
        private String osTerminal;

        /**
         * The operating system terminal of the user session.
         *
         * @param osTerminal the value to set
         * @return this builder
         */
        public Builder osTerminal(String osTerminal) {
            this.osTerminal = osTerminal;
            this.__explicitlySet__.add("osTerminal");
            return this;
        }
        /** The client identifier in each Oracle session. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * The client identifier in each Oracle session.
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /** Comma-seperated list of audit policies that caused the current audit event. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditPolicies")
        private String auditPolicies;

        /**
         * Comma-seperated list of audit policies that caused the current audit event.
         *
         * @param auditPolicies the value to set
         * @return this builder
         */
        public Builder auditPolicies(String auditPolicies) {
            this.auditPolicies = auditPolicies;
            this.__explicitlySet__.add("auditPolicies");
            return this;
        }
        /** The type of the auditing. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditType")
        private AuditType auditType;

        /**
         * The type of the auditing.
         *
         * @param auditType the value to set
         * @return this builder
         */
        public Builder auditType(AuditType auditType) {
            this.auditType = auditType;
            this.__explicitlySet__.add("auditType");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public AuditEventSummary build() {
            AuditEventSummary model =
                    new AuditEventSummary(
                            this.id,
                            this.compartmentId,
                            this.dbUserName,
                            this.targetId,
                            this.targetName,
                            this.databaseType,
                            this.targetClass,
                            this.auditEventTime,
                            this.timeCollected,
                            this.osUserName,
                            this.operation,
                            this.operationStatus,
                            this.eventName,
                            this.errorCode,
                            this.errorMessage,
                            this.objectType,
                            this.objectName,
                            this.objectOwner,
                            this.clientHostname,
                            this.clientIp,
                            this.auditTrailId,
                            this.isAlerted,
                            this.actionTaken,
                            this.clientProgram,
                            this.commandText,
                            this.commandParam,
                            this.extendedEventAttributes,
                            this.auditLocation,
                            this.osTerminal,
                            this.clientId,
                            this.auditPolicies,
                            this.auditType,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditEventSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbUserName")) {
                this.dbUserName(model.getDbUserName());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetName")) {
                this.targetName(model.getTargetName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("targetClass")) {
                this.targetClass(model.getTargetClass());
            }
            if (model.wasPropertyExplicitlySet("auditEventTime")) {
                this.auditEventTime(model.getAuditEventTime());
            }
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("osUserName")) {
                this.osUserName(model.getOsUserName());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
            }
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("eventName")) {
                this.eventName(model.getEventName());
            }
            if (model.wasPropertyExplicitlySet("errorCode")) {
                this.errorCode(model.getErrorCode());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectOwner")) {
                this.objectOwner(model.getObjectOwner());
            }
            if (model.wasPropertyExplicitlySet("clientHostname")) {
                this.clientHostname(model.getClientHostname());
            }
            if (model.wasPropertyExplicitlySet("clientIp")) {
                this.clientIp(model.getClientIp());
            }
            if (model.wasPropertyExplicitlySet("auditTrailId")) {
                this.auditTrailId(model.getAuditTrailId());
            }
            if (model.wasPropertyExplicitlySet("isAlerted")) {
                this.isAlerted(model.getIsAlerted());
            }
            if (model.wasPropertyExplicitlySet("actionTaken")) {
                this.actionTaken(model.getActionTaken());
            }
            if (model.wasPropertyExplicitlySet("clientProgram")) {
                this.clientProgram(model.getClientProgram());
            }
            if (model.wasPropertyExplicitlySet("commandText")) {
                this.commandText(model.getCommandText());
            }
            if (model.wasPropertyExplicitlySet("commandParam")) {
                this.commandParam(model.getCommandParam());
            }
            if (model.wasPropertyExplicitlySet("extendedEventAttributes")) {
                this.extendedEventAttributes(model.getExtendedEventAttributes());
            }
            if (model.wasPropertyExplicitlySet("auditLocation")) {
                this.auditLocation(model.getAuditLocation());
            }
            if (model.wasPropertyExplicitlySet("osTerminal")) {
                this.osTerminal(model.getOsTerminal());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("auditPolicies")) {
                this.auditPolicies(model.getAuditPolicies());
            }
            if (model.wasPropertyExplicitlySet("auditType")) {
                this.auditType(model.getAuditType());
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

    /** The OCID of the audit event. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the audit event.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment containing the audit event. This is the same as that of audit
     * profile of the target database resource compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the audit event. This is the same as that of audit
     * profile of the target database resource compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name of the database user whose actions were audited. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    private final String dbUserName;

    /**
     * The name of the database user whose actions were audited.
     *
     * @return the value
     */
    public String getDbUserName() {
        return dbUserName;
    }

    /** The OCID of the target database that was audited. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database that was audited.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The name of the target database that was audited. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    private final String targetName;

    /**
     * The name of the target database that was audited.
     *
     * @return the value
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * The type of the target database that was audited. Allowed values are - DATABASE_CLOUD_SERVICE
     * - Represents Oracle Database Cloud Services. - AUTONOMOUS_DATABASE - Represents Oracle
     * Autonomous Databases. - INSTALLED_DATABASE - Represents databases running on-premises or on
     * compute instances.
     */
    public enum DatabaseType implements com.oracle.bmc.http.internal.BmcEnum {
        DatabaseCloudService("DATABASE_CLOUD_SERVICE"),
        AutonomousDatabase("AUTONOMOUS_DATABASE"),
        InstalledDatabase("INSTALLED_DATABASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseType.class);

        private final String value;
        private static java.util.Map<String, DatabaseType> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseType v : DatabaseType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the target database that was audited. Allowed values are - DATABASE_CLOUD_SERVICE
     * - Represents Oracle Database Cloud Services. - AUTONOMOUS_DATABASE - Represents Oracle
     * Autonomous Databases. - INSTALLED_DATABASE - Represents databases running on-premises or on
     * compute instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseType databaseType;

    /**
     * The type of the target database that was audited. Allowed values are - DATABASE_CLOUD_SERVICE
     * - Represents Oracle Database Cloud Services. - AUTONOMOUS_DATABASE - Represents Oracle
     * Autonomous Databases. - INSTALLED_DATABASE - Represents databases running on-premises or on
     * compute instances.
     *
     * @return the value
     */
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /** The class of the target that was audited. */
    public enum TargetClass implements com.oracle.bmc.http.internal.BmcEnum {
        Database("DATABASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TargetClass.class);

        private final String value;
        private static java.util.Map<String, TargetClass> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetClass v : TargetClass.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetClass(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetClass create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetClass', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The class of the target that was audited. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetClass")
    private final TargetClass targetClass;

    /**
     * The class of the target that was audited.
     *
     * @return the value
     */
    public TargetClass getTargetClass() {
        return targetClass;
    }

    /** The time of the audit event occurrence in the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditEventTime")
    private final java.util.Date auditEventTime;

    /**
     * The time of the audit event occurrence in the target database.
     *
     * @return the value
     */
    public java.util.Date getAuditEventTime() {
        return auditEventTime;
    }

    /** The timestamp when this audit event was collected from the target database by Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * The timestamp when this audit event was collected from the target database by Data Safe.
     *
     * @return the value
     */
    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /** The name of the operating system user for the database session. */
    @com.fasterxml.jackson.annotation.JsonProperty("osUserName")
    private final String osUserName;

    /**
     * The name of the operating system user for the database session.
     *
     * @return the value
     */
    public String getOsUserName() {
        return osUserName;
    }

    /**
     * The name of the action executed by the user on the target database. i.e ALTER, CREATE, DROP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final String operation;

    /**
     * The name of the action executed by the user on the target database. i.e ALTER, CREATE, DROP.
     *
     * @return the value
     */
    public String getOperation() {
        return operation;
    }

    /** Indicates whether the operation was a success or a failure. */
    public enum OperationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Success("SUCCESS"),
        Failure("FAILURE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationStatus.class);

        private final String value;
        private static java.util.Map<String, OperationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationStatus v : OperationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether the operation was a success or a failure. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final OperationStatus operationStatus;

    /**
     * Indicates whether the operation was a success or a failure.
     *
     * @return the value
     */
    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    /**
     * The name of the detail action executed by the user on the target database. i.e ALTER
     * SEQUENCE, CREATE TRIGGER, CREATE INDEX.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventName")
    private final String eventName;

    /**
     * The name of the detail action executed by the user on the target database. i.e ALTER
     * SEQUENCE, CREATE TRIGGER, CREATE INDEX.
     *
     * @return the value
     */
    public String getEventName() {
        return eventName;
    }

    /** Oracle Error code generated by the action. Zero indicates the action was successful. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

    /**
     * Oracle Error code generated by the action. Zero indicates the action was successful.
     *
     * @return the value
     */
    public String getErrorCode() {
        return errorCode;
    }

    /** The detailed message on why the Error occurred. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * The detailed message on why the Error occurred.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * The type of the object in the source database affected by the action. i.e PL/SQL, SYNONYM,
     * PACKAGE BODY.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

    /**
     * The type of the object in the source database affected by the action. i.e PL/SQL, SYNONYM,
     * PACKAGE BODY.
     *
     * @return the value
     */
    public String getObjectType() {
        return objectType;
    }

    /** The name of the object affected by the action. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the object affected by the action.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The schema name of the object affected by the action. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
    private final String objectOwner;

    /**
     * The schema name of the object affected by the action.
     *
     * @return the value
     */
    public String getObjectOwner() {
        return objectOwner;
    }

    /** The name of the host machine from which the session was spawned. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientHostname")
    private final String clientHostname;

    /**
     * The name of the host machine from which the session was spawned.
     *
     * @return the value
     */
    public String getClientHostname() {
        return clientHostname;
    }

    /** The IP address of the host machine from which the session was spawned. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientIp")
    private final String clientIp;

    /**
     * The IP address of the host machine from which the session was spawned.
     *
     * @return the value
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * The OCID of the audit trail that generated this audit event. To be noted, this field has been
     * deprecated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auditTrailId")
    private final String auditTrailId;

    /**
     * The OCID of the audit trail that generated this audit event. To be noted, this field has been
     * deprecated.
     *
     * @return the value
     */
    public String getAuditTrailId() {
        return auditTrailId;
    }

    /** Indicates whether an alert was raised for this audit event. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAlerted")
    private final Boolean isAlerted;

    /**
     * Indicates whether an alert was raised for this audit event.
     *
     * @return the value
     */
    public Boolean getIsAlerted() {
        return isAlerted;
    }

    /** The action taken for this audit event. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionTaken")
    private final String actionTaken;

    /**
     * The action taken for this audit event.
     *
     * @return the value
     */
    public String getActionTaken() {
        return actionTaken;
    }

    /**
     * The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
    private final String clientProgram;

    /**
     * The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
     *
     * @return the value
     */
    public String getClientProgram() {
        return clientProgram;
    }

    /** The SQL associated with the audit event. */
    @com.fasterxml.jackson.annotation.JsonProperty("commandText")
    private final String commandText;

    /**
     * The SQL associated with the audit event.
     *
     * @return the value
     */
    public String getCommandText() {
        return commandText;
    }

    /** List of bind variables associated with the command text. */
    @com.fasterxml.jackson.annotation.JsonProperty("commandParam")
    private final String commandParam;

    /**
     * List of bind variables associated with the command text.
     *
     * @return the value
     */
    public String getCommandParam() {
        return commandParam;
    }

    /**
     * List of all other attributes of the audit event seperated by a colon other than the one
     * returned in audit record.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedEventAttributes")
    private final String extendedEventAttributes;

    /**
     * List of all other attributes of the audit event seperated by a colon other than the one
     * returned in audit record.
     *
     * @return the value
     */
    public String getExtendedEventAttributes() {
        return extendedEventAttributes;
    }

    /** The location of the audit. Currently the value is audit table. */
    public enum AuditLocation implements com.oracle.bmc.http.internal.BmcEnum {
        AuditTable("AUDIT_TABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuditLocation.class);

        private final String value;
        private static java.util.Map<String, AuditLocation> map;

        static {
            map = new java.util.HashMap<>();
            for (AuditLocation v : AuditLocation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuditLocation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuditLocation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuditLocation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The location of the audit. Currently the value is audit table. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditLocation")
    private final AuditLocation auditLocation;

    /**
     * The location of the audit. Currently the value is audit table.
     *
     * @return the value
     */
    public AuditLocation getAuditLocation() {
        return auditLocation;
    }

    /** The operating system terminal of the user session. */
    @com.fasterxml.jackson.annotation.JsonProperty("osTerminal")
    private final String osTerminal;

    /**
     * The operating system terminal of the user session.
     *
     * @return the value
     */
    public String getOsTerminal() {
        return osTerminal;
    }

    /** The client identifier in each Oracle session. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * The client identifier in each Oracle session.
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /** Comma-seperated list of audit policies that caused the current audit event. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditPolicies")
    private final String auditPolicies;

    /**
     * Comma-seperated list of audit policies that caused the current audit event.
     *
     * @return the value
     */
    public String getAuditPolicies() {
        return auditPolicies;
    }

    /** The type of the auditing. */
    public enum AuditType implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("STANDARD"),
        FineGrained("FINE_GRAINED"),
        Xs("XS"),
        DatabaseVault("DATABASE_VAULT"),
        LabelSecurity("LABEL_SECURITY"),
        Rman("RMAN"),
        Datapump("DATAPUMP"),
        DirectPathApi("DIRECT_PATH_API"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuditType.class);

        private final String value;
        private static java.util.Map<String, AuditType> map;

        static {
            map = new java.util.HashMap<>();
            for (AuditType v : AuditType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuditType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuditType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuditType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of the auditing. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditType")
    private final AuditType auditType;

    /**
     * The type of the auditing.
     *
     * @return the value
     */
    public AuditType getAuditType() {
        return auditType;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("AuditEventSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbUserName=").append(String.valueOf(this.dbUserName));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetName=").append(String.valueOf(this.targetName));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", targetClass=").append(String.valueOf(this.targetClass));
        sb.append(", auditEventTime=").append(String.valueOf(this.auditEventTime));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", osUserName=").append(String.valueOf(this.osUserName));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", eventName=").append(String.valueOf(this.eventName));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectOwner=").append(String.valueOf(this.objectOwner));
        sb.append(", clientHostname=").append(String.valueOf(this.clientHostname));
        sb.append(", clientIp=").append(String.valueOf(this.clientIp));
        sb.append(", auditTrailId=").append(String.valueOf(this.auditTrailId));
        sb.append(", isAlerted=").append(String.valueOf(this.isAlerted));
        sb.append(", actionTaken=").append(String.valueOf(this.actionTaken));
        sb.append(", clientProgram=").append(String.valueOf(this.clientProgram));
        sb.append(", commandText=").append(String.valueOf(this.commandText));
        sb.append(", commandParam=").append(String.valueOf(this.commandParam));
        sb.append(", extendedEventAttributes=")
                .append(String.valueOf(this.extendedEventAttributes));
        sb.append(", auditLocation=").append(String.valueOf(this.auditLocation));
        sb.append(", osTerminal=").append(String.valueOf(this.osTerminal));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", auditPolicies=").append(String.valueOf(this.auditPolicies));
        sb.append(", auditType=").append(String.valueOf(this.auditType));
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
        if (!(o instanceof AuditEventSummary)) {
            return false;
        }

        AuditEventSummary other = (AuditEventSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbUserName, other.dbUserName)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetName, other.targetName)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.targetClass, other.targetClass)
                && java.util.Objects.equals(this.auditEventTime, other.auditEventTime)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.osUserName, other.osUserName)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.eventName, other.eventName)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectOwner, other.objectOwner)
                && java.util.Objects.equals(this.clientHostname, other.clientHostname)
                && java.util.Objects.equals(this.clientIp, other.clientIp)
                && java.util.Objects.equals(this.auditTrailId, other.auditTrailId)
                && java.util.Objects.equals(this.isAlerted, other.isAlerted)
                && java.util.Objects.equals(this.actionTaken, other.actionTaken)
                && java.util.Objects.equals(this.clientProgram, other.clientProgram)
                && java.util.Objects.equals(this.commandText, other.commandText)
                && java.util.Objects.equals(this.commandParam, other.commandParam)
                && java.util.Objects.equals(
                        this.extendedEventAttributes, other.extendedEventAttributes)
                && java.util.Objects.equals(this.auditLocation, other.auditLocation)
                && java.util.Objects.equals(this.osTerminal, other.osTerminal)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.auditPolicies, other.auditPolicies)
                && java.util.Objects.equals(this.auditType, other.auditType)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.dbUserName == null ? 43 : this.dbUserName.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result = (result * PRIME) + (this.targetClass == null ? 43 : this.targetClass.hashCode());
        result =
                (result * PRIME)
                        + (this.auditEventTime == null ? 43 : this.auditEventTime.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + (this.osUserName == null ? 43 : this.osUserName.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result =
                (result * PRIME)
                        + (this.operationStatus == null ? 43 : this.operationStatus.hashCode());
        result = (result * PRIME) + (this.eventName == null ? 43 : this.eventName.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.objectOwner == null ? 43 : this.objectOwner.hashCode());
        result =
                (result * PRIME)
                        + (this.clientHostname == null ? 43 : this.clientHostname.hashCode());
        result = (result * PRIME) + (this.clientIp == null ? 43 : this.clientIp.hashCode());
        result = (result * PRIME) + (this.auditTrailId == null ? 43 : this.auditTrailId.hashCode());
        result = (result * PRIME) + (this.isAlerted == null ? 43 : this.isAlerted.hashCode());
        result = (result * PRIME) + (this.actionTaken == null ? 43 : this.actionTaken.hashCode());
        result =
                (result * PRIME)
                        + (this.clientProgram == null ? 43 : this.clientProgram.hashCode());
        result = (result * PRIME) + (this.commandText == null ? 43 : this.commandText.hashCode());
        result = (result * PRIME) + (this.commandParam == null ? 43 : this.commandParam.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedEventAttributes == null
                                ? 43
                                : this.extendedEventAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.auditLocation == null ? 43 : this.auditLocation.hashCode());
        result = (result * PRIME) + (this.osTerminal == null ? 43 : this.osTerminal.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result =
                (result * PRIME)
                        + (this.auditPolicies == null ? 43 : this.auditPolicies.hashCode());
        result = (result * PRIME) + (this.auditType == null ? 43 : this.auditType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
