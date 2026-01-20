/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create backend set mapping properties for a network load balancer member. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NetworkLoadBalancerBackendSetMappingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkLoadBalancerBackendSetMappingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isBackendSetForNonMovable",
        "sourceBackendSetName",
        "destinationBackendSetName"
    })
    public NetworkLoadBalancerBackendSetMappingDetails(
            Boolean isBackendSetForNonMovable,
            String sourceBackendSetName,
            String destinationBackendSetName) {
        super();
        this.isBackendSetForNonMovable = isBackendSetForNonMovable;
        this.sourceBackendSetName = sourceBackendSetName;
        this.destinationBackendSetName = destinationBackendSetName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This flag specifies if this backend set is used for traffic for non-movable compute
         * instances. Backend sets that point to non-movable instances are only enabled or disabled
         * during DR, their contents are not altered. For non-movable instances this flag should be
         * set to 'true'. Backend sets that point to movable instances are emptied and their
         * contents are transferred to the destination region load balancer. For movable instances
         * this flag should be set to 'false'.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isBackendSetForNonMovable")
        private Boolean isBackendSetForNonMovable;

        /**
         * This flag specifies if this backend set is used for traffic for non-movable compute
         * instances. Backend sets that point to non-movable instances are only enabled or disabled
         * during DR, their contents are not altered. For non-movable instances this flag should be
         * set to 'true'. Backend sets that point to movable instances are emptied and their
         * contents are transferred to the destination region load balancer. For movable instances
         * this flag should be set to 'false'.
         *
         * <p>Example: {@code true}
         *
         * @param isBackendSetForNonMovable the value to set
         * @return this builder
         */
        public Builder isBackendSetForNonMovable(Boolean isBackendSetForNonMovable) {
            this.isBackendSetForNonMovable = isBackendSetForNonMovable;
            this.__explicitlySet__.add("isBackendSetForNonMovable");
            return this;
        }
        /**
         * The name of the source backend set.
         *
         * <p>Example: {@code Source-BackendSet-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceBackendSetName")
        private String sourceBackendSetName;

        /**
         * The name of the source backend set.
         *
         * <p>Example: {@code Source-BackendSet-1}
         *
         * @param sourceBackendSetName the value to set
         * @return this builder
         */
        public Builder sourceBackendSetName(String sourceBackendSetName) {
            this.sourceBackendSetName = sourceBackendSetName;
            this.__explicitlySet__.add("sourceBackendSetName");
            return this;
        }
        /**
         * The name of the destination backend set.
         *
         * <p>Example: {@code Destination-BackendSet-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBackendSetName")
        private String destinationBackendSetName;

        /**
         * The name of the destination backend set.
         *
         * <p>Example: {@code Destination-BackendSet-1}
         *
         * @param destinationBackendSetName the value to set
         * @return this builder
         */
        public Builder destinationBackendSetName(String destinationBackendSetName) {
            this.destinationBackendSetName = destinationBackendSetName;
            this.__explicitlySet__.add("destinationBackendSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkLoadBalancerBackendSetMappingDetails build() {
            NetworkLoadBalancerBackendSetMappingDetails model =
                    new NetworkLoadBalancerBackendSetMappingDetails(
                            this.isBackendSetForNonMovable,
                            this.sourceBackendSetName,
                            this.destinationBackendSetName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkLoadBalancerBackendSetMappingDetails model) {
            if (model.wasPropertyExplicitlySet("isBackendSetForNonMovable")) {
                this.isBackendSetForNonMovable(model.getIsBackendSetForNonMovable());
            }
            if (model.wasPropertyExplicitlySet("sourceBackendSetName")) {
                this.sourceBackendSetName(model.getSourceBackendSetName());
            }
            if (model.wasPropertyExplicitlySet("destinationBackendSetName")) {
                this.destinationBackendSetName(model.getDestinationBackendSetName());
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
     * This flag specifies if this backend set is used for traffic for non-movable compute
     * instances. Backend sets that point to non-movable instances are only enabled or disabled
     * during DR, their contents are not altered. For non-movable instances this flag should be set
     * to 'true'. Backend sets that point to movable instances are emptied and their contents are
     * transferred to the destination region load balancer. For movable instances this flag should
     * be set to 'false'.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isBackendSetForNonMovable")
    private final Boolean isBackendSetForNonMovable;

    /**
     * This flag specifies if this backend set is used for traffic for non-movable compute
     * instances. Backend sets that point to non-movable instances are only enabled or disabled
     * during DR, their contents are not altered. For non-movable instances this flag should be set
     * to 'true'. Backend sets that point to movable instances are emptied and their contents are
     * transferred to the destination region load balancer. For movable instances this flag should
     * be set to 'false'.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsBackendSetForNonMovable() {
        return isBackendSetForNonMovable;
    }

    /**
     * The name of the source backend set.
     *
     * <p>Example: {@code Source-BackendSet-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceBackendSetName")
    private final String sourceBackendSetName;

    /**
     * The name of the source backend set.
     *
     * <p>Example: {@code Source-BackendSet-1}
     *
     * @return the value
     */
    public String getSourceBackendSetName() {
        return sourceBackendSetName;
    }

    /**
     * The name of the destination backend set.
     *
     * <p>Example: {@code Destination-BackendSet-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBackendSetName")
    private final String destinationBackendSetName;

    /**
     * The name of the destination backend set.
     *
     * <p>Example: {@code Destination-BackendSet-1}
     *
     * @return the value
     */
    public String getDestinationBackendSetName() {
        return destinationBackendSetName;
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
        sb.append("NetworkLoadBalancerBackendSetMappingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isBackendSetForNonMovable=")
                .append(String.valueOf(this.isBackendSetForNonMovable));
        sb.append(", sourceBackendSetName=").append(String.valueOf(this.sourceBackendSetName));
        sb.append(", destinationBackendSetName=")
                .append(String.valueOf(this.destinationBackendSetName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkLoadBalancerBackendSetMappingDetails)) {
            return false;
        }

        NetworkLoadBalancerBackendSetMappingDetails other =
                (NetworkLoadBalancerBackendSetMappingDetails) o;
        return java.util.Objects.equals(
                        this.isBackendSetForNonMovable, other.isBackendSetForNonMovable)
                && java.util.Objects.equals(this.sourceBackendSetName, other.sourceBackendSetName)
                && java.util.Objects.equals(
                        this.destinationBackendSetName, other.destinationBackendSetName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isBackendSetForNonMovable == null
                                ? 43
                                : this.isBackendSetForNonMovable.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceBackendSetName == null
                                ? 43
                                : this.sourceBackendSetName.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBackendSetName == null
                                ? 43
                                : this.destinationBackendSetName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
