/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The details of a maintenance event.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaintenanceEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MaintenanceEvent extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dbSystemId",
        "compartmentId",
        "maintenanceNotes",
        "timeCreated",
        "timeStarted",
        "timeEnded",
        "timeMysqlSwitchOverStarted",
        "timeMysqlSwitchOverEnded",
        "mysqlVersionBeforeMaintenance",
        "mysqlVersionAfterMaintenance",
        "maintenanceScope",
        "maintenanceType",
        "maintenanceAction",
        "maintenanceStatus"
    })
    public MaintenanceEvent(
            String dbSystemId,
            String compartmentId,
            String maintenanceNotes,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            java.util.Date timeMysqlSwitchOverStarted,
            java.util.Date timeMysqlSwitchOverEnded,
            String mysqlVersionBeforeMaintenance,
            String mysqlVersionAfterMaintenance,
            MaintenanceScope maintenanceScope,
            MaintenanceType maintenanceType,
            MaintenanceAction maintenanceAction,
            MaintenanceStatus maintenanceStatus) {
        super();
        this.dbSystemId = dbSystemId;
        this.compartmentId = compartmentId;
        this.maintenanceNotes = maintenanceNotes;
        this.timeCreated = timeCreated;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.timeMysqlSwitchOverStarted = timeMysqlSwitchOverStarted;
        this.timeMysqlSwitchOverEnded = timeMysqlSwitchOverEnded;
        this.mysqlVersionBeforeMaintenance = mysqlVersionBeforeMaintenance;
        this.mysqlVersionAfterMaintenance = mysqlVersionAfterMaintenance;
        this.maintenanceScope = maintenanceScope;
        this.maintenanceType = maintenanceType;
        this.maintenanceAction = maintenanceAction;
        this.maintenanceStatus = maintenanceStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the DB System this maintenance event is associated with.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the DB System this maintenance event is associated with.
         * @param dbSystemId the value to set
         * @return this builder
         **/
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The OCID of the compartment the maintenance event belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment the maintenance event belongs to.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Information regarding what was performed during that maintenance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceNotes")
        private String maintenanceNotes;

        /**
         * Information regarding what was performed during that maintenance.
         * @param maintenanceNotes the value to set
         * @return this builder
         **/
        public Builder maintenanceNotes(String maintenanceNotes) {
            this.maintenanceNotes = maintenanceNotes;
            this.__explicitlySet__.add("maintenanceNotes");
            return this;
        }
        /**
         * The date and time the record was created,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the record was created,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the maintenance event started,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the maintenance event started,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the maintenance event ended,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time the maintenance event ended,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * The date and time the DB System was initially down during the maintenance,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMysqlSwitchOverStarted")
        private java.util.Date timeMysqlSwitchOverStarted;

        /**
         * The date and time the DB System was initially down during the maintenance,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeMysqlSwitchOverStarted the value to set
         * @return this builder
         **/
        public Builder timeMysqlSwitchOverStarted(java.util.Date timeMysqlSwitchOverStarted) {
            this.timeMysqlSwitchOverStarted = timeMysqlSwitchOverStarted;
            this.__explicitlySet__.add("timeMysqlSwitchOverStarted");
            return this;
        }
        /**
         * The date and time the DB System came back online during the maintenance,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMysqlSwitchOverEnded")
        private java.util.Date timeMysqlSwitchOverEnded;

        /**
         * The date and time the DB System came back online during the maintenance,
         * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeMysqlSwitchOverEnded the value to set
         * @return this builder
         **/
        public Builder timeMysqlSwitchOverEnded(java.util.Date timeMysqlSwitchOverEnded) {
            this.timeMysqlSwitchOverEnded = timeMysqlSwitchOverEnded;
            this.__explicitlySet__.add("timeMysqlSwitchOverEnded");
            return this;
        }
        /**
         * The MySQL version prior to the maintenance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersionBeforeMaintenance")
        private String mysqlVersionBeforeMaintenance;

        /**
         * The MySQL version prior to the maintenance.
         * @param mysqlVersionBeforeMaintenance the value to set
         * @return this builder
         **/
        public Builder mysqlVersionBeforeMaintenance(String mysqlVersionBeforeMaintenance) {
            this.mysqlVersionBeforeMaintenance = mysqlVersionBeforeMaintenance;
            this.__explicitlySet__.add("mysqlVersionBeforeMaintenance");
            return this;
        }
        /**
         * The MySQL version after the maintenance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersionAfterMaintenance")
        private String mysqlVersionAfterMaintenance;

        /**
         * The MySQL version after the maintenance.
         * @param mysqlVersionAfterMaintenance the value to set
         * @return this builder
         **/
        public Builder mysqlVersionAfterMaintenance(String mysqlVersionAfterMaintenance) {
            this.mysqlVersionAfterMaintenance = mysqlVersionAfterMaintenance;
            this.__explicitlySet__.add("mysqlVersionAfterMaintenance");
            return this;
        }
        /**
         * The MySQL instances operated during a maintenance event.
         * <p>
         * ALL:             maintenance event targeting all MySQL instances in a DB System.
         * ALL_BUT_PRIMARY: maintenance event targeting all MySQL instances in a highly available DB System except the primary group member.
         * PRIMARY_ONLY:    maintenance event targeting only the primary group member in a highly available DB System.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceScope")
        private MaintenanceScope maintenanceScope;

        /**
         * The MySQL instances operated during a maintenance event.
         * <p>
         * ALL:             maintenance event targeting all MySQL instances in a DB System.
         * ALL_BUT_PRIMARY: maintenance event targeting all MySQL instances in a highly available DB System except the primary group member.
         * PRIMARY_ONLY:    maintenance event targeting only the primary group member in a highly available DB System.
         *
         * @param maintenanceScope the value to set
         * @return this builder
         **/
        public Builder maintenanceScope(MaintenanceScope maintenanceScope) {
            this.maintenanceScope = maintenanceScope;
            this.__explicitlySet__.add("maintenanceScope");
            return this;
        }
        /**
         * How the maintenance event was triggered.
         * <p>
         * AUTOMATIC:  maintenance event triggered as part of scheduled maintenance.
         * MANUAL:     maintenance event triggered manually.
         * SHAPE:      maintenance event triggered by a shape update.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
        private MaintenanceType maintenanceType;

        /**
         * How the maintenance event was triggered.
         * <p>
         * AUTOMATIC:  maintenance event triggered as part of scheduled maintenance.
         * MANUAL:     maintenance event triggered manually.
         * SHAPE:      maintenance event triggered by a shape update.
         *
         * @param maintenanceType the value to set
         * @return this builder
         **/
        public Builder maintenanceType(MaintenanceType maintenanceType) {
            this.maintenanceType = maintenanceType;
            this.__explicitlySet__.add("maintenanceType");
            return this;
        }
        /**
         * The nature of the maintenance event.
         * <p>
         * DATABASE:  maintenance event causing a MySQL version upgrade. This may also include OS updates.
         * OS_UPDATE: maintenance event causing an OS update.
         * ONLINE_UPDATE: maintenance event causing downtime-free OS security patches.
         * HARDWARE: hardware maintenance event affecting the DB System's VMs and BMs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceAction")
        private MaintenanceAction maintenanceAction;

        /**
         * The nature of the maintenance event.
         * <p>
         * DATABASE:  maintenance event causing a MySQL version upgrade. This may also include OS updates.
         * OS_UPDATE: maintenance event causing an OS update.
         * ONLINE_UPDATE: maintenance event causing downtime-free OS security patches.
         * HARDWARE: hardware maintenance event affecting the DB System's VMs and BMs.
         *
         * @param maintenanceAction the value to set
         * @return this builder
         **/
        public Builder maintenanceAction(MaintenanceAction maintenanceAction) {
            this.maintenanceAction = maintenanceAction;
            this.__explicitlySet__.add("maintenanceAction");
            return this;
        }
        /**
         * The last status of the maintenance event.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceStatus")
        private MaintenanceStatus maintenanceStatus;

        /**
         * The last status of the maintenance event.
         *
         * @param maintenanceStatus the value to set
         * @return this builder
         **/
        public Builder maintenanceStatus(MaintenanceStatus maintenanceStatus) {
            this.maintenanceStatus = maintenanceStatus;
            this.__explicitlySet__.add("maintenanceStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceEvent build() {
            MaintenanceEvent model =
                    new MaintenanceEvent(
                            this.dbSystemId,
                            this.compartmentId,
                            this.maintenanceNotes,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeEnded,
                            this.timeMysqlSwitchOverStarted,
                            this.timeMysqlSwitchOverEnded,
                            this.mysqlVersionBeforeMaintenance,
                            this.mysqlVersionAfterMaintenance,
                            this.maintenanceScope,
                            this.maintenanceType,
                            this.maintenanceAction,
                            this.maintenanceStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceEvent model) {
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("maintenanceNotes")) {
                this.maintenanceNotes(model.getMaintenanceNotes());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("timeMysqlSwitchOverStarted")) {
                this.timeMysqlSwitchOverStarted(model.getTimeMysqlSwitchOverStarted());
            }
            if (model.wasPropertyExplicitlySet("timeMysqlSwitchOverEnded")) {
                this.timeMysqlSwitchOverEnded(model.getTimeMysqlSwitchOverEnded());
            }
            if (model.wasPropertyExplicitlySet("mysqlVersionBeforeMaintenance")) {
                this.mysqlVersionBeforeMaintenance(model.getMysqlVersionBeforeMaintenance());
            }
            if (model.wasPropertyExplicitlySet("mysqlVersionAfterMaintenance")) {
                this.mysqlVersionAfterMaintenance(model.getMysqlVersionAfterMaintenance());
            }
            if (model.wasPropertyExplicitlySet("maintenanceScope")) {
                this.maintenanceScope(model.getMaintenanceScope());
            }
            if (model.wasPropertyExplicitlySet("maintenanceType")) {
                this.maintenanceType(model.getMaintenanceType());
            }
            if (model.wasPropertyExplicitlySet("maintenanceAction")) {
                this.maintenanceAction(model.getMaintenanceAction());
            }
            if (model.wasPropertyExplicitlySet("maintenanceStatus")) {
                this.maintenanceStatus(model.getMaintenanceStatus());
            }
            return this;
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
     * The OCID of the DB System this maintenance event is associated with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the DB System this maintenance event is associated with.
     * @return the value
     **/
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The OCID of the compartment the maintenance event belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment the maintenance event belongs to.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Information regarding what was performed during that maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceNotes")
    private final String maintenanceNotes;

    /**
     * Information regarding what was performed during that maintenance.
     * @return the value
     **/
    public String getMaintenanceNotes() {
        return maintenanceNotes;
    }

    /**
     * The date and time the record was created,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the record was created,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the maintenance event started,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the maintenance event started,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the maintenance event ended,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time the maintenance event ended,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * The date and time the DB System was initially down during the maintenance,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMysqlSwitchOverStarted")
    private final java.util.Date timeMysqlSwitchOverStarted;

    /**
     * The date and time the DB System was initially down during the maintenance,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeMysqlSwitchOverStarted() {
        return timeMysqlSwitchOverStarted;
    }

    /**
     * The date and time the DB System came back online during the maintenance,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMysqlSwitchOverEnded")
    private final java.util.Date timeMysqlSwitchOverEnded;

    /**
     * The date and time the DB System came back online during the maintenance,
     * as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeMysqlSwitchOverEnded() {
        return timeMysqlSwitchOverEnded;
    }

    /**
     * The MySQL version prior to the maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersionBeforeMaintenance")
    private final String mysqlVersionBeforeMaintenance;

    /**
     * The MySQL version prior to the maintenance.
     * @return the value
     **/
    public String getMysqlVersionBeforeMaintenance() {
        return mysqlVersionBeforeMaintenance;
    }

    /**
     * The MySQL version after the maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersionAfterMaintenance")
    private final String mysqlVersionAfterMaintenance;

    /**
     * The MySQL version after the maintenance.
     * @return the value
     **/
    public String getMysqlVersionAfterMaintenance() {
        return mysqlVersionAfterMaintenance;
    }

    /**
     * The MySQL instances operated during a maintenance event.
     * <p>
     * ALL:             maintenance event targeting all MySQL instances in a DB System.
     * ALL_BUT_PRIMARY: maintenance event targeting all MySQL instances in a highly available DB System except the primary group member.
     * PRIMARY_ONLY:    maintenance event targeting only the primary group member in a highly available DB System.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceScope")
    private final MaintenanceScope maintenanceScope;

    /**
     * The MySQL instances operated during a maintenance event.
     * <p>
     * ALL:             maintenance event targeting all MySQL instances in a DB System.
     * ALL_BUT_PRIMARY: maintenance event targeting all MySQL instances in a highly available DB System except the primary group member.
     * PRIMARY_ONLY:    maintenance event targeting only the primary group member in a highly available DB System.
     *
     * @return the value
     **/
    public MaintenanceScope getMaintenanceScope() {
        return maintenanceScope;
    }

    /**
     * How the maintenance event was triggered.
     * <p>
     * AUTOMATIC:  maintenance event triggered as part of scheduled maintenance.
     * MANUAL:     maintenance event triggered manually.
     * SHAPE:      maintenance event triggered by a shape update.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
    private final MaintenanceType maintenanceType;

    /**
     * How the maintenance event was triggered.
     * <p>
     * AUTOMATIC:  maintenance event triggered as part of scheduled maintenance.
     * MANUAL:     maintenance event triggered manually.
     * SHAPE:      maintenance event triggered by a shape update.
     *
     * @return the value
     **/
    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * The nature of the maintenance event.
     * <p>
     * DATABASE:  maintenance event causing a MySQL version upgrade. This may also include OS updates.
     * OS_UPDATE: maintenance event causing an OS update.
     * ONLINE_UPDATE: maintenance event causing downtime-free OS security patches.
     * HARDWARE: hardware maintenance event affecting the DB System's VMs and BMs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceAction")
    private final MaintenanceAction maintenanceAction;

    /**
     * The nature of the maintenance event.
     * <p>
     * DATABASE:  maintenance event causing a MySQL version upgrade. This may also include OS updates.
     * OS_UPDATE: maintenance event causing an OS update.
     * ONLINE_UPDATE: maintenance event causing downtime-free OS security patches.
     * HARDWARE: hardware maintenance event affecting the DB System's VMs and BMs.
     *
     * @return the value
     **/
    public MaintenanceAction getMaintenanceAction() {
        return maintenanceAction;
    }

    /**
     * The last status of the maintenance event.
     *
     **/
    public enum MaintenanceStatus {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MaintenanceStatus.class);

        private final String value;
        private static java.util.Map<String, MaintenanceStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (MaintenanceStatus v : MaintenanceStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaintenanceStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaintenanceStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaintenanceStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The last status of the maintenance event.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceStatus")
    private final MaintenanceStatus maintenanceStatus;

    /**
     * The last status of the maintenance event.
     *
     * @return the value
     **/
    public MaintenanceStatus getMaintenanceStatus() {
        return maintenanceStatus;
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
        sb.append("MaintenanceEvent(");
        sb.append("super=").append(super.toString());
        sb.append("dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", maintenanceNotes=").append(String.valueOf(this.maintenanceNotes));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", timeMysqlSwitchOverStarted=")
                .append(String.valueOf(this.timeMysqlSwitchOverStarted));
        sb.append(", timeMysqlSwitchOverEnded=")
                .append(String.valueOf(this.timeMysqlSwitchOverEnded));
        sb.append(", mysqlVersionBeforeMaintenance=")
                .append(String.valueOf(this.mysqlVersionBeforeMaintenance));
        sb.append(", mysqlVersionAfterMaintenance=")
                .append(String.valueOf(this.mysqlVersionAfterMaintenance));
        sb.append(", maintenanceScope=").append(String.valueOf(this.maintenanceScope));
        sb.append(", maintenanceType=").append(String.valueOf(this.maintenanceType));
        sb.append(", maintenanceAction=").append(String.valueOf(this.maintenanceAction));
        sb.append(", maintenanceStatus=").append(String.valueOf(this.maintenanceStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceEvent)) {
            return false;
        }

        MaintenanceEvent other = (MaintenanceEvent) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.maintenanceNotes, other.maintenanceNotes)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(
                        this.timeMysqlSwitchOverStarted, other.timeMysqlSwitchOverStarted)
                && java.util.Objects.equals(
                        this.timeMysqlSwitchOverEnded, other.timeMysqlSwitchOverEnded)
                && java.util.Objects.equals(
                        this.mysqlVersionBeforeMaintenance, other.mysqlVersionBeforeMaintenance)
                && java.util.Objects.equals(
                        this.mysqlVersionAfterMaintenance, other.mysqlVersionAfterMaintenance)
                && java.util.Objects.equals(this.maintenanceScope, other.maintenanceScope)
                && java.util.Objects.equals(this.maintenanceType, other.maintenanceType)
                && java.util.Objects.equals(this.maintenanceAction, other.maintenanceAction)
                && java.util.Objects.equals(this.maintenanceStatus, other.maintenanceStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceNotes == null ? 43 : this.maintenanceNotes.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMysqlSwitchOverStarted == null
                                ? 43
                                : this.timeMysqlSwitchOverStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMysqlSwitchOverEnded == null
                                ? 43
                                : this.timeMysqlSwitchOverEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlVersionBeforeMaintenance == null
                                ? 43
                                : this.mysqlVersionBeforeMaintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlVersionAfterMaintenance == null
                                ? 43
                                : this.mysqlVersionAfterMaintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceScope == null ? 43 : this.maintenanceScope.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceType == null ? 43 : this.maintenanceType.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceAction == null ? 43 : this.maintenanceAction.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceStatus == null ? 43 : this.maintenanceStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
