/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details required for existing GenAi instance to be updated. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenAiUpdateDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenAiUpdateDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"instanceId", "unitCount", "endpoints"})
    public GenAiUpdateDetail(
            String instanceId, Integer unitCount, java.util.List<EndpointDetails> endpoints) {
        super();
        this.instanceId = instanceId;
        this.unitCount = unitCount;
        this.endpoints = endpoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Instance id of the exisitng GenAi instance to be updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Instance id of the exisitng GenAi instance to be updated.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
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
        /**
         * List of endpoints to be provisioned new or updated if existing for the GenAi dedicated
         * cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private java.util.List<EndpointDetails> endpoints;

        /**
         * List of endpoints to be provisioned new or updated if existing for the GenAi dedicated
         * cluster.
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

        public GenAiUpdateDetail build() {
            GenAiUpdateDetail model =
                    new GenAiUpdateDetail(this.instanceId, this.unitCount, this.endpoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenAiUpdateDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
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

    /** Instance id of the exisitng GenAi instance to be updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Instance id of the exisitng GenAi instance to be updated.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
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

    /**
     * List of endpoints to be provisioned new or updated if existing for the GenAi dedicated
     * cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    private final java.util.List<EndpointDetails> endpoints;

    /**
     * List of endpoints to be provisioned new or updated if existing for the GenAi dedicated
     * cluster.
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
        sb.append("GenAiUpdateDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
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
        if (!(o instanceof GenAiUpdateDetail)) {
            return false;
        }

        GenAiUpdateDetail other = (GenAiUpdateDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.unitCount, other.unitCount)
                && java.util.Objects.equals(this.endpoints, other.endpoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.unitCount == null ? 43 : this.unitCount.hashCode());
        result = (result * PRIME) + (this.endpoints == null ? 43 : this.endpoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
