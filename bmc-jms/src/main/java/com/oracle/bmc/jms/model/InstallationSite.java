/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Installation site of a Java Runtime. An installation site is a Java Runtime installed at a
 * specific path on a managed instance. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InstallationSite.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstallationSite
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "installationKey",
        "managedInstanceId",
        "jre",
        "path",
        "operatingSystem",
        "approximateApplicationCount",
        "timeLastSeen",
        "blocklist",
        "lifecycleState",
        "managedInstanceType",
        "hostname"
    })
    public InstallationSite(
            String installationKey,
            String managedInstanceId,
            JavaRuntimeId jre,
            String path,
            OperatingSystem operatingSystem,
            Integer approximateApplicationCount,
            java.util.Date timeLastSeen,
            java.util.List<BlocklistEntry> blocklist,
            LifecycleState lifecycleState,
            ManagedInstanceType managedInstanceType,
            String hostname) {
        super();
        this.installationKey = installationKey;
        this.managedInstanceId = managedInstanceId;
        this.jre = jre;
        this.path = path;
        this.operatingSystem = operatingSystem;
        this.approximateApplicationCount = approximateApplicationCount;
        this.timeLastSeen = timeLastSeen;
        this.blocklist = blocklist;
        this.lifecycleState = lifecycleState;
        this.managedInstanceType = managedInstanceType;
        this.hostname = hostname;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier for the installation of a Java Runtime at a specific path on a
         * specific operating system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("installationKey")
        private String installationKey;

        /**
         * The unique identifier for the installation of a Java Runtime at a specific path on a
         * specific operating system.
         *
         * @param installationKey the value to set
         * @return this builder
         */
        public Builder installationKey(String installationKey) {
            this.installationKey = installationKey;
            this.__explicitlySet__.add("installationKey");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * related managed instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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

        @com.fasterxml.jackson.annotation.JsonProperty("jre")
        private JavaRuntimeId jre;

        public Builder jre(JavaRuntimeId jre) {
            this.jre = jre;
            this.__explicitlySet__.add("jre");
            return this;
        }
        /** The file system path of the installation. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The file system path of the installation.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private OperatingSystem operatingSystem;

        public Builder operatingSystem(OperatingSystem operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }
        /** The approximate count of applications running on this installation */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
        private Integer approximateApplicationCount;

        /**
         * The approximate count of applications running on this installation
         *
         * @param approximateApplicationCount the value to set
         * @return this builder
         */
        public Builder approximateApplicationCount(Integer approximateApplicationCount) {
            this.approximateApplicationCount = approximateApplicationCount;
            this.__explicitlySet__.add("approximateApplicationCount");
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
        /** The list of operations that are blocklisted. */
        @com.fasterxml.jackson.annotation.JsonProperty("blocklist")
        private java.util.List<BlocklistEntry> blocklist;

        /**
         * The list of operations that are blocklisted.
         *
         * @param blocklist the value to set
         * @return this builder
         */
        public Builder blocklist(java.util.List<BlocklistEntry> blocklist) {
            this.blocklist = blocklist;
            this.__explicitlySet__.add("blocklist");
            return this;
        }
        /** The lifecycle state of the installation site. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The lifecycle state of the installation site.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstallationSite build() {
            InstallationSite model =
                    new InstallationSite(
                            this.installationKey,
                            this.managedInstanceId,
                            this.jre,
                            this.path,
                            this.operatingSystem,
                            this.approximateApplicationCount,
                            this.timeLastSeen,
                            this.blocklist,
                            this.lifecycleState,
                            this.managedInstanceType,
                            this.hostname);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallationSite model) {
            if (model.wasPropertyExplicitlySet("installationKey")) {
                this.installationKey(model.getInstallationKey());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("jre")) {
                this.jre(model.getJre());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("operatingSystem")) {
                this.operatingSystem(model.getOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("approximateApplicationCount")) {
                this.approximateApplicationCount(model.getApproximateApplicationCount());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeen")) {
                this.timeLastSeen(model.getTimeLastSeen());
            }
            if (model.wasPropertyExplicitlySet("blocklist")) {
                this.blocklist(model.getBlocklist());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceType")) {
                this.managedInstanceType(model.getManagedInstanceType());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
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
     * The unique identifier for the installation of a Java Runtime at a specific path on a specific
     * operating system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("installationKey")
    private final String installationKey;

    /**
     * The unique identifier for the installation of a Java Runtime at a specific path on a specific
     * operating system.
     *
     * @return the value
     */
    public String getInstallationKey() {
        return installationKey;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related managed instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related managed instance.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jre")
    private final JavaRuntimeId jre;

    public JavaRuntimeId getJre() {
        return jre;
    }

    /** The file system path of the installation. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The file system path of the installation.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final OperatingSystem operatingSystem;

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /** The approximate count of applications running on this installation */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
    private final Integer approximateApplicationCount;

    /**
     * The approximate count of applications running on this installation
     *
     * @return the value
     */
    public Integer getApproximateApplicationCount() {
        return approximateApplicationCount;
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

    /** The list of operations that are blocklisted. */
    @com.fasterxml.jackson.annotation.JsonProperty("blocklist")
    private final java.util.List<BlocklistEntry> blocklist;

    /**
     * The list of operations that are blocklisted.
     *
     * @return the value
     */
    public java.util.List<BlocklistEntry> getBlocklist() {
        return blocklist;
    }

    /** The lifecycle state of the installation site. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycle state of the installation site.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("InstallationSite(");
        sb.append("super=").append(super.toString());
        sb.append("installationKey=").append(String.valueOf(this.installationKey));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", jre=").append(String.valueOf(this.jre));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", approximateApplicationCount=")
                .append(String.valueOf(this.approximateApplicationCount));
        sb.append(", timeLastSeen=").append(String.valueOf(this.timeLastSeen));
        sb.append(", blocklist=").append(String.valueOf(this.blocklist));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", managedInstanceType=").append(String.valueOf(this.managedInstanceType));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstallationSite)) {
            return false;
        }

        InstallationSite other = (InstallationSite) o;
        return java.util.Objects.equals(this.installationKey, other.installationKey)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.jre, other.jre)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(
                        this.approximateApplicationCount, other.approximateApplicationCount)
                && java.util.Objects.equals(this.timeLastSeen, other.timeLastSeen)
                && java.util.Objects.equals(this.blocklist, other.blocklist)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.managedInstanceType, other.managedInstanceType)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.installationKey == null ? 43 : this.installationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.jre == null ? 43 : this.jre.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateApplicationCount == null
                                ? 43
                                : this.approximateApplicationCount.hashCode());
        result = (result * PRIME) + (this.timeLastSeen == null ? 43 : this.timeLastSeen.hashCode());
        result = (result * PRIME) + (this.blocklist == null ? 43 : this.blocklist.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceType == null
                                ? 43
                                : this.managedInstanceType.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
