/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * OLVM target enviroment <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmTargetEnvironment.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "targetEnvironmentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmTargetEnvironment extends TargetEnvironment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
        private String targetCompartmentId;

        public Builder targetCompartmentId(String targetCompartmentId) {
            this.targetCompartmentId = targetCompartmentId;
            this.__explicitlySet__.add("targetCompartmentId");
            return this;
        }
        /** Inventory asset id of the olvm cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAssetId")
        private String clusterAssetId;

        /**
         * Inventory asset id of the olvm cluster
         *
         * @param clusterAssetId the value to set
         * @return this builder
         */
        public Builder clusterAssetId(String clusterAssetId) {
            this.clusterAssetId = clusterAssetId;
            this.__explicitlySet__.add("clusterAssetId");
            return this;
        }
        /** Inventory asset Id of the vnic profile */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicProfileAssetId")
        private String vnicProfileAssetId;

        /**
         * Inventory asset Id of the vnic profile
         *
         * @param vnicProfileAssetId the value to set
         * @return this builder
         */
        public Builder vnicProfileAssetId(String vnicProfileAssetId) {
            this.vnicProfileAssetId = vnicProfileAssetId;
            this.__explicitlySet__.add("vnicProfileAssetId");
            return this;
        }
        /** OLVM OS type to inventory asset id of the template */
        @com.fasterxml.jackson.annotation.JsonProperty("olvmTemplates")
        private java.util.Map<String, String> olvmTemplates;

        /**
         * OLVM OS type to inventory asset id of the template
         *
         * @param olvmTemplates the value to set
         * @return this builder
         */
        public Builder olvmTemplates(java.util.Map<String, String> olvmTemplates) {
            this.olvmTemplates = olvmTemplates;
            this.__explicitlySet__.add("olvmTemplates");
            return this;
        }
        /** Preferred VM shape type provided by the customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("preferredShapeType")
        private VmTargetAsset.PreferredShapeType preferredShapeType;

        /**
         * Preferred VM shape type provided by the customer.
         *
         * @param preferredShapeType the value to set
         * @return this builder
         */
        public Builder preferredShapeType(VmTargetAsset.PreferredShapeType preferredShapeType) {
            this.preferredShapeType = preferredShapeType;
            this.__explicitlySet__.add("preferredShapeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmTargetEnvironment build() {
            OlvmTargetEnvironment model =
                    new OlvmTargetEnvironment(
                            this.targetCompartmentId,
                            this.clusterAssetId,
                            this.vnicProfileAssetId,
                            this.olvmTemplates,
                            this.preferredShapeType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmTargetEnvironment model) {
            if (model.wasPropertyExplicitlySet("targetCompartmentId")) {
                this.targetCompartmentId(model.getTargetCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("clusterAssetId")) {
                this.clusterAssetId(model.getClusterAssetId());
            }
            if (model.wasPropertyExplicitlySet("vnicProfileAssetId")) {
                this.vnicProfileAssetId(model.getVnicProfileAssetId());
            }
            if (model.wasPropertyExplicitlySet("olvmTemplates")) {
                this.olvmTemplates(model.getOlvmTemplates());
            }
            if (model.wasPropertyExplicitlySet("preferredShapeType")) {
                this.preferredShapeType(model.getPreferredShapeType());
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
    public OlvmTargetEnvironment(
            String targetCompartmentId,
            String clusterAssetId,
            String vnicProfileAssetId,
            java.util.Map<String, String> olvmTemplates,
            VmTargetAsset.PreferredShapeType preferredShapeType) {
        super(targetCompartmentId);
        this.clusterAssetId = clusterAssetId;
        this.vnicProfileAssetId = vnicProfileAssetId;
        this.olvmTemplates = olvmTemplates;
        this.preferredShapeType = preferredShapeType;
    }

    /** Inventory asset id of the olvm cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAssetId")
    private final String clusterAssetId;

    /**
     * Inventory asset id of the olvm cluster
     *
     * @return the value
     */
    public String getClusterAssetId() {
        return clusterAssetId;
    }

    /** Inventory asset Id of the vnic profile */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicProfileAssetId")
    private final String vnicProfileAssetId;

    /**
     * Inventory asset Id of the vnic profile
     *
     * @return the value
     */
    public String getVnicProfileAssetId() {
        return vnicProfileAssetId;
    }

    /** OLVM OS type to inventory asset id of the template */
    @com.fasterxml.jackson.annotation.JsonProperty("olvmTemplates")
    private final java.util.Map<String, String> olvmTemplates;

    /**
     * OLVM OS type to inventory asset id of the template
     *
     * @return the value
     */
    public java.util.Map<String, String> getOlvmTemplates() {
        return olvmTemplates;
    }

    /** Preferred VM shape type provided by the customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredShapeType")
    private final VmTargetAsset.PreferredShapeType preferredShapeType;

    /**
     * Preferred VM shape type provided by the customer.
     *
     * @return the value
     */
    public VmTargetAsset.PreferredShapeType getPreferredShapeType() {
        return preferredShapeType;
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
        sb.append("OlvmTargetEnvironment(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", clusterAssetId=").append(String.valueOf(this.clusterAssetId));
        sb.append(", vnicProfileAssetId=").append(String.valueOf(this.vnicProfileAssetId));
        sb.append(", olvmTemplates=").append(String.valueOf(this.olvmTemplates));
        sb.append(", preferredShapeType=").append(String.valueOf(this.preferredShapeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmTargetEnvironment)) {
            return false;
        }

        OlvmTargetEnvironment other = (OlvmTargetEnvironment) o;
        return java.util.Objects.equals(this.clusterAssetId, other.clusterAssetId)
                && java.util.Objects.equals(this.vnicProfileAssetId, other.vnicProfileAssetId)
                && java.util.Objects.equals(this.olvmTemplates, other.olvmTemplates)
                && java.util.Objects.equals(this.preferredShapeType, other.preferredShapeType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.clusterAssetId == null ? 43 : this.clusterAssetId.hashCode());
        result =
                (result * PRIME)
                        + (this.vnicProfileAssetId == null
                                ? 43
                                : this.vnicProfileAssetId.hashCode());
        result =
                (result * PRIME)
                        + (this.olvmTemplates == null ? 43 : this.olvmTemplates.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredShapeType == null
                                ? 43
                                : this.preferredShapeType.hashCode());
        return result;
    }
}
