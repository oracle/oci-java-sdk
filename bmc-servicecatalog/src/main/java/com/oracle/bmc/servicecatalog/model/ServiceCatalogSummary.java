/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.model;

/**
 * The model for a summary of an Oracle Cloud Infrastructure service catalog.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceCatalogSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceCatalogSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "lifecycleState",
        "compartmentId",
        "displayName",
        "timeCreated"
    })
    public ServiceCatalogSummary(
            String id,
            ServiceCatalog.LifecycleState lifecycleState,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier for the Service catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier for the Service catalog.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The lifecycle state of the service catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ServiceCatalog.LifecycleState lifecycleState;

        /**
         * The lifecycle state of the service catalog.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ServiceCatalog.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The Compartment id where the service catalog exists.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The Compartment id where the service catalog exists.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the service catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the service catalog.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time this service catalog was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * <p>
         * Example: {@code 2021-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time this service catalog was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * <p>
         * Example: {@code 2021-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceCatalogSummary build() {
            ServiceCatalogSummary model =
                    new ServiceCatalogSummary(
                            this.id,
                            this.lifecycleState,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceCatalogSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /**
     * The unique identifier for the Service catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier for the Service catalog.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The lifecycle state of the service catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ServiceCatalog.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the service catalog.
     * @return the value
     **/
    public ServiceCatalog.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The Compartment id where the service catalog exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The Compartment id where the service catalog exists.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the service catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the service catalog.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time this service catalog was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * <p>
     * Example: {@code 2021-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time this service catalog was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * <p>
     * Example: {@code 2021-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("ServiceCatalogSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceCatalogSummary)) {
            return false;
        }

        ServiceCatalogSummary other = (ServiceCatalogSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
