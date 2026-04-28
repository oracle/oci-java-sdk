/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Schedule activity details to vanity domain on pod <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateVanityDomainActivityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVanityDomainActivityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vanityDomainId", "timeScheduled", "operationType"})
    public CreateVanityDomainActivityDetails(
            String vanityDomainId, java.util.Date timeScheduled, OperationType operationType) {
        super();
        this.vanityDomainId = vanityDomainId;
        this.timeScheduled = timeScheduled;
        this.operationType = operationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Vanity domain ID */
        @com.fasterxml.jackson.annotation.JsonProperty("vanityDomainId")
        private String vanityDomainId;

        /**
         * Vanity domain ID
         *
         * @param vanityDomainId the value to set
         * @return this builder
         */
        public Builder vanityDomainId(String vanityDomainId) {
            this.vanityDomainId = vanityDomainId;
            this.__explicitlySet__.add("vanityDomainId");
            return this;
        }
        /** Activity start time */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * Activity start time
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /** The type of operation */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * The type of operation
         *
         * @param operationType the value to set
         * @return this builder
         */
        public Builder operationType(OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVanityDomainActivityDetails build() {
            CreateVanityDomainActivityDetails model =
                    new CreateVanityDomainActivityDetails(
                            this.vanityDomainId, this.timeScheduled, this.operationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVanityDomainActivityDetails model) {
            if (model.wasPropertyExplicitlySet("vanityDomainId")) {
                this.vanityDomainId(model.getVanityDomainId());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
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

    /** Vanity domain ID */
    @com.fasterxml.jackson.annotation.JsonProperty("vanityDomainId")
    private final String vanityDomainId;

    /**
     * Vanity domain ID
     *
     * @return the value
     */
    public String getVanityDomainId() {
        return vanityDomainId;
    }

    /** Activity start time */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * Activity start time
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /** The type of operation */
    public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
        EnableVanityDomain("ENABLE_VANITY_DOMAIN"),
        DeleteVanityDomain("DELETE_VANITY_DOMAIN"),
        ;

        private final String value;
        private static java.util.Map<String, OperationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationType v : OperationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        OperationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OperationType: " + key);
        }
    };
    /** The type of operation */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * The type of operation
     *
     * @return the value
     */
    public OperationType getOperationType() {
        return operationType;
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
        sb.append("CreateVanityDomainActivityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vanityDomainId=").append(String.valueOf(this.vanityDomainId));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVanityDomainActivityDetails)) {
            return false;
        }

        CreateVanityDomainActivityDetails other = (CreateVanityDomainActivityDetails) o;
        return java.util.Objects.equals(this.vanityDomainId, other.vanityDomainId)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.vanityDomainId == null ? 43 : this.vanityDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
