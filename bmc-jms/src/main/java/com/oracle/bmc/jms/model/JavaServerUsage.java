/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Java Server usage during a specified time period. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JavaServerUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaServerUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "serverKey",
        "fleetId",
        "serverName",
        "serverVersion",
        "serverInstanceCount",
        "approximateDeployedApplicationCount",
        "timeStart",
        "timeEnd",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public JavaServerUsage(
            String serverKey,
            String fleetId,
            String serverName,
            String serverVersion,
            Integer serverInstanceCount,
            Integer approximateDeployedApplicationCount,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.serverKey = serverKey;
        this.fleetId = fleetId;
        this.serverName = serverName;
        this.serverVersion = serverVersion;
        this.serverInstanceCount = serverInstanceCount;
        this.approximateDeployedApplicationCount = approximateDeployedApplicationCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The internal identifier of the Java Server. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverKey")
        private String serverKey;

        /**
         * The internal identifier of the Java Server.
         *
         * @param serverKey the value to set
         * @return this builder
         */
        public Builder serverKey(String serverKey) {
            this.serverKey = serverKey;
            this.__explicitlySet__.add("serverKey");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * related fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
        /** The count of server instances of the Java Server. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverInstanceCount")
        private Integer serverInstanceCount;

        /**
         * The count of server instances of the Java Server.
         *
         * @param serverInstanceCount the value to set
         * @return this builder
         */
        public Builder serverInstanceCount(Integer serverInstanceCount) {
            this.serverInstanceCount = serverInstanceCount;
            this.__explicitlySet__.add("serverInstanceCount");
            return this;
        }
        /** The approximate count of deployed applications in the Java Server. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateDeployedApplicationCount")
        private Integer approximateDeployedApplicationCount;

        /**
         * The approximate count of deployed applications in the Java Server.
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

        public JavaServerUsage build() {
            JavaServerUsage model =
                    new JavaServerUsage(
                            this.serverKey,
                            this.fleetId,
                            this.serverName,
                            this.serverVersion,
                            this.serverInstanceCount,
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
        public Builder copy(JavaServerUsage model) {
            if (model.wasPropertyExplicitlySet("serverKey")) {
                this.serverKey(model.getServerKey());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("serverName")) {
                this.serverName(model.getServerName());
            }
            if (model.wasPropertyExplicitlySet("serverVersion")) {
                this.serverVersion(model.getServerVersion());
            }
            if (model.wasPropertyExplicitlySet("serverInstanceCount")) {
                this.serverInstanceCount(model.getServerInstanceCount());
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

    /** The internal identifier of the Java Server. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverKey")
    private final String serverKey;

    /**
     * The internal identifier of the Java Server.
     *
     * @return the value
     */
    public String getServerKey() {
        return serverKey;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related fleet.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
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

    /** The count of server instances of the Java Server. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverInstanceCount")
    private final Integer serverInstanceCount;

    /**
     * The count of server instances of the Java Server.
     *
     * @return the value
     */
    public Integer getServerInstanceCount() {
        return serverInstanceCount;
    }

    /** The approximate count of deployed applications in the Java Server. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateDeployedApplicationCount")
    private final Integer approximateDeployedApplicationCount;

    /**
     * The approximate count of deployed applications in the Java Server.
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
        sb.append("JavaServerUsage(");
        sb.append("super=").append(super.toString());
        sb.append("serverKey=").append(String.valueOf(this.serverKey));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", serverName=").append(String.valueOf(this.serverName));
        sb.append(", serverVersion=").append(String.valueOf(this.serverVersion));
        sb.append(", serverInstanceCount=").append(String.valueOf(this.serverInstanceCount));
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
        if (!(o instanceof JavaServerUsage)) {
            return false;
        }

        JavaServerUsage other = (JavaServerUsage) o;
        return java.util.Objects.equals(this.serverKey, other.serverKey)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.serverName, other.serverName)
                && java.util.Objects.equals(this.serverVersion, other.serverVersion)
                && java.util.Objects.equals(this.serverInstanceCount, other.serverInstanceCount)
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
        result = (result * PRIME) + (this.serverKey == null ? 43 : this.serverKey.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + (this.serverName == null ? 43 : this.serverName.hashCode());
        result =
                (result * PRIME)
                        + (this.serverVersion == null ? 43 : this.serverVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.serverInstanceCount == null
                                ? 43
                                : this.serverInstanceCount.hashCode());
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
