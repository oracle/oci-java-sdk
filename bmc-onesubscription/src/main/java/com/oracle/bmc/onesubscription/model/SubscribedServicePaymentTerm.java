/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Payment Term details
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SubscribedServicePaymentTerm.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubscribedServicePaymentTerm
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "value",
        "description",
        "isActive",
        "timeCreated",
        "createdBy",
        "timeUpdated",
        "updatedBy"
    })
    public SubscribedServicePaymentTerm(
            String name,
            String value,
            String description,
            Boolean isActive,
            java.util.Date timeCreated,
            String createdBy,
            java.util.Date timeUpdated,
            String updatedBy) {
        super();
        this.name = name;
        this.value = value;
        this.description = description;
        this.isActive = isActive;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Payment Term name
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Payment Term name
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Payment Term value
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Payment Term value
         *
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Payment term Description
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Payment term Description
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Payment term active flag
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isActive")
        private Boolean isActive;

        /**
         * Payment term active flag
         *
         * @param isActive the value to set
         * @return this builder
         **/
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            this.__explicitlySet__.add("isActive");
            return this;
        }
        /**
         * Payment term last update date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Payment term last update date
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * User that created the Payment term
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * User that created the Payment term
         *
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * Payment term last update date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Payment term last update date
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * User that updated the Payment term
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        /**
         * User that updated the Payment term
         *
         * @param updatedBy the value to set
         * @return this builder
         **/
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscribedServicePaymentTerm build() {
            SubscribedServicePaymentTerm model =
                    new SubscribedServicePaymentTerm(
                            this.name,
                            this.value,
                            this.description,
                            this.isActive,
                            this.timeCreated,
                            this.createdBy,
                            this.timeUpdated,
                            this.updatedBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscribedServicePaymentTerm model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isActive")) {
                this.isActive(model.getIsActive());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
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
     * Payment Term name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Payment Term name
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Payment Term value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Payment Term value
     *
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Payment term Description
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Payment term Description
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Payment term active flag
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActive")
    private final Boolean isActive;

    /**
     * Payment term active flag
     *
     * @return the value
     **/
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Payment term last update date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Payment term last update date
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * User that created the Payment term
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * User that created the Payment term
     *
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Payment term last update date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Payment term last update date
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * User that updated the Payment term
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

    /**
     * User that updated the Payment term
     *
     * @return the value
     **/
    public String getUpdatedBy() {
        return updatedBy;
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
        sb.append("SubscribedServicePaymentTerm(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isActive=").append(String.valueOf(this.isActive));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscribedServicePaymentTerm)) {
            return false;
        }

        SubscribedServicePaymentTerm other = (SubscribedServicePaymentTerm) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isActive, other.isActive)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isActive == null ? 43 : this.isActive.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
