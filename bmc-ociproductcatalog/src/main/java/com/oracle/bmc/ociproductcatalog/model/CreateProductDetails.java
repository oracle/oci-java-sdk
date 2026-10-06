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
        builder = CreateProductDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateProductDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "name",
        "description",
        "meters",
        "serviceName",
        "limits",
        "backfillEligibility",
        "isExcluded"
    })
    public CreateProductDetails(
            String compartmentId,
            String name,
            String description,
            java.util.List<Meter> meters,
            String serviceName,
            java.util.List<Limit> limits,
            BackfillEligibility backfillEligibility,
            Boolean isExcluded) {
        super();
        this.compartmentId = compartmentId;
        this.name = name;
        this.description = description;
        this.meters = meters;
        this.serviceName = serviceName;
        this.limits = limits;
        this.backfillEligibility = backfillEligibility;
        this.isExcluded = isExcluded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
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
         * Optional create-time signal that marks the product as eligible for the backfill flow in
         * existing Alloy regions. Omit this field to preserve the current create behavior. Final
         * runtime backfill and auto-enable decisions remain worker-side.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backfillEligibility")
        private BackfillEligibility backfillEligibility;

        /**
         * Optional create-time signal that marks the product as eligible for the backfill flow in
         * existing Alloy regions. Omit this field to preserve the current create behavior. Final
         * runtime backfill and auto-enable decisions remain worker-side.
         *
         * @param backfillEligibility the value to set
         * @return this builder
         */
        public Builder backfillEligibility(BackfillEligibility backfillEligibility) {
            this.backfillEligibility = backfillEligibility;
            this.__explicitlySet__.add("backfillEligibility");
            return this;
        }
        /**
         * Optional create-time exclusion flag. When true, the product is created in an excluded
         * state. Omit this field to preserve backward-compatible create behavior.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isExcluded")
        private Boolean isExcluded;

        /**
         * Optional create-time exclusion flag. When true, the product is created in an excluded
         * state. Omit this field to preserve backward-compatible create behavior.
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

        public CreateProductDetails build() {
            CreateProductDetails model =
                    new CreateProductDetails(
                            this.compartmentId,
                            this.name,
                            this.description,
                            this.meters,
                            this.serviceName,
                            this.limits,
                            this.backfillEligibility,
                            this.isExcluded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateProductDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("backfillEligibility")) {
                this.backfillEligibility(model.getBackfillEligibility());
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

    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * Optional create-time signal that marks the product as eligible for the backfill flow in
     * existing Alloy regions. Omit this field to preserve the current create behavior. Final
     * runtime backfill and auto-enable decisions remain worker-side.
     */
    public enum BackfillEligibility implements com.oracle.bmc.http.internal.BmcEnum {
        BackfillEligible("BACKFILL_ELIGIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, BackfillEligibility> map;

        static {
            map = new java.util.HashMap<>();
            for (BackfillEligibility v : BackfillEligibility.values()) {
                map.put(v.getValue(), v);
            }
        }

        BackfillEligibility(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackfillEligibility create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BackfillEligibility: " + key);
        }
    };
    /**
     * Optional create-time signal that marks the product as eligible for the backfill flow in
     * existing Alloy regions. Omit this field to preserve the current create behavior. Final
     * runtime backfill and auto-enable decisions remain worker-side.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backfillEligibility")
    private final BackfillEligibility backfillEligibility;

    /**
     * Optional create-time signal that marks the product as eligible for the backfill flow in
     * existing Alloy regions. Omit this field to preserve the current create behavior. Final
     * runtime backfill and auto-enable decisions remain worker-side.
     *
     * @return the value
     */
    public BackfillEligibility getBackfillEligibility() {
        return backfillEligibility;
    }

    /**
     * Optional create-time exclusion flag. When true, the product is created in an excluded state.
     * Omit this field to preserve backward-compatible create behavior.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isExcluded")
    private final Boolean isExcluded;

    /**
     * Optional create-time exclusion flag. When true, the product is created in an excluded state.
     * Omit this field to preserve backward-compatible create behavior.
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
        sb.append("CreateProductDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", meters=").append(String.valueOf(this.meters));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", limits=").append(String.valueOf(this.limits));
        sb.append(", backfillEligibility=").append(String.valueOf(this.backfillEligibility));
        sb.append(", isExcluded=").append(String.valueOf(this.isExcluded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateProductDetails)) {
            return false;
        }

        CreateProductDetails other = (CreateProductDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.meters, other.meters)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.limits, other.limits)
                && java.util.Objects.equals(this.backfillEligibility, other.backfillEligibility)
                && java.util.Objects.equals(this.isExcluded, other.isExcluded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.meters == null ? 43 : this.meters.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.limits == null ? 43 : this.limits.hashCode());
        result =
                (result * PRIME)
                        + (this.backfillEligibility == null
                                ? 43
                                : this.backfillEligibility.hashCode());
        result = (result * PRIME) + (this.isExcluded == null ? 43 : this.isExcluded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
