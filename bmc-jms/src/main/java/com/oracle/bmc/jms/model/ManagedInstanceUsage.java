/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Managed instance usage during a specified time period. An entity that emits usage events to Java
 * Management Service (JMS) is represented as a managed instance. A managed instance has a unique
 * identity which is used by JMS to distinguish it from other managed instances. Currently, JMS
 * supports only one kind of managed instance, a Management Agent. <br>
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
        builder = ManagedInstanceUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ManagedInstanceUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedInstanceId",
        "managedInstanceType",
        "hostname",
        "hostId",
        "operatingSystem",
        "approximateApplicationCount",
        "approximateInstallationCount",
        "approximateJreCount",
        "timeStart",
        "timeEnd",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public ManagedInstanceUsage(
            String managedInstanceId,
            ManagedInstanceType managedInstanceType,
            String hostname,
            String hostId,
            OperatingSystem operatingSystem,
            Integer approximateApplicationCount,
            Integer approximateInstallationCount,
            Integer approximateJreCount,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.managedInstanceId = managedInstanceId;
        this.managedInstanceType = managedInstanceType;
        this.hostname = hostname;
        this.hostId = hostId;
        this.operatingSystem = operatingSystem;
        this.approximateApplicationCount = approximateApplicationCount;
        this.approximateInstallationCount = approximateInstallationCount;
        this.approximateJreCount = approximateJreCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The type of the source of events. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceType")
        private ManagedInstanceType managedInstanceType;

        /**
         * The type of the source of events.
         *
         * @param managedInstanceType the value to set
         * @return this builder
         */
        public Builder managedInstanceType(ManagedInstanceType managedInstanceType) {
            this.managedInstanceType = managedInstanceType;
            this.__explicitlySet__.add("managedInstanceType");
            return this;
        }
        /** The hostname of the managed instance (if applicable). */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname of the managed instance (if applicable).
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * The host [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * of the related managed instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostId")
        private String hostId;

        /**
         * The host [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * of the related managed instance.
         *
         * @param hostId the value to set
         * @return this builder
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            this.__explicitlySet__.add("hostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private OperatingSystem operatingSystem;

        public Builder operatingSystem(OperatingSystem operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }
        /** The approximate count of applications reported by this managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
        private Integer approximateApplicationCount;

        /**
         * The approximate count of applications reported by this managed instance.
         *
         * @param approximateApplicationCount the value to set
         * @return this builder
         */
        public Builder approximateApplicationCount(Integer approximateApplicationCount) {
            this.approximateApplicationCount = approximateApplicationCount;
            this.__explicitlySet__.add("approximateApplicationCount");
            return this;
        }
        /** The approximate count of installations reported by this managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
        private Integer approximateInstallationCount;

        /**
         * The approximate count of installations reported by this managed instance.
         *
         * @param approximateInstallationCount the value to set
         * @return this builder
         */
        public Builder approximateInstallationCount(Integer approximateInstallationCount) {
            this.approximateInstallationCount = approximateInstallationCount;
            this.__explicitlySet__.add("approximateInstallationCount");
            return this;
        }
        /** The approximate count of Java Runtimes reported by this managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateJreCount")
        private Integer approximateJreCount;

        /**
         * The approximate count of Java Runtimes reported by this managed instance.
         *
         * @param approximateJreCount the value to set
         * @return this builder
         */
        public Builder approximateJreCount(Integer approximateJreCount) {
            this.approximateJreCount = approximateJreCount;
            this.__explicitlySet__.add("approximateJreCount");
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

        public ManagedInstanceUsage build() {
            ManagedInstanceUsage model =
                    new ManagedInstanceUsage(
                            this.managedInstanceId,
                            this.managedInstanceType,
                            this.hostname,
                            this.hostId,
                            this.operatingSystem,
                            this.approximateApplicationCount,
                            this.approximateInstallationCount,
                            this.approximateJreCount,
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
        public Builder copy(ManagedInstanceUsage model) {
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceType")) {
                this.managedInstanceType(model.getManagedInstanceType());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("hostId")) {
                this.hostId(model.getHostId());
            }
            if (model.wasPropertyExplicitlySet("operatingSystem")) {
                this.operatingSystem(model.getOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("approximateApplicationCount")) {
                this.approximateApplicationCount(model.getApproximateApplicationCount());
            }
            if (model.wasPropertyExplicitlySet("approximateInstallationCount")) {
                this.approximateInstallationCount(model.getApproximateInstallationCount());
            }
            if (model.wasPropertyExplicitlySet("approximateJreCount")) {
                this.approximateJreCount(model.getApproximateJreCount());
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

    /** The type of the source of events. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceType")
    private final ManagedInstanceType managedInstanceType;

    /**
     * The type of the source of events.
     *
     * @return the value
     */
    public ManagedInstanceType getManagedInstanceType() {
        return managedInstanceType;
    }

    /** The hostname of the managed instance (if applicable). */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname of the managed instance (if applicable).
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * The host [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
     * the related managed instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostId")
    private final String hostId;

    /**
     * The host [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
     * the related managed instance.
     *
     * @return the value
     */
    public String getHostId() {
        return hostId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final OperatingSystem operatingSystem;

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /** The approximate count of applications reported by this managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
    private final Integer approximateApplicationCount;

    /**
     * The approximate count of applications reported by this managed instance.
     *
     * @return the value
     */
    public Integer getApproximateApplicationCount() {
        return approximateApplicationCount;
    }

    /** The approximate count of installations reported by this managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
    private final Integer approximateInstallationCount;

    /**
     * The approximate count of installations reported by this managed instance.
     *
     * @return the value
     */
    public Integer getApproximateInstallationCount() {
        return approximateInstallationCount;
    }

    /** The approximate count of Java Runtimes reported by this managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateJreCount")
    private final Integer approximateJreCount;

    /**
     * The approximate count of Java Runtimes reported by this managed instance.
     *
     * @return the value
     */
    public Integer getApproximateJreCount() {
        return approximateJreCount;
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
        sb.append("ManagedInstanceUsage(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", managedInstanceType=").append(String.valueOf(this.managedInstanceType));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", hostId=").append(String.valueOf(this.hostId));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", approximateApplicationCount=")
                .append(String.valueOf(this.approximateApplicationCount));
        sb.append(", approximateInstallationCount=")
                .append(String.valueOf(this.approximateInstallationCount));
        sb.append(", approximateJreCount=").append(String.valueOf(this.approximateJreCount));
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
        if (!(o instanceof ManagedInstanceUsage)) {
            return false;
        }

        ManagedInstanceUsage other = (ManagedInstanceUsage) o;
        return java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.managedInstanceType, other.managedInstanceType)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(
                        this.approximateApplicationCount, other.approximateApplicationCount)
                && java.util.Objects.equals(
                        this.approximateInstallationCount, other.approximateInstallationCount)
                && java.util.Objects.equals(this.approximateJreCount, other.approximateJreCount)
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
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceType == null
                                ? 43
                                : this.managedInstanceType.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateApplicationCount == null
                                ? 43
                                : this.approximateApplicationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateInstallationCount == null
                                ? 43
                                : this.approximateInstallationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateJreCount == null
                                ? 43
                                : this.approximateJreCount.hashCode());
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
