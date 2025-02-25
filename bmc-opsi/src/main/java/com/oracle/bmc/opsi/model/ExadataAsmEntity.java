/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * ASM entitie for an exadata
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExadataAsmEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataAsmEntity extends DatabaseConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * Instance name of ASM
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        /**
         * Instance name of ASM
         * @param instanceName the value to set
         * @return this builder
         **/
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }
        /**
         * Cluster name of ASM
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        /**
         * Cluster name of ASM
         * @param clusterName the value to set
         * @return this builder
         **/
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
            return this;
        }
        /**
         * Software version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
        private String softwareVersion;

        /**
         * Software version
         * @param softwareVersion the value to set
         * @return this builder
         **/
        public Builder softwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            this.__explicitlySet__.add("softwareVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataAsmEntity build() {
            ExadataAsmEntity model =
                    new ExadataAsmEntity(
                            this.timeCollected,
                            this.instanceName,
                            this.clusterName,
                            this.softwareVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataAsmEntity model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("instanceName")) {
                this.instanceName(model.getInstanceName());
            }
            if (model.wasPropertyExplicitlySet("clusterName")) {
                this.clusterName(model.getClusterName());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
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

    @Deprecated
    public ExadataAsmEntity(
            java.util.Date timeCollected,
            String instanceName,
            String clusterName,
            String softwareVersion) {
        super(timeCollected);
        this.instanceName = instanceName;
        this.clusterName = clusterName;
        this.softwareVersion = softwareVersion;
    }

    /**
     * Instance name of ASM
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    private final String instanceName;

    /**
     * Instance name of ASM
     * @return the value
     **/
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * Cluster name of ASM
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

    /**
     * Cluster name of ASM
     * @return the value
     **/
    public String getClusterName() {
        return clusterName;
    }

    /**
     * Software version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
    private final String softwareVersion;

    /**
     * Software version
     * @return the value
     **/
    public String getSoftwareVersion() {
        return softwareVersion;
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
        sb.append("ExadataAsmEntity(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", instanceName=").append(String.valueOf(this.instanceName));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataAsmEntity)) {
            return false;
        }

        ExadataAsmEntity other = (ExadataAsmEntity) o;
        return java.util.Objects.equals(this.instanceName, other.instanceName)
                && java.util.Objects.equals(this.clusterName, other.clusterName)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.instanceName == null ? 43 : this.instanceName.hashCode());
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        return result;
    }
}
