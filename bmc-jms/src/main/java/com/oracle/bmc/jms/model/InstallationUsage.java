/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Installation usage during a specified time period.
 * An installation is a collection of deployed instances of a specific Java Runtime that share the same install path.
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
    builder = InstallationUsage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstallationUsage extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "installationKey",
        "jreVendor",
        "jreDistribution",
        "jreVersion",
        "path",
        "os",
        "architecture",
        "operatingSystem",
        "approximateApplicationCount",
        "approximateManagedInstanceCount",
        "timeStart",
        "timeEnd",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public InstallationUsage(
            String installationKey,
            String jreVendor,
            String jreDistribution,
            String jreVersion,
            String path,
            String os,
            String architecture,
            OperatingSystem operatingSystem,
            Integer approximateApplicationCount,
            Integer approximateManagedInstanceCount,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.installationKey = installationKey;
        this.jreVendor = jreVendor;
        this.jreDistribution = jreDistribution;
        this.jreVersion = jreVersion;
        this.path = path;
        this.os = os;
        this.architecture = architecture;
        this.operatingSystem = operatingSystem;
        this.approximateApplicationCount = approximateApplicationCount;
        this.approximateManagedInstanceCount = approximateManagedInstanceCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier for the installation of a Java Runtime at a specific path on a specific operating system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("installationKey")
        private String installationKey;

        /**
         * The unique identifier for the installation of a Java Runtime at a specific path on a specific operating system.
         * @param installationKey the value to set
         * @return this builder
         **/
        public Builder installationKey(String installationKey) {
            this.installationKey = installationKey;
            this.__explicitlySet__.add("installationKey");
            return this;
        }
        /**
         * The vendor of the Java Runtime that is deployed with the installation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jreVendor")
        private String jreVendor;

        /**
         * The vendor of the Java Runtime that is deployed with the installation.
         * @param jreVendor the value to set
         * @return this builder
         **/
        public Builder jreVendor(String jreVendor) {
            this.jreVendor = jreVendor;
            this.__explicitlySet__.add("jreVendor");
            return this;
        }
        /**
         * The distribution of the Java Runtime that is deployed with the installation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jreDistribution")
        private String jreDistribution;

        /**
         * The distribution of the Java Runtime that is deployed with the installation.
         * @param jreDistribution the value to set
         * @return this builder
         **/
        public Builder jreDistribution(String jreDistribution) {
            this.jreDistribution = jreDistribution;
            this.__explicitlySet__.add("jreDistribution");
            return this;
        }
        /**
         * The version of the Java Runtime that is deployed with the installation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jreVersion")
        private String jreVersion;

        /**
         * The version of the Java Runtime that is deployed with the installation.
         * @param jreVersion the value to set
         * @return this builder
         **/
        public Builder jreVersion(String jreVersion) {
            this.jreVersion = jreVersion;
            this.__explicitlySet__.add("jreVersion");
            return this;
        }
        /**
         * The file system path of the Java installation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The file system path of the Java installation.
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * The Operating System for the installation. Deprecated, use {@code operatingSystem} instead.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("os")
        private String os;

        /**
         * The Operating System for the installation. Deprecated, use {@code operatingSystem} instead.
         * @param os the value to set
         * @return this builder
         **/
        public Builder os(String os) {
            this.os = os;
            this.__explicitlySet__.add("os");
            return this;
        }
        /**
         * The architecture of the operating system for the installation. Deprecated, use {@code operatingSystem} instead.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The architecture of the operating system for the installation. Deprecated, use {@code operatingSystem} instead.
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private OperatingSystem operatingSystem;

        public Builder operatingSystem(OperatingSystem operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }
        /**
         * The approximate count of applications running on this installation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
        private Integer approximateApplicationCount;

        /**
         * The approximate count of applications running on this installation
         * @param approximateApplicationCount the value to set
         * @return this builder
         **/
        public Builder approximateApplicationCount(Integer approximateApplicationCount) {
            this.approximateApplicationCount = approximateApplicationCount;
            this.__explicitlySet__.add("approximateApplicationCount");
            return this;
        }
        /**
         * The approximate count of managed instances reporting this installation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
        private Integer approximateManagedInstanceCount;

        /**
         * The approximate count of managed instances reporting this installation
         * @param approximateManagedInstanceCount the value to set
         * @return this builder
         **/
        public Builder approximateManagedInstanceCount(Integer approximateManagedInstanceCount) {
            this.approximateManagedInstanceCount = approximateManagedInstanceCount;
            this.__explicitlySet__.add("approximateManagedInstanceCount");
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

        public InstallationUsage build() {
            InstallationUsage model =
                    new InstallationUsage(
                            this.installationKey,
                            this.jreVendor,
                            this.jreDistribution,
                            this.jreVersion,
                            this.path,
                            this.os,
                            this.architecture,
                            this.operatingSystem,
                            this.approximateApplicationCount,
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
        public Builder copy(InstallationUsage model) {
            if (model.wasPropertyExplicitlySet("installationKey")) {
                this.installationKey(model.getInstallationKey());
            }
            if (model.wasPropertyExplicitlySet("jreVendor")) {
                this.jreVendor(model.getJreVendor());
            }
            if (model.wasPropertyExplicitlySet("jreDistribution")) {
                this.jreDistribution(model.getJreDistribution());
            }
            if (model.wasPropertyExplicitlySet("jreVersion")) {
                this.jreVersion(model.getJreVersion());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("os")) {
                this.os(model.getOs());
            }
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("operatingSystem")) {
                this.operatingSystem(model.getOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("approximateApplicationCount")) {
                this.approximateApplicationCount(model.getApproximateApplicationCount());
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
     * The unique identifier for the installation of a Java Runtime at a specific path on a specific operating system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installationKey")
    private final String installationKey;

    /**
     * The unique identifier for the installation of a Java Runtime at a specific path on a specific operating system.
     * @return the value
     **/
    public String getInstallationKey() {
        return installationKey;
    }

    /**
     * The vendor of the Java Runtime that is deployed with the installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreVendor")
    private final String jreVendor;

    /**
     * The vendor of the Java Runtime that is deployed with the installation.
     * @return the value
     **/
    public String getJreVendor() {
        return jreVendor;
    }

    /**
     * The distribution of the Java Runtime that is deployed with the installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreDistribution")
    private final String jreDistribution;

    /**
     * The distribution of the Java Runtime that is deployed with the installation.
     * @return the value
     **/
    public String getJreDistribution() {
        return jreDistribution;
    }

    /**
     * The version of the Java Runtime that is deployed with the installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreVersion")
    private final String jreVersion;

    /**
     * The version of the Java Runtime that is deployed with the installation.
     * @return the value
     **/
    public String getJreVersion() {
        return jreVersion;
    }

    /**
     * The file system path of the Java installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The file system path of the Java installation.
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * The Operating System for the installation. Deprecated, use {@code operatingSystem} instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("os")
    private final String os;

    /**
     * The Operating System for the installation. Deprecated, use {@code operatingSystem} instead.
     * @return the value
     **/
    public String getOs() {
        return os;
    }

    /**
     * The architecture of the operating system for the installation. Deprecated, use {@code operatingSystem} instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The architecture of the operating system for the installation. Deprecated, use {@code operatingSystem} instead.
     * @return the value
     **/
    public String getArchitecture() {
        return architecture;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final OperatingSystem operatingSystem;

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * The approximate count of applications running on this installation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
    private final Integer approximateApplicationCount;

    /**
     * The approximate count of applications running on this installation
     * @return the value
     **/
    public Integer getApproximateApplicationCount() {
        return approximateApplicationCount;
    }

    /**
     * The approximate count of managed instances reporting this installation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
    private final Integer approximateManagedInstanceCount;

    /**
     * The approximate count of managed instances reporting this installation
     * @return the value
     **/
    public Integer getApproximateManagedInstanceCount() {
        return approximateManagedInstanceCount;
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
        sb.append("InstallationUsage(");
        sb.append("super=").append(super.toString());
        sb.append("installationKey=").append(String.valueOf(this.installationKey));
        sb.append(", jreVendor=").append(String.valueOf(this.jreVendor));
        sb.append(", jreDistribution=").append(String.valueOf(this.jreDistribution));
        sb.append(", jreVersion=").append(String.valueOf(this.jreVersion));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", os=").append(String.valueOf(this.os));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", approximateApplicationCount=")
                .append(String.valueOf(this.approximateApplicationCount));
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
        if (!(o instanceof InstallationUsage)) {
            return false;
        }

        InstallationUsage other = (InstallationUsage) o;
        return java.util.Objects.equals(this.installationKey, other.installationKey)
                && java.util.Objects.equals(this.jreVendor, other.jreVendor)
                && java.util.Objects.equals(this.jreDistribution, other.jreDistribution)
                && java.util.Objects.equals(this.jreVersion, other.jreVersion)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.os, other.os)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(
                        this.approximateApplicationCount, other.approximateApplicationCount)
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
                        + (this.installationKey == null ? 43 : this.installationKey.hashCode());
        result = (result * PRIME) + (this.jreVendor == null ? 43 : this.jreVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.jreDistribution == null ? 43 : this.jreDistribution.hashCode());
        result = (result * PRIME) + (this.jreVersion == null ? 43 : this.jreVersion.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.os == null ? 43 : this.os.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
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
