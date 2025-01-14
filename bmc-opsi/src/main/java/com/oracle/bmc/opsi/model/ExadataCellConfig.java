/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Storage server configuration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExadataCellConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadataCellConfig extends DatabaseConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** Cell name */
        @com.fasterxml.jackson.annotation.JsonProperty("cellName")
        private String cellName;

        /**
         * Cell name
         *
         * @param cellName the value to set
         * @return this builder
         */
        public Builder cellName(String cellName) {
            this.cellName = cellName;
            this.__explicitlySet__.add("cellName");
            return this;
        }
        /** Cell hash */
        @com.fasterxml.jackson.annotation.JsonProperty("cellHash")
        private String cellHash;

        /**
         * Cell hash
         *
         * @param cellHash the value to set
         * @return this builder
         */
        public Builder cellHash(String cellHash) {
            this.cellHash = cellHash;
            this.__explicitlySet__.add("cellHash");
            return this;
        }
        /** Cell properties */
        @com.fasterxml.jackson.annotation.JsonProperty("cellProperties")
        private String cellProperties;

        /**
         * Cell properties
         *
         * @param cellProperties the value to set
         * @return this builder
         */
        public Builder cellProperties(String cellProperties) {
            this.cellProperties = cellProperties;
            this.__explicitlySet__.add("cellProperties");
            return this;
        }
        /** Cell configs */
        @com.fasterxml.jackson.annotation.JsonProperty("cellConfigs")
        private String cellConfigs;

        /**
         * Cell configs
         *
         * @param cellConfigs the value to set
         * @return this builder
         */
        public Builder cellConfigs(String cellConfigs) {
            this.cellConfigs = cellConfigs;
            this.__explicitlySet__.add("cellConfigs");
            return this;
        }
        /** Cell disk counts */
        @com.fasterxml.jackson.annotation.JsonProperty("diskCounts")
        private String diskCounts;

        /**
         * Cell disk counts
         *
         * @param diskCounts the value to set
         * @return this builder
         */
        public Builder diskCounts(String diskCounts) {
            this.diskCounts = diskCounts;
            this.__explicitlySet__.add("diskCounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataCellConfig build() {
            ExadataCellConfig model =
                    new ExadataCellConfig(
                            this.timeCollected,
                            this.cellName,
                            this.cellHash,
                            this.cellProperties,
                            this.cellConfigs,
                            this.diskCounts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataCellConfig model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("cellName")) {
                this.cellName(model.getCellName());
            }
            if (model.wasPropertyExplicitlySet("cellHash")) {
                this.cellHash(model.getCellHash());
            }
            if (model.wasPropertyExplicitlySet("cellProperties")) {
                this.cellProperties(model.getCellProperties());
            }
            if (model.wasPropertyExplicitlySet("cellConfigs")) {
                this.cellConfigs(model.getCellConfigs());
            }
            if (model.wasPropertyExplicitlySet("diskCounts")) {
                this.diskCounts(model.getDiskCounts());
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

    @Deprecated
    public ExadataCellConfig(
            java.util.Date timeCollected,
            String cellName,
            String cellHash,
            String cellProperties,
            String cellConfigs,
            String diskCounts) {
        super(timeCollected);
        this.cellName = cellName;
        this.cellHash = cellHash;
        this.cellProperties = cellProperties;
        this.cellConfigs = cellConfigs;
        this.diskCounts = diskCounts;
    }

    /** Cell name */
    @com.fasterxml.jackson.annotation.JsonProperty("cellName")
    private final String cellName;

    /**
     * Cell name
     *
     * @return the value
     */
    public String getCellName() {
        return cellName;
    }

    /** Cell hash */
    @com.fasterxml.jackson.annotation.JsonProperty("cellHash")
    private final String cellHash;

    /**
     * Cell hash
     *
     * @return the value
     */
    public String getCellHash() {
        return cellHash;
    }

    /** Cell properties */
    @com.fasterxml.jackson.annotation.JsonProperty("cellProperties")
    private final String cellProperties;

    /**
     * Cell properties
     *
     * @return the value
     */
    public String getCellProperties() {
        return cellProperties;
    }

    /** Cell configs */
    @com.fasterxml.jackson.annotation.JsonProperty("cellConfigs")
    private final String cellConfigs;

    /**
     * Cell configs
     *
     * @return the value
     */
    public String getCellConfigs() {
        return cellConfigs;
    }

    /** Cell disk counts */
    @com.fasterxml.jackson.annotation.JsonProperty("diskCounts")
    private final String diskCounts;

    /**
     * Cell disk counts
     *
     * @return the value
     */
    public String getDiskCounts() {
        return diskCounts;
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
        sb.append("ExadataCellConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", cellName=").append(String.valueOf(this.cellName));
        sb.append(", cellHash=").append(String.valueOf(this.cellHash));
        sb.append(", cellProperties=").append(String.valueOf(this.cellProperties));
        sb.append(", cellConfigs=").append(String.valueOf(this.cellConfigs));
        sb.append(", diskCounts=").append(String.valueOf(this.diskCounts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataCellConfig)) {
            return false;
        }

        ExadataCellConfig other = (ExadataCellConfig) o;
        return java.util.Objects.equals(this.cellName, other.cellName)
                && java.util.Objects.equals(this.cellHash, other.cellHash)
                && java.util.Objects.equals(this.cellProperties, other.cellProperties)
                && java.util.Objects.equals(this.cellConfigs, other.cellConfigs)
                && java.util.Objects.equals(this.diskCounts, other.diskCounts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.cellName == null ? 43 : this.cellName.hashCode());
        result = (result * PRIME) + (this.cellHash == null ? 43 : this.cellHash.hashCode());
        result =
                (result * PRIME)
                        + (this.cellProperties == null ? 43 : this.cellProperties.hashCode());
        result = (result * PRIME) + (this.cellConfigs == null ? 43 : this.cellConfigs.hashCode());
        result = (result * PRIME) + (this.diskCounts == null ? 43 : this.diskCounts.hashCode());
        return result;
    }
}
