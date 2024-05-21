/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * The single context variable in an incoming request to match against specified selection keys when dynamically routing and dynamically authenticating requests.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SingleSelectionSourcePolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SingleSelectionSourcePolicy extends SelectionSourcePolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * String describing the context variable used as selector.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selector")
        private String selector;

        /**
         * String describing the context variable used as selector.
         * @param selector the value to set
         * @return this builder
         **/
        public Builder selector(String selector) {
            this.selector = selector;
            this.__explicitlySet__.add("selector");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SingleSelectionSourcePolicy build() {
            SingleSelectionSourcePolicy model = new SingleSelectionSourcePolicy(this.selector);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SingleSelectionSourcePolicy model) {
            if (model.wasPropertyExplicitlySet("selector")) {
                this.selector(model.getSelector());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public SingleSelectionSourcePolicy(String selector) {
        super();
        this.selector = selector;
    }

    /**
     * String describing the context variable used as selector.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    private final String selector;

    /**
     * String describing the context variable used as selector.
     * @return the value
     **/
    public String getSelector() {
        return selector;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SingleSelectionSourcePolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", selector=").append(String.valueOf(this.selector));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SingleSelectionSourcePolicy)) {
            return false;
        }

        SingleSelectionSourcePolicy other = (SingleSelectionSourcePolicy) o;
        return java.util.Objects.equals(this.selector, other.selector) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.selector == null ? 43 : this.selector.hashCode());
        return result;
    }
}
