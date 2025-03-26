/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the monitor assigned to an On-premise vantage point worker.
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
    builder = WorkerMonitorList.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkerMonitorList extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "monitorType",
        "isRunNow",
        "timeAssigned"
    })
    public WorkerMonitorList(
            String id,
            String displayName,
            MonitorTypes monitorType,
            Boolean isRunNow,
            java.util.Date timeAssigned) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.monitorType = monitorType;
        this.isRunNow = isRunNow;
        this.timeAssigned = timeAssigned;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitor.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitor.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Type of monitor.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("monitorType")
        private MonitorTypes monitorType;

        /**
         * Type of monitor.
         * @param monitorType the value to set
         * @return this builder
         **/
        public Builder monitorType(MonitorTypes monitorType) {
            this.monitorType = monitorType;
            this.__explicitlySet__.add("monitorType");
            return this;
        }
        /**
         * If isRunNow is enabled, then the monitor will run immediately.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRunNow")
        private Boolean isRunNow;

        /**
         * If isRunNow is enabled, then the monitor will run immediately.
         * @param isRunNow the value to set
         * @return this builder
         **/
        public Builder isRunNow(Boolean isRunNow) {
            this.isRunNow = isRunNow;
            this.__explicitlySet__.add("isRunNow");
            return this;
        }
        /**
         * The time the resource was last assigned to an On-premise vantage point worker, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2020-02-12T22:47:12.613Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAssigned")
        private java.util.Date timeAssigned;

        /**
         * The time the resource was last assigned to an On-premise vantage point worker, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2020-02-12T22:47:12.613Z}
         *
         * @param timeAssigned the value to set
         * @return this builder
         **/
        public Builder timeAssigned(java.util.Date timeAssigned) {
            this.timeAssigned = timeAssigned;
            this.__explicitlySet__.add("timeAssigned");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkerMonitorList build() {
            WorkerMonitorList model =
                    new WorkerMonitorList(
                            this.id,
                            this.displayName,
                            this.monitorType,
                            this.isRunNow,
                            this.timeAssigned);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkerMonitorList model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("monitorType")) {
                this.monitorType(model.getMonitorType());
            }
            if (model.wasPropertyExplicitlySet("isRunNow")) {
                this.isRunNow(model.getIsRunNow());
            }
            if (model.wasPropertyExplicitlySet("timeAssigned")) {
                this.timeAssigned(model.getTimeAssigned());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitor.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Type of monitor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monitorType")
    private final MonitorTypes monitorType;

    /**
     * Type of monitor.
     * @return the value
     **/
    public MonitorTypes getMonitorType() {
        return monitorType;
    }

    /**
     * If isRunNow is enabled, then the monitor will run immediately.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRunNow")
    private final Boolean isRunNow;

    /**
     * If isRunNow is enabled, then the monitor will run immediately.
     * @return the value
     **/
    public Boolean getIsRunNow() {
        return isRunNow;
    }

    /**
     * The time the resource was last assigned to an On-premise vantage point worker, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-12T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssigned")
    private final java.util.Date timeAssigned;

    /**
     * The time the resource was last assigned to an On-premise vantage point worker, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-12T22:47:12.613Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeAssigned() {
        return timeAssigned;
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
        sb.append("WorkerMonitorList(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", monitorType=").append(String.valueOf(this.monitorType));
        sb.append(", isRunNow=").append(String.valueOf(this.isRunNow));
        sb.append(", timeAssigned=").append(String.valueOf(this.timeAssigned));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkerMonitorList)) {
            return false;
        }

        WorkerMonitorList other = (WorkerMonitorList) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.monitorType, other.monitorType)
                && java.util.Objects.equals(this.isRunNow, other.isRunNow)
                && java.util.Objects.equals(this.timeAssigned, other.timeAssigned)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.monitorType == null ? 43 : this.monitorType.hashCode());
        result = (result * PRIME) + (this.isRunNow == null ? 43 : this.isRunNow.hashCode());
        result = (result * PRIME) + (this.timeAssigned == null ? 43 : this.timeAssigned.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
