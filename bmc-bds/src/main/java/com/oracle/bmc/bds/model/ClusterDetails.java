/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Specific info about a Hadoop cluster
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bdaVersion",
        "bdmVersion",
        "bdsVersion",
        "osVersion",
        "dbVersion",
        "bdCellVersion",
        "csqlCellVersion",
        "timeCreated",
        "timeRefreshed",
        "clouderaManagerUrl",
        "ambariUrl",
        "bigDataManagerUrl",
        "hueServerUrl",
        "odhVersion",
        "jupyterHubUrl"
    })
    public ClusterDetails(
            String bdaVersion,
            String bdmVersion,
            String bdsVersion,
            String osVersion,
            String dbVersion,
            String bdCellVersion,
            String csqlCellVersion,
            java.util.Date timeCreated,
            java.util.Date timeRefreshed,
            String clouderaManagerUrl,
            String ambariUrl,
            String bigDataManagerUrl,
            String hueServerUrl,
            String odhVersion,
            String jupyterHubUrl) {
        super();
        this.bdaVersion = bdaVersion;
        this.bdmVersion = bdmVersion;
        this.bdsVersion = bdsVersion;
        this.osVersion = osVersion;
        this.dbVersion = dbVersion;
        this.bdCellVersion = bdCellVersion;
        this.csqlCellVersion = csqlCellVersion;
        this.timeCreated = timeCreated;
        this.timeRefreshed = timeRefreshed;
        this.clouderaManagerUrl = clouderaManagerUrl;
        this.ambariUrl = ambariUrl;
        this.bigDataManagerUrl = bigDataManagerUrl;
        this.hueServerUrl = hueServerUrl;
        this.odhVersion = odhVersion;
        this.jupyterHubUrl = jupyterHubUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bdaVersion")
        private String bdaVersion;

        public Builder bdaVersion(String bdaVersion) {
            this.bdaVersion = bdaVersion;
            this.__explicitlySet__.add("bdaVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdmVersion")
        private String bdmVersion;

        public Builder bdmVersion(String bdmVersion) {
            this.bdmVersion = bdmVersion;
            this.__explicitlySet__.add("bdmVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdsVersion")
        private String bdsVersion;

        public Builder bdsVersion(String bdsVersion) {
            this.bdsVersion = bdsVersion;
            this.__explicitlySet__.add("bdsVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
        private String osVersion;

        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            this.__explicitlySet__.add("osVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdCellVersion")
        private String bdCellVersion;

        public Builder bdCellVersion(String bdCellVersion) {
            this.bdCellVersion = bdCellVersion;
            this.__explicitlySet__.add("bdCellVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("csqlCellVersion")
        private String csqlCellVersion;

        public Builder csqlCellVersion(String csqlCellVersion) {
            this.csqlCellVersion = csqlCellVersion;
            this.__explicitlySet__.add("csqlCellVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeRefreshed")
        private java.util.Date timeRefreshed;

        public Builder timeRefreshed(java.util.Date timeRefreshed) {
            this.timeRefreshed = timeRefreshed;
            this.__explicitlySet__.add("timeRefreshed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clouderaManagerUrl")
        private String clouderaManagerUrl;

        public Builder clouderaManagerUrl(String clouderaManagerUrl) {
            this.clouderaManagerUrl = clouderaManagerUrl;
            this.__explicitlySet__.add("clouderaManagerUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ambariUrl")
        private String ambariUrl;

        public Builder ambariUrl(String ambariUrl) {
            this.ambariUrl = ambariUrl;
            this.__explicitlySet__.add("ambariUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bigDataManagerUrl")
        private String bigDataManagerUrl;

        public Builder bigDataManagerUrl(String bigDataManagerUrl) {
            this.bigDataManagerUrl = bigDataManagerUrl;
            this.__explicitlySet__.add("bigDataManagerUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hueServerUrl")
        private String hueServerUrl;

        public Builder hueServerUrl(String hueServerUrl) {
            this.hueServerUrl = hueServerUrl;
            this.__explicitlySet__.add("hueServerUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("odhVersion")
        private String odhVersion;

        public Builder odhVersion(String odhVersion) {
            this.odhVersion = odhVersion;
            this.__explicitlySet__.add("odhVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jupyterHubUrl")
        private String jupyterHubUrl;

        public Builder jupyterHubUrl(String jupyterHubUrl) {
            this.jupyterHubUrl = jupyterHubUrl;
            this.__explicitlySet__.add("jupyterHubUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterDetails build() {
            ClusterDetails __instance__ =
                    new ClusterDetails(
                            bdaVersion,
                            bdmVersion,
                            bdsVersion,
                            osVersion,
                            dbVersion,
                            bdCellVersion,
                            csqlCellVersion,
                            timeCreated,
                            timeRefreshed,
                            clouderaManagerUrl,
                            ambariUrl,
                            bigDataManagerUrl,
                            hueServerUrl,
                            odhVersion,
                            jupyterHubUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterDetails o) {
            Builder copiedBuilder =
                    bdaVersion(o.getBdaVersion())
                            .bdmVersion(o.getBdmVersion())
                            .bdsVersion(o.getBdsVersion())
                            .osVersion(o.getOsVersion())
                            .dbVersion(o.getDbVersion())
                            .bdCellVersion(o.getBdCellVersion())
                            .csqlCellVersion(o.getCsqlCellVersion())
                            .timeCreated(o.getTimeCreated())
                            .timeRefreshed(o.getTimeRefreshed())
                            .clouderaManagerUrl(o.getClouderaManagerUrl())
                            .ambariUrl(o.getAmbariUrl())
                            .bigDataManagerUrl(o.getBigDataManagerUrl())
                            .hueServerUrl(o.getHueServerUrl())
                            .odhVersion(o.getOdhVersion())
                            .jupyterHubUrl(o.getJupyterHubUrl());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * BDA version installed in the cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdaVersion")
    private final String bdaVersion;

    public String getBdaVersion() {
        return bdaVersion;
    }

    /**
     * Big Data Manager version installed in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdmVersion")
    private final String bdmVersion;

    public String getBdmVersion() {
        return bdmVersion;
    }

    /**
     * Big Data Service version installed in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsVersion")
    private final String bdsVersion;

    public String getBdsVersion() {
        return bdsVersion;
    }

    /**
     * Oracle Linux version installed in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
    private final String osVersion;

    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Cloud SQL query server database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * Cloud SQL cell version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdCellVersion")
    private final String bdCellVersion;

    public String getBdCellVersion() {
        return bdCellVersion;
    }

    /**
     * Big Data SQL version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csqlCellVersion")
    private final String csqlCellVersion;

    public String getCsqlCellVersion() {
        return csqlCellVersion;
    }

    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the cluster was automatically or manually refreshed, shown as an RFC 3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRefreshed")
    private final java.util.Date timeRefreshed;

    public java.util.Date getTimeRefreshed() {
        return timeRefreshed;
    }

    /**
     * The URL of Cloudera Manager
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clouderaManagerUrl")
    private final String clouderaManagerUrl;

    public String getClouderaManagerUrl() {
        return clouderaManagerUrl;
    }

    /**
     * The URL of Ambari
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ambariUrl")
    private final String ambariUrl;

    public String getAmbariUrl() {
        return ambariUrl;
    }

    /**
     * The URL of Big Data Manager.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bigDataManagerUrl")
    private final String bigDataManagerUrl;

    public String getBigDataManagerUrl() {
        return bigDataManagerUrl;
    }

    /**
     * The URL of the Hue server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hueServerUrl")
    private final String hueServerUrl;

    public String getHueServerUrl() {
        return hueServerUrl;
    }

    /**
     * Version of the ODH (Oracle Distribution including Apache Hadoop) installed on the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("odhVersion")
    private final String odhVersion;

    public String getOdhVersion() {
        return odhVersion;
    }

    /**
     * The URL of the Jupyterhub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jupyterHubUrl")
    private final String jupyterHubUrl;

    public String getJupyterHubUrl() {
        return jupyterHubUrl;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClusterDetails(");
        sb.append("bdaVersion=").append(String.valueOf(this.bdaVersion));
        sb.append(", bdmVersion=").append(String.valueOf(this.bdmVersion));
        sb.append(", bdsVersion=").append(String.valueOf(this.bdsVersion));
        sb.append(", osVersion=").append(String.valueOf(this.osVersion));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", bdCellVersion=").append(String.valueOf(this.bdCellVersion));
        sb.append(", csqlCellVersion=").append(String.valueOf(this.csqlCellVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeRefreshed=").append(String.valueOf(this.timeRefreshed));
        sb.append(", clouderaManagerUrl=").append(String.valueOf(this.clouderaManagerUrl));
        sb.append(", ambariUrl=").append(String.valueOf(this.ambariUrl));
        sb.append(", bigDataManagerUrl=").append(String.valueOf(this.bigDataManagerUrl));
        sb.append(", hueServerUrl=").append(String.valueOf(this.hueServerUrl));
        sb.append(", odhVersion=").append(String.valueOf(this.odhVersion));
        sb.append(", jupyterHubUrl=").append(String.valueOf(this.jupyterHubUrl));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterDetails)) {
            return false;
        }

        ClusterDetails other = (ClusterDetails) o;
        return java.util.Objects.equals(this.bdaVersion, other.bdaVersion)
                && java.util.Objects.equals(this.bdmVersion, other.bdmVersion)
                && java.util.Objects.equals(this.bdsVersion, other.bdsVersion)
                && java.util.Objects.equals(this.osVersion, other.osVersion)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.bdCellVersion, other.bdCellVersion)
                && java.util.Objects.equals(this.csqlCellVersion, other.csqlCellVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeRefreshed, other.timeRefreshed)
                && java.util.Objects.equals(this.clouderaManagerUrl, other.clouderaManagerUrl)
                && java.util.Objects.equals(this.ambariUrl, other.ambariUrl)
                && java.util.Objects.equals(this.bigDataManagerUrl, other.bigDataManagerUrl)
                && java.util.Objects.equals(this.hueServerUrl, other.hueServerUrl)
                && java.util.Objects.equals(this.odhVersion, other.odhVersion)
                && java.util.Objects.equals(this.jupyterHubUrl, other.jupyterHubUrl)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bdaVersion == null ? 43 : this.bdaVersion.hashCode());
        result = (result * PRIME) + (this.bdmVersion == null ? 43 : this.bdmVersion.hashCode());
        result = (result * PRIME) + (this.bdsVersion == null ? 43 : this.bdsVersion.hashCode());
        result = (result * PRIME) + (this.osVersion == null ? 43 : this.osVersion.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.bdCellVersion == null ? 43 : this.bdCellVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.csqlCellVersion == null ? 43 : this.csqlCellVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRefreshed == null ? 43 : this.timeRefreshed.hashCode());
        result =
                (result * PRIME)
                        + (this.clouderaManagerUrl == null
                                ? 43
                                : this.clouderaManagerUrl.hashCode());
        result = (result * PRIME) + (this.ambariUrl == null ? 43 : this.ambariUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.bigDataManagerUrl == null ? 43 : this.bigDataManagerUrl.hashCode());
        result = (result * PRIME) + (this.hueServerUrl == null ? 43 : this.hueServerUrl.hashCode());
        result = (result * PRIME) + (this.odhVersion == null ? 43 : this.odhVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.jupyterHubUrl == null ? 43 : this.jupyterHubUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
