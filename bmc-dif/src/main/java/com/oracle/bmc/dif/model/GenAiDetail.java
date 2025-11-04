/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * GenAI details required to provision dedicated clusters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GenAiDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenAiDetail extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "clusterType",
        "baseModel",
        "ociRegion",
        "unitCount",
        "endpoints"
    })
    public GenAiDetail(
            String instanceId,
            ClusterType clusterType,
            String baseModel,
            String ociRegion,
            Integer unitCount,
            java.util.List<EndpointDetails> endpoints) {
        super();
        this.instanceId = instanceId;
        this.clusterType = clusterType;
        this.baseModel = baseModel;
        this.ociRegion = ociRegion;
        this.unitCount = unitCount;
        this.endpoints = endpoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Id for the GGCS instance to be provisioned. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Id for the GGCS instance to be provisioned.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The dedicated AI cluster type. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
        private ClusterType clusterType;

        /**
         * The dedicated AI cluster type.
         *
         * @param clusterType the value to set
         * @return this builder
         */
        public Builder clusterType(ClusterType clusterType) {
            this.clusterType = clusterType;
            this.__explicitlySet__.add("clusterType");
            return this;
        }
        /** Name of the base model. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseModel")
        private String baseModel;

        /**
         * Name of the base model.
         *
         * @param baseModel the value to set
         * @return this builder
         */
        public Builder baseModel(String baseModel) {
            this.baseModel = baseModel;
            this.__explicitlySet__.add("baseModel");
            return this;
        }
        /** Region on which the cluster end endpoint will be provisioned. */
        @com.fasterxml.jackson.annotation.JsonProperty("ociRegion")
        private String ociRegion;

        /**
         * Region on which the cluster end endpoint will be provisioned.
         *
         * @param ociRegion the value to set
         * @return this builder
         */
        public Builder ociRegion(String ociRegion) {
            this.ociRegion = ociRegion;
            this.__explicitlySet__.add("ociRegion");
            return this;
        }
        /** No of replicas of base model to be used for hosting. */
        @com.fasterxml.jackson.annotation.JsonProperty("unitCount")
        private Integer unitCount;

        /**
         * No of replicas of base model to be used for hosting.
         *
         * @param unitCount the value to set
         * @return this builder
         */
        public Builder unitCount(Integer unitCount) {
            this.unitCount = unitCount;
            this.__explicitlySet__.add("unitCount");
            return this;
        }
        /** List of endpoints to provision for the GENAI cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private java.util.List<EndpointDetails> endpoints;

        /**
         * List of endpoints to provision for the GENAI cluster.
         *
         * @param endpoints the value to set
         * @return this builder
         */
        public Builder endpoints(java.util.List<EndpointDetails> endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenAiDetail build() {
            GenAiDetail model =
                    new GenAiDetail(
                            this.instanceId,
                            this.clusterType,
                            this.baseModel,
                            this.ociRegion,
                            this.unitCount,
                            this.endpoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenAiDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("clusterType")) {
                this.clusterType(model.getClusterType());
            }
            if (model.wasPropertyExplicitlySet("baseModel")) {
                this.baseModel(model.getBaseModel());
            }
            if (model.wasPropertyExplicitlySet("ociRegion")) {
                this.ociRegion(model.getOciRegion());
            }
            if (model.wasPropertyExplicitlySet("unitCount")) {
                this.unitCount(model.getUnitCount());
            }
            if (model.wasPropertyExplicitlySet("endpoints")) {
                this.endpoints(model.getEndpoints());
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

    /** Id for the GGCS instance to be provisioned. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Id for the GGCS instance to be provisioned.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** The dedicated AI cluster type. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
    private final ClusterType clusterType;

    /**
     * The dedicated AI cluster type.
     *
     * @return the value
     */
    public ClusterType getClusterType() {
        return clusterType;
    }

    /** Name of the base model. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseModel")
    private final String baseModel;

    /**
     * Name of the base model.
     *
     * @return the value
     */
    public String getBaseModel() {
        return baseModel;
    }

    /** Region on which the cluster end endpoint will be provisioned. */
    @com.fasterxml.jackson.annotation.JsonProperty("ociRegion")
    private final String ociRegion;

    /**
     * Region on which the cluster end endpoint will be provisioned.
     *
     * @return the value
     */
    public String getOciRegion() {
        return ociRegion;
    }

    /** No of replicas of base model to be used for hosting. */
    @com.fasterxml.jackson.annotation.JsonProperty("unitCount")
    private final Integer unitCount;

    /**
     * No of replicas of base model to be used for hosting.
     *
     * @return the value
     */
    public Integer getUnitCount() {
        return unitCount;
    }

    /** List of endpoints to provision for the GENAI cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    private final java.util.List<EndpointDetails> endpoints;

    /**
     * List of endpoints to provision for the GENAI cluster.
     *
     * @return the value
     */
    public java.util.List<EndpointDetails> getEndpoints() {
        return endpoints;
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
        sb.append("GenAiDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", clusterType=").append(String.valueOf(this.clusterType));
        sb.append(", baseModel=").append(String.valueOf(this.baseModel));
        sb.append(", ociRegion=").append(String.valueOf(this.ociRegion));
        sb.append(", unitCount=").append(String.valueOf(this.unitCount));
        sb.append(", endpoints=").append(String.valueOf(this.endpoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenAiDetail)) {
            return false;
        }

        GenAiDetail other = (GenAiDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.clusterType, other.clusterType)
                && java.util.Objects.equals(this.baseModel, other.baseModel)
                && java.util.Objects.equals(this.ociRegion, other.ociRegion)
                && java.util.Objects.equals(this.unitCount, other.unitCount)
                && java.util.Objects.equals(this.endpoints, other.endpoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.clusterType == null ? 43 : this.clusterType.hashCode());
        result = (result * PRIME) + (this.baseModel == null ? 43 : this.baseModel.hashCode());
        result = (result * PRIME) + (this.ociRegion == null ? 43 : this.ociRegion.hashCode());
        result = (result * PRIME) + (this.unitCount == null ? 43 : this.unitCount.hashCode());
        result = (result * PRIME) + (this.endpoints == null ? 43 : this.endpoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
