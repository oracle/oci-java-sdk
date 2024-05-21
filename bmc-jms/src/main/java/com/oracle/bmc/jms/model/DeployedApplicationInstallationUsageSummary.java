/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Summarize usage information about an application deployed on Java servers including installation information during a specified time period. The main difference between DeployedApplicationInstallationUsageSummary and DeployedApplicationUsage is the presence of the applicationSourcePath. DeployedApplicationUsage provides only an aggregated view to the deployed applications without installation information. It therefore doesn\u2019t distinguish between applications with the identical deployment information deployed to different paths. DeployedApplicationInstallationUsageSummary contains installation information, and it\u2019s therefore possible to target actions.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeployedApplicationInstallationUsageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeployedApplicationInstallationUsageSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "applicationInstallationKey",
        "applicationKey",
        "fleetId",
        "applicationName",
        "applicationType",
        "applicationSourcePath",
        "isClustered",
        "approximateJavaServerInstanceCount",
        "timeStart",
        "timeEnd",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public DeployedApplicationInstallationUsageSummary(
            String applicationInstallationKey,
            String applicationKey,
            String fleetId,
            String applicationName,
            String applicationType,
            String applicationSourcePath,
            Boolean isClustered,
            Integer approximateJavaServerInstanceCount,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.applicationInstallationKey = applicationInstallationKey;
        this.applicationKey = applicationKey;
        this.fleetId = fleetId;
        this.applicationName = applicationName;
        this.applicationType = applicationType;
        this.applicationSourcePath = applicationSourcePath;
        this.isClustered = isClustered;
        this.approximateJavaServerInstanceCount = approximateJavaServerInstanceCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The internal identifier of the deployed application installation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationKey")
        private String applicationInstallationKey;

        /**
         * The internal identifier of the deployed application installation.
         *
         * @param applicationInstallationKey the value to set
         * @return this builder
         **/
        public Builder applicationInstallationKey(String applicationInstallationKey) {
            this.applicationInstallationKey = applicationInstallationKey;
            this.__explicitlySet__.add("applicationInstallationKey");
            return this;
        }
        /**
         * The internal identifier of the deployed application.
         * ApplicationKey will be identical for deployed applications with different applicationSourcePaths.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
        private String applicationKey;

        /**
         * The internal identifier of the deployed application.
         * ApplicationKey will be identical for deployed applications with different applicationSourcePaths.
         *
         * @param applicationKey the value to set
         * @return this builder
         **/
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            this.__explicitlySet__.add("applicationKey");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related fleet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related fleet.
         *
         * @param fleetId the value to set
         * @return this builder
         **/
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /**
         * The name of the deployed application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        /**
         * The name of the deployed application.
         *
         * @param applicationName the value to set
         * @return this builder
         **/
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }
        /**
         * The type of the deployed application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private String applicationType;

        /**
         * The type of the deployed application.
         *
         * @param applicationType the value to set
         * @return this builder
         **/
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            this.__explicitlySet__.add("applicationType");
            return this;
        }
        /**
         * The full path to source WAR or EAR file for deployed application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationSourcePath")
        private String applicationSourcePath;

        /**
         * The full path to source WAR or EAR file for deployed application.
         *
         * @param applicationSourcePath the value to set
         * @return this builder
         **/
        public Builder applicationSourcePath(String applicationSourcePath) {
            this.applicationSourcePath = applicationSourcePath;
            this.__explicitlySet__.add("applicationSourcePath");
            return this;
        }
        /**
         * Whether or not the deployed application is clustered.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isClustered")
        private Boolean isClustered;

        /**
         * Whether or not the deployed application is clustered.
         *
         * @param isClustered the value to set
         * @return this builder
         **/
        public Builder isClustered(Boolean isClustered) {
            this.isClustered = isClustered;
            this.__explicitlySet__.add("isClustered");
            return this;
        }
        /**
         * The approximate count of Java Server instances running the deployed application installations.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approximateJavaServerInstanceCount")
        private Integer approximateJavaServerInstanceCount;

        /**
         * The approximate count of Java Server instances running the deployed application installations.
         *
         * @param approximateJavaServerInstanceCount the value to set
         * @return this builder
         **/
        public Builder approximateJavaServerInstanceCount(
                Integer approximateJavaServerInstanceCount) {
            this.approximateJavaServerInstanceCount = approximateJavaServerInstanceCount;
            this.__explicitlySet__.add("approximateJavaServerInstanceCount");
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

        public DeployedApplicationInstallationUsageSummary build() {
            DeployedApplicationInstallationUsageSummary model =
                    new DeployedApplicationInstallationUsageSummary(
                            this.applicationInstallationKey,
                            this.applicationKey,
                            this.fleetId,
                            this.applicationName,
                            this.applicationType,
                            this.applicationSourcePath,
                            this.isClustered,
                            this.approximateJavaServerInstanceCount,
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
        public Builder copy(DeployedApplicationInstallationUsageSummary model) {
            if (model.wasPropertyExplicitlySet("applicationInstallationKey")) {
                this.applicationInstallationKey(model.getApplicationInstallationKey());
            }
            if (model.wasPropertyExplicitlySet("applicationKey")) {
                this.applicationKey(model.getApplicationKey());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("applicationName")) {
                this.applicationName(model.getApplicationName());
            }
            if (model.wasPropertyExplicitlySet("applicationType")) {
                this.applicationType(model.getApplicationType());
            }
            if (model.wasPropertyExplicitlySet("applicationSourcePath")) {
                this.applicationSourcePath(model.getApplicationSourcePath());
            }
            if (model.wasPropertyExplicitlySet("isClustered")) {
                this.isClustered(model.getIsClustered());
            }
            if (model.wasPropertyExplicitlySet("approximateJavaServerInstanceCount")) {
                this.approximateJavaServerInstanceCount(
                        model.getApproximateJavaServerInstanceCount());
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
     * The internal identifier of the deployed application installation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationKey")
    private final String applicationInstallationKey;

    /**
     * The internal identifier of the deployed application installation.
     *
     * @return the value
     **/
    public String getApplicationInstallationKey() {
        return applicationInstallationKey;
    }

    /**
     * The internal identifier of the deployed application.
     * ApplicationKey will be identical for deployed applications with different applicationSourcePaths.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
    private final String applicationKey;

    /**
     * The internal identifier of the deployed application.
     * ApplicationKey will be identical for deployed applications with different applicationSourcePaths.
     *
     * @return the value
     **/
    public String getApplicationKey() {
        return applicationKey;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related fleet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related fleet.
     *
     * @return the value
     **/
    public String getFleetId() {
        return fleetId;
    }

    /**
     * The name of the deployed application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    private final String applicationName;

    /**
     * The name of the deployed application.
     *
     * @return the value
     **/
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * The type of the deployed application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    private final String applicationType;

    /**
     * The type of the deployed application.
     *
     * @return the value
     **/
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * The full path to source WAR or EAR file for deployed application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationSourcePath")
    private final String applicationSourcePath;

    /**
     * The full path to source WAR or EAR file for deployed application.
     *
     * @return the value
     **/
    public String getApplicationSourcePath() {
        return applicationSourcePath;
    }

    /**
     * Whether or not the deployed application is clustered.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isClustered")
    private final Boolean isClustered;

    /**
     * Whether or not the deployed application is clustered.
     *
     * @return the value
     **/
    public Boolean getIsClustered() {
        return isClustered;
    }

    /**
     * The approximate count of Java Server instances running the deployed application installations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateJavaServerInstanceCount")
    private final Integer approximateJavaServerInstanceCount;

    /**
     * The approximate count of Java Server instances running the deployed application installations.
     *
     * @return the value
     **/
    public Integer getApproximateJavaServerInstanceCount() {
        return approximateJavaServerInstanceCount;
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
        sb.append("DeployedApplicationInstallationUsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("applicationInstallationKey=")
                .append(String.valueOf(this.applicationInstallationKey));
        sb.append(", applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", applicationName=").append(String.valueOf(this.applicationName));
        sb.append(", applicationType=").append(String.valueOf(this.applicationType));
        sb.append(", applicationSourcePath=").append(String.valueOf(this.applicationSourcePath));
        sb.append(", isClustered=").append(String.valueOf(this.isClustered));
        sb.append(", approximateJavaServerInstanceCount=")
                .append(String.valueOf(this.approximateJavaServerInstanceCount));
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
        if (!(o instanceof DeployedApplicationInstallationUsageSummary)) {
            return false;
        }

        DeployedApplicationInstallationUsageSummary other =
                (DeployedApplicationInstallationUsageSummary) o;
        return java.util.Objects.equals(
                        this.applicationInstallationKey, other.applicationInstallationKey)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(this.applicationSourcePath, other.applicationSourcePath)
                && java.util.Objects.equals(this.isClustered, other.isClustered)
                && java.util.Objects.equals(
                        this.approximateJavaServerInstanceCount,
                        other.approximateJavaServerInstanceCount)
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
                        + (this.applicationInstallationKey == null
                                ? 43
                                : this.applicationInstallationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationType == null ? 43 : this.applicationType.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationSourcePath == null
                                ? 43
                                : this.applicationSourcePath.hashCode());
        result = (result * PRIME) + (this.isClustered == null ? 43 : this.isClustered.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateJavaServerInstanceCount == null
                                ? 43
                                : this.approximateJavaServerInstanceCount.hashCode());
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
