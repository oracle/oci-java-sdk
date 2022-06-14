/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The URLs for accessing Oracle Application Express (APEX) and SQL Developer Web with a browser from a Compute instance within your VCN or that has a direct connection to your VCN. Note that these URLs are provided by the console only for databases on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
 * <p>
 * Example: {@code {"sqlDevWebUrl": "https://<hostname>/ords...", "apexUrl", "https://<hostname>/ords..."}}
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDatabaseConnectionUrls.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDatabaseConnectionUrls {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlDevWebUrl",
        "apexUrl",
        "machineLearningUserManagementUrl",
        "graphStudioUrl"
    })
    public AutonomousDatabaseConnectionUrls(
            String sqlDevWebUrl,
            String apexUrl,
            String machineLearningUserManagementUrl,
            String graphStudioUrl) {
        super();
        this.sqlDevWebUrl = sqlDevWebUrl;
        this.apexUrl = apexUrl;
        this.machineLearningUserManagementUrl = machineLearningUserManagementUrl;
        this.graphStudioUrl = graphStudioUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Oracle SQL Developer Web URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlDevWebUrl")
        private String sqlDevWebUrl;

        /**
         * Oracle SQL Developer Web URL.
         * @param sqlDevWebUrl the value to set
         * @return this builder
         **/
        public Builder sqlDevWebUrl(String sqlDevWebUrl) {
            this.sqlDevWebUrl = sqlDevWebUrl;
            this.__explicitlySet__.add("sqlDevWebUrl");
            return this;
        }
        /**
         * Oracle Application Express (APEX) URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("apexUrl")
        private String apexUrl;

        /**
         * Oracle Application Express (APEX) URL.
         * @param apexUrl the value to set
         * @return this builder
         **/
        public Builder apexUrl(String apexUrl) {
            this.apexUrl = apexUrl;
            this.__explicitlySet__.add("apexUrl");
            return this;
        }
        /**
         * Oracle Machine Learning user management URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("machineLearningUserManagementUrl")
        private String machineLearningUserManagementUrl;

        /**
         * Oracle Machine Learning user management URL.
         * @param machineLearningUserManagementUrl the value to set
         * @return this builder
         **/
        public Builder machineLearningUserManagementUrl(String machineLearningUserManagementUrl) {
            this.machineLearningUserManagementUrl = machineLearningUserManagementUrl;
            this.__explicitlySet__.add("machineLearningUserManagementUrl");
            return this;
        }
        /**
         * The URL of the Graph Studio for the Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("graphStudioUrl")
        private String graphStudioUrl;

        /**
         * The URL of the Graph Studio for the Autonomous Database.
         * @param graphStudioUrl the value to set
         * @return this builder
         **/
        public Builder graphStudioUrl(String graphStudioUrl) {
            this.graphStudioUrl = graphStudioUrl;
            this.__explicitlySet__.add("graphStudioUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseConnectionUrls build() {
            AutonomousDatabaseConnectionUrls __instance__ =
                    new AutonomousDatabaseConnectionUrls(
                            sqlDevWebUrl,
                            apexUrl,
                            machineLearningUserManagementUrl,
                            graphStudioUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseConnectionUrls o) {
            Builder copiedBuilder =
                    sqlDevWebUrl(o.getSqlDevWebUrl())
                            .apexUrl(o.getApexUrl())
                            .machineLearningUserManagementUrl(
                                    o.getMachineLearningUserManagementUrl())
                            .graphStudioUrl(o.getGraphStudioUrl());

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
     * Oracle SQL Developer Web URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlDevWebUrl")
    private final String sqlDevWebUrl;

    /**
     * Oracle SQL Developer Web URL.
     * @return the value
     **/
    public String getSqlDevWebUrl() {
        return sqlDevWebUrl;
    }

    /**
     * Oracle Application Express (APEX) URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apexUrl")
    private final String apexUrl;

    /**
     * Oracle Application Express (APEX) URL.
     * @return the value
     **/
    public String getApexUrl() {
        return apexUrl;
    }

    /**
     * Oracle Machine Learning user management URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("machineLearningUserManagementUrl")
    private final String machineLearningUserManagementUrl;

    /**
     * Oracle Machine Learning user management URL.
     * @return the value
     **/
    public String getMachineLearningUserManagementUrl() {
        return machineLearningUserManagementUrl;
    }

    /**
     * The URL of the Graph Studio for the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("graphStudioUrl")
    private final String graphStudioUrl;

    /**
     * The URL of the Graph Studio for the Autonomous Database.
     * @return the value
     **/
    public String getGraphStudioUrl() {
        return graphStudioUrl;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AutonomousDatabaseConnectionUrls(");
        sb.append("sqlDevWebUrl=").append(String.valueOf(this.sqlDevWebUrl));
        sb.append(", apexUrl=").append(String.valueOf(this.apexUrl));
        sb.append(", machineLearningUserManagementUrl=")
                .append(String.valueOf(this.machineLearningUserManagementUrl));
        sb.append(", graphStudioUrl=").append(String.valueOf(this.graphStudioUrl));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseConnectionUrls)) {
            return false;
        }

        AutonomousDatabaseConnectionUrls other = (AutonomousDatabaseConnectionUrls) o;
        return java.util.Objects.equals(this.sqlDevWebUrl, other.sqlDevWebUrl)
                && java.util.Objects.equals(this.apexUrl, other.apexUrl)
                && java.util.Objects.equals(
                        this.machineLearningUserManagementUrl,
                        other.machineLearningUserManagementUrl)
                && java.util.Objects.equals(this.graphStudioUrl, other.graphStudioUrl)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sqlDevWebUrl == null ? 43 : this.sqlDevWebUrl.hashCode());
        result = (result * PRIME) + (this.apexUrl == null ? 43 : this.apexUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.machineLearningUserManagementUrl == null
                                ? 43
                                : this.machineLearningUserManagementUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.graphStudioUrl == null ? 43 : this.graphStudioUrl.hashCode());
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
