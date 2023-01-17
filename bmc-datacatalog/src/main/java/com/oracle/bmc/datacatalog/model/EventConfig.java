/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Describes an event configuration, for a given object type and property. Primarily, whether a
 * property change will result in an event being emitted. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EventConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class EventConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "typeId",
        "typeName",
        "propertyId",
        "propertyName",
        "eventConfigStatus",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById"
    })
    public EventConfig(
            String typeId,
            String typeName,
            String propertyId,
            String propertyName,
            EventConfigStatus eventConfigStatus,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById) {
        super();
        this.typeId = typeId;
        this.typeName = typeName;
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.eventConfigStatus = eventConfigStatus;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique type key identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeId")
        private String typeId;

        /**
         * Unique type key identifier.
         *
         * @param typeId the value to set
         * @return this builder
         */
        public Builder typeId(String typeId) {
            this.typeId = typeId;
            this.__explicitlySet__.add("typeId");
            return this;
        }
        /** Name of the type. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        /**
         * Name of the type.
         *
         * @param typeName the value to set
         * @return this builder
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }
        /** Unique property key identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyId")
        private String propertyId;

        /**
         * Unique property key identifier.
         *
         * @param propertyId the value to set
         * @return this builder
         */
        public Builder propertyId(String propertyId) {
            this.propertyId = propertyId;
            this.__explicitlySet__.add("propertyId");
            return this;
        }
        /** Name of the property. */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
        private String propertyName;

        /**
         * Name of the property.
         *
         * @param propertyName the value to set
         * @return this builder
         */
        public Builder propertyName(String propertyName) {
            this.propertyName = propertyName;
            this.__explicitlySet__.add("propertyName");
            return this;
        }
        /** Status of the configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("eventConfigStatus")
        private EventConfigStatus eventConfigStatus;

        /**
         * Status of the configuration.
         *
         * @param eventConfigStatus the value to set
         * @return this builder
         */
        public Builder eventConfigStatus(EventConfigStatus eventConfigStatus) {
            this.eventConfigStatus = eventConfigStatus;
            this.__explicitlySet__.add("eventConfigStatus");
            return this;
        }
        /**
         * The date and time the event was configured, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the event was configured, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The last time that any change was made to the configuration. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time that any change was made to the configuration. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** OCID of the user who created the configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created the configuration.
         *
         * @param createdById the value to set
         * @return this builder
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /** OCID of the user who last modified the configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who last modified the configuration.
         *
         * @param updatedById the value to set
         * @return this builder
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EventConfig build() {
            EventConfig model =
                    new EventConfig(
                            this.typeId,
                            this.typeName,
                            this.propertyId,
                            this.propertyName,
                            this.eventConfigStatus,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdById,
                            this.updatedById);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EventConfig model) {
            if (model.wasPropertyExplicitlySet("typeId")) {
                this.typeId(model.getTypeId());
            }
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
            }
            if (model.wasPropertyExplicitlySet("propertyId")) {
                this.propertyId(model.getPropertyId());
            }
            if (model.wasPropertyExplicitlySet("propertyName")) {
                this.propertyName(model.getPropertyName());
            }
            if (model.wasPropertyExplicitlySet("eventConfigStatus")) {
                this.eventConfigStatus(model.getEventConfigStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
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

    /** Unique type key identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeId")
    private final String typeId;

    /**
     * Unique type key identifier.
     *
     * @return the value
     */
    public String getTypeId() {
        return typeId;
    }

    /** Name of the type. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    /**
     * Name of the type.
     *
     * @return the value
     */
    public String getTypeName() {
        return typeName;
    }

    /** Unique property key identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyId")
    private final String propertyId;

    /**
     * Unique property key identifier.
     *
     * @return the value
     */
    public String getPropertyId() {
        return propertyId;
    }

    /** Name of the property. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
    private final String propertyName;

    /**
     * Name of the property.
     *
     * @return the value
     */
    public String getPropertyName() {
        return propertyName;
    }

    /** Status of the configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("eventConfigStatus")
    private final EventConfigStatus eventConfigStatus;

    /**
     * Status of the configuration.
     *
     * @return the value
     */
    public EventConfigStatus getEventConfigStatus() {
        return eventConfigStatus;
    }

    /**
     * The date and time the event was configured, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the event was configured, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time that any change was made to the configuration. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time that any change was made to the configuration. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** OCID of the user who created the configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created the configuration.
     *
     * @return the value
     */
    public String getCreatedById() {
        return createdById;
    }

    /** OCID of the user who last modified the configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who last modified the configuration.
     *
     * @return the value
     */
    public String getUpdatedById() {
        return updatedById;
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
        sb.append("EventConfig(");
        sb.append("super=").append(super.toString());
        sb.append("typeId=").append(String.valueOf(this.typeId));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append(", propertyId=").append(String.valueOf(this.propertyId));
        sb.append(", propertyName=").append(String.valueOf(this.propertyName));
        sb.append(", eventConfigStatus=").append(String.valueOf(this.eventConfigStatus));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EventConfig)) {
            return false;
        }

        EventConfig other = (EventConfig) o;
        return java.util.Objects.equals(this.typeId, other.typeId)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.propertyId, other.propertyId)
                && java.util.Objects.equals(this.propertyName, other.propertyName)
                && java.util.Objects.equals(this.eventConfigStatus, other.eventConfigStatus)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.typeId == null ? 43 : this.typeId.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result = (result * PRIME) + (this.propertyId == null ? 43 : this.propertyId.hashCode());
        result = (result * PRIME) + (this.propertyName == null ? 43 : this.propertyName.hashCode());
        result =
                (result * PRIME)
                        + (this.eventConfigStatus == null ? 43 : this.eventConfigStatus.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
