/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ociproductcatalog.model;

/**
 * The properties of a product <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateProductDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateProductDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "state",
        "meters",
        "serviceName",
        "limits",
        "isExcluded"
    })
    public UpdateProductDetails(
            String name,
            String description,
            State state,
            java.util.List<Meter> meters,
            String serviceName,
            java.util.List<Limit> limits,
            Boolean isExcluded) {
        super();
        this.name = name;
        this.description = description;
        this.state = state;
        this.meters = meters;
        this.serviceName = serviceName;
        this.limits = limits;
        this.isExcluded = isExcluded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the product, defined by service teams. Unique within one service */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the product, defined by service teams. Unique within one service
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** description to the product */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * description to the product
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The current state of the product. READY - The product is fully configured and ready for
         * activation. ENABLED - The product is active. DISABLED - The product is inactive and not
         * ready for activation. DELETED - The product has been deleted. NEEDS_ATTENTION - Pricing
         * not set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * The current state of the product. READY - The product is fully configured and ready for
         * activation. ENABLED - The product is active. DISABLED - The product is inactive and not
         * ready for activation. DELETED - The product has been deleted. NEEDS_ATTENTION - Pricing
         * not set.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** List of meters associated with this product */
        @com.fasterxml.jackson.annotation.JsonProperty("meters")
        private java.util.List<Meter> meters;

        /**
         * List of meters associated with this product
         *
         * @param meters the value to set
         * @return this builder
         */
        public Builder meters(java.util.List<Meter> meters) {
            this.meters = meters;
            this.__explicitlySet__.add("meters");
            return this;
        }
        /** Name of the metering service this product relates to. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Name of the metering service this product relates to.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** List of limits that this product is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("limits")
        private java.util.List<Limit> limits;

        /**
         * List of limits that this product is associated with.
         *
         * @param limits the value to set
         * @return this builder
         */
        public Builder limits(java.util.List<Limit> limits) {
            this.limits = limits;
            this.__explicitlySet__.add("limits");
            return this;
        }
        /**
         * Optional exclusion flag update. When true, marks the product as excluded. When false,
         * clears the exclusion state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isExcluded")
        private Boolean isExcluded;

        /**
         * Optional exclusion flag update. When true, marks the product as excluded. When false,
         * clears the exclusion state.
         *
         * @param isExcluded the value to set
         * @return this builder
         */
        public Builder isExcluded(Boolean isExcluded) {
            this.isExcluded = isExcluded;
            this.__explicitlySet__.add("isExcluded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateProductDetails build() {
            UpdateProductDetails model =
                    new UpdateProductDetails(
                            this.name,
                            this.description,
                            this.state,
                            this.meters,
                            this.serviceName,
                            this.limits,
                            this.isExcluded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateProductDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("meters")) {
                this.meters(model.getMeters());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("limits")) {
                this.limits(model.getLimits());
            }
            if (model.wasPropertyExplicitlySet("isExcluded")) {
                this.isExcluded(model.getIsExcluded());
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

    /** Name of the product, defined by service teams. Unique within one service */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the product, defined by service teams. Unique within one service
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** description to the product */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * description to the product
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The current state of the product. READY - The product is fully configured and ready for
     * activation. ENABLED - The product is active. DISABLED - The product is inactive and not ready
     * for activation. DELETED - The product has been deleted. NEEDS_ATTENTION - Pricing not set.
     */
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        Ready("READY"),
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Deleted("DELETED"),
        NeedsAttention("NEEDS_ATTENTION"),
        ;

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                map.put(v.getValue(), v);
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid State: " + key);
        }
    };
    /**
     * The current state of the product. READY - The product is fully configured and ready for
     * activation. ENABLED - The product is active. DISABLED - The product is inactive and not ready
     * for activation. DELETED - The product has been deleted. NEEDS_ATTENTION - Pricing not set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * The current state of the product. READY - The product is fully configured and ready for
     * activation. ENABLED - The product is active. DISABLED - The product is inactive and not ready
     * for activation. DELETED - The product has been deleted. NEEDS_ATTENTION - Pricing not set.
     *
     * @return the value
     */
    public State getState() {
        return state;
    }

    /** List of meters associated with this product */
    @com.fasterxml.jackson.annotation.JsonProperty("meters")
    private final java.util.List<Meter> meters;

    /**
     * List of meters associated with this product
     *
     * @return the value
     */
    public java.util.List<Meter> getMeters() {
        return meters;
    }

    /** Name of the metering service this product relates to. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Name of the metering service this product relates to.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** List of limits that this product is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("limits")
    private final java.util.List<Limit> limits;

    /**
     * List of limits that this product is associated with.
     *
     * @return the value
     */
    public java.util.List<Limit> getLimits() {
        return limits;
    }

    /**
     * Optional exclusion flag update. When true, marks the product as excluded. When false, clears
     * the exclusion state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isExcluded")
    private final Boolean isExcluded;

    /**
     * Optional exclusion flag update. When true, marks the product as excluded. When false, clears
     * the exclusion state.
     *
     * @return the value
     */
    public Boolean getIsExcluded() {
        return isExcluded;
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
        sb.append("UpdateProductDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", meters=").append(String.valueOf(this.meters));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", limits=").append(String.valueOf(this.limits));
        sb.append(", isExcluded=").append(String.valueOf(this.isExcluded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateProductDetails)) {
            return false;
        }

        UpdateProductDetails other = (UpdateProductDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.meters, other.meters)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.limits, other.limits)
                && java.util.Objects.equals(this.isExcluded, other.isExcluded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.meters == null ? 43 : this.meters.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.limits == null ? 43 : this.limits.hashCode());
        result = (result * PRIME) + (this.isExcluded == null ? 43 : this.isExcluded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
