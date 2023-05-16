/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The configuration details for updating a backend server. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateBackendDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateBackendDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"weight", "isBackup", "isDrain", "isOffline"})
    public UpdateBackendDetails(
            Integer weight, Boolean isBackup, Boolean isDrain, Boolean isOffline) {
        super();
        this.weight = weight;
        this.isBackup = isBackup;
        this.isDrain = isDrain;
        this.isOffline = isOffline;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The load balancing policy weight assigned to the server. Backend servers with a higher
         * weight receive a larger proportion of incoming traffic. For example, a server weighted
         * '3' receives three times the number of new connections as a server weighted '1'. For more
         * information about load balancing policies, see [How Load Balancing Policies
         * Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
         *
         * <p>Example: {@code 3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        /**
         * The load balancing policy weight assigned to the server. Backend servers with a higher
         * weight receive a larger proportion of incoming traffic. For example, a server weighted
         * '3' receives three times the number of new connections as a server weighted '1'. For more
         * information about load balancing policies, see [How Load Balancing Policies
         * Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
         *
         * <p>Example: {@code 3}
         *
         * @param weight the value to set
         * @return this builder
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }
        /**
         * Whether the network load balancer should treat this server as a backup unit. If {@code
         * true}, then the network load balancer forwards no ingress traffic to this backend server
         * unless all other backend servers not marked as "isBackup" fail the health check policy.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isBackup")
        private Boolean isBackup;

        /**
         * Whether the network load balancer should treat this server as a backup unit. If {@code
         * true}, then the network load balancer forwards no ingress traffic to this backend server
         * unless all other backend servers not marked as "isBackup" fail the health check policy.
         *
         * <p>Example: {@code false}
         *
         * @param isBackup the value to set
         * @return this builder
         */
        public Builder isBackup(Boolean isBackup) {
            this.isBackup = isBackup;
            this.__explicitlySet__.add("isBackup");
            return this;
        }
        /**
         * Whether the network load balancer should drain this server. Servers marked "isDrain"
         * receive no incoming traffic.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDrain")
        private Boolean isDrain;

        /**
         * Whether the network load balancer should drain this server. Servers marked "isDrain"
         * receive no incoming traffic.
         *
         * <p>Example: {@code false}
         *
         * @param isDrain the value to set
         * @return this builder
         */
        public Builder isDrain(Boolean isDrain) {
            this.isDrain = isDrain;
            this.__explicitlySet__.add("isDrain");
            return this;
        }
        /**
         * Whether the network load balancer should treat this server as offline. Offline servers
         * receive no incoming traffic.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOffline")
        private Boolean isOffline;

        /**
         * Whether the network load balancer should treat this server as offline. Offline servers
         * receive no incoming traffic.
         *
         * <p>Example: {@code false}
         *
         * @param isOffline the value to set
         * @return this builder
         */
        public Builder isOffline(Boolean isOffline) {
            this.isOffline = isOffline;
            this.__explicitlySet__.add("isOffline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBackendDetails build() {
            UpdateBackendDetails model =
                    new UpdateBackendDetails(
                            this.weight, this.isBackup, this.isDrain, this.isOffline);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBackendDetails model) {
            if (model.wasPropertyExplicitlySet("weight")) {
                this.weight(model.getWeight());
            }
            if (model.wasPropertyExplicitlySet("isBackup")) {
                this.isBackup(model.getIsBackup());
            }
            if (model.wasPropertyExplicitlySet("isDrain")) {
                this.isDrain(model.getIsDrain());
            }
            if (model.wasPropertyExplicitlySet("isOffline")) {
                this.isOffline(model.getIsOffline());
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

    /**
     * The load balancing policy weight assigned to the server. Backend servers with a higher weight
     * receive a larger proportion of incoming traffic. For example, a server weighted '3' receives
     * three times the number of new connections as a server weighted '1'. For more information
     * about load balancing policies, see [How Load Balancing Policies
     * Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
     *
     * <p>Example: {@code 3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Integer weight;

    /**
     * The load balancing policy weight assigned to the server. Backend servers with a higher weight
     * receive a larger proportion of incoming traffic. For example, a server weighted '3' receives
     * three times the number of new connections as a server weighted '1'. For more information
     * about load balancing policies, see [How Load Balancing Policies
     * Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
     *
     * <p>Example: {@code 3}
     *
     * @return the value
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Whether the network load balancer should treat this server as a backup unit. If {@code true},
     * then the network load balancer forwards no ingress traffic to this backend server unless all
     * other backend servers not marked as "isBackup" fail the health check policy.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isBackup")
    private final Boolean isBackup;

    /**
     * Whether the network load balancer should treat this server as a backup unit. If {@code true},
     * then the network load balancer forwards no ingress traffic to this backend server unless all
     * other backend servers not marked as "isBackup" fail the health check policy.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsBackup() {
        return isBackup;
    }

    /**
     * Whether the network load balancer should drain this server. Servers marked "isDrain" receive
     * no incoming traffic.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDrain")
    private final Boolean isDrain;

    /**
     * Whether the network load balancer should drain this server. Servers marked "isDrain" receive
     * no incoming traffic.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsDrain() {
        return isDrain;
    }

    /**
     * Whether the network load balancer should treat this server as offline. Offline servers
     * receive no incoming traffic.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOffline")
    private final Boolean isOffline;

    /**
     * Whether the network load balancer should treat this server as offline. Offline servers
     * receive no incoming traffic.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsOffline() {
        return isOffline;
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
        sb.append("UpdateBackendDetails(");
        sb.append("super=").append(super.toString());
        sb.append("weight=").append(String.valueOf(this.weight));
        sb.append(", isBackup=").append(String.valueOf(this.isBackup));
        sb.append(", isDrain=").append(String.valueOf(this.isDrain));
        sb.append(", isOffline=").append(String.valueOf(this.isOffline));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBackendDetails)) {
            return false;
        }

        UpdateBackendDetails other = (UpdateBackendDetails) o;
        return java.util.Objects.equals(this.weight, other.weight)
                && java.util.Objects.equals(this.isBackup, other.isBackup)
                && java.util.Objects.equals(this.isDrain, other.isDrain)
                && java.util.Objects.equals(this.isOffline, other.isOffline)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        result = (result * PRIME) + (this.isBackup == null ? 43 : this.isBackup.hashCode());
        result = (result * PRIME) + (this.isDrain == null ? 43 : this.isDrain.hashCode());
        result = (result * PRIME) + (this.isOffline == null ? 43 : this.isOffline.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
