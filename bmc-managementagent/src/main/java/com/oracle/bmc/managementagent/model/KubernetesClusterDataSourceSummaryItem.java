/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * A Kubernetes collection data source summary. <br>
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
        builder = KubernetesClusterDataSourceSummaryItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KubernetesClusterDataSourceSummaryItem extends DataSourceSummaryItem {
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
        /** true if the Kubernetes cluster type is Daemon set */
        @com.fasterxml.jackson.annotation.JsonProperty("isDaemonSet")
        private Boolean isDaemonSet;

        /**
         * true if the Kubernetes cluster type is Daemon set
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

        public KubernetesClusterDataSourceSummaryItem build() {
            KubernetesClusterDataSourceSummaryItem model =
                    new KubernetesClusterDataSourceSummaryItem(
                            this.key, this.name, this.isDaemonSet);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KubernetesClusterDataSourceSummaryItem model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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
    public KubernetesClusterDataSourceSummaryItem(String key, String name, Boolean isDaemonSet) {
        super(key, name);
        this.isDaemonSet = isDaemonSet;
    }

    /** true if the Kubernetes cluster type is Daemon set */
    @com.fasterxml.jackson.annotation.JsonProperty("isDaemonSet")
    private final Boolean isDaemonSet;

    /**
     * true if the Kubernetes cluster type is Daemon set
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
        sb.append("KubernetesClusterDataSourceSummaryItem(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isDaemonSet=").append(String.valueOf(this.isDaemonSet));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KubernetesClusterDataSourceSummaryItem)) {
            return false;
        }

        KubernetesClusterDataSourceSummaryItem other = (KubernetesClusterDataSourceSummaryItem) o;
        return java.util.Objects.equals(this.isDaemonSet, other.isDaemonSet) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.isDaemonSet == null ? 43 : this.isDaemonSet.hashCode());
        return result;
    }
}
