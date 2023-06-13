/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Library usage during a specified time period. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LibraryUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LibraryUsage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "libraryKey",
        "fleetId",
        "libraryName",
        "libraryVersion",
        "cvssScore",
        "approximateApplicationCount",
        "approximateJavaServerInstanceCount",
        "approximateDeployedApplicationCount",
        "approximateManagedInstanceCount",
        "timeStart",
        "timeEnd",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public LibraryUsage(
            String libraryKey,
            String fleetId,
            String libraryName,
            String libraryVersion,
            Float cvssScore,
            Integer approximateApplicationCount,
            Integer approximateJavaServerInstanceCount,
            Integer approximateDeployedApplicationCount,
            Integer approximateManagedInstanceCount,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.libraryKey = libraryKey;
        this.fleetId = fleetId;
        this.libraryName = libraryName;
        this.libraryVersion = libraryVersion;
        this.cvssScore = cvssScore;
        this.approximateApplicationCount = approximateApplicationCount;
        this.approximateJavaServerInstanceCount = approximateJavaServerInstanceCount;
        this.approximateDeployedApplicationCount = approximateDeployedApplicationCount;
        this.approximateManagedInstanceCount = approximateManagedInstanceCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The internal identifier of the library. */
        @com.fasterxml.jackson.annotation.JsonProperty("libraryKey")
        private String libraryKey;

        /**
         * The internal identifier of the library.
         *
         * @param libraryKey the value to set
         * @return this builder
         */
        public Builder libraryKey(String libraryKey) {
            this.libraryKey = libraryKey;
            this.__explicitlySet__.add("libraryKey");
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
        /** The name of the library. */
        @com.fasterxml.jackson.annotation.JsonProperty("libraryName")
        private String libraryName;

        /**
         * The name of the library.
         *
         * @param libraryName the value to set
         * @return this builder
         */
        public Builder libraryName(String libraryName) {
            this.libraryName = libraryName;
            this.__explicitlySet__.add("libraryName");
            return this;
        }
        /** The version of the library. */
        @com.fasterxml.jackson.annotation.JsonProperty("libraryVersion")
        private String libraryVersion;

        /**
         * The version of the library.
         *
         * @param libraryVersion the value to set
         * @return this builder
         */
        public Builder libraryVersion(String libraryVersion) {
            this.libraryVersion = libraryVersion;
            this.__explicitlySet__.add("libraryVersion");
            return this;
        }
        /** The Common Vulnerability Scoring System (CVSS) score. */
        @com.fasterxml.jackson.annotation.JsonProperty("cvssScore")
        private Float cvssScore;

        /**
         * The Common Vulnerability Scoring System (CVSS) score.
         *
         * @param cvssScore the value to set
         * @return this builder
         */
        public Builder cvssScore(Float cvssScore) {
            this.cvssScore = cvssScore;
            this.__explicitlySet__.add("cvssScore");
            return this;
        }
        /** The approximate count of applications using the library. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
        private Integer approximateApplicationCount;

        /**
         * The approximate count of applications using the library.
         *
         * @param approximateApplicationCount the value to set
         * @return this builder
         */
        public Builder approximateApplicationCount(Integer approximateApplicationCount) {
            this.approximateApplicationCount = approximateApplicationCount;
            this.__explicitlySet__.add("approximateApplicationCount");
            return this;
        }
        /** The approximate count of Java Server instances using the library. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateJavaServerInstanceCount")
        private Integer approximateJavaServerInstanceCount;

        /**
         * The approximate count of Java Server instances using the library.
         *
         * @param approximateJavaServerInstanceCount the value to set
         * @return this builder
         */
        public Builder approximateJavaServerInstanceCount(
                Integer approximateJavaServerInstanceCount) {
            this.approximateJavaServerInstanceCount = approximateJavaServerInstanceCount;
            this.__explicitlySet__.add("approximateJavaServerInstanceCount");
            return this;
        }
        /** The approximate count of deployed applications using the library. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateDeployedApplicationCount")
        private Integer approximateDeployedApplicationCount;

        /**
         * The approximate count of deployed applications using the library.
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
        /** The approximate count of managed instances using the library. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
        private Integer approximateManagedInstanceCount;

        /**
         * The approximate count of managed instances using the library.
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

        public LibraryUsage build() {
            LibraryUsage model =
                    new LibraryUsage(
                            this.libraryKey,
                            this.fleetId,
                            this.libraryName,
                            this.libraryVersion,
                            this.cvssScore,
                            this.approximateApplicationCount,
                            this.approximateJavaServerInstanceCount,
                            this.approximateDeployedApplicationCount,
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
        public Builder copy(LibraryUsage model) {
            if (model.wasPropertyExplicitlySet("libraryKey")) {
                this.libraryKey(model.getLibraryKey());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("libraryName")) {
                this.libraryName(model.getLibraryName());
            }
            if (model.wasPropertyExplicitlySet("libraryVersion")) {
                this.libraryVersion(model.getLibraryVersion());
            }
            if (model.wasPropertyExplicitlySet("cvssScore")) {
                this.cvssScore(model.getCvssScore());
            }
            if (model.wasPropertyExplicitlySet("approximateApplicationCount")) {
                this.approximateApplicationCount(model.getApproximateApplicationCount());
            }
            if (model.wasPropertyExplicitlySet("approximateJavaServerInstanceCount")) {
                this.approximateJavaServerInstanceCount(
                        model.getApproximateJavaServerInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("approximateDeployedApplicationCount")) {
                this.approximateDeployedApplicationCount(
                        model.getApproximateDeployedApplicationCount());
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

    /** The internal identifier of the library. */
    @com.fasterxml.jackson.annotation.JsonProperty("libraryKey")
    private final String libraryKey;

    /**
     * The internal identifier of the library.
     *
     * @return the value
     */
    public String getLibraryKey() {
        return libraryKey;
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

    /** The name of the library. */
    @com.fasterxml.jackson.annotation.JsonProperty("libraryName")
    private final String libraryName;

    /**
     * The name of the library.
     *
     * @return the value
     */
    public String getLibraryName() {
        return libraryName;
    }

    /** The version of the library. */
    @com.fasterxml.jackson.annotation.JsonProperty("libraryVersion")
    private final String libraryVersion;

    /**
     * The version of the library.
     *
     * @return the value
     */
    public String getLibraryVersion() {
        return libraryVersion;
    }

    /** The Common Vulnerability Scoring System (CVSS) score. */
    @com.fasterxml.jackson.annotation.JsonProperty("cvssScore")
    private final Float cvssScore;

    /**
     * The Common Vulnerability Scoring System (CVSS) score.
     *
     * @return the value
     */
    public Float getCvssScore() {
        return cvssScore;
    }

    /** The approximate count of applications using the library. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
    private final Integer approximateApplicationCount;

    /**
     * The approximate count of applications using the library.
     *
     * @return the value
     */
    public Integer getApproximateApplicationCount() {
        return approximateApplicationCount;
    }

    /** The approximate count of Java Server instances using the library. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateJavaServerInstanceCount")
    private final Integer approximateJavaServerInstanceCount;

    /**
     * The approximate count of Java Server instances using the library.
     *
     * @return the value
     */
    public Integer getApproximateJavaServerInstanceCount() {
        return approximateJavaServerInstanceCount;
    }

    /** The approximate count of deployed applications using the library. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateDeployedApplicationCount")
    private final Integer approximateDeployedApplicationCount;

    /**
     * The approximate count of deployed applications using the library.
     *
     * @return the value
     */
    public Integer getApproximateDeployedApplicationCount() {
        return approximateDeployedApplicationCount;
    }

    /** The approximate count of managed instances using the library. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
    private final Integer approximateManagedInstanceCount;

    /**
     * The approximate count of managed instances using the library.
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
        sb.append("LibraryUsage(");
        sb.append("super=").append(super.toString());
        sb.append("libraryKey=").append(String.valueOf(this.libraryKey));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", libraryName=").append(String.valueOf(this.libraryName));
        sb.append(", libraryVersion=").append(String.valueOf(this.libraryVersion));
        sb.append(", cvssScore=").append(String.valueOf(this.cvssScore));
        sb.append(", approximateApplicationCount=")
                .append(String.valueOf(this.approximateApplicationCount));
        sb.append(", approximateJavaServerInstanceCount=")
                .append(String.valueOf(this.approximateJavaServerInstanceCount));
        sb.append(", approximateDeployedApplicationCount=")
                .append(String.valueOf(this.approximateDeployedApplicationCount));
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
        if (!(o instanceof LibraryUsage)) {
            return false;
        }

        LibraryUsage other = (LibraryUsage) o;
        return java.util.Objects.equals(this.libraryKey, other.libraryKey)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.libraryName, other.libraryName)
                && java.util.Objects.equals(this.libraryVersion, other.libraryVersion)
                && java.util.Objects.equals(this.cvssScore, other.cvssScore)
                && java.util.Objects.equals(
                        this.approximateApplicationCount, other.approximateApplicationCount)
                && java.util.Objects.equals(
                        this.approximateJavaServerInstanceCount,
                        other.approximateJavaServerInstanceCount)
                && java.util.Objects.equals(
                        this.approximateDeployedApplicationCount,
                        other.approximateDeployedApplicationCount)
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
        result = (result * PRIME) + (this.libraryKey == null ? 43 : this.libraryKey.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + (this.libraryName == null ? 43 : this.libraryName.hashCode());
        result =
                (result * PRIME)
                        + (this.libraryVersion == null ? 43 : this.libraryVersion.hashCode());
        result = (result * PRIME) + (this.cvssScore == null ? 43 : this.cvssScore.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateApplicationCount == null
                                ? 43
                                : this.approximateApplicationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateJavaServerInstanceCount == null
                                ? 43
                                : this.approximateJavaServerInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateDeployedApplicationCount == null
                                ? 43
                                : this.approximateDeployedApplicationCount.hashCode());
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
