/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the NodeReplaceConfiguration
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateNodeReplaceConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateNodeReplaceConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "levelTypeDetails",
        "displayName",
        "clusterAdminPassword",
        "metricType",
        "durationInMinutes"
    })
    public CreateNodeReplaceConfigurationDetails(
            LevelTypeDetails levelTypeDetails,
            String displayName,
            String clusterAdminPassword,
            NodeReplaceConfiguration.MetricType metricType,
            Integer durationInMinutes) {
        super();
        this.levelTypeDetails = levelTypeDetails;
        this.displayName = displayName;
        this.clusterAdminPassword = clusterAdminPassword;
        this.metricType = metricType;
        this.durationInMinutes = durationInMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("levelTypeDetails")
        private LevelTypeDetails levelTypeDetails;

        public Builder levelTypeDetails(LevelTypeDetails levelTypeDetails) {
            this.levelTypeDetails = levelTypeDetails;
            this.__explicitlySet__.add("levelTypeDetails");
            return this;
        }
        /**
         * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Base-64 encoded password for the cluster admin user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster admin user.
         * @param clusterAdminPassword the value to set
         * @return this builder
         **/
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /**
         * Type of compute instance health metric to use for node replacement
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricType")
        private NodeReplaceConfiguration.MetricType metricType;

        /**
         * Type of compute instance health metric to use for node replacement
         * @param metricType the value to set
         * @return this builder
         **/
        public Builder metricType(NodeReplaceConfiguration.MetricType metricType) {
            this.metricType = metricType;
            this.__explicitlySet__.add("metricType");
            return this;
        }
        /**
         * This value is the minimum period of time to wait before triggering node replacement. The value is in minutes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("durationInMinutes")
        private Integer durationInMinutes;

        /**
         * This value is the minimum period of time to wait before triggering node replacement. The value is in minutes.
         * @param durationInMinutes the value to set
         * @return this builder
         **/
        public Builder durationInMinutes(Integer durationInMinutes) {
            this.durationInMinutes = durationInMinutes;
            this.__explicitlySet__.add("durationInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNodeReplaceConfigurationDetails build() {
            CreateNodeReplaceConfigurationDetails model =
                    new CreateNodeReplaceConfigurationDetails(
                            this.levelTypeDetails,
                            this.displayName,
                            this.clusterAdminPassword,
                            this.metricType,
                            this.durationInMinutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNodeReplaceConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("levelTypeDetails")) {
                this.levelTypeDetails(model.getLevelTypeDetails());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("metricType")) {
                this.metricType(model.getMetricType());
            }
            if (model.wasPropertyExplicitlySet("durationInMinutes")) {
                this.durationInMinutes(model.getDurationInMinutes());
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

    @com.fasterxml.jackson.annotation.JsonProperty("levelTypeDetails")
    private final LevelTypeDetails levelTypeDetails;

    public LevelTypeDetails getLevelTypeDetails() {
        return levelTypeDetails;
    }

    /**
     * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Base-64 encoded password for the cluster admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster admin user.
     * @return the value
     **/
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /**
     * Type of compute instance health metric to use for node replacement
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricType")
    private final NodeReplaceConfiguration.MetricType metricType;

    /**
     * Type of compute instance health metric to use for node replacement
     * @return the value
     **/
    public NodeReplaceConfiguration.MetricType getMetricType() {
        return metricType;
    }

    /**
     * This value is the minimum period of time to wait before triggering node replacement. The value is in minutes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("durationInMinutes")
    private final Integer durationInMinutes;

    /**
     * This value is the minimum period of time to wait before triggering node replacement. The value is in minutes.
     * @return the value
     **/
    public Integer getDurationInMinutes() {
        return durationInMinutes;
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
        sb.append("CreateNodeReplaceConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("levelTypeDetails=").append(String.valueOf(this.levelTypeDetails));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", clusterAdminPassword=").append("<redacted>");
        sb.append(", metricType=").append(String.valueOf(this.metricType));
        sb.append(", durationInMinutes=").append(String.valueOf(this.durationInMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNodeReplaceConfigurationDetails)) {
            return false;
        }

        CreateNodeReplaceConfigurationDetails other = (CreateNodeReplaceConfigurationDetails) o;
        return java.util.Objects.equals(this.levelTypeDetails, other.levelTypeDetails)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.metricType, other.metricType)
                && java.util.Objects.equals(this.durationInMinutes, other.durationInMinutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.levelTypeDetails == null ? 43 : this.levelTypeDetails.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result = (result * PRIME) + (this.metricType == null ? 43 : this.metricType.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInMinutes == null ? 43 : this.durationInMinutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
