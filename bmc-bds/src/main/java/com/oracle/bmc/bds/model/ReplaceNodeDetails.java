/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the node to be replaced.
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
    builder = ReplaceNodeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReplaceNodeDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "nodeHostName",
        "nodeBackupId",
        "clusterAdminPassword",
        "shape"
    })
    public ReplaceNodeDetails(
            String nodeHostName, String nodeBackupId, String clusterAdminPassword, String shape) {
        super();
        this.nodeHostName = nodeHostName;
        this.nodeBackupId = nodeBackupId;
        this.clusterAdminPassword = clusterAdminPassword;
        this.shape = shape;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Host name of the node to replace. MASTER, UTILITY and EDGE node are only supported types
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeHostName")
        private String nodeHostName;

        /**
         * Host name of the node to replace. MASTER, UTILITY and EDGE node are only supported types
         * @param nodeHostName the value to set
         * @return this builder
         **/
        public Builder nodeHostName(String nodeHostName) {
            this.nodeHostName = nodeHostName;
            this.__explicitlySet__.add("nodeHostName");
            return this;
        }
        /**
         * The id of the nodeBackup to use for replacing the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeBackupId")
        private String nodeBackupId;

        /**
         * The id of the nodeBackup to use for replacing the node.
         * @param nodeBackupId the value to set
         * @return this builder
         **/
        public Builder nodeBackupId(String nodeBackupId) {
            this.nodeBackupId = nodeBackupId;
            this.__explicitlySet__.add("nodeBackupId");
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
         * Shape of the new vm when replacing the node. If not provided, BDS will attempt to replace the node with the shape of current node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Shape of the new vm when replacing the node. If not provided, BDS will attempt to replace the node with the shape of current node.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplaceNodeDetails build() {
            ReplaceNodeDetails model =
                    new ReplaceNodeDetails(
                            this.nodeHostName,
                            this.nodeBackupId,
                            this.clusterAdminPassword,
                            this.shape);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplaceNodeDetails model) {
            if (model.wasPropertyExplicitlySet("nodeHostName")) {
                this.nodeHostName(model.getNodeHostName());
            }
            if (model.wasPropertyExplicitlySet("nodeBackupId")) {
                this.nodeBackupId(model.getNodeBackupId());
            }
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
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
     * Host name of the node to replace. MASTER, UTILITY and EDGE node are only supported types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeHostName")
    private final String nodeHostName;

    /**
     * Host name of the node to replace. MASTER, UTILITY and EDGE node are only supported types
     * @return the value
     **/
    public String getNodeHostName() {
        return nodeHostName;
    }

    /**
     * The id of the nodeBackup to use for replacing the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeBackupId")
    private final String nodeBackupId;

    /**
     * The id of the nodeBackup to use for replacing the node.
     * @return the value
     **/
    public String getNodeBackupId() {
        return nodeBackupId;
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
     * Shape of the new vm when replacing the node. If not provided, BDS will attempt to replace the node with the shape of current node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Shape of the new vm when replacing the node. If not provided, BDS will attempt to replace the node with the shape of current node.
     * @return the value
     **/
    public String getShape() {
        return shape;
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
        sb.append("ReplaceNodeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("nodeHostName=").append(String.valueOf(this.nodeHostName));
        sb.append(", nodeBackupId=").append(String.valueOf(this.nodeBackupId));
        sb.append(", clusterAdminPassword=").append("<redacted>");
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplaceNodeDetails)) {
            return false;
        }

        ReplaceNodeDetails other = (ReplaceNodeDetails) o;
        return java.util.Objects.equals(this.nodeHostName, other.nodeHostName)
                && java.util.Objects.equals(this.nodeBackupId, other.nodeBackupId)
                && java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.shape, other.shape)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodeHostName == null ? 43 : this.nodeHostName.hashCode());
        result = (result * PRIME) + (this.nodeBackupId == null ? 43 : this.nodeBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
