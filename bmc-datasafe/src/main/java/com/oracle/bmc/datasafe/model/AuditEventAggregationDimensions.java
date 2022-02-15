/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of aggregation dimensions used for summarizing audit events.
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
    builder = AuditEventAggregationDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AuditEventAggregationDimensions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("auditEventTime")
        private java.util.List<java.util.Date> auditEventTime;

        public Builder auditEventTime(java.util.List<java.util.Date> auditEventTime) {
            this.auditEventTime = auditEventTime;
            this.__explicitlySet__.add("auditEventTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private java.util.List<String> dbUserName;

        public Builder dbUserName(java.util.List<String> dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private java.util.List<String> targetId;

        public Builder targetId(java.util.List<String> targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private java.util.List<String> targetName;

        public Builder targetName(java.util.List<String> targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetClass")
        private java.util.List<TargetClass> targetClass;

        public Builder targetClass(java.util.List<TargetClass> targetClass) {
            this.targetClass = targetClass;
            this.__explicitlySet__.add("targetClass");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private java.util.List<String> objectType;

        public Builder objectType(java.util.List<String> objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientHostname")
        private java.util.List<String> clientHostname;

        public Builder clientHostname(java.util.List<String> clientHostname) {
            this.clientHostname = clientHostname;
            this.__explicitlySet__.add("clientHostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
        private java.util.List<String> clientProgram;

        public Builder clientProgram(java.util.List<String> clientProgram) {
            this.clientProgram = clientProgram;
            this.__explicitlySet__.add("clientProgram");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private java.util.List<String> clientId;

        public Builder clientId(java.util.List<String> clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditType")
        private java.util.List<AuditType> auditType;

        public Builder auditType(java.util.List<AuditType> auditType) {
            this.auditType = auditType;
            this.__explicitlySet__.add("auditType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventName")
        private java.util.List<String> eventName;

        public Builder eventName(java.util.List<String> eventName) {
            this.eventName = eventName;
            this.__explicitlySet__.add("eventName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditEventAggregationDimensions build() {
            AuditEventAggregationDimensions __instance__ =
                    new AuditEventAggregationDimensions(
                            auditEventTime,
                            dbUserName,
                            targetId,
                            targetName,
                            targetClass,
                            objectType,
                            clientHostname,
                            clientProgram,
                            clientId,
                            auditType,
                            eventName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditEventAggregationDimensions o) {
            Builder copiedBuilder =
                    auditEventTime(o.getAuditEventTime())
                            .dbUserName(o.getDbUserName())
                            .targetId(o.getTargetId())
                            .targetName(o.getTargetName())
                            .targetClass(o.getTargetClass())
                            .objectType(o.getObjectType())
                            .clientHostname(o.getClientHostname())
                            .clientProgram(o.getClientProgram())
                            .clientId(o.getClientId())
                            .auditType(o.getAuditType())
                            .eventName(o.getEventName());

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
     * Time of audit event occurrence in the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditEventTime")
    java.util.List<java.util.Date> auditEventTime;

    /**
     * Name of the database user whose actions were audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    java.util.List<String> dbUserName;

    /**
     * The OCID of the target database that was audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    java.util.List<String> targetId;

    /**
     * The name of the target database that was audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    java.util.List<String> targetName;
    /**
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
    java.util.List<TargetClass> targetClass;

    /**
     * Type of object in the source database affected by the action. i.e PL/SQL, SYNONYM, PACKAGE BODY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    java.util.List<String> objectType;

    /**
     * Name of the host machine from which the session was spawned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientHostname")
    java.util.List<String> clientHostname;

    /**
     * The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
    java.util.List<String> clientProgram;

    /**
     * The client identifier in each Oracle session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    java.util.List<String> clientId;
    /**
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
    java.util.List<AuditType> auditType;

    /**
     * Name of the detail action executed by the user on the target database. i.e ALTER SEQUENCE, CREATE TRIGGER, CREATE INDEX.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventName")
    java.util.List<String> eventName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
