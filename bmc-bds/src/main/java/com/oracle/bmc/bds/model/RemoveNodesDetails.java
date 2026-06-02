/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the list of nodes to be removed.
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
    builder = RemoveNodesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RemoveNodesDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    public RemoveNodesDetails(
            String clusterAdminPassword,
            String secretId,
            Boolean isForceRemoveEnabled,
            java.util.List<String> instanceIds) {
        super();
        this.clusterAdminPassword =
                clusterAdminPassword != null ? clusterAdminPassword.toCharArray() : null;
        this.secretId = secretId;
        this.isForceRemoveEnabled = isForceRemoveEnabled;
        this.instanceIds = instanceIds;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterAdminPassword",
        "secretId",
        "isForceRemoveEnabled",
        "instanceIds"
    })
    public RemoveNodesDetails(
            char[] clusterAdminPassword,
            String secretId,
            Boolean isForceRemoveEnabled,
            java.util.List<String> instanceIds) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.secretId = secretId;
        this.isForceRemoveEnabled = isForceRemoveEnabled;
        this.instanceIds = instanceIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private char[] clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         * @param clusterAdminPassword the value to set
         * @return this builder
         **/
        public Builder clusterAdminPassword(char[] clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }

        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword =
                    clusterAdminPassword != null ? clusterAdminPassword.toCharArray() : null;
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
        /**
         * Boolean flag specifying whether or not to force remove nodes if graceful removal fails.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isForceRemoveEnabled")
        private Boolean isForceRemoveEnabled;

        /**
         * Boolean flag specifying whether or not to force remove nodes if graceful removal fails.
         *
         * @param isForceRemoveEnabled the value to set
         * @return this builder
         **/
        public Builder isForceRemoveEnabled(Boolean isForceRemoveEnabled) {
            this.isForceRemoveEnabled = isForceRemoveEnabled;
            this.__explicitlySet__.add("isForceRemoveEnabled");
            return this;
        }
        /**
         * List of instance IDs to be removed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceIds")
        private java.util.List<String> instanceIds;

        /**
         * List of instance IDs to be removed.
         * @param instanceIds the value to set
         * @return this builder
         **/
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            this.__explicitlySet__.add("instanceIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveNodesDetails build() {
            RemoveNodesDetails model =
                    new RemoveNodesDetails(
                            this.clusterAdminPassword,
                            this.secretId,
                            this.isForceRemoveEnabled,
                            this.instanceIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveNodesDetails model) {
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("isForceRemoveEnabled")) {
                this.isForceRemoveEnabled(model.getIsForceRemoveEnabled());
            }
            if (model.wasPropertyExplicitlySet("instanceIds")) {
                this.instanceIds(model.getInstanceIds());
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
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final char[] clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     * return the value
     * @Deprecated - Use getClusterAdminPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getClusterAdminPassword() {
        return clusterAdminPassword != null ? new String(clusterAdminPassword) : null;
    }

    /**
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     * @return the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    public char[] getClusterAdminPassword__AsCharArray() {
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

    /**
     * Boolean flag specifying whether or not to force remove nodes if graceful removal fails.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForceRemoveEnabled")
    private final Boolean isForceRemoveEnabled;

    /**
     * Boolean flag specifying whether or not to force remove nodes if graceful removal fails.
     *
     * @return the value
     **/
    public Boolean getIsForceRemoveEnabled() {
        return isForceRemoveEnabled;
    }

    /**
     * List of instance IDs to be removed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceIds")
    private final java.util.List<String> instanceIds;

    /**
     * List of instance IDs to be removed.
     * @return the value
     **/
    public java.util.List<String> getInstanceIds() {
        return instanceIds;
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
        sb.append("RemoveNodesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterAdminPassword=").append("<redacted>");
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", isForceRemoveEnabled=").append(String.valueOf(this.isForceRemoveEnabled));
        sb.append(", instanceIds=").append(String.valueOf(this.instanceIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveNodesDetails)) {
            return false;
        }

        RemoveNodesDetails other = (RemoveNodesDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.isForceRemoveEnabled, other.isForceRemoveEnabled)
                && java.util.Objects.equals(this.instanceIds, other.instanceIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceRemoveEnabled == null
                                ? 43
                                : this.isForceRemoveEnabled.hashCode());
        result = (result * PRIME) + (this.instanceIds == null ? 43 : this.instanceIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
