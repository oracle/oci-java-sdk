/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Java Server instance usage during a specified time period. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JavaServerInstanceUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JavaServerInstanceUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "serverInstanceKey",
        "fleetId",
        "serverInstanceName",
        "serverKey",
        "serverName",
        "serverVersion",
        "managedInstanceId",
        "hostName",
        "jvmKey",
        "jvmVendor",
        "jvmDistribution",
        "jvmVersion",
        "jvmSecurityStatus",
        "approximateDeployedApplicationCount",
        "timeStart",
        "timeEnd",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public JavaServerInstanceUsage(
            String serverInstanceKey,
            String fleetId,
            String serverInstanceName,
            String serverKey,
            String serverName,
            String serverVersion,
            String managedInstanceId,
            String hostName,
            String jvmKey,
            String jvmVendor,
            String jvmDistribution,
            String jvmVersion,
            JreSecurityStatus jvmSecurityStatus,
            Integer approximateDeployedApplicationCount,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.serverInstanceKey = serverInstanceKey;
        this.fleetId = fleetId;
        this.serverInstanceName = serverInstanceName;
        this.serverKey = serverKey;
        this.serverName = serverName;
        this.serverVersion = serverVersion;
        this.managedInstanceId = managedInstanceId;
        this.hostName = hostName;
        this.jvmKey = jvmKey;
        this.jvmVendor = jvmVendor;
        this.jvmDistribution = jvmDistribution;
        this.jvmVersion = jvmVersion;
        this.jvmSecurityStatus = jvmSecurityStatus;
        this.approximateDeployedApplicationCount = approximateDeployedApplicationCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The internal identifier of the Java Server instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverInstanceKey")
        private String serverInstanceKey;

        /**
         * The internal identifier of the Java Server instance.
         *
         * @param serverInstanceKey the value to set
         * @return this builder
         */
        public Builder serverInstanceKey(String serverInstanceKey) {
            this.serverInstanceKey = serverInstanceKey;
            this.__explicitlySet__.add("serverInstanceKey");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * related fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * related fleet.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /** The name of the Java Server instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverInstanceName")
        private String serverInstanceName;

        /**
         * The name of the Java Server instance.
         *
         * @param serverInstanceName the value to set
         * @return this builder
         */
        public Builder serverInstanceName(String serverInstanceName) {
            this.serverInstanceName = serverInstanceName;
            this.__explicitlySet__.add("serverInstanceName");
            return this;
        }
        /** The internal identifier of the related Java Server. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverKey")
        private String serverKey;

        /**
         * The internal identifier of the related Java Server.
         *
         * @param serverKey the value to set
         * @return this builder
         */
        public Builder serverKey(String serverKey) {
            this.serverKey = serverKey;
            this.__explicitlySet__.add("serverKey");
            return this;
        }
        /** The name of the Java Server. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverName")
        private String serverName;

        /**
         * The name of the Java Server.
         *
         * @param serverName the value to set
         * @return this builder
         */
        public Builder serverName(String serverName) {
            this.serverName = serverName;
            this.__explicitlySet__.add("serverName");
            return this;
        }
        /** The version of the Java Server. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverVersion")
        private String serverVersion;

        /**
         * The version of the Java Server.
         *
         * @param serverVersion the value to set
         * @return this builder
         */
        public Builder serverVersion(String serverVersion) {
            this.serverVersion = serverVersion;
            this.__explicitlySet__.add("serverVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * related managed instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * related managed instance.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /** The host name of the related managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The host name of the related managed instance.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The internal identifier of the related Java Runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("jvmKey")
        private String jvmKey;

        /**
         * The internal identifier of the related Java Runtime.
         *
         * @param jvmKey the value to set
         * @return this builder
         */
        public Builder jvmKey(String jvmKey) {
            this.jvmKey = jvmKey;
            this.__explicitlySet__.add("jvmKey");
            return this;
        }
        /** The vendor of the Java Runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("jvmVendor")
        private String jvmVendor;

        /**
         * The vendor of the Java Runtime.
         *
         * @param jvmVendor the value to set
         * @return this builder
         */
        public Builder jvmVendor(String jvmVendor) {
            this.jvmVendor = jvmVendor;
            this.__explicitlySet__.add("jvmVendor");
            return this;
        }
        /** The distribution of the Java Runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("jvmDistribution")
        private String jvmDistribution;

        /**
         * The distribution of the Java Runtime.
         *
         * @param jvmDistribution the value to set
         * @return this builder
         */
        public Builder jvmDistribution(String jvmDistribution) {
            this.jvmDistribution = jvmDistribution;
            this.__explicitlySet__.add("jvmDistribution");
            return this;
        }
        /** The version of the Java Runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("jvmVersion")
        private String jvmVersion;

        /**
         * The version of the Java Runtime.
         *
         * @param jvmVersion the value to set
         * @return this builder
         */
        public Builder jvmVersion(String jvmVersion) {
            this.jvmVersion = jvmVersion;
            this.__explicitlySet__.add("jvmVersion");
            return this;
        }
        /** The security status of the Java Runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("jvmSecurityStatus")
        private JreSecurityStatus jvmSecurityStatus;

        /**
         * The security status of the Java Runtime.
         *
         * @param jvmSecurityStatus the value to set
         * @return this builder
         */
        public Builder jvmSecurityStatus(JreSecurityStatus jvmSecurityStatus) {
            this.jvmSecurityStatus = jvmSecurityStatus;
            this.__explicitlySet__.add("jvmSecurityStatus");
            return this;
        }
        /** The approximate count of deployed applications in the Java Server instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateDeployedApplicationCount")
        private Integer approximateDeployedApplicationCount;

        /**
         * The approximate count of deployed applications in the Java Server instance.
         *
         * @param approximateDeployedApplicationCount the value to set
         * @return this builder
         */
        public Builder approximateDeployedApplicationCount(
                Integer approximateDeployedApplicationCount) {
            this.approximateDeployedApplicationCount = approximateDeployedApplicationCount;
            this.__explicitlySet__.add("approximateDeployedApplicationCount");
            return this;
        }
        /**
         * Lower bound of the specified time period filter. JMS provides a view of the data that is
         * _per day_. The query uses only the date element of the parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Lower bound of the specified time period filter. JMS provides a view of the data that is
         * _per day_. The query uses only the date element of the parameter.
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * Upper bound of the specified time period filter. JMS provides a view of the data that is
         * _per day_. The query uses only the date element of the parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Upper bound of the specified time period filter. JMS provides a view of the data that is
         * _per day_. The query uses only the date element of the parameter.
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * The date and time the resource was _first_ reported to JMS. This is potentially _before_
         * the specified time period provided by the filters. For example, a resource can be first
         * reported to JMS before the start of a specified time period, if it is also reported
         * during the time period.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
        private java.util.Date timeFirstSeen;

        /**
         * The date and time the resource was _first_ reported to JMS. This is potentially _before_
         * the specified time period provided by the filters. For example, a resource can be first
         * reported to JMS before the start of a specified time period, if it is also reported
         * during the time period.
         *
         * @param timeFirstSeen the value to set
         * @return this builder
         */
        public Builder timeFirstSeen(java.util.Date timeFirstSeen) {
            this.timeFirstSeen = timeFirstSeen;
            this.__explicitlySet__.add("timeFirstSeen");
            return this;
        }
        /**
         * The date and time the resource was _last_ reported to JMS. This is potentially _after_
         * the specified time period provided by the filters. For example, a resource can be last
         * reported to JMS before the start of a specified time period, if it is also reported
         * during the time period.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        /**
         * The date and time the resource was _last_ reported to JMS. This is potentially _after_
         * the specified time period provided by the filters. For example, a resource can be last
         * reported to JMS before the start of a specified time period, if it is also reported
         * during the time period.
         *
         * @param timeLastSeen the value to set
         * @return this builder
         */
        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaServerInstanceUsage build() {
            JavaServerInstanceUsage model =
                    new JavaServerInstanceUsage(
                            this.serverInstanceKey,
                            this.fleetId,
                            this.serverInstanceName,
                            this.serverKey,
                            this.serverName,
                            this.serverVersion,
                            this.managedInstanceId,
                            this.hostName,
                            this.jvmKey,
                            this.jvmVendor,
                            this.jvmDistribution,
                            this.jvmVersion,
                            this.jvmSecurityStatus,
                            this.approximateDeployedApplicationCount,
                            this.timeStart,
                            this.timeEnd,
                            this.timeFirstSeen,
                            this.timeLastSeen);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaServerInstanceUsage model) {
            if (model.wasPropertyExplicitlySet("serverInstanceKey")) {
                this.serverInstanceKey(model.getServerInstanceKey());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("serverInstanceName")) {
                this.serverInstanceName(model.getServerInstanceName());
            }
            if (model.wasPropertyExplicitlySet("serverKey")) {
                this.serverKey(model.getServerKey());
            }
            if (model.wasPropertyExplicitlySet("serverName")) {
                this.serverName(model.getServerName());
            }
            if (model.wasPropertyExplicitlySet("serverVersion")) {
                this.serverVersion(model.getServerVersion());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("jvmKey")) {
                this.jvmKey(model.getJvmKey());
            }
            if (model.wasPropertyExplicitlySet("jvmVendor")) {
                this.jvmVendor(model.getJvmVendor());
            }
            if (model.wasPropertyExplicitlySet("jvmDistribution")) {
                this.jvmDistribution(model.getJvmDistribution());
            }
            if (model.wasPropertyExplicitlySet("jvmVersion")) {
                this.jvmVersion(model.getJvmVersion());
            }
            if (model.wasPropertyExplicitlySet("jvmSecurityStatus")) {
                this.jvmSecurityStatus(model.getJvmSecurityStatus());
            }
            if (model.wasPropertyExplicitlySet("approximateDeployedApplicationCount")) {
                this.approximateDeployedApplicationCount(
                        model.getApproximateDeployedApplicationCount());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("timeFirstSeen")) {
                this.timeFirstSeen(model.getTimeFirstSeen());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeen")) {
                this.timeLastSeen(model.getTimeLastSeen());
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

    /** The internal identifier of the Java Server instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverInstanceKey")
    private final String serverInstanceKey;

    /**
     * The internal identifier of the Java Server instance.
     *
     * @return the value
     */
    public String getServerInstanceKey() {
        return serverInstanceKey;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * related fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * related fleet.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
    }

    /** The name of the Java Server instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverInstanceName")
    private final String serverInstanceName;

    /**
     * The name of the Java Server instance.
     *
     * @return the value
     */
    public String getServerInstanceName() {
        return serverInstanceName;
    }

    /** The internal identifier of the related Java Server. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverKey")
    private final String serverKey;

    /**
     * The internal identifier of the related Java Server.
     *
     * @return the value
     */
    public String getServerKey() {
        return serverKey;
    }

    /** The name of the Java Server. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverName")
    private final String serverName;

    /**
     * The name of the Java Server.
     *
     * @return the value
     */
    public String getServerName() {
        return serverName;
    }

    /** The version of the Java Server. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverVersion")
    private final String serverVersion;

    /**
     * The version of the Java Server.
     *
     * @return the value
     */
    public String getServerVersion() {
        return serverVersion;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * related managed instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * related managed instance.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /** The host name of the related managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The host name of the related managed instance.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The internal identifier of the related Java Runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmKey")
    private final String jvmKey;

    /**
     * The internal identifier of the related Java Runtime.
     *
     * @return the value
     */
    public String getJvmKey() {
        return jvmKey;
    }

    /** The vendor of the Java Runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmVendor")
    private final String jvmVendor;

    /**
     * The vendor of the Java Runtime.
     *
     * @return the value
     */
    public String getJvmVendor() {
        return jvmVendor;
    }

    /** The distribution of the Java Runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmDistribution")
    private final String jvmDistribution;

    /**
     * The distribution of the Java Runtime.
     *
     * @return the value
     */
    public String getJvmDistribution() {
        return jvmDistribution;
    }

    /** The version of the Java Runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmVersion")
    private final String jvmVersion;

    /**
     * The version of the Java Runtime.
     *
     * @return the value
     */
    public String getJvmVersion() {
        return jvmVersion;
    }

    /** The security status of the Java Runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmSecurityStatus")
    private final JreSecurityStatus jvmSecurityStatus;

    /**
     * The security status of the Java Runtime.
     *
     * @return the value
     */
    public JreSecurityStatus getJvmSecurityStatus() {
        return jvmSecurityStatus;
    }

    /** The approximate count of deployed applications in the Java Server instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateDeployedApplicationCount")
    private final Integer approximateDeployedApplicationCount;

    /**
     * The approximate count of deployed applications in the Java Server instance.
     *
     * @return the value
     */
    public Integer getApproximateDeployedApplicationCount() {
        return approximateDeployedApplicationCount;
    }

    /**
     * Lower bound of the specified time period filter. JMS provides a view of the data that is _per
     * day_. The query uses only the date element of the parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Lower bound of the specified time period filter. JMS provides a view of the data that is _per
     * day_. The query uses only the date element of the parameter.
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Upper bound of the specified time period filter. JMS provides a view of the data that is _per
     * day_. The query uses only the date element of the parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Upper bound of the specified time period filter. JMS provides a view of the data that is _per
     * day_. The query uses only the date element of the parameter.
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * The date and time the resource was _first_ reported to JMS. This is potentially _before_ the
     * specified time period provided by the filters. For example, a resource can be first reported
     * to JMS before the start of a specified time period, if it is also reported during the time
     * period.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
    private final java.util.Date timeFirstSeen;

    /**
     * The date and time the resource was _first_ reported to JMS. This is potentially _before_ the
     * specified time period provided by the filters. For example, a resource can be first reported
     * to JMS before the start of a specified time period, if it is also reported during the time
     * period.
     *
     * @return the value
     */
    public java.util.Date getTimeFirstSeen() {
        return timeFirstSeen;
    }

    /**
     * The date and time the resource was _last_ reported to JMS. This is potentially _after_ the
     * specified time period provided by the filters. For example, a resource can be last reported
     * to JMS before the start of a specified time period, if it is also reported during the time
     * period.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    private final java.util.Date timeLastSeen;

    /**
     * The date and time the resource was _last_ reported to JMS. This is potentially _after_ the
     * specified time period provided by the filters. For example, a resource can be last reported
     * to JMS before the start of a specified time period, if it is also reported during the time
     * period.
     *
     * @return the value
     */
    public java.util.Date getTimeLastSeen() {
        return timeLastSeen;
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
        sb.append("JavaServerInstanceUsage(");
        sb.append("super=").append(super.toString());
        sb.append("serverInstanceKey=").append(String.valueOf(this.serverInstanceKey));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", serverInstanceName=").append(String.valueOf(this.serverInstanceName));
        sb.append(", serverKey=").append(String.valueOf(this.serverKey));
        sb.append(", serverName=").append(String.valueOf(this.serverName));
        sb.append(", serverVersion=").append(String.valueOf(this.serverVersion));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", jvmKey=").append(String.valueOf(this.jvmKey));
        sb.append(", jvmVendor=").append(String.valueOf(this.jvmVendor));
        sb.append(", jvmDistribution=").append(String.valueOf(this.jvmDistribution));
        sb.append(", jvmVersion=").append(String.valueOf(this.jvmVersion));
        sb.append(", jvmSecurityStatus=").append(String.valueOf(this.jvmSecurityStatus));
        sb.append(", approximateDeployedApplicationCount=")
                .append(String.valueOf(this.approximateDeployedApplicationCount));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", timeFirstSeen=").append(String.valueOf(this.timeFirstSeen));
        sb.append(", timeLastSeen=").append(String.valueOf(this.timeLastSeen));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaServerInstanceUsage)) {
            return false;
        }

        JavaServerInstanceUsage other = (JavaServerInstanceUsage) o;
        return java.util.Objects.equals(this.serverInstanceKey, other.serverInstanceKey)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.serverInstanceName, other.serverInstanceName)
                && java.util.Objects.equals(this.serverKey, other.serverKey)
                && java.util.Objects.equals(this.serverName, other.serverName)
                && java.util.Objects.equals(this.serverVersion, other.serverVersion)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.jvmKey, other.jvmKey)
                && java.util.Objects.equals(this.jvmVendor, other.jvmVendor)
                && java.util.Objects.equals(this.jvmDistribution, other.jvmDistribution)
                && java.util.Objects.equals(this.jvmVersion, other.jvmVersion)
                && java.util.Objects.equals(this.jvmSecurityStatus, other.jvmSecurityStatus)
                && java.util.Objects.equals(
                        this.approximateDeployedApplicationCount,
                        other.approximateDeployedApplicationCount)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.timeFirstSeen, other.timeFirstSeen)
                && java.util.Objects.equals(this.timeLastSeen, other.timeLastSeen)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serverInstanceKey == null ? 43 : this.serverInstanceKey.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.serverInstanceName == null
                                ? 43
                                : this.serverInstanceName.hashCode());
        result = (result * PRIME) + (this.serverKey == null ? 43 : this.serverKey.hashCode());
        result = (result * PRIME) + (this.serverName == null ? 43 : this.serverName.hashCode());
        result =
                (result * PRIME)
                        + (this.serverVersion == null ? 43 : this.serverVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.jvmKey == null ? 43 : this.jvmKey.hashCode());
        result = (result * PRIME) + (this.jvmVendor == null ? 43 : this.jvmVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.jvmDistribution == null ? 43 : this.jvmDistribution.hashCode());
        result = (result * PRIME) + (this.jvmVersion == null ? 43 : this.jvmVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.jvmSecurityStatus == null ? 43 : this.jvmSecurityStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateDeployedApplicationCount == null
                                ? 43
                                : this.approximateDeployedApplicationCount.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSeen == null ? 43 : this.timeFirstSeen.hashCode());
        result = (result * PRIME) + (this.timeLastSeen == null ? 43 : this.timeLastSeen.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
