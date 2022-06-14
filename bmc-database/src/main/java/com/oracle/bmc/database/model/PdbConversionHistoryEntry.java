/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of operations performed to convert a non-container database to pluggable database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PdbConversionHistoryEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PdbConversionHistoryEntry {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "action",
        "target",
        "sourceDatabaseId",
        "targetDatabaseId",
        "cdbName",
        "lifecycleState",
        "lifecycleDetails",
        "timeStarted",
        "timeEnded",
        "additionalCdbParams"
    })
    public PdbConversionHistoryEntry(
            String id,
            Action action,
            Target target,
            String sourceDatabaseId,
            String targetDatabaseId,
            String cdbName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            String additionalCdbParams) {
        super();
        this.id = id;
        this.action = action;
        this.target = target;
        this.sourceDatabaseId = sourceDatabaseId;
        this.targetDatabaseId = targetDatabaseId;
        this.cdbName = cdbName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.additionalCdbParams = additionalCdbParams;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database conversion history.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database conversion history.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The operations used to convert a non-container database to a pluggable database.
         * - Use {@code PRECHECK} to run a pre-check operation on non-container database prior to converting it into a pluggable database.
         * - Use {@code CONVERT} to convert a non-container database into a pluggable database.
         * - Use {@code SYNC} if the non-container database was manually converted into a pluggable database using the dbcli command-line utility. Databases may need to be converted manually if the CONVERT action fails when converting a non-container database using the API.
         * - Use {@code SYNC_ROLLBACK} if the conversion of a non-container database into a pluggable database was manually rolled back using the dbcli command line utility. Conversions may need to be manually rolled back if the CONVERT action fails when converting a non-container database using the API.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The operations used to convert a non-container database to a pluggable database.
         * - Use {@code PRECHECK} to run a pre-check operation on non-container database prior to converting it into a pluggable database.
         * - Use {@code CONVERT} to convert a non-container database into a pluggable database.
         * - Use {@code SYNC} if the non-container database was manually converted into a pluggable database using the dbcli command-line utility. Databases may need to be converted manually if the CONVERT action fails when converting a non-container database using the API.
         * - Use {@code SYNC_ROLLBACK} if the conversion of a non-container database into a pluggable database was manually rolled back using the dbcli command line utility. Conversions may need to be manually rolled back if the CONVERT action fails when converting a non-container database using the API.
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The target container database of the pluggable database created by the database conversion operation. Currently, the database conversion operation only supports creating the pluggable database in a new container database.
         *  - Use {@code NEW_DATABASE} to specify that the pluggable database be created within a new container database in the same database home.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private Target target;

        /**
         * The target container database of the pluggable database created by the database conversion operation. Currently, the database conversion operation only supports creating the pluggable database in a new container database.
         *  - Use {@code NEW_DATABASE} to specify that the pluggable database be created within a new container database in the same database home.
         *
         * @param target the value to set
         * @return this builder
         **/
        public Builder target(Target target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseId")
        private String sourceDatabaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
         * @param sourceDatabaseId the value to set
         * @return this builder
         **/
        public Builder sourceDatabaseId(String sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            this.__explicitlySet__.add("sourceDatabaseId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseId")
        private String targetDatabaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
         * @param targetDatabaseId the value to set
         * @return this builder
         **/
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            this.__explicitlySet__.add("targetDatabaseId");
            return this;
        }
        /**
         * The database name. The name must begin with an alphabetic character and can contain a maximum of 8 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cdbName")
        private String cdbName;

        /**
         * The database name. The name must begin with an alphabetic character and can contain a maximum of 8 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
         * @param cdbName the value to set
         * @return this builder
         **/
        public Builder cdbName(String cdbName) {
            this.cdbName = cdbName;
            this.__explicitlySet__.add("cdbName");
            return this;
        }
        /**
         * Status of an operation performed during the conversion of a non-container database to a pluggable database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Status of an operation performed during the conversion of a non-container database to a pluggable database.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Additional information about the current lifecycle state for the conversion operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state for the conversion operation.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time when the database conversion operation started.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time when the database conversion operation started.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time when the database conversion operation ended.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time when the database conversion operation ended.
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * Additional container database parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalCdbParams")
        private String additionalCdbParams;

        /**
         * Additional container database parameter.
         *
         * @param additionalCdbParams the value to set
         * @return this builder
         **/
        public Builder additionalCdbParams(String additionalCdbParams) {
            this.additionalCdbParams = additionalCdbParams;
            this.__explicitlySet__.add("additionalCdbParams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PdbConversionHistoryEntry build() {
            PdbConversionHistoryEntry __instance__ =
                    new PdbConversionHistoryEntry(
                            id,
                            action,
                            target,
                            sourceDatabaseId,
                            targetDatabaseId,
                            cdbName,
                            lifecycleState,
                            lifecycleDetails,
                            timeStarted,
                            timeEnded,
                            additionalCdbParams);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PdbConversionHistoryEntry o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .action(o.getAction())
                            .target(o.getTarget())
                            .sourceDatabaseId(o.getSourceDatabaseId())
                            .targetDatabaseId(o.getTargetDatabaseId())
                            .cdbName(o.getCdbName())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
                            .additionalCdbParams(o.getAdditionalCdbParams());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database conversion history.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database conversion history.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The operations used to convert a non-container database to a pluggable database.
     * - Use {@code PRECHECK} to run a pre-check operation on non-container database prior to converting it into a pluggable database.
     * - Use {@code CONVERT} to convert a non-container database into a pluggable database.
     * - Use {@code SYNC} if the non-container database was manually converted into a pluggable database using the dbcli command-line utility. Databases may need to be converted manually if the CONVERT action fails when converting a non-container database using the API.
     * - Use {@code SYNC_ROLLBACK} if the conversion of a non-container database into a pluggable database was manually rolled back using the dbcli command line utility. Conversions may need to be manually rolled back if the CONVERT action fails when converting a non-container database using the API.
     *
     **/
    public enum Action {
        Precheck("PRECHECK"),
        Convert("CONVERT"),
        Sync("SYNC"),
        SyncRollback("SYNC_ROLLBACK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The operations used to convert a non-container database to a pluggable database.
     * - Use {@code PRECHECK} to run a pre-check operation on non-container database prior to converting it into a pluggable database.
     * - Use {@code CONVERT} to convert a non-container database into a pluggable database.
     * - Use {@code SYNC} if the non-container database was manually converted into a pluggable database using the dbcli command-line utility. Databases may need to be converted manually if the CONVERT action fails when converting a non-container database using the API.
     * - Use {@code SYNC_ROLLBACK} if the conversion of a non-container database into a pluggable database was manually rolled back using the dbcli command line utility. Conversions may need to be manually rolled back if the CONVERT action fails when converting a non-container database using the API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The operations used to convert a non-container database to a pluggable database.
     * - Use {@code PRECHECK} to run a pre-check operation on non-container database prior to converting it into a pluggable database.
     * - Use {@code CONVERT} to convert a non-container database into a pluggable database.
     * - Use {@code SYNC} if the non-container database was manually converted into a pluggable database using the dbcli command-line utility. Databases may need to be converted manually if the CONVERT action fails when converting a non-container database using the API.
     * - Use {@code SYNC_ROLLBACK} if the conversion of a non-container database into a pluggable database was manually rolled back using the dbcli command line utility. Conversions may need to be manually rolled back if the CONVERT action fails when converting a non-container database using the API.
     *
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * The target container database of the pluggable database created by the database conversion operation. Currently, the database conversion operation only supports creating the pluggable database in a new container database.
     *  - Use {@code NEW_DATABASE} to specify that the pluggable database be created within a new container database in the same database home.
     *
     **/
    public enum Target {
        NewDatabase("NEW_DATABASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Target.class);

        private final String value;
        private static java.util.Map<String, Target> map;

        static {
            map = new java.util.HashMap<>();
            for (Target v : Target.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Target(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Target create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Target', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The target container database of the pluggable database created by the database conversion operation. Currently, the database conversion operation only supports creating the pluggable database in a new container database.
     *  - Use {@code NEW_DATABASE} to specify that the pluggable database be created within a new container database in the same database home.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final Target target;

    /**
     * The target container database of the pluggable database created by the database conversion operation. Currently, the database conversion operation only supports creating the pluggable database in a new container database.
     *  - Use {@code NEW_DATABASE} to specify that the pluggable database be created within a new container database in the same database home.
     *
     * @return the value
     **/
    public Target getTarget() {
        return target;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseId")
    private final String sourceDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
     * @return the value
     **/
    public String getSourceDatabaseId() {
        return sourceDatabaseId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseId")
    private final String targetDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
     * @return the value
     **/
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }

    /**
     * The database name. The name must begin with an alphabetic character and can contain a maximum of 8 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdbName")
    private final String cdbName;

    /**
     * The database name. The name must begin with an alphabetic character and can contain a maximum of 8 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
     * @return the value
     **/
    public String getCdbName() {
        return cdbName;
    }

    /**
     * Status of an operation performed during the conversion of a non-container database to a pluggable database.
     **/
    public enum LifecycleState {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of an operation performed during the conversion of a non-container database to a pluggable database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Status of an operation performed during the conversion of a non-container database to a pluggable database.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Additional information about the current lifecycle state for the conversion operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state for the conversion operation.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time when the database conversion operation started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time when the database conversion operation started.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time when the database conversion operation ended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time when the database conversion operation ended.
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Additional container database parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalCdbParams")
    private final String additionalCdbParams;

    /**
     * Additional container database parameter.
     *
     * @return the value
     **/
    public String getAdditionalCdbParams() {
        return additionalCdbParams;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PdbConversionHistoryEntry(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", sourceDatabaseId=").append(String.valueOf(this.sourceDatabaseId));
        sb.append(", targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(", cdbName=").append(String.valueOf(this.cdbName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", additionalCdbParams=").append(String.valueOf(this.additionalCdbParams));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PdbConversionHistoryEntry)) {
            return false;
        }

        PdbConversionHistoryEntry other = (PdbConversionHistoryEntry) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.sourceDatabaseId, other.sourceDatabaseId)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.cdbName, other.cdbName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.additionalCdbParams, other.additionalCdbParams)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDatabaseId == null ? 43 : this.sourceDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result = (result * PRIME) + (this.cdbName == null ? 43 : this.cdbName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalCdbParams == null
                                ? 43
                                : this.additionalCdbParams.hashCode());
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
