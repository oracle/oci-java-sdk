/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * By default a read replica inherits the MySQL version, shape, and configuration of the source DB system.
 * If you want to override any of these, provide values in the properties, mysqlVersion, shapeName,
 * and configurationId. If you set a property value to "", then the value is inherited from its
 * source DB system.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReplicaOverrides.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReplicaOverrides extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mysqlVersion", "shapeName", "configurationId"})
    public ReplicaOverrides(String mysqlVersion, String shapeName, String configurationId) {
        super();
        this.mysqlVersion = mysqlVersion;
        this.shapeName = shapeName;
        this.configurationId = configurationId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The MySQL version to be used by the read replica.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        /**
         * The MySQL version to be used by the read replica.
         * @param mysqlVersion the value to set
         * @return this builder
         **/
        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
            return this;
        }
        /**
         * The shape to be used by the read replica. The shape determines the resources allocated:
         * CPU cores and memory for VM shapes, CPU cores, memory and storage for non-VM (bare metal) shapes.
         * To get a list of shapes, use the {@link #listShapes(ListShapesRequest) listShapes} operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape to be used by the read replica. The shape determines the resources allocated:
         * CPU cores and memory for VM shapes, CPU cores, memory and storage for non-VM (bare metal) shapes.
         * To get a list of shapes, use the {@link #listShapes(ListShapesRequest) listShapes} operation.
         *
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * The OCID of the Configuration to be used by the read replica.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
        private String configurationId;

        /**
         * The OCID of the Configuration to be used by the read replica.
         * @param configurationId the value to set
         * @return this builder
         **/
        public Builder configurationId(String configurationId) {
            this.configurationId = configurationId;
            this.__explicitlySet__.add("configurationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicaOverrides build() {
            ReplicaOverrides model =
                    new ReplicaOverrides(this.mysqlVersion, this.shapeName, this.configurationId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicaOverrides model) {
            if (model.wasPropertyExplicitlySet("mysqlVersion")) {
                this.mysqlVersion(model.getMysqlVersion());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("configurationId")) {
                this.configurationId(model.getConfigurationId());
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
     * The MySQL version to be used by the read replica.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    private final String mysqlVersion;

    /**
     * The MySQL version to be used by the read replica.
     * @return the value
     **/
    public String getMysqlVersion() {
        return mysqlVersion;
    }

    /**
     * The shape to be used by the read replica. The shape determines the resources allocated:
     * CPU cores and memory for VM shapes, CPU cores, memory and storage for non-VM (bare metal) shapes.
     * To get a list of shapes, use the {@link #listShapes(ListShapesRequest) listShapes} operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape to be used by the read replica. The shape determines the resources allocated:
     * CPU cores and memory for VM shapes, CPU cores, memory and storage for non-VM (bare metal) shapes.
     * To get a list of shapes, use the {@link #listShapes(ListShapesRequest) listShapes} operation.
     *
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    /**
     * The OCID of the Configuration to be used by the read replica.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
    private final String configurationId;

    /**
     * The OCID of the Configuration to be used by the read replica.
     * @return the value
     **/
    public String getConfigurationId() {
        return configurationId;
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
        sb.append("ReplicaOverrides(");
        sb.append("super=").append(super.toString());
        sb.append("mysqlVersion=").append(String.valueOf(this.mysqlVersion));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", configurationId=").append(String.valueOf(this.configurationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicaOverrides)) {
            return false;
        }

        ReplicaOverrides other = (ReplicaOverrides) o;
        return java.util.Objects.equals(this.mysqlVersion, other.mysqlVersion)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.configurationId, other.configurationId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mysqlVersion == null ? 43 : this.mysqlVersion.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationId == null ? 43 : this.configurationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
