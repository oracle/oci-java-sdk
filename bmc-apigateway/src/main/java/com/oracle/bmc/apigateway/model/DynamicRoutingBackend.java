/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Send the request to the backend dynamically selected based on the incoming request's context.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DynamicRoutingBackend.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DynamicRoutingBackend extends ApiSpecificationRouteBackend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("selectionSource")
        private SelectionSourcePolicy selectionSource;

        public Builder selectionSource(SelectionSourcePolicy selectionSource) {
            this.selectionSource = selectionSource;
            this.__explicitlySet__.add("selectionSource");
            return this;
        }
        /** List of backends to chose from for Dynamic Routing. */
        @com.fasterxml.jackson.annotation.JsonProperty("routingBackends")
        private java.util.List<DynamicRoutingTypeRoutingBackend> routingBackends;

        /**
         * List of backends to chose from for Dynamic Routing.
         *
         * @param routingBackends the value to set
         * @return this builder
         */
        public Builder routingBackends(
                java.util.List<DynamicRoutingTypeRoutingBackend> routingBackends) {
            this.routingBackends = routingBackends;
            this.__explicitlySet__.add("routingBackends");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DynamicRoutingBackend build() {
            DynamicRoutingBackend model =
                    new DynamicRoutingBackend(this.selectionSource, this.routingBackends);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DynamicRoutingBackend model) {
            if (model.wasPropertyExplicitlySet("selectionSource")) {
                this.selectionSource(model.getSelectionSource());
            }
            if (model.wasPropertyExplicitlySet("routingBackends")) {
                this.routingBackends(model.getRoutingBackends());
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
    public DynamicRoutingBackend(
            SelectionSourcePolicy selectionSource,
            java.util.List<DynamicRoutingTypeRoutingBackend> routingBackends) {
        super();
        this.selectionSource = selectionSource;
        this.routingBackends = routingBackends;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("selectionSource")
    private final SelectionSourcePolicy selectionSource;

    public SelectionSourcePolicy getSelectionSource() {
        return selectionSource;
    }

    /** List of backends to chose from for Dynamic Routing. */
    @com.fasterxml.jackson.annotation.JsonProperty("routingBackends")
    private final java.util.List<DynamicRoutingTypeRoutingBackend> routingBackends;

    /**
     * List of backends to chose from for Dynamic Routing.
     *
     * @return the value
     */
    public java.util.List<DynamicRoutingTypeRoutingBackend> getRoutingBackends() {
        return routingBackends;
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
        sb.append("DynamicRoutingBackend(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", selectionSource=").append(String.valueOf(this.selectionSource));
        sb.append(", routingBackends=").append(String.valueOf(this.routingBackends));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DynamicRoutingBackend)) {
            return false;
        }

        DynamicRoutingBackend other = (DynamicRoutingBackend) o;
        return java.util.Objects.equals(this.selectionSource, other.selectionSource)
                && java.util.Objects.equals(this.routingBackends, other.routingBackends)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.selectionSource == null ? 43 : this.selectionSource.hashCode());
        result =
                (result * PRIME)
                        + (this.routingBackends == null ? 43 : this.routingBackends.hashCode());
        return result;
    }
}
