/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The request body for stopping a BDS cluster.
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
    builder = StopBdsInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StopBdsInstanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isForceStopJobs", "clusterAdminPassword", "secretId"})
    public StopBdsInstanceDetails(
            Boolean isForceStopJobs, String clusterAdminPassword, String secretId) {
        super();
        this.isForceStopJobs = isForceStopJobs;
        this.clusterAdminPassword = clusterAdminPassword;
        this.secretId = secretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Boolean indicating whether to force stop jobs while stopping cluster. Defaults to false.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isForceStopJobs")
        private Boolean isForceStopJobs;

        /**
         * Boolean indicating whether to force stop jobs while stopping cluster. Defaults to false.
         * @param isForceStopJobs the value to set
         * @return this builder
         **/
        public Builder isForceStopJobs(Boolean isForceStopJobs) {
            this.isForceStopJobs = isForceStopJobs;
            this.__explicitlySet__.add("isForceStopJobs");
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
         * The secretId for the clusterAdminPassword.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The secretId for the clusterAdminPassword.
         * @param secretId the value to set
         * @return this builder
         **/
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StopBdsInstanceDetails build() {
            StopBdsInstanceDetails model =
                    new StopBdsInstanceDetails(
                            this.isForceStopJobs, this.clusterAdminPassword, this.secretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StopBdsInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("isForceStopJobs")) {
                this.isForceStopJobs(model.getIsForceStopJobs());
            }
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
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
     * Boolean indicating whether to force stop jobs while stopping cluster. Defaults to false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForceStopJobs")
    private final Boolean isForceStopJobs;

    /**
     * Boolean indicating whether to force stop jobs while stopping cluster. Defaults to false.
     * @return the value
     **/
    public Boolean getIsForceStopJobs() {
        return isForceStopJobs;
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
     * The secretId for the clusterAdminPassword.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The secretId for the clusterAdminPassword.
     * @return the value
     **/
    public String getSecretId() {
        return secretId;
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
        sb.append("StopBdsInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isForceStopJobs=").append(String.valueOf(this.isForceStopJobs));
        sb.append(", clusterAdminPassword=").append("<redacted>");
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StopBdsInstanceDetails)) {
            return false;
        }

        StopBdsInstanceDetails other = (StopBdsInstanceDetails) o;
        return java.util.Objects.equals(this.isForceStopJobs, other.isForceStopJobs)
                && java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isForceStopJobs == null ? 43 : this.isForceStopJobs.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
