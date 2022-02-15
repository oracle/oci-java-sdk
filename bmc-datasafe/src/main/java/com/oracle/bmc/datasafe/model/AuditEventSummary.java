/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The resource represents the audit events collected from the target database by Oracle Data Safe.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuditEventSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AuditEventSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private String dbUserName;

        public Builder dbUserName(String dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private String targetName;

        public Builder targetName(String targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetClass")
        private TargetClass targetClass;

        public Builder targetClass(TargetClass targetClass) {
            this.targetClass = targetClass;
            this.__explicitlySet__.add("targetClass");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditEventTime")
        private java.util.Date auditEventTime;

        public Builder auditEventTime(java.util.Date auditEventTime) {
            this.auditEventTime = auditEventTime;
            this.__explicitlySet__.add("auditEventTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osUserName")
        private String osUserName;

        public Builder osUserName(String osUserName) {
            this.osUserName = osUserName;
            this.__explicitlySet__.add("osUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        public Builder operationStatus(OperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventName")
        private String eventName;

        public Builder eventName(String eventName) {
            this.eventName = eventName;
            this.__explicitlySet__.add("eventName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private String errorCode;

        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
        private String objectOwner;

        public Builder objectOwner(String objectOwner) {
            this.objectOwner = objectOwner;
            this.__explicitlySet__.add("objectOwner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientHostname")
        private String clientHostname;

        public Builder clientHostname(String clientHostname) {
            this.clientHostname = clientHostname;
            this.__explicitlySet__.add("clientHostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientIp")
        private String clientIp;

        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            this.__explicitlySet__.add("clientIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditTrailId")
        private String auditTrailId;

        public Builder auditTrailId(String auditTrailId) {
            this.auditTrailId = auditTrailId;
            this.__explicitlySet__.add("auditTrailId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAlerted")
        private Boolean isAlerted;

        public Builder isAlerted(Boolean isAlerted) {
            this.isAlerted = isAlerted;
            this.__explicitlySet__.add("isAlerted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionTaken")
        private String actionTaken;

        public Builder actionTaken(String actionTaken) {
            this.actionTaken = actionTaken;
            this.__explicitlySet__.add("actionTaken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
        private String clientProgram;

        public Builder clientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            this.__explicitlySet__.add("clientProgram");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commandText")
        private String commandText;

        public Builder commandText(String commandText) {
            this.commandText = commandText;
            this.__explicitlySet__.add("commandText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commandParam")
        private String commandParam;

        public Builder commandParam(String commandParam) {
            this.commandParam = commandParam;
            this.__explicitlySet__.add("commandParam");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedEventAttributes")
        private String extendedEventAttributes;

        public Builder extendedEventAttributes(String extendedEventAttributes) {
            this.extendedEventAttributes = extendedEventAttributes;
            this.__explicitlySet__.add("extendedEventAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditLocation")
        private AuditLocation auditLocation;

        public Builder auditLocation(AuditLocation auditLocation) {
            this.auditLocation = auditLocation;
            this.__explicitlySet__.add("auditLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osTerminal")
        private String osTerminal;

        public Builder osTerminal(String osTerminal) {
            this.osTerminal = osTerminal;
            this.__explicitlySet__.add("osTerminal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditPolicies")
        private String auditPolicies;

        public Builder auditPolicies(String auditPolicies) {
            this.auditPolicies = auditPolicies;
            this.__explicitlySet__.add("auditPolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditType")
        private AuditType auditType;

        public Builder auditType(AuditType auditType) {
            this.auditType = auditType;
            this.__explicitlySet__.add("auditType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditEventSummary build() {
            AuditEventSummary __instance__ =
                    new AuditEventSummary(
                            id,
                            compartmentId,
                            dbUserName,
                            targetId,
                            targetName,
                            databaseType,
                            targetClass,
                            auditEventTime,
                            timeCollected,
                            osUserName,
                            operation,
                            operationStatus,
                            eventName,
                            errorCode,
                            errorMessage,
                            objectType,
                            objectName,
                            objectOwner,
                            clientHostname,
                            clientIp,
                            auditTrailId,
                            isAlerted,
                            actionTaken,
                            clientProgram,
                            commandText,
                            commandParam,
                            extendedEventAttributes,
                            auditLocation,
                            osTerminal,
                            clientId,
                            auditPolicies,
                            auditType,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditEventSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .dbUserName(o.getDbUserName())
                            .targetId(o.getTargetId())
                            .targetName(o.getTargetName())
                            .databaseType(o.getDatabaseType())
                            .targetClass(o.getTargetClass())
                            .auditEventTime(o.getAuditEventTime())
                            .timeCollected(o.getTimeCollected())
                            .osUserName(o.getOsUserName())
                            .operation(o.getOperation())
                            .operationStatus(o.getOperationStatus())
                            .eventName(o.getEventName())
                            .errorCode(o.getErrorCode())
                            .errorMessage(o.getErrorMessage())
                            .objectType(o.getObjectType())
                            .objectName(o.getObjectName())
                            .objectOwner(o.getObjectOwner())
                            .clientHostname(o.getClientHostname())
                            .clientIp(o.getClientIp())
                            .auditTrailId(o.getAuditTrailId())
                            .isAlerted(o.getIsAlerted())
                            .actionTaken(o.getActionTaken())
                            .clientProgram(o.getClientProgram())
                            .commandText(o.getCommandText())
                            .commandParam(o.getCommandParam())
                            .extendedEventAttributes(o.getExtendedEventAttributes())
                            .auditLocation(o.getAuditLocation())
                            .osTerminal(o.getOsTerminal())
                            .clientId(o.getClientId())
                            .auditPolicies(o.getAuditPolicies())
                            .auditType(o.getAuditType())
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

    /**
     * The OCID of the audit event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment containing the audit event. This is the same audited target database resource comparment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Name of the database user whose actions were audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    String dbUserName;

    /**
     * The OCID of the target database that was audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * The name of the target database that was audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    String targetName;
    /**
     * The type of the target database that was audited. Allowed values are
     *   - DATABASE_CLOUD_SERVICE - Represents Oracle Database Cloud Services.
     *   - AUTONOMOUS_DATABASE - Represents Oracle Autonomous Databases.
     *   - INSTALLED_DATABASE - Represents databases running on-premises or on compute instances.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DatabaseType {
        DatabaseCloudService("DATABASE_CLOUD_SERVICE"),
        AutonomousDatabase("AUTONOMOUS_DATABASE"),
        InstalledDatabase("INSTALLED_DATABASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The type of the target database that was audited. Allowed values are
     *   - DATABASE_CLOUD_SERVICE - Represents Oracle Database Cloud Services.
     *   - AUTONOMOUS_DATABASE - Represents Oracle Autonomous Databases.
     *   - INSTALLED_DATABASE - Represents databases running on-premises or on compute instances.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    DatabaseType databaseType;
    /**
     * Class of the target that was audited.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TargetClass {
        Database("DATABASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Class of the target that was audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetClass")
    TargetClass targetClass;

    /**
     * Time of audit event occurrence in the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditEventTime")
    java.util.Date auditEventTime;

    /**
     * Timestamp when this audit event was collected from the target database by Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    java.util.Date timeCollected;

    /**
     * Name of the operating system user for the database session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osUserName")
    String osUserName;

    /**
     * Name of the action executed by the user on the target database. i.e ALTER, CREATE, DROP.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    String operation;
    /**
     * Indicates whether the operation was a success or a failure.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OperationStatus {
        Success("SUCCESS"),
        Failure("FAILURE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Indicates whether the operation was a success or a failure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    OperationStatus operationStatus;

    /**
     * Name of the detail action executed by the user on the target database. i.e ALTER SEQUENCE, CREATE TRIGGER, CREATE INDEX.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventName")
    String eventName;

    /**
     * Oracle Error code generated by the action. Zero indicates the action was successful.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    String errorCode;

    /**
     * Detailed message on why the Error occurred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    String errorMessage;

    /**
     * Type of object in the source database affected by the action. i.e PL/SQL, SYNONYM, PACKAGE BODY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    String objectType;

    /**
     * Name of the object affected by the action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * Schema name of object affected but the action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
    String objectOwner;

    /**
     * Name of the host machine from which the session was spawned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientHostname")
    String clientHostname;

    /**
     * IP address of the host from which the session was spawned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientIp")
    String clientIp;

    /**
     * The OCID of the audit trail that generated this audit event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditTrailId")
    String auditTrailId;

    /**
     * Indicates whether an alert was raised for this audit event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAlerted")
    Boolean isAlerted;

    /**
     * The action taken for this audit event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionTaken")
    String actionTaken;

    /**
     * The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
    String clientProgram;

    /**
     * The SQL associated with the audit event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commandText")
    String commandText;

    /**
     * List of bind variables associated with the command text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commandParam")
    String commandParam;

    /**
     * List of all other attributes of the audit event seperated by a colon other than the one returned in audit record.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedEventAttributes")
    String extendedEventAttributes;
    /**
     * The location of the audit. Currently the value is audit table.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AuditLocation {
        AuditTable("AUDIT_TABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The location of the audit. Currently the value is audit table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditLocation")
    AuditLocation auditLocation;

    /**
     * The operating system terminal of the user session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osTerminal")
    String osTerminal;

    /**
     * The client identifier in each Oracle session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    String clientId;

    /**
     * Comma-seperated list of audit policies that caused the current audit event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditPolicies")
    String auditPolicies;
    /**
     * Type of auditing.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AuditType {
        Standard("STANDARD"),
        FineGrained("FINE_GRAINED"),
        Xs("XS"),
        DatabaseVault("DATABASE_VAULT"),
        LabelSecurity("LABEL_SECURITY"),
        Rman("RMAN"),
        Datapump("DATAPUMP"),
        DirectPathApi("DIRECT_PATH_API"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Type of auditing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditType")
    AuditType auditType;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
