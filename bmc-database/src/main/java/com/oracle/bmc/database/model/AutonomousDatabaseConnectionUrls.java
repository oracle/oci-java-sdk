/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The URLs for accessing Oracle Application Express (APEX) and SQL Developer Web with a browser
 * from a Compute instance within your VCN or that has a direct connection to your VCN. Note that
 * these URLs are provided by the console only for databases on [dedicated Exadata
 * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
 *
 * <p>Example: {@code {"sqlDevWebUrl": "https://<hostname>/ords...", "apexUrl",
 * "https://<hostname>/ords..."}} <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutonomousDatabaseConnectionUrls.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousDatabaseConnectionUrls
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlDevWebUrl",
        "apexUrl",
        "machineLearningUserManagementUrl",
        "graphStudioUrl",
        "mongoDbUrl",
        "machineLearningNotebookUrl",
        "ordsUrl",
        "databaseTransformsUrl"
    })
    public AutonomousDatabaseConnectionUrls(
            String sqlDevWebUrl,
            String apexUrl,
            String machineLearningUserManagementUrl,
            String graphStudioUrl,
            String mongoDbUrl,
            String machineLearningNotebookUrl,
            String ordsUrl,
            String databaseTransformsUrl) {
        super();
        this.sqlDevWebUrl = sqlDevWebUrl;
        this.apexUrl = apexUrl;
        this.machineLearningUserManagementUrl = machineLearningUserManagementUrl;
        this.graphStudioUrl = graphStudioUrl;
        this.mongoDbUrl = mongoDbUrl;
        this.machineLearningNotebookUrl = machineLearningNotebookUrl;
        this.ordsUrl = ordsUrl;
        this.databaseTransformsUrl = databaseTransformsUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Oracle SQL Developer Web URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlDevWebUrl")
        private String sqlDevWebUrl;

        /**
         * Oracle SQL Developer Web URL.
         *
         * @param sqlDevWebUrl the value to set
         * @return this builder
         */
        public Builder sqlDevWebUrl(String sqlDevWebUrl) {
            this.sqlDevWebUrl = sqlDevWebUrl;
            this.__explicitlySet__.add("sqlDevWebUrl");
            return this;
        }
        /** Oracle Application Express (APEX) URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("apexUrl")
        private String apexUrl;

        /**
         * Oracle Application Express (APEX) URL.
         *
         * @param apexUrl the value to set
         * @return this builder
         */
        public Builder apexUrl(String apexUrl) {
            this.apexUrl = apexUrl;
            this.__explicitlySet__.add("apexUrl");
            return this;
        }
        /** Oracle Machine Learning user management URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("machineLearningUserManagementUrl")
        private String machineLearningUserManagementUrl;

        /**
         * Oracle Machine Learning user management URL.
         *
         * @param machineLearningUserManagementUrl the value to set
         * @return this builder
         */
        public Builder machineLearningUserManagementUrl(String machineLearningUserManagementUrl) {
            this.machineLearningUserManagementUrl = machineLearningUserManagementUrl;
            this.__explicitlySet__.add("machineLearningUserManagementUrl");
            return this;
        }
        /** The URL of the Graph Studio for the Autonomous AI Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("graphStudioUrl")
        private String graphStudioUrl;

        /**
         * The URL of the Graph Studio for the Autonomous AI Database.
         *
         * @param graphStudioUrl the value to set
         * @return this builder
         */
        public Builder graphStudioUrl(String graphStudioUrl) {
            this.graphStudioUrl = graphStudioUrl;
            this.__explicitlySet__.add("graphStudioUrl");
            return this;
        }
        /** The URL of the MongoDB API for the Autonomous AI Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("mongoDbUrl")
        private String mongoDbUrl;

        /**
         * The URL of the MongoDB API for the Autonomous AI Database.
         *
         * @param mongoDbUrl the value to set
         * @return this builder
         */
        public Builder mongoDbUrl(String mongoDbUrl) {
            this.mongoDbUrl = mongoDbUrl;
            this.__explicitlySet__.add("mongoDbUrl");
            return this;
        }
        /** The URL of the Oracle Machine Learning (OML) Notebook for the Autonomous AI Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("machineLearningNotebookUrl")
        private String machineLearningNotebookUrl;

        /**
         * The URL of the Oracle Machine Learning (OML) Notebook for the Autonomous AI Database.
         *
         * @param machineLearningNotebookUrl the value to set
         * @return this builder
         */
        public Builder machineLearningNotebookUrl(String machineLearningNotebookUrl) {
            this.machineLearningNotebookUrl = machineLearningNotebookUrl;
            this.__explicitlySet__.add("machineLearningNotebookUrl");
            return this;
        }
        /**
         * The Oracle REST Data Services (ORDS) URL of the Web Access for the Autonomous AI
         * Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ordsUrl")
        private String ordsUrl;

        /**
         * The Oracle REST Data Services (ORDS) URL of the Web Access for the Autonomous AI
         * Database.
         *
         * @param ordsUrl the value to set
         * @return this builder
         */
        public Builder ordsUrl(String ordsUrl) {
            this.ordsUrl = ordsUrl;
            this.__explicitlySet__.add("ordsUrl");
            return this;
        }
        /** The URL of the Database Transforms for the Autonomous AI Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseTransformsUrl")
        private String databaseTransformsUrl;

        /**
         * The URL of the Database Transforms for the Autonomous AI Database.
         *
         * @param databaseTransformsUrl the value to set
         * @return this builder
         */
        public Builder databaseTransformsUrl(String databaseTransformsUrl) {
            this.databaseTransformsUrl = databaseTransformsUrl;
            this.__explicitlySet__.add("databaseTransformsUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseConnectionUrls build() {
            AutonomousDatabaseConnectionUrls model =
                    new AutonomousDatabaseConnectionUrls(
                            this.sqlDevWebUrl,
                            this.apexUrl,
                            this.machineLearningUserManagementUrl,
                            this.graphStudioUrl,
                            this.mongoDbUrl,
                            this.machineLearningNotebookUrl,
                            this.ordsUrl,
                            this.databaseTransformsUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseConnectionUrls model) {
            if (model.wasPropertyExplicitlySet("sqlDevWebUrl")) {
                this.sqlDevWebUrl(model.getSqlDevWebUrl());
            }
            if (model.wasPropertyExplicitlySet("apexUrl")) {
                this.apexUrl(model.getApexUrl());
            }
            if (model.wasPropertyExplicitlySet("machineLearningUserManagementUrl")) {
                this.machineLearningUserManagementUrl(model.getMachineLearningUserManagementUrl());
            }
            if (model.wasPropertyExplicitlySet("graphStudioUrl")) {
                this.graphStudioUrl(model.getGraphStudioUrl());
            }
            if (model.wasPropertyExplicitlySet("mongoDbUrl")) {
                this.mongoDbUrl(model.getMongoDbUrl());
            }
            if (model.wasPropertyExplicitlySet("machineLearningNotebookUrl")) {
                this.machineLearningNotebookUrl(model.getMachineLearningNotebookUrl());
            }
            if (model.wasPropertyExplicitlySet("ordsUrl")) {
                this.ordsUrl(model.getOrdsUrl());
            }
            if (model.wasPropertyExplicitlySet("databaseTransformsUrl")) {
                this.databaseTransformsUrl(model.getDatabaseTransformsUrl());
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

    /** Oracle SQL Developer Web URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlDevWebUrl")
    private final String sqlDevWebUrl;

    /**
     * Oracle SQL Developer Web URL.
     *
     * @return the value
     */
    public String getSqlDevWebUrl() {
        return sqlDevWebUrl;
    }

    /** Oracle Application Express (APEX) URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("apexUrl")
    private final String apexUrl;

    /**
     * Oracle Application Express (APEX) URL.
     *
     * @return the value
     */
    public String getApexUrl() {
        return apexUrl;
    }

    /** Oracle Machine Learning user management URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("machineLearningUserManagementUrl")
    private final String machineLearningUserManagementUrl;

    /**
     * Oracle Machine Learning user management URL.
     *
     * @return the value
     */
    public String getMachineLearningUserManagementUrl() {
        return machineLearningUserManagementUrl;
    }

    /** The URL of the Graph Studio for the Autonomous AI Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("graphStudioUrl")
    private final String graphStudioUrl;

    /**
     * The URL of the Graph Studio for the Autonomous AI Database.
     *
     * @return the value
     */
    public String getGraphStudioUrl() {
        return graphStudioUrl;
    }

    /** The URL of the MongoDB API for the Autonomous AI Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("mongoDbUrl")
    private final String mongoDbUrl;

    /**
     * The URL of the MongoDB API for the Autonomous AI Database.
     *
     * @return the value
     */
    public String getMongoDbUrl() {
        return mongoDbUrl;
    }

    /** The URL of the Oracle Machine Learning (OML) Notebook for the Autonomous AI Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("machineLearningNotebookUrl")
    private final String machineLearningNotebookUrl;

    /**
     * The URL of the Oracle Machine Learning (OML) Notebook for the Autonomous AI Database.
     *
     * @return the value
     */
    public String getMachineLearningNotebookUrl() {
        return machineLearningNotebookUrl;
    }

    /**
     * The Oracle REST Data Services (ORDS) URL of the Web Access for the Autonomous AI Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ordsUrl")
    private final String ordsUrl;

    /**
     * The Oracle REST Data Services (ORDS) URL of the Web Access for the Autonomous AI Database.
     *
     * @return the value
     */
    public String getOrdsUrl() {
        return ordsUrl;
    }

    /** The URL of the Database Transforms for the Autonomous AI Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseTransformsUrl")
    private final String databaseTransformsUrl;

    /**
     * The URL of the Database Transforms for the Autonomous AI Database.
     *
     * @return the value
     */
    public String getDatabaseTransformsUrl() {
        return databaseTransformsUrl;
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
        sb.append("AutonomousDatabaseConnectionUrls(");
        sb.append("super=").append(super.toString());
        sb.append("sqlDevWebUrl=").append(String.valueOf(this.sqlDevWebUrl));
        sb.append(", apexUrl=").append(String.valueOf(this.apexUrl));
        sb.append(", machineLearningUserManagementUrl=")
                .append(String.valueOf(this.machineLearningUserManagementUrl));
        sb.append(", graphStudioUrl=").append(String.valueOf(this.graphStudioUrl));
        sb.append(", mongoDbUrl=").append(String.valueOf(this.mongoDbUrl));
        sb.append(", machineLearningNotebookUrl=")
                .append(String.valueOf(this.machineLearningNotebookUrl));
        sb.append(", ordsUrl=").append(String.valueOf(this.ordsUrl));
        sb.append(", databaseTransformsUrl=").append(String.valueOf(this.databaseTransformsUrl));
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
                && java.util.Objects.equals(this.mongoDbUrl, other.mongoDbUrl)
                && java.util.Objects.equals(
                        this.machineLearningNotebookUrl, other.machineLearningNotebookUrl)
                && java.util.Objects.equals(this.ordsUrl, other.ordsUrl)
                && java.util.Objects.equals(this.databaseTransformsUrl, other.databaseTransformsUrl)
                && super.equals(other);
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
        result = (result * PRIME) + (this.mongoDbUrl == null ? 43 : this.mongoDbUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.machineLearningNotebookUrl == null
                                ? 43
                                : this.machineLearningNotebookUrl.hashCode());
        result = (result * PRIME) + (this.ordsUrl == null ? 43 : this.ordsUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseTransformsUrl == null
                                ? 43
                                : this.databaseTransformsUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
