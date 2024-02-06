/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * A Kubernetes cluster data source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KubernetesClusterDataSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KubernetesClusterDataSource extends DataSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private LifecycleStates state;

        public Builder state(LifecycleStates state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The Kubernetes namespace */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Kubernetes namespace
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** If the Kubernetes cluster type is Daemon set then this will be set to true. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDaemonSet")
        private Boolean isDaemonSet;

        /**
         * If the Kubernetes cluster type is Daemon set then this will be set to true.
         *
         * @param isDaemonSet the value to set
         * @return this builder
         */
        public Builder isDaemonSet(Boolean isDaemonSet) {
            this.isDaemonSet = isDaemonSet;
            this.__explicitlySet__.add("isDaemonSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KubernetesClusterDataSource build() {
            KubernetesClusterDataSource model =
                    new KubernetesClusterDataSource(
                            this.key,
                            this.name,
                            this.compartmentId,
                            this.state,
                            this.timeCreated,
                            this.timeUpdated,
                            this.namespace,
                            this.isDaemonSet);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KubernetesClusterDataSource model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("isDaemonSet")) {
                this.isDaemonSet(model.getIsDaemonSet());
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
    public KubernetesClusterDataSource(
            String key,
            String name,
            String compartmentId,
            LifecycleStates state,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String namespace,
            Boolean isDaemonSet) {
        super(key, name, compartmentId, state, timeCreated, timeUpdated);
        this.namespace = namespace;
        this.isDaemonSet = isDaemonSet;
    }

    /** The Kubernetes namespace */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Kubernetes namespace
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** If the Kubernetes cluster type is Daemon set then this will be set to true. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDaemonSet")
    private final Boolean isDaemonSet;

    /**
     * If the Kubernetes cluster type is Daemon set then this will be set to true.
     *
     * @return the value
     */
    public Boolean getIsDaemonSet() {
        return isDaemonSet;
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
        sb.append("KubernetesClusterDataSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", isDaemonSet=").append(String.valueOf(this.isDaemonSet));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KubernetesClusterDataSource)) {
            return false;
        }

        KubernetesClusterDataSource other = (KubernetesClusterDataSource) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.isDaemonSet, other.isDaemonSet)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.isDaemonSet == null ? 43 : this.isDaemonSet.hashCode());
        return result;
    }
}
