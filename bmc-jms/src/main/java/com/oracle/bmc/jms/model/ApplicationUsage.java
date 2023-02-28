/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Application usage during a specified time period. An application is a Java application that can
 * be executed by a Java Runtime installation. An application is independent of the Java Runtime or
 * its installation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApplicationUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ApplicationUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "applicationId",
        "displayName",
        "applicationType",
        "operatingSystems",
        "approximateInstallationCount",
        "approximateJreCount",
        "approximateManagedInstanceCount",
        "timeStart",
        "timeEnd",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public ApplicationUsage(
            String applicationId,
            String displayName,
            String applicationType,
            java.util.List<OperatingSystem> operatingSystems,
            Integer approximateInstallationCount,
            Integer approximateJreCount,
            Integer approximateManagedInstanceCount,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.applicationId = applicationId;
        this.displayName = displayName;
        this.applicationType = applicationType;
        this.operatingSystems = operatingSystems;
        this.approximateInstallationCount = approximateInstallationCount;
        this.approximateJreCount = approximateJreCount;
        this.approximateManagedInstanceCount = approximateManagedInstanceCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An internal identifier for the application that is unique to a Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        /**
         * An internal identifier for the application that is unique to a Fleet.
         *
         * @param applicationId the value to set
         * @return this builder
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }
        /** The name of the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the application.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The type of the application, denoted by how the application was started. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private String applicationType;

        /**
         * The type of the application, denoted by how the application was started.
         *
         * @param applicationType the value to set
         * @return this builder
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            this.__explicitlySet__.add("applicationType");
            return this;
        }
        /** The operating systems running this application. */
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystems")
        private java.util.List<OperatingSystem> operatingSystems;

        /**
         * The operating systems running this application.
         *
         * @param operatingSystems the value to set
         * @return this builder
         */
        public Builder operatingSystems(java.util.List<OperatingSystem> operatingSystems) {
            this.operatingSystems = operatingSystems;
            this.__explicitlySet__.add("operatingSystems");
            return this;
        }
        /** The approximate count of installations running this application. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
        private Integer approximateInstallationCount;

        /**
         * The approximate count of installations running this application.
         *
         * @param approximateInstallationCount the value to set
         * @return this builder
         */
        public Builder approximateInstallationCount(Integer approximateInstallationCount) {
            this.approximateInstallationCount = approximateInstallationCount;
            this.__explicitlySet__.add("approximateInstallationCount");
            return this;
        }
        /** The approximate count of Java Runtimes running this application. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateJreCount")
        private Integer approximateJreCount;

        /**
         * The approximate count of Java Runtimes running this application.
         *
         * @param approximateJreCount the value to set
         * @return this builder
         */
        public Builder approximateJreCount(Integer approximateJreCount) {
            this.approximateJreCount = approximateJreCount;
            this.__explicitlySet__.add("approximateJreCount");
            return this;
        }
        /** The approximate count of managed instances reporting this application. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
        private Integer approximateManagedInstanceCount;

        /**
         * The approximate count of managed instances reporting this application.
         *
         * @param approximateManagedInstanceCount the value to set
         * @return this builder
         */
        public Builder approximateManagedInstanceCount(Integer approximateManagedInstanceCount) {
            this.approximateManagedInstanceCount = approximateManagedInstanceCount;
            this.__explicitlySet__.add("approximateManagedInstanceCount");
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

        public ApplicationUsage build() {
            ApplicationUsage model =
                    new ApplicationUsage(
                            this.applicationId,
                            this.displayName,
                            this.applicationType,
                            this.operatingSystems,
                            this.approximateInstallationCount,
                            this.approximateJreCount,
                            this.approximateManagedInstanceCount,
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
        public Builder copy(ApplicationUsage model) {
            if (model.wasPropertyExplicitlySet("applicationId")) {
                this.applicationId(model.getApplicationId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("applicationType")) {
                this.applicationType(model.getApplicationType());
            }
            if (model.wasPropertyExplicitlySet("operatingSystems")) {
                this.operatingSystems(model.getOperatingSystems());
            }
            if (model.wasPropertyExplicitlySet("approximateInstallationCount")) {
                this.approximateInstallationCount(model.getApproximateInstallationCount());
            }
            if (model.wasPropertyExplicitlySet("approximateJreCount")) {
                this.approximateJreCount(model.getApproximateJreCount());
            }
            if (model.wasPropertyExplicitlySet("approximateManagedInstanceCount")) {
                this.approximateManagedInstanceCount(model.getApproximateManagedInstanceCount());
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

    /** An internal identifier for the application that is unique to a Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    private final String applicationId;

    /**
     * An internal identifier for the application that is unique to a Fleet.
     *
     * @return the value
     */
    public String getApplicationId() {
        return applicationId;
    }

    /** The name of the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the application.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The type of the application, denoted by how the application was started. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    private final String applicationType;

    /**
     * The type of the application, denoted by how the application was started.
     *
     * @return the value
     */
    public String getApplicationType() {
        return applicationType;
    }

    /** The operating systems running this application. */
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystems")
    private final java.util.List<OperatingSystem> operatingSystems;

    /**
     * The operating systems running this application.
     *
     * @return the value
     */
    public java.util.List<OperatingSystem> getOperatingSystems() {
        return operatingSystems;
    }

    /** The approximate count of installations running this application. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
    private final Integer approximateInstallationCount;

    /**
     * The approximate count of installations running this application.
     *
     * @return the value
     */
    public Integer getApproximateInstallationCount() {
        return approximateInstallationCount;
    }

    /** The approximate count of Java Runtimes running this application. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateJreCount")
    private final Integer approximateJreCount;

    /**
     * The approximate count of Java Runtimes running this application.
     *
     * @return the value
     */
    public Integer getApproximateJreCount() {
        return approximateJreCount;
    }

    /** The approximate count of managed instances reporting this application. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
    private final Integer approximateManagedInstanceCount;

    /**
     * The approximate count of managed instances reporting this application.
     *
     * @return the value
     */
    public Integer getApproximateManagedInstanceCount() {
        return approximateManagedInstanceCount;
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
        sb.append("ApplicationUsage(");
        sb.append("super=").append(super.toString());
        sb.append("applicationId=").append(String.valueOf(this.applicationId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", applicationType=").append(String.valueOf(this.applicationType));
        sb.append(", operatingSystems=").append(String.valueOf(this.operatingSystems));
        sb.append(", approximateInstallationCount=")
                .append(String.valueOf(this.approximateInstallationCount));
        sb.append(", approximateJreCount=").append(String.valueOf(this.approximateJreCount));
        sb.append(", approximateManagedInstanceCount=")
                .append(String.valueOf(this.approximateManagedInstanceCount));
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
        if (!(o instanceof ApplicationUsage)) {
            return false;
        }

        ApplicationUsage other = (ApplicationUsage) o;
        return java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(this.operatingSystems, other.operatingSystems)
                && java.util.Objects.equals(
                        this.approximateInstallationCount, other.approximateInstallationCount)
                && java.util.Objects.equals(this.approximateJreCount, other.approximateJreCount)
                && java.util.Objects.equals(
                        this.approximateManagedInstanceCount, other.approximateManagedInstanceCount)
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
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationType == null ? 43 : this.applicationType.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystems == null ? 43 : this.operatingSystems.hashCode());
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
        result =
                (result * PRIME)
                        + (this.approximateManagedInstanceCount == null
                                ? 43
                                : this.approximateManagedInstanceCount.hashCode());
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
