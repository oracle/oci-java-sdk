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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuditEventAggregationDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuditEventAggregationDimensions {
    @Deprecated
    @java.beans.ConstructorProperties({
        "auditEventTime",
        "dbUserName",
        "targetId",
        "targetName",
        "targetClass",
        "objectType",
        "clientHostname",
        "clientProgram",
        "clientId",
        "auditType",
        "eventName"
    })
    public AuditEventAggregationDimensions(
            java.util.List<java.util.Date> auditEventTime,
            java.util.List<String> dbUserName,
            java.util.List<String> targetId,
            java.util.List<String> targetName,
            java.util.List<TargetClass> targetClass,
            java.util.List<String> objectType,
            java.util.List<String> clientHostname,
            java.util.List<String> clientProgram,
            java.util.List<String> clientId,
            java.util.List<AuditType> auditType,
            java.util.List<String> eventName) {
        super();
        this.auditEventTime = auditEventTime;
        this.dbUserName = dbUserName;
        this.targetId = targetId;
        this.targetName = targetName;
        this.targetClass = targetClass;
        this.objectType = objectType;
        this.clientHostname = clientHostname;
        this.clientProgram = clientProgram;
        this.clientId = clientId;
        this.auditType = auditType;
        this.eventName = eventName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Time of audit event occurrence in the target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditEventTime")
        private java.util.List<java.util.Date> auditEventTime;

        /**
         * Time of audit event occurrence in the target database.
         * @param auditEventTime the value to set
         * @return this builder
         **/
        public Builder auditEventTime(java.util.List<java.util.Date> auditEventTime) {
            this.auditEventTime = auditEventTime;
            this.__explicitlySet__.add("auditEventTime");
            return this;
        }
        /**
         * Name of the database user whose actions were audited.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private java.util.List<String> dbUserName;

        /**
         * Name of the database user whose actions were audited.
         * @param dbUserName the value to set
         * @return this builder
         **/
        public Builder dbUserName(java.util.List<String> dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }
        /**
         * The OCID of the target database that was audited.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private java.util.List<String> targetId;

        /**
         * The OCID of the target database that was audited.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(java.util.List<String> targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The name of the target database that was audited.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private java.util.List<String> targetName;

        /**
         * The name of the target database that was audited.
         * @param targetName the value to set
         * @return this builder
         **/
        public Builder targetName(java.util.List<String> targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }
        /**
         * Class of the target that was audited.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetClass")
        private java.util.List<TargetClass> targetClass;

        /**
         * Class of the target that was audited.
         * @param targetClass the value to set
         * @return this builder
         **/
        public Builder targetClass(java.util.List<TargetClass> targetClass) {
            this.targetClass = targetClass;
            this.__explicitlySet__.add("targetClass");
            return this;
        }
        /**
         * Type of object in the source database affected by the action. i.e PL/SQL, SYNONYM, PACKAGE BODY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private java.util.List<String> objectType;

        /**
         * Type of object in the source database affected by the action. i.e PL/SQL, SYNONYM, PACKAGE BODY.
         * @param objectType the value to set
         * @return this builder
         **/
        public Builder objectType(java.util.List<String> objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /**
         * Name of the host machine from which the session was spawned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientHostname")
        private java.util.List<String> clientHostname;

        /**
         * Name of the host machine from which the session was spawned.
         * @param clientHostname the value to set
         * @return this builder
         **/
        public Builder clientHostname(java.util.List<String> clientHostname) {
            this.clientHostname = clientHostname;
            this.__explicitlySet__.add("clientHostname");
            return this;
        }
        /**
         * The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
        private java.util.List<String> clientProgram;

        /**
         * The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
         * @param clientProgram the value to set
         * @return this builder
         **/
        public Builder clientProgram(java.util.List<String> clientProgram) {
            this.clientProgram = clientProgram;
            this.__explicitlySet__.add("clientProgram");
            return this;
        }
        /**
         * The client identifier in each Oracle session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private java.util.List<String> clientId;

        /**
         * The client identifier in each Oracle session.
         * @param clientId the value to set
         * @return this builder
         **/
        public Builder clientId(java.util.List<String> clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * Type of auditing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditType")
        private java.util.List<AuditType> auditType;

        /**
         * Type of auditing.
         * @param auditType the value to set
         * @return this builder
         **/
        public Builder auditType(java.util.List<AuditType> auditType) {
            this.auditType = auditType;
            this.__explicitlySet__.add("auditType");
            return this;
        }
        /**
         * Name of the detail action executed by the user on the target database. i.e ALTER SEQUENCE, CREATE TRIGGER, CREATE INDEX.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("eventName")
        private java.util.List<String> eventName;

        /**
         * Name of the detail action executed by the user on the target database. i.e ALTER SEQUENCE, CREATE TRIGGER, CREATE INDEX.
         * @param eventName the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Time of audit event occurrence in the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditEventTime")
    private final java.util.List<java.util.Date> auditEventTime;

    /**
     * Time of audit event occurrence in the target database.
     * @return the value
     **/
    public java.util.List<java.util.Date> getAuditEventTime() {
        return auditEventTime;
    }

    /**
     * Name of the database user whose actions were audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    private final java.util.List<String> dbUserName;

    /**
     * Name of the database user whose actions were audited.
     * @return the value
     **/
    public java.util.List<String> getDbUserName() {
        return dbUserName;
    }

    /**
     * The OCID of the target database that was audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final java.util.List<String> targetId;

    /**
     * The OCID of the target database that was audited.
     * @return the value
     **/
    public java.util.List<String> getTargetId() {
        return targetId;
    }

    /**
     * The name of the target database that was audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    private final java.util.List<String> targetName;

    /**
     * The name of the target database that was audited.
     * @return the value
     **/
    public java.util.List<String> getTargetName() {
        return targetName;
    }

    /**
     **/
    public enum TargetClass {
        Database("DATABASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * Class of the target that was audited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetClass")
    private final java.util.List<TargetClass> targetClass;

    /**
     * Class of the target that was audited.
     * @return the value
     **/
    public java.util.List<TargetClass> getTargetClass() {
        return targetClass;
    }

    /**
     * Type of object in the source database affected by the action. i.e PL/SQL, SYNONYM, PACKAGE BODY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final java.util.List<String> objectType;

    /**
     * Type of object in the source database affected by the action. i.e PL/SQL, SYNONYM, PACKAGE BODY.
     * @return the value
     **/
    public java.util.List<String> getObjectType() {
        return objectType;
    }

    /**
     * Name of the host machine from which the session was spawned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientHostname")
    private final java.util.List<String> clientHostname;

    /**
     * Name of the host machine from which the session was spawned.
     * @return the value
     **/
    public java.util.List<String> getClientHostname() {
        return clientHostname;
    }

    /**
     * The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
    private final java.util.List<String> clientProgram;

    /**
     * The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
     * @return the value
     **/
    public java.util.List<String> getClientProgram() {
        return clientProgram;
    }

    /**
     * The client identifier in each Oracle session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final java.util.List<String> clientId;

    /**
     * The client identifier in each Oracle session.
     * @return the value
     **/
    public java.util.List<String> getClientId() {
        return clientId;
    }

    /**
     **/
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
    /**
     * Type of auditing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditType")
    private final java.util.List<AuditType> auditType;

    /**
     * Type of auditing.
     * @return the value
     **/
    public java.util.List<AuditType> getAuditType() {
        return auditType;
    }

    /**
     * Name of the detail action executed by the user on the target database. i.e ALTER SEQUENCE, CREATE TRIGGER, CREATE INDEX.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventName")
    private final java.util.List<String> eventName;

    /**
     * Name of the detail action executed by the user on the target database. i.e ALTER SEQUENCE, CREATE TRIGGER, CREATE INDEX.
     * @return the value
     **/
    public java.util.List<String> getEventName() {
        return eventName;
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
        sb.append("AuditEventAggregationDimensions(");
        sb.append("auditEventTime=").append(String.valueOf(this.auditEventTime));
        sb.append(", dbUserName=").append(String.valueOf(this.dbUserName));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetName=").append(String.valueOf(this.targetName));
        sb.append(", targetClass=").append(String.valueOf(this.targetClass));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", clientHostname=").append(String.valueOf(this.clientHostname));
        sb.append(", clientProgram=").append(String.valueOf(this.clientProgram));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", auditType=").append(String.valueOf(this.auditType));
        sb.append(", eventName=").append(String.valueOf(this.eventName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditEventAggregationDimensions)) {
            return false;
        }

        AuditEventAggregationDimensions other = (AuditEventAggregationDimensions) o;
        return java.util.Objects.equals(this.auditEventTime, other.auditEventTime)
                && java.util.Objects.equals(this.dbUserName, other.dbUserName)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetName, other.targetName)
                && java.util.Objects.equals(this.targetClass, other.targetClass)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.clientHostname, other.clientHostname)
                && java.util.Objects.equals(this.clientProgram, other.clientProgram)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.auditType, other.auditType)
                && java.util.Objects.equals(this.eventName, other.eventName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.auditEventTime == null ? 43 : this.auditEventTime.hashCode());
        result = (result * PRIME) + (this.dbUserName == null ? 43 : this.dbUserName.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        result = (result * PRIME) + (this.targetClass == null ? 43 : this.targetClass.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result =
                (result * PRIME)
                        + (this.clientHostname == null ? 43 : this.clientHostname.hashCode());
        result =
                (result * PRIME)
                        + (this.clientProgram == null ? 43 : this.clientProgram.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.auditType == null ? 43 : this.auditType.hashCode());
        result = (result * PRIME) + (this.eventName == null ? 43 : this.eventName.hashCode());
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
