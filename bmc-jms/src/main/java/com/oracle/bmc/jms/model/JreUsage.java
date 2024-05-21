/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Java Runtime usage during a specified time period. A Java Runtime is identified by its vendor and version.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JreUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JreUsage extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "fleetId",
        "managedInstanceId",
        "securityStatus",
        "releaseDate",
        "endOfSupportLifeDate",
        "vendor",
        "distribution",
        "version",
        "daysUnderSecurityBaseline",
        "operatingSystems",
        "approximateInstallationCount",
        "approximateApplicationCount",
        "approximateManagedInstanceCount",
        "approximatePendingWorkRequestCount",
        "timeStart",
        "timeEnd",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public JreUsage(
            String id,
            String fleetId,
            String managedInstanceId,
            JreSecurityStatus securityStatus,
            java.util.Date releaseDate,
            java.util.Date endOfSupportLifeDate,
            String vendor,
            String distribution,
            String version,
            Integer daysUnderSecurityBaseline,
            java.util.List<OperatingSystem> operatingSystems,
            Integer approximateInstallationCount,
            Integer approximateApplicationCount,
            Integer approximateManagedInstanceCount,
            Integer approximatePendingWorkRequestCount,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.id = id;
        this.fleetId = fleetId;
        this.managedInstanceId = managedInstanceId;
        this.securityStatus = securityStatus;
        this.releaseDate = releaseDate;
        this.endOfSupportLifeDate = endOfSupportLifeDate;
        this.vendor = vendor;
        this.distribution = distribution;
        this.version = version;
        this.daysUnderSecurityBaseline = daysUnderSecurityBaseline;
        this.operatingSystems = operatingSystems;
        this.approximateInstallationCount = approximateInstallationCount;
        this.approximateApplicationCount = approximateApplicationCount;
        this.approximateManagedInstanceCount = approximateManagedInstanceCount;
        this.approximatePendingWorkRequestCount = approximatePendingWorkRequestCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The internal identifier of the Java Runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The internal identifier of the Java Runtime.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related fleet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related fleet.
         * @param fleetId the value to set
         * @return this builder
         **/
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance. This property value is present only for /listJreUsage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance. This property value is present only for /listJreUsage.
         * @param managedInstanceId the value to set
         * @return this builder
         **/
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /**
         * The security status of the Java Runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityStatus")
        private JreSecurityStatus securityStatus;

        /**
         * The security status of the Java Runtime.
         * @param securityStatus the value to set
         * @return this builder
         **/
        public Builder securityStatus(JreSecurityStatus securityStatus) {
            this.securityStatus = securityStatus;
            this.__explicitlySet__.add("securityStatus");
            return this;
        }
        /**
         * The release date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
        private java.util.Date releaseDate;

        /**
         * The release date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         * @param releaseDate the value to set
         * @return this builder
         **/
        public Builder releaseDate(java.util.Date releaseDate) {
            this.releaseDate = releaseDate;
            this.__explicitlySet__.add("releaseDate");
            return this;
        }
        /**
         * The End of Support Life (EOSL) date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endOfSupportLifeDate")
        private java.util.Date endOfSupportLifeDate;

        /**
         * The End of Support Life (EOSL) date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         * @param endOfSupportLifeDate the value to set
         * @return this builder
         **/
        public Builder endOfSupportLifeDate(java.util.Date endOfSupportLifeDate) {
            this.endOfSupportLifeDate = endOfSupportLifeDate;
            this.__explicitlySet__.add("endOfSupportLifeDate");
            return this;
        }
        /**
         * The vendor of the Java Runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vendor")
        private String vendor;

        /**
         * The vendor of the Java Runtime.
         * @param vendor the value to set
         * @return this builder
         **/
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            this.__explicitlySet__.add("vendor");
            return this;
        }
        /**
         * The distribution of a Java Runtime is the name of the lineage of product to which it belongs, for example _Java(TM) SE Runtime Environment_.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("distribution")
        private String distribution;

        /**
         * The distribution of a Java Runtime is the name of the lineage of product to which it belongs, for example _Java(TM) SE Runtime Environment_.
         * @param distribution the value to set
         * @return this builder
         **/
        public Builder distribution(String distribution) {
            this.distribution = distribution;
            this.__explicitlySet__.add("distribution");
            return this;
        }
        /**
         * The version of the Java Runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the Java Runtime.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The number of days since this release has been under the security baseline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("daysUnderSecurityBaseline")
        private Integer daysUnderSecurityBaseline;

        /**
         * The number of days since this release has been under the security baseline.
         * @param daysUnderSecurityBaseline the value to set
         * @return this builder
         **/
        public Builder daysUnderSecurityBaseline(Integer daysUnderSecurityBaseline) {
            this.daysUnderSecurityBaseline = daysUnderSecurityBaseline;
            this.__explicitlySet__.add("daysUnderSecurityBaseline");
            return this;
        }
        /**
         * The operating systems that have this Java Runtime installed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystems")
        private java.util.List<OperatingSystem> operatingSystems;

        /**
         * The operating systems that have this Java Runtime installed.
         * @param operatingSystems the value to set
         * @return this builder
         **/
        public Builder operatingSystems(java.util.List<OperatingSystem> operatingSystems) {
            this.operatingSystems = operatingSystems;
            this.__explicitlySet__.add("operatingSystems");
            return this;
        }
        /**
         * The approximate count of installations that are installations of this Java Runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
        private Integer approximateInstallationCount;

        /**
         * The approximate count of installations that are installations of this Java Runtime.
         * @param approximateInstallationCount the value to set
         * @return this builder
         **/
        public Builder approximateInstallationCount(Integer approximateInstallationCount) {
            this.approximateInstallationCount = approximateInstallationCount;
            this.__explicitlySet__.add("approximateInstallationCount");
            return this;
        }
        /**
         * The approximate count of the applications running on this Java Runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
        private Integer approximateApplicationCount;

        /**
         * The approximate count of the applications running on this Java Runtime.
         * @param approximateApplicationCount the value to set
         * @return this builder
         **/
        public Builder approximateApplicationCount(Integer approximateApplicationCount) {
            this.approximateApplicationCount = approximateApplicationCount;
            this.__explicitlySet__.add("approximateApplicationCount");
            return this;
        }
        /**
         * The approximate count of the managed instances that report this Java Runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
        private Integer approximateManagedInstanceCount;

        /**
         * The approximate count of the managed instances that report this Java Runtime.
         * @param approximateManagedInstanceCount the value to set
         * @return this builder
         **/
        public Builder approximateManagedInstanceCount(Integer approximateManagedInstanceCount) {
            this.approximateManagedInstanceCount = approximateManagedInstanceCount;
            this.__explicitlySet__.add("approximateManagedInstanceCount");
            return this;
        }
        /**
         * The approximate count of work requests working on this Java Runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approximatePendingWorkRequestCount")
        private Integer approximatePendingWorkRequestCount;

        /**
         * The approximate count of work requests working on this Java Runtime.
         * @param approximatePendingWorkRequestCount the value to set
         * @return this builder
         **/
        public Builder approximatePendingWorkRequestCount(
                Integer approximatePendingWorkRequestCount) {
            this.approximatePendingWorkRequestCount = approximatePendingWorkRequestCount;
            this.__explicitlySet__.add("approximatePendingWorkRequestCount");
            return this;
        }
        /**
         * Lower bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Lower bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * Upper bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Upper bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * The date and time the resource was _first_ reported to JMS.
         * This is potentially _before_ the specified time period provided by the filters.
         * For example, a resource can be first reported to JMS before the start of a specified time period,
         * if it is also reported during the time period.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
        private java.util.Date timeFirstSeen;

        /**
         * The date and time the resource was _first_ reported to JMS.
         * This is potentially _before_ the specified time period provided by the filters.
         * For example, a resource can be first reported to JMS before the start of a specified time period,
         * if it is also reported during the time period.
         *
         * @param timeFirstSeen the value to set
         * @return this builder
         **/
        public Builder timeFirstSeen(java.util.Date timeFirstSeen) {
            this.timeFirstSeen = timeFirstSeen;
            this.__explicitlySet__.add("timeFirstSeen");
            return this;
        }
        /**
         * The date and time the resource was _last_ reported to JMS.
         * This is potentially _after_ the specified time period provided by the filters.
         * For example, a resource can be last reported to JMS before the start of a specified time period,
         * if it is also reported during the time period.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        /**
         * The date and time the resource was _last_ reported to JMS.
         * This is potentially _after_ the specified time period provided by the filters.
         * For example, a resource can be last reported to JMS before the start of a specified time period,
         * if it is also reported during the time period.
         *
         * @param timeLastSeen the value to set
         * @return this builder
         **/
        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JreUsage build() {
            JreUsage model =
                    new JreUsage(
                            this.id,
                            this.fleetId,
                            this.managedInstanceId,
                            this.securityStatus,
                            this.releaseDate,
                            this.endOfSupportLifeDate,
                            this.vendor,
                            this.distribution,
                            this.version,
                            this.daysUnderSecurityBaseline,
                            this.operatingSystems,
                            this.approximateInstallationCount,
                            this.approximateApplicationCount,
                            this.approximateManagedInstanceCount,
                            this.approximatePendingWorkRequestCount,
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
        public Builder copy(JreUsage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("securityStatus")) {
                this.securityStatus(model.getSecurityStatus());
            }
            if (model.wasPropertyExplicitlySet("releaseDate")) {
                this.releaseDate(model.getReleaseDate());
            }
            if (model.wasPropertyExplicitlySet("endOfSupportLifeDate")) {
                this.endOfSupportLifeDate(model.getEndOfSupportLifeDate());
            }
            if (model.wasPropertyExplicitlySet("vendor")) {
                this.vendor(model.getVendor());
            }
            if (model.wasPropertyExplicitlySet("distribution")) {
                this.distribution(model.getDistribution());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("daysUnderSecurityBaseline")) {
                this.daysUnderSecurityBaseline(model.getDaysUnderSecurityBaseline());
            }
            if (model.wasPropertyExplicitlySet("operatingSystems")) {
                this.operatingSystems(model.getOperatingSystems());
            }
            if (model.wasPropertyExplicitlySet("approximateInstallationCount")) {
                this.approximateInstallationCount(model.getApproximateInstallationCount());
            }
            if (model.wasPropertyExplicitlySet("approximateApplicationCount")) {
                this.approximateApplicationCount(model.getApproximateApplicationCount());
            }
            if (model.wasPropertyExplicitlySet("approximateManagedInstanceCount")) {
                this.approximateManagedInstanceCount(model.getApproximateManagedInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("approximatePendingWorkRequestCount")) {
                this.approximatePendingWorkRequestCount(
                        model.getApproximatePendingWorkRequestCount());
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
     * The internal identifier of the Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The internal identifier of the Java Runtime.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related fleet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related fleet.
     * @return the value
     **/
    public String getFleetId() {
        return fleetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance. This property value is present only for /listJreUsage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance. This property value is present only for /listJreUsage.
     * @return the value
     **/
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * The security status of the Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityStatus")
    private final JreSecurityStatus securityStatus;

    /**
     * The security status of the Java Runtime.
     * @return the value
     **/
    public JreSecurityStatus getSecurityStatus() {
        return securityStatus;
    }

    /**
     * The release date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
    private final java.util.Date releaseDate;

    /**
     * The release date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     * @return the value
     **/
    public java.util.Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * The End of Support Life (EOSL) date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endOfSupportLifeDate")
    private final java.util.Date endOfSupportLifeDate;

    /**
     * The End of Support Life (EOSL) date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     * @return the value
     **/
    public java.util.Date getEndOfSupportLifeDate() {
        return endOfSupportLifeDate;
    }

    /**
     * The vendor of the Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

    /**
     * The vendor of the Java Runtime.
     * @return the value
     **/
    public String getVendor() {
        return vendor;
    }

    /**
     * The distribution of a Java Runtime is the name of the lineage of product to which it belongs, for example _Java(TM) SE Runtime Environment_.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("distribution")
    private final String distribution;

    /**
     * The distribution of a Java Runtime is the name of the lineage of product to which it belongs, for example _Java(TM) SE Runtime Environment_.
     * @return the value
     **/
    public String getDistribution() {
        return distribution;
    }

    /**
     * The version of the Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the Java Runtime.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The number of days since this release has been under the security baseline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("daysUnderSecurityBaseline")
    private final Integer daysUnderSecurityBaseline;

    /**
     * The number of days since this release has been under the security baseline.
     * @return the value
     **/
    public Integer getDaysUnderSecurityBaseline() {
        return daysUnderSecurityBaseline;
    }

    /**
     * The operating systems that have this Java Runtime installed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystems")
    private final java.util.List<OperatingSystem> operatingSystems;

    /**
     * The operating systems that have this Java Runtime installed.
     * @return the value
     **/
    public java.util.List<OperatingSystem> getOperatingSystems() {
        return operatingSystems;
    }

    /**
     * The approximate count of installations that are installations of this Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
    private final Integer approximateInstallationCount;

    /**
     * The approximate count of installations that are installations of this Java Runtime.
     * @return the value
     **/
    public Integer getApproximateInstallationCount() {
        return approximateInstallationCount;
    }

    /**
     * The approximate count of the applications running on this Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
    private final Integer approximateApplicationCount;

    /**
     * The approximate count of the applications running on this Java Runtime.
     * @return the value
     **/
    public Integer getApproximateApplicationCount() {
        return approximateApplicationCount;
    }

    /**
     * The approximate count of the managed instances that report this Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
    private final Integer approximateManagedInstanceCount;

    /**
     * The approximate count of the managed instances that report this Java Runtime.
     * @return the value
     **/
    public Integer getApproximateManagedInstanceCount() {
        return approximateManagedInstanceCount;
    }

    /**
     * The approximate count of work requests working on this Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximatePendingWorkRequestCount")
    private final Integer approximatePendingWorkRequestCount;

    /**
     * The approximate count of work requests working on this Java Runtime.
     * @return the value
     **/
    public Integer getApproximatePendingWorkRequestCount() {
        return approximatePendingWorkRequestCount;
    }

    /**
     * Lower bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Lower bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
     * @return the value
     **/
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Upper bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Upper bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * The date and time the resource was _first_ reported to JMS.
     * This is potentially _before_ the specified time period provided by the filters.
     * For example, a resource can be first reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
    private final java.util.Date timeFirstSeen;

    /**
     * The date and time the resource was _first_ reported to JMS.
     * This is potentially _before_ the specified time period provided by the filters.
     * For example, a resource can be first reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     * @return the value
     **/
    public java.util.Date getTimeFirstSeen() {
        return timeFirstSeen;
    }

    /**
     * The date and time the resource was _last_ reported to JMS.
     * This is potentially _after_ the specified time period provided by the filters.
     * For example, a resource can be last reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    private final java.util.Date timeLastSeen;

    /**
     * The date and time the resource was _last_ reported to JMS.
     * This is potentially _after_ the specified time period provided by the filters.
     * For example, a resource can be last reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastSeen() {
        return timeLastSeen;
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
        sb.append("JreUsage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", securityStatus=").append(String.valueOf(this.securityStatus));
        sb.append(", releaseDate=").append(String.valueOf(this.releaseDate));
        sb.append(", endOfSupportLifeDate=").append(String.valueOf(this.endOfSupportLifeDate));
        sb.append(", vendor=").append(String.valueOf(this.vendor));
        sb.append(", distribution=").append(String.valueOf(this.distribution));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", daysUnderSecurityBaseline=")
                .append(String.valueOf(this.daysUnderSecurityBaseline));
        sb.append(", operatingSystems=").append(String.valueOf(this.operatingSystems));
        sb.append(", approximateInstallationCount=")
                .append(String.valueOf(this.approximateInstallationCount));
        sb.append(", approximateApplicationCount=")
                .append(String.valueOf(this.approximateApplicationCount));
        sb.append(", approximateManagedInstanceCount=")
                .append(String.valueOf(this.approximateManagedInstanceCount));
        sb.append(", approximatePendingWorkRequestCount=")
                .append(String.valueOf(this.approximatePendingWorkRequestCount));
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
        if (!(o instanceof JreUsage)) {
            return false;
        }

        JreUsage other = (JreUsage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.securityStatus, other.securityStatus)
                && java.util.Objects.equals(this.releaseDate, other.releaseDate)
                && java.util.Objects.equals(this.endOfSupportLifeDate, other.endOfSupportLifeDate)
                && java.util.Objects.equals(this.vendor, other.vendor)
                && java.util.Objects.equals(this.distribution, other.distribution)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.daysUnderSecurityBaseline, other.daysUnderSecurityBaseline)
                && java.util.Objects.equals(this.operatingSystems, other.operatingSystems)
                && java.util.Objects.equals(
                        this.approximateInstallationCount, other.approximateInstallationCount)
                && java.util.Objects.equals(
                        this.approximateApplicationCount, other.approximateApplicationCount)
                && java.util.Objects.equals(
                        this.approximateManagedInstanceCount, other.approximateManagedInstanceCount)
                && java.util.Objects.equals(
                        this.approximatePendingWorkRequestCount,
                        other.approximatePendingWorkRequestCount)
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
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityStatus == null ? 43 : this.securityStatus.hashCode());
        result = (result * PRIME) + (this.releaseDate == null ? 43 : this.releaseDate.hashCode());
        result =
                (result * PRIME)
                        + (this.endOfSupportLifeDate == null
                                ? 43
                                : this.endOfSupportLifeDate.hashCode());
        result = (result * PRIME) + (this.vendor == null ? 43 : this.vendor.hashCode());
        result = (result * PRIME) + (this.distribution == null ? 43 : this.distribution.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.daysUnderSecurityBaseline == null
                                ? 43
                                : this.daysUnderSecurityBaseline.hashCode());
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
                        + (this.approximateApplicationCount == null
                                ? 43
                                : this.approximateApplicationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateManagedInstanceCount == null
                                ? 43
                                : this.approximateManagedInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximatePendingWorkRequestCount == null
                                ? 43
                                : this.approximatePendingWorkRequestCount.hashCode());
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
