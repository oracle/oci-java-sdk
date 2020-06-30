/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ClusterDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterDetails build() {
            ClusterDetails __instance__ =
                    new ClusterDetails(
                            bdaVersion,
                            bdmVersion,
                            timeCreated,
                            timeRefreshed,
                            clouderaManagerUrl,
                            bigDataManagerUrl,
                            hueServerUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterDetails o) {
            Builder copiedBuilder =
                    bdaVersion(o.getBdaVersion())
                            .bdmVersion(o.getBdmVersion())
                            .timeCreated(o.getTimeCreated())
                            .timeRefreshed(o.getTimeRefreshed())
                            .clouderaManagerUrl(o.getClouderaManagerUrl())
                            .bigDataManagerUrl(o.getBigDataManagerUrl())
                            .hueServerUrl(o.getHueServerUrl());

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

    /**
     * BDA version installed in the cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdaVersion")
    String bdaVersion;

    /**
     * BDM version installed in the cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdmVersion")
    String bdmVersion;

    /**
     * The time the cluster was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the BDS instance was automatically, or manually refreshed.
     * An RFC3339 formatted datetime string
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRefreshed")
    java.util.Date timeRefreshed;

    /**
     * The URL of a Cloudera Manager
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clouderaManagerUrl")
    String clouderaManagerUrl;

    /**
     * The URL of a Big Data Manager
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bigDataManagerUrl")
    String bigDataManagerUrl;

    /**
     * The URL of a Hue Server
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hueServerUrl")
    String hueServerUrl;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
