/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * This is the ClusterLoadBalancer which can store the State of the cluster,
 * opensearchLoadbalancerIps, remoteLoadbalancerIps <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OpensearchClusterInternalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpensearchClusterInternalDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "state",
        "elasticLoadBalancerIps",
        "remoteLoadBalancerIps",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OpensearchClusterInternalDetails(
            String state,
            java.util.List<String> elasticLoadBalancerIps,
            java.util.List<String> remoteLoadBalancerIps,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.state = state;
        this.elasticLoadBalancerIps = elasticLoadBalancerIps;
        this.remoteLoadBalancerIps = remoteLoadBalancerIps;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The state of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * The state of the cluster.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** List of OpenSearch elastic LoadbalancerIps */
        @com.fasterxml.jackson.annotation.JsonProperty("elasticLoadBalancerIps")
        private java.util.List<String> elasticLoadBalancerIps;

        /**
         * List of OpenSearch elastic LoadbalancerIps
         *
         * @param elasticLoadBalancerIps the value to set
         * @return this builder
         */
        public Builder elasticLoadBalancerIps(java.util.List<String> elasticLoadBalancerIps) {
            this.elasticLoadBalancerIps = elasticLoadBalancerIps;
            this.__explicitlySet__.add("elasticLoadBalancerIps");
            return this;
        }
        /** List of OpenSearch remote LoadbalancerIps */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteLoadBalancerIps")
        private java.util.List<String> remoteLoadBalancerIps;

        /**
         * List of OpenSearch remote LoadbalancerIps
         *
         * @param remoteLoadBalancerIps the value to set
         * @return this builder
         */
        public Builder remoteLoadBalancerIps(java.util.List<String> remoteLoadBalancerIps) {
            this.remoteLoadBalancerIps = remoteLoadBalancerIps;
            this.__explicitlySet__.add("remoteLoadBalancerIps");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpensearchClusterInternalDetails build() {
            OpensearchClusterInternalDetails model =
                    new OpensearchClusterInternalDetails(
                            this.state,
                            this.elasticLoadBalancerIps,
                            this.remoteLoadBalancerIps,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpensearchClusterInternalDetails model) {
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("elasticLoadBalancerIps")) {
                this.elasticLoadBalancerIps(model.getElasticLoadBalancerIps());
            }
            if (model.wasPropertyExplicitlySet("remoteLoadBalancerIps")) {
                this.remoteLoadBalancerIps(model.getRemoteLoadBalancerIps());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The state of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * The state of the cluster.
     *
     * @return the value
     */
    public String getState() {
        return state;
    }

    /** List of OpenSearch elastic LoadbalancerIps */
    @com.fasterxml.jackson.annotation.JsonProperty("elasticLoadBalancerIps")
    private final java.util.List<String> elasticLoadBalancerIps;

    /**
     * List of OpenSearch elastic LoadbalancerIps
     *
     * @return the value
     */
    public java.util.List<String> getElasticLoadBalancerIps() {
        return elasticLoadBalancerIps;
    }

    /** List of OpenSearch remote LoadbalancerIps */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteLoadBalancerIps")
    private final java.util.List<String> remoteLoadBalancerIps;

    /**
     * List of OpenSearch remote LoadbalancerIps
     *
     * @return the value
     */
    public java.util.List<String> getRemoteLoadBalancerIps() {
        return remoteLoadBalancerIps;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OpensearchClusterInternalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("state=").append(String.valueOf(this.state));
        sb.append(", elasticLoadBalancerIps=").append(String.valueOf(this.elasticLoadBalancerIps));
        sb.append(", remoteLoadBalancerIps=").append(String.valueOf(this.remoteLoadBalancerIps));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpensearchClusterInternalDetails)) {
            return false;
        }

        OpensearchClusterInternalDetails other = (OpensearchClusterInternalDetails) o;
        return java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(
                        this.elasticLoadBalancerIps, other.elasticLoadBalancerIps)
                && java.util.Objects.equals(this.remoteLoadBalancerIps, other.remoteLoadBalancerIps)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result =
                (result * PRIME)
                        + (this.elasticLoadBalancerIps == null
                                ? 43
                                : this.elasticLoadBalancerIps.hashCode());
        result =
                (result * PRIME)
                        + (this.remoteLoadBalancerIps == null
                                ? 43
                                : this.remoteLoadBalancerIps.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
